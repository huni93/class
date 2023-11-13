package ch04_controll;

import java.util.Scanner;

public class ExCont10 {
    /*
     * 화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기
     * [결과]
     * 삼각형의 높이를 입력하세요
     * 삼각형 높이를 입력하세요 :
     * 7
     *           *
     *          **
     *         ***
     *        ****
     *        ~~ 
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요 : ");		  
		  int len = scan.nextInt();
		  
		  for (int i = len; i >= 1; i--) {
				 // System.out.println(i);
				  for (int j = 1; j <=len ; j++) {
					    if (j<i)System.out.print(" ");
					    else
						System.out.print("*");
					}
					System.out.println();
				

}
}
}