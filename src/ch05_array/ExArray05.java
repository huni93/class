package ch05_array;

public class ExArray05 {
    /*
     *  1부터 100까지 임의의 수 10개를
     *  배열에 저장하고, 정렬하여 출력하기
     *  단 Arrays.sort() 메서드는 사용하지 않기 
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int [10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}		
		   // ascending sort
		  for (int i = 0; i < arr.length; i++) {
	        	boolean change = false; // 안바뀌는걸 가정
	        	for (int j = 0; j < arr.length -1 -i; j++) {
	        		if (arr[j] > arr[j + 1]) {
	        			int temp = arr[j];
	        			arr[j] = arr[j + 1];
	        			arr[j+1] = temp;
	        		    change=true;//바뀌면 참
				}	
	        		
			}   
	        	if (!change) break;			        			
	}
		  for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
		  }
		 System.out.println();

}
}
