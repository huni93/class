package ch08_exp;

public class ExceptionEx6 {

	public static void main(String[] args) {

         try {
			badmethod();  //1번
		} catch (Exception e) {
			System.out.println("main 에서 예외 처리");  //7번
			e.printStackTrace(); //8번
		}  
	}
private static void badmethod() throws Exception {  //6번
	try {
		throw new Exception ("예외 강제 발생");  // 2번 예외 발생
	} catch (Exception e) {
		System.out.println("badmethod 에서 예외 처리"); //3번
		e.printStackTrace(); //4번
		throw e;  //예외 재발생.  // 5번
	}
}
}