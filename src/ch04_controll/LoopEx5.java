package ch04_controll;

import java.util.Scanner;

public class LoopEx5 {
    /*
     * 무한 반복 (루프) : 절대 종료되지 않는 프로그램.
     * 화면에서 숫자를 입력받기. 99999 숫자 입력되면 입력을 종료함.
     * 입력 종료시 숫자의 총합과 평균을 구하기
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum = 0;
        int cnt = 0; //count 
        System.out.println("숫자를 입력하세요:99999");
        Scanner scan = new Scanner(System.in);
        while(true) {                   //무한 반복 
        	  int num = scan.nextInt();
        	  if(num==99999) break;
        	  cnt ++;
        	  sum +=num;
       
        }
        System.out.println("총합 :" + sum);
        System.out.println("평균 :" + (double)sum/cnt);
	}

}
