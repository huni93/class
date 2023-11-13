package ch10_util;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class ScannerEx2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("src/ch10_util/score.txt"));
		int sum = 0;
		int cnt = 0;
		while (sc.hasNext()) {
			String line = sc.nextLine();
			//System.out.println(line);
			String[] stu = line.split(",");
			System.out.print(stu[0]+":");
			sum = 0;  cnt = 0;
		for (int i = 0; i < stu.length-1; i++) {
			int num = Integer.parseInt(stu[i+1]);
			sum+=num;
			++cnt;
		    System.out.print(num + " ");
		}					
            System.out.println(sum + " "+ (double)sum/cnt);
	}	   
}
}
