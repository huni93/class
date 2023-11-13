package ch05_array;

import java.util.Scanner;

public class ExArray07 {

	public static void main(String[] args) {
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("임의의 수를  입력하세요 ");		  	
		int num = scan.nextInt(); */
	/*		int num = Integer.parseInt(args[0]);
			System.out.println(num);
			
		for (int i = 1; i <= num; i++) {
			boolean chk = false;
			for (int j = 1; j <= num; j++) {
				if (num % i ==0) {
					chk = true;
					break;
				}
				
			}
			if (chk)
				System.out.print( i + " "  );
		}  */            
			int num = Integer.parseInt(args[0]);{
			System.out.println(num);
			
			for (int i = 1; i <= num; i++) {
				if(num%i==0) {
					System.out.print(i+ " ");
				}
			}
			System.out.println();
		}
	}

}
