package ch03_op;

import java.util.Scanner;

public class ExOp6 {
         /*
          * 원의 반지름을 입력받아 면적과 둘레를 구하시요
          * 반지름 : 5
          * [힌트]- 원주율은 3.141592입니다.
          * 
          * [결과] 면적 = 78.5398 둘레 = 31.41592
          */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("반지름을 입력하세요");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double pi = 3.141592; //pi는 변수명 
        System.out.println("면적:" + (r*r*pi));
        // 앞쪽 r*r 이 int가 되고 전체적으로 double이 된다
        
        System.out.println("둘레:" + (2*pi*r));
	}

}
