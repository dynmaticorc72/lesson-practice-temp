package tw.satisfaction.myproject.oop.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestByteStreaamBufferIOEx2 {

	public static void main(String[] args) throws IOException {
//		FileInputStream fis1 = new FileInputStream("c:/temp/test/Hello.txt");
//		BufferedInputStream bis1 = new BufferedInputStream(fis1);
		BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("c:/temp/test/Hello.txt"));

		int data;
		while ((data = bis1.read()) != -1) {
			System.out.print((char) data);
		}
		bis1.close();
//		fis1.close();
	}

}
