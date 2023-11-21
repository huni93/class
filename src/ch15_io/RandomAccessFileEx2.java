package ch15_io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {

	public static void main(String[] args) {
		//             번호, 국어, 영어,  수학 
		int[] score = { 1, 100,  90,  90,
				        2,  70,  90, 100,
				        3, 100, 100, 100,
				        4,  70,  60,  80,
				        5,  70,  90, 100
		};
		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile("src/ch15_io/score2.dat", "rw");
			  for (int i = 0; i < score.length; i++) {
				raf.writeInt(score[i]);
			}
			  // 4 * 20 
			  System.out.println("=============");
			  raf.seek(0);
			  while(true)  {
				  System.out.println(raf.readInt());
			  }
		}	  catch (FileNotFoundException e) {
			//	  e.printStackTrace();
		}     catch (IOException e)  {
           //	  e.printStackTrace();
		}	
	}// main

}
