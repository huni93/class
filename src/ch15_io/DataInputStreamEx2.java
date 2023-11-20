package ch15_io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx2 {

	public static void main(String[] args) {
		FileInputStream fis = null; // local변수 초기화
		DataInputStream dis = null;
		int sum = 0;
		try {
			fis = new FileInputStream("src/ch15_io/score.dat");
			dis = new DataInputStream(fis);
			
			while (true) {
				int score = dis.readInt();
				sum += score;
				System.out.println(score);
			}

		} catch (Exception e) {
			System.out.println("합계:" + sum);
	//		e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
