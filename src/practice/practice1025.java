package practice;

import java.util.Scanner;

public class practice1025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("삼각형의 높이를 입력하세요");
		  Scanner scan = new Scanner(System.in);
		  int len = scan.nextInt();
    
			for (int i = len; i >= 1; i--) {
				
				for (int j = 0 ; j <= (len * 2 - 1); j++) {
					if (len-i < j && j < len + i  )
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
				
			}				      
				for (int i = 1; i <= len; i++) {
					
					for (int j = 0 ; j <= (len * 2 - 1); j++) {
						if (len-i < j && j < len + i  )
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.println();
					
				}
	}
	

}
