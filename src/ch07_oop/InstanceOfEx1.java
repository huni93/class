package ch07_oop;
/*
 *  instanceof 예제
 *  객체를 찾을수 없을때 찾게해주는 속성
 */
public class InstanceOfEx1 {

	public static void main(String[] args) {
		Parent4 p = new Parent4();
		if (p instanceof Child4)  {
			System.out.println("p 참조변수 객체는 Child4 객체다");
			Child4  c = (Child4) p;
			System.out.println(c.x);
			c.method();    }
		if (p instanceof Parent4) {
			System.out.println("p 참조변수 객체는 Parent4 객체다");  }
		/*
		 * 모든 클래스는 Object 클래스를 상속 받는다. 
		 *       => 모든 객체는 Object 객체를 포함한다.
		 * 참조변수로 참조가 가능하다. 
		 */
		if (p instanceof Object) {
			System.out.println("p 참조변수 객체는 Object 객체다");
			Object o = p;
			System.out.println(p.x);
	//		System.out.println(o.x);
	//      x는 Object 클래스의 멤버가 아니다. 접근할 수 없다.
			}
		}
	}

class Parent4  {
	int x = 10;
}
class Child4 extends Parent4  {
	int x = 20;
	
	void method() {
		System.out.println("child method");
	}
}