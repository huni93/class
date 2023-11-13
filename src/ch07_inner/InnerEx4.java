package ch07_inner;

public class InnerEx4 {

	public static void main(String[] args) {
		//  I t = new I(); error
		I i = new I() {
			int iv = 100;
			@Override
			public void test() {
				System.out.println("iv=" + iv);
				System.out.println("this.iv=" + this.iv);
				System.out.println("I 내부 클래스의 test 메서드"); }};
				i.test();
			
			I i2 = new IInner();  //implements I  상속
			i2.test();
			Abs a = new Abs() {
				int iv = 100;
				@Override
				void test() {
				System.out.println("iv=" + iv);				
				System.out.println("this.iv=" + this.iv);
				System.out.println("I 내부 클래스의 test 메서드");												
}		};// 익명클래스의 경우 끝에 세미클론을 붙여준다.
	a.test();
}}

interface I {void test();}
abstract class Abs { abstract void test(); }
class IInner implements  I {
    int iv = 100;
	@Override
	public void test() {
		System.out.println("iv=" + iv);
		System.out.println("this.iv=" + this.iv);
		System.out.println("I 내부 클래스의 test 메서드");
		
	} 
}

