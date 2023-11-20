package ch15_io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("src/ch15_io/buffered.txt");
		String data = null;
		while((data = br.readLine()) != null)  { //ctrl + z 로 멈춤
			System.out.println(data);
			fw.write(data + "\n");
		}
		// fw.flush();
		fw.close();

	}

}
