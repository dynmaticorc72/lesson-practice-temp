package tw.satisfaction.myproject.oop.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class TestNetWorkIOEx1 {
	
	public static void main(String[] args) throws IOException {
		String urlstr = "https://udn.com/news/story/7002/2537144";
		URL url = new URL(urlstr);
		
//		InputStream is = url.openStream();
//		InputStreamReader isr1 = new InputStreamReader(is);
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String data;
		while((data = br1.readLine())!=null){
			System.out.println("data:" + data);
		}
		
		br1.close();
	}

}
