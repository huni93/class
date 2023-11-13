package ch03_op;

import java.util.Scanner;

public class ExOp3 {
/*
 * 화면에서 금액을 입력받아 500,00,50,10,1 원 동전으로 바꾸기
 * 필요한 돈전의 갯수를 출력하기
 * [결과]
 * 금액을 입력하세요
 * 5641
 * 500원 : 11개
 * 100원 : 1개
 * 50원  : 0개
 * 10원  : 4개
 * 1원   : 1개
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin;
		System.out.println("금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		coin =scan.nextInt(); //5641
		/*System.out.println(coin / 500);
		System.out.println(coin / 100);
		System.out.println(coin / 50);
		System.out.println(coin / 10);
		System.out.println(coin / 1);*/
		System.out.println("500원 " +(coin/500)+"개");
		System.out.println("100원 " +(coin%100)+"개");
		System.out.println("50원 " +(coin%50)+"개");
		System.out.println("10원 " +(coin%10)+"개");
		System.out.println("1원 " +(coin%10)+"개");

	}

}
