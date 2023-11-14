package ch14_lambdaStream;
/*
 * 람다식 예제 : jdk 8.0 이후 버전에서 사용가능.
 * 람다식에서 사용할 수 있는 인터페이스는 반드시 FunctionalInterface여야함
 * @FunctionalInterface : 인터페이스에는 추상메서드가 한개임.
 * 매개변수가 없고, 리턴값도 없는 경우
 * 매개변수 없음 : () -> {.... }
 * 람다식 내부에 실행되는 구문이 한개인 경우 {  } 생략 가능
 */
public class LambdaEx1 {

	public static void main(String[] args) {
		// 기존의 방식으로 코딩
		LambdaInterface1 fi = new LambdaInterface1()  {
			@Override
			public void method()  {
				System.out.println("1) 기존방식으로 코딩");
			}};
			fi.method();
			fi = () -> {
				String str = "2) method call1";
				System.out.println(str);			
			};
			fi.method();
			//한줄이면 {} 생략
			fi = () -> System.out.println("3) method call3"); 
			fi.method();
			excute(() -> {
				String str = "4) method call4";			
			 System.out.println(str);});
			excute(() -> System.out.println ("5) method call5"));
							
			
	}
	static void excute(LambdaInterface1 fi) {
		fi.method();
	}
}

@FunctionalInterface
interface LambdaInterface1 {
	void method();
}