package ch05_array;

import java.util.Arrays;

public class ArrayEx11 {
    /*
     * 배열의 복사 : Arrays 클래스 이용하기
     * 
     * int[] Arrays.copyOf (int[] original, int newLength)
     */
	public static void main(String[] args) {
		 int score1[] = {90,80,70};
         int score2[] = Arrays.copyOf (score1, 5);
         
         for(int s : score2) {
        	 System.out.print(s + " ");
         }
         System.out.println("Arrays.toString(score2)");
         System.out.println(Arrays.toString(score2));
	}
}
