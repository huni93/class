package ch07_oop;
/*
 * super() 생성자 : 부모클래스의 생성자 호출시 사용함.
 */
public class SuperEx1 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);
	}
}

class Super {
	int x;
	//default 생성자 없음
	Super(int x)  {	this.x = x; }	
}

class Child extends Super  {
	int y;
	public Child()  {
	super(10); 
	}
}
