package tw.satisfaction.myproject.oop.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestByteConvertCharStreamIOEx2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Please Input Your Secret:(use Q or q to exit)");
		InputStream is1 = System.in;
		InputStreamReader isr1 = new InputStreamReader(is1);
		BufferedReader br1 = new BufferedReader(isr1);

		String data;
		while ((data = br1.readLine()) != null) {
			if (data.equalsIgnoreCase("Q")) {
				System.out.print("bye bye");
				br1.close();
				isr1.close();
				is1.close();
				System.exit(-1);
			}
			System.out.println("data : " + data);
			
			File file1 = new File(data);

			if (file1.exists()) {
				System.out.println("File Exists.");
			} else {
				System.out.println("File Not Found.");
			}

		}

	}

}
