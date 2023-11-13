package ch08_exp;
/*
 *   throws 예외 처리
 *   throws Exception를 처리한 메소드는 콜한 메소드에서 처리 하여야함
 *   단  RuntimeException은 처리 하지 않아도 됨.
 */
public class ExceptionEx5 {

	public static void main(String[] args) {
		try {
             first(); 
         } catch (Exception e) {
        	 e.printStackTrace();
         } }
	private static void first() throws Exception  {
		second();
		System.out.println("first");
	}
	private static void second() throws Exception  {
		System.out.println("second 메서드");
		//NumverFormatException 예외 발생
		System.out.println(Integer.parseInt("abc"));
	}
}
