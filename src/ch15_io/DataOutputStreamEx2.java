package ch15_io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx2 {

	public static void main(String[] args) {
		int[] score = { 100, 90, 95, 85, 50 };
		try {
			FileOutputStream fos = new FileOutputStream("src/ch15_io/score.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			for (int i = 0; i < score.length; i++) {
				dos.writeInt(score[i]);
			}
			dos.close();
		}  catch (IOException e ) {
			e.printStackTrace();
		}

	}// main

}
