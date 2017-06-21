package tw.satisfaction.myproject.oop.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStreamIOEx2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis1 = new FileInputStream("c:/temp/test/Hello.txt");
		//FileOutputStream fos1 = new FileOutputStream("c:/temp/test/destination.txt");
		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/destination.txt", true);
		int data;
		while ((data = fis1.read()) != -1) {
			System.out.print((char) data + "");
			fos1.write(data);
		}
		fos1.close();
		fis1.close();
	}

}
