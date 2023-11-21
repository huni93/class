package ch15_io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx3 {

	public static void main(String[] args) {
		int sumkor = 0;
		int sumeng = 0;
		int summath = 0;

		try {

			RandomAccessFile raf = new RandomAccessFile("src/ch15_io/score2.dat", "r");
			int i = 4;
			raf.seek(i);
			while (true) {
				
				sumkor += raf.readInt();
				sumeng += raf.readInt();
				summath += raf.readInt();
				i +=16;
			}

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
		} catch (IOException e) {

			System.out.println("sumkor:" + sumkor);
			System.out.println("sumeng:" + sumeng);
			System.out.println("summath:" + summath);
			// e.printStackTrace();
		}
	}
}