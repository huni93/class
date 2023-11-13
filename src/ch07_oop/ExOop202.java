package ch07_oop;
/*
 *   다형성 예제
 *   
 *    product  클래스
 *  멤버 변수 : int 가격(price), int 포인트(point)
 *  생성자 : 가격을 입력받고, 가격의 10%를 포인트로 저장.
 *    Tv 클래스 (parent class:Product)
 *  생성자(int) : 가격을 100 설정하기
 *  toString() 메서드에서 Tv를 리턴.
 *    Computer 클래스 (Parent class : Product)
 *  생성자(int) : 가격을 200 설정하기
 *  toString() 메서드에서 Computer를 리턴.
 *    SmartPhone 클래스  (parent class:product)
 *  생성자 (int) : 가격을 150 설정하기
 *  toString()  메서드에서 SmartPhone를 리턴
 */
public class ExOop202 {

	public static void main(String[] args) {
		Tv tv = new Tv(100);  //100
		Computer com = new Computer(200);  // 200
		SmartPhone sp = new SmartPhone(300); // 300
		System.out.println(tv);
		System.out.println(com);
		System.out.println(sp);
	}}
class Product  {
	 int price, point;
	 
      Product(int price) {
    	  this.price = price;
    	  this.point = price /10;
      }
}
class Tv extends Product  {
	Tv(int price)  {
		super(price);
	}
	public String toString()  {
		return "Tv:" + price;
	}
}
class Computer extends Product  {
	Computer(int price)  {
		  super(price);
	}
	public String toString()  {
		return "Computer:" + price;
	}
}
class SmartPhone extends Product  {
	SmartPhone(int price)  {
		super(price);
	}
	public String toString()  {
		return "SmartPhone:" + price;
	}
}












