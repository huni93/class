package ch04_controll;

public class ExCont03 {
    /*
     * 중첩 반복문 : 반복문 내부에 반복문이 존재.
     *            구구단 가로 출력하기
     *            
     *  2*2=4  3*2=6  ....  9*2=18
     *  2*3=6  3*3=9  ....  9*3=27
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <=9 ; i++) {       	
        	
        	for (int j = 2; j <=9; j++) {
				System.out.print(j + "*" + i + "=" + (j*i)+ "\t");				
			}
        	System.out.println();
		}
	}
}


