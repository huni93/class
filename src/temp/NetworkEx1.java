package temp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkEx1 {

	public static void main(String[] args) {
		URL url = null;
		BufferedReader input = null;
		String address = "https://n.news.naver.com/article/666/0000026423?cds=news_media_pc&type=editn";
		String line = "";
		try {
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			while((line=input.readLine()) !=null) {
				System.out.println(line);
			}
			input.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
