package ch05_array;

public class ArrayEx06 {
    /*
     * 2차원 가변 배열의 초기화
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] arr = {
        		{10, 20 },
        		{30, 40 },
        		{50, 60, 70} }; //[3][?]
        
        for (int i = 0; i < arr.length; i++) {
       		for (int j = 0; j < arr[i].length; j++) { //2,2,3
       			System.out.print("arr[" + i +"][" + j + "])="
       					                + arr[i][j] + "\t");
       		}
       		System.out.println();
        }
	}

}
