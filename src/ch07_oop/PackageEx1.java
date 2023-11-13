package ch07_oop;

import java.util.Date;

import temp.Pack2;

public class PackageEx1 {

	public static void main(String[] args) {
		String str = " " ;
		Pack1 p1 = new Pack1();
		p1.method();
		Pack2 p2 = new Pack2();  //temp.Pack2
		p2.method();
		Date d = new Date();
	}
}
class Pack1  {
	void method()  {
		System.out.println("Pack1.method() 호출됨");
	}
}
