package ch06_oop;
  /*
   *   main 메서드에서 Animal 클래스의 객체생성이 되도록 생성자를 구현하기
   *   name : 동물이름
   *   age  : 나이
   *   
   *    
   *   결과 
   *   원숭이 : 26
   *   
   *   1)new Animal ("원숭이",26)
   *   2) toString() 구현
   */
public class ExOop05 {

	public static void main(String[] args) {
		Animal a = new Animal ("원숭이", 26);
		System.out.println(a);

	}
}
class Animal {
	String name;
	int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + ":" + age;
	}
	
	
}
