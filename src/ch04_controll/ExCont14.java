package ch04_controll;

import java.util.Scanner;

public class ExCont14 {
 /*
  * 입력된 포인트에 가능한 모든 상품을 프린트 하세요
  * 0 ~ 199 : 상품이 없습니다
  * 200 ~ 399 : 새우깡
  * 400 ~ 599 : 핸드폰
  * 600 ~ 799 : 자동차
  * 800 ~ 999 : 아파트
  * 
  * 850 : 아파트, 자동차, 핸드폰, 새우깡
  * 730 : 자동차, 핸드폰, 새우깡
  * 160 : 상품이 없습니다.
  */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("포인트를 입력하세요 (1~1000) exit(9999)");
		int point = 0;
		
		while(true) {
			point = scan.nextInt();
			if (point==9999) break;
			
			switch (point/200) {
			case 0: System.out.println("상품이 없습니다"); break;
			case 4: System.out.println("아파트");
			case 3: System.out.println("자동차");
			case 2: System.out.println("핸드폰");
			case 1: System.out.println("새우깡");
			
			}
			
		}
	
	}
}


