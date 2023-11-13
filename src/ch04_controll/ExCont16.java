package ch04_controll;

import java.util.Scanner;

public class ExCont16 {
	/*	
	숫자를 입력하세요 
	8
	***************
	 ************* 
	  ***********  
	   *********   
	    *******    
	     *****     
	      ***      
	       *       
	      ***      
	     *****     
	    *******    
	   *********   
	  ***********  
	 ************* 
	***************
	*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println("삼각형의 높이를 입력하세요");
		  Scanner scan = new Scanner(System.in);
		  int len = scan.nextInt();
		  	  
		  
		  for(int i=len; i>=1; i--) {
		         for(int j=0; j<len-i; j++) {
		            System.out.print(" "); 
		         }
		         for(int j=1; j<=(i*2)-1; j++) {
		            System.out.print("*");
		         }
		         System.out.println();
		      }
		      
		      for(int i=1; i<=len; i++) {
		         for(int j=1; j<=len-i; j++) {
		            System.out.print(" ");
		         }
		         for(int j=1; j<=(i*2)-1; j++) {
		            System.out.print("*");
		         }
		         System.out.println();
		      }
		   
		      
		      
		      
		      
		   }
				
			}*/
	/*	System.out.println("삼각형의 높이를 입력하세요");
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
				for (int i = 2; i <= len; i++) {
					
					for (int j = 0 ; j <= (len * 2 - 1); j++) {
						if (len-i < j && j < len + i  )
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.println();
					
				}*/
		System.out.println("숫자를 입력하세요.");
		  Scanner scan = new Scanner(System.in);
		  int num = scan.nextInt();
		  int start = 1;
		  int end = (num * 2 - 1);
		  for (int i = 1; i <= (num * 2 - 1); i++) {
			for (int j = 1; j <= (num * 2 - 1); j++) {
				System.out.print((start <= j && end >= j) ? "*" : " ");
			}
			
			if (i < num) {
				start++;
				end--;
			} else {
				start--;
				end++;
			}
			System.out.println();
		}
	}
	

}




	

