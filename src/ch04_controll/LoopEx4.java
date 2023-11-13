package ch04_controll;

public class LoopEx4 {
    /*
     * 그외 제어문 
     *   break : 반복문이나 switch 구문을 빠짐
     *   continue : 반복문의 처음으로 제어를 이동
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <=9 ; i++) {
        	System.out.println("\n" + i + "단"); // \n 다음 단으로 넘어가는 기호
			for (int j = 2; j <=9; j++) {
				
				//if (j==5) break; 4단까지
				if (j==5) continue; //5단만 없어짐
				System.out.println(i +"*"+j+"="+(i*j));
			}
		}
	}

}
