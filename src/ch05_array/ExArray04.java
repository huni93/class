package ch05_array;

public class ExArray04 {
    /*
     * 1~9까지의 숫자 중 중복되지 않는 3자리 숫자를 임의로 생성하는 프로그램 작성하기
     */
	public static void main(String[] args) {
		// 1~ 9 까지 초기화
		int[] arr = new int [9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < 1000; i++) {
			int f = (int) (Math.random() * 9); // 0~ 8 index
			int t = (int) (Math.random() * 9); // 0~ 8 index
			// swap 알고리즘
			int tmp = arr[f];
			arr[f] = arr[t];
			arr[t] = tmp;			
		}
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
}
}
