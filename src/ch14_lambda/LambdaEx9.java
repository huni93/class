package ch14_lambda;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

/*
 * Operator 인터페이스 예제 : apply 계열 추상 메서드 소유
 * 매개변수 있고, 리턴값도 존재. =>
 * 단 매개변수의 자료형과 리턴값의 자료형이 같다.
 * Function 인터페이스의 하위 인터페이스임.
 * result = op.applyAsInt(result, next); 
 */
public class LambdaEx9 {
    private static Student[] list = {
    		new Student("홍길동",90,80,"경영"),
    		new Student("김삿갓",95,70,"컴공"),
    		new Student("이몽룡",100,70,"수학")};
   
	public static void main(String[] args) {
		System.out.print("최대 수학값:");
		int max = maxOrMinmath((a,b) -> (a>=b)?a:b);
			max = maxOrMinmath((a,b) -> { if (a>=b) return a; else return b; });
			max = maxOrMinmath((a,b) -> { return ((a>=b)?a:b);});
		System.out.println(max);
		System.out.print("최소 수학값:");
	    System.out.println(maxOrMinmath((a,b)->(a<=b)?a:b));
	    
	    System.out.print("최대 평균값:");
	    System.out.println(maxOrMinAvg((a,b)->(a>=b)?a:b));
	    System.out.print("최소 평균값:");
	    System.out.println(maxOrMinAvg((a,b)->(a<=b)?a:b));
	}
	static double maxOrMinAvg(DoubleBinaryOperator op)  {
		double result = list[0].getMath() + list[0].getEng()/2;
		for (Student s : list) {
			//System.out.println(s.getMath() + "=");
			result = op.applyAsDouble(result, (s.getMath() + s.getEng())/(double)2);			
		}
		//System.out.println();
		return result;
	}
	
	static int maxOrMinmath(IntBinaryOperator op)  {
		int result = list[0].getMath();
		for (Student s : list) {
			//System.out.println(s.getMath() + "=");
			result = op.applyAsInt(result, s.getMath());			
		}
		//System.out.println();
		return result;
	}
}
