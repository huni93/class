package ch14_lambda;
/*
 * 매개변수 존재, 리턴값이 없는 경우
 * 매개변수가 한개인 경우 () 생략 가능
 * 실행되는 구문이 한개인 경우 {} 생략 가능 
 */
@FunctionalInterface
interface LambdaInterface3 {
	void method(int x);
}
public class LambdaEx3 {

	public static void main(String[] args) {
		LambdaInterface3 f3;
		f3 = (x) -> {System.out.println(x*5);};
		f3.method(2);  //10
		f3.method(10);  //50
		f3 = (x) -> {System.out.println(x+x);};
		f3.method(10);  //20
		f3 = x -> System.out.println(x*3); //() , {} 생략
		f3.method(10);  //30
		LambdaInterface3 f4 = new LambdaInterface3() {
								
		@Override
	    public void method(int x) {
			print(x);  //method call
			
	    }	
		
	};
	f4.method(10); //13
	
	excute(x -> print(x), 3);  //x=3  답은 6
}//main end
	static void print(int x) {
		System.out.println(x+3);  
	}
	static void excute(LambdaInterface3 f3, int num) {
		f3.method(num);
	}
	
}//class end

	
	


