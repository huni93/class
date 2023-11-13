package ch03_op;

import java.util.Scanner;

public class ExOp4 {
/*
 *  숫자를 입력받아서 양수인 경우는 양수로, 음수인 경우는 음수로, 0인 경우는 0 출력하기*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println((num > 0 )? "양수" : (num < 0)? "음수" : "0" );

	}

}
