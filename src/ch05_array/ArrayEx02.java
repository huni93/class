package ch05_array;

public class ArrayEx02 {
    /*
     * 배열의 선언시 초기화를 하는 예제
     * 배열의 선언 + 생성(주소) + 초기화 한번에 하는방식
     * 
     * 1. =new int [5]  : 생성만 
     * 
     * 2. = { 10, 20, 30, 40, 50 } ;   : 생성(주소) + 초기화 까지
     * 
     * 3. = new int [] { 10, 20, 30, 40, 50 } ;   : 생성(주소) + 초기화
     * 
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {10, 20, 30, 40, 50};
        for (int a : arr) {
			System.out.println(a + ",");
		}
        System.out.println();
       for (int i = 0; i < arr.length; i++) {
		System.out.println("arr[" + i +"] = " + arr[i]);
	}
        System.out.println();
        // 생성 + 초기화
        arr = new int [] { 100, 200, 300 };
        for (int a : arr) {
			System.out.println(a + ",");
			
		}
        System.out.println();
}
}