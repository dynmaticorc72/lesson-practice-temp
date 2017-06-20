package tw.satisfaction.myproject.oop.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestByteStreamIOEx1 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis1 = new FileInputStream("c:/temp/test/Hello.txt");
		int data;
		while ((data = fis1.read()) != -1) {
			System.out.print((char) data + "");
		}
		fis1.close();
	}

}
