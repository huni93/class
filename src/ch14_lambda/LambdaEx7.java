package ch14_lambda;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * Supplier 인터페이스 예제
 * 매개변수는 없고, 리턴값은 존재 
 */
public class LambdaEx7 {

	public static void main(String[] args) {
		Supplier<String> s1 = ()-> {
			return "java1";};    //문장이 하나라서 return 생략가능 
		System.out.println(s1.get());
		
		Supplier<String> s2 = () ->"java2";
		System.out.println(s2.get());
		
		IntSupplier s3 = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;  };
		System.out.println("주사위:" + s3.getAsInt());
		IntSupplier s4 = () -> (int) (Math.random() * 6) + 1;
		System.out.println("주사위:" + s4.getAsInt());
		DoubleSupplier s5 = () -> {
			double d = Math.random();
			return d;};
	    System.out.println("임의의 실수 :" + s5.getAsDouble());
	    DoubleSupplier s6 = () -> Math.random();
	    System.out.println("임의의 실수 :" + s6.getAsDouble());
		}		
	}


