package tw.satisfaction.myproject.oop.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStreamIOEx2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new FileReader("c:/temp/test/source.txt"));
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("c:/temp/test/tast_bufferwritter.txt",true));
		
		String data ;
		while ((data = br1.readLine())!=null){
			System.out.print(data);
			bw1.write(data);
			bw1.newLine();
		}
		bw1.flush();
		bw1.close();
		br1.close();
	}

}
