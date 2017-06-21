package tw.satisfaction.myproject.oop.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStreamIOEx1 {

	public static void main(String[] args) throws IOException {
		FileReader fr1 = new FileReader("c:/temp/test/Hello.txt");
		FileWriter fw1 = new FileWriter("c:/temp/test/virus.txt");
		
		int data;
		while((data = fr1.read())!=-1){
			System.out.print((char)data);
			fw1.write(data);
		}
		fw1.close();
		fr1.close();

	}

}
