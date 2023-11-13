package ch03_op;

import java.util.Scanner;

/*
 * 조건 연산자 (삼황 연산자)
 *  (조건식) ?참 : 거짓3
 *  
 * 조건 연산자는 조건문으로 변경이 가능함.*/
public class OpEx09 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String result = (score >= 60) ? "합격" : "불합격";
		System.out.println(score + "점은" + result + "입니다.");
		
		

	}

}
