package ch03_op;

import java.util.Scanner;

/*
 * 화면에서 3자리 정수를 입력받아 100자리 미만을 버리고 출력하기
 * [결과]
 * 세자리 정수를 입력하세요
 * 321
 * 300
 * 
 * 세자리 정수를 입력하세요
 * 199
 * 100*/
public class ExOp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("세자리 정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		num =scan.nextInt(); //321
		System.out.println(num/100*100);
		System.out.println(num-(num%100));


	}

}
