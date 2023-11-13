package ch05_array;

public class ArrayEx08 {
    /*
     *46
     *47  37  
     *48  38  29
     *49  39  30  22
     *50  40  31  23  16
     *51  41  32  24  17  11
     *52  42  33  25  18  12  7
     *53  43  34  26  19  13  8   4
     *54  44  35  27  20  14  9   5  2
     *55  45  36  28  21  15  10  6  3  1 
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 배열 생성과 초기화
		int[][] arr = new int [10][];
		for (int i = 0; i < arr.length; i++) {
			arr [i] = new int [i+1];
		}
		int data = 0;
		for (int i = arr.length-1; i >=0; i--) {
			for (int j = i; j < arr.length; j++) {
				//System.out.print(j+"," + i + " ");
				arr[j][i]=++data;
			}
		//	System.out.println();
		}
		
		
		
		
		
		
		
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
		
	}
	    

}
