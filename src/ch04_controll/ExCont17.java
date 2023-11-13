package ch04_controll;

import java.util.Scanner;

public class ExCont17 {
	/*
	 * 입력된 수 보다 작은 솟수를 프린트 하세요 
	 * 
	 */

	public static void main(String[] args) {
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("임의의 수를  입력하세요 ");
		int num = scan.nextInt();
		int sum1 =0, sum2=0;	
		 for (int i = 1; i <= num; i++) {
			 if(i%2==0 || i%3==0 || i%4==0 || i%5==0 || i%6==0 || i%7==0 || i%7==0 || i%9==0)   { 
				 sum1 +=i;
			 } else { 
				 sum2 = i;
			 }			 
	}
		 System.out.println(sum2); */
		Scanner scan = new Scanner(System.in);
		System.out.println("임의의 수를  입력하세요 ");
		int num = scan.nextInt();
		for (int i = 2; i < num; i++) {
			boolean chk = true;
			for (int j = 2; j < i; j++) {
				if (i % j ==0) {
					chk = false;
					break;
				}
				
			}
			if (chk)
				System.out.print(i + " ");
		}
	}
}
