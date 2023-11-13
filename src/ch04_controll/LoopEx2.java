package ch04_controll;

public class LoopEx2 {
    /*
     * 반복문을 이용하여 1부터 10까지의 합 구하기
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for 구문을 이용하기");
		int i = 1;
		int sum =0;
		for (i=1; i<=10 ; i++) {
			sum += i;
		}
		System.out.println("1~10 까지의 합:" + sum);
		
		System.out.println("while 구문을 이용하기");
		i = 1;
		sum =0;
		while(i<=10) {
			sum +=i;
			i++;
		}
		System.out.println("1~10 까지의 합:" + sum);
		System.out.println("do while 구문을 이용하기");
		sum = 0;
		i = 1;
		
		do {
			sum +=i;
			i++;
		}  while (i <=10);
		System.out.println("1~10 까지의 합:" + sum);
		}
			
	}


