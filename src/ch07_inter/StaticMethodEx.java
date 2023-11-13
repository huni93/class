package ch07_inter;

public class StaticMethodEx {

	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		System.out.println("======");
		a.method();
		b.method();
	}
}
//static 메소드는 오버라이딩이 되지 않는다. AB  // static을지우면 BB
class A  {
	static void method()  {
		System.out.println("A");
	}
}
class B extends A  {
	static void method()  {
		System.out.println("B");
	}
}