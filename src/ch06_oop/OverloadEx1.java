package ch06_oop;
/*
 * 오버로딩 예제
 *   같은 클래스 내부에 같은 이름을 가진 메서드가 여러개 존재할 수 있다.
 *   단 매개변수의 자료형의 갯수, 순서, 타입이 달라야 한다. 
 *                   => 매개변수이름이 아니고 **자료형**으로 판단함.
 */
class Math3 {
	int a = 100;
	int add(int b) {
		System.out.print("1:");
		return a + b;   }
	double add(float b) {
		System.out.print("2:");
		return a + b;   }
	double add(double b) {
		System.out.print("3:");
		return a + b;   }
	double add(long b) {
		System.out.print("4:");
		return a + b;   }
	String add(String b) {
		System.out.print("5:");
		return a + b;   }
	}

public class OverloadEx1 {

	public static void main(String[] args) {
		Math3 m = new Math3();
		System.out.println(m.add(10));
		System.out.println(m.add(10.3));
		System.out.println(m.add("번"));

	}

}
