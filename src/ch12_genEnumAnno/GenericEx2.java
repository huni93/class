package ch12_genEnumAnno;

public class GenericEx2 {

	public static void main(String[] args) {
		Poo102<String> gen = new Poo102<String>();			
		gen.set("그랜져");  //Object  <---String type		
		String name = (String) gen.get();
		System.out.println(name);
		Poo102<MyClass02> gen1 = new Poo102<MyClass02>();
		gen1.set(new MyClass02()); //Object <---MyClass type
		MyClass02 g = gen1.get();
		System.out.println(g);	

        Poo102<Integer> gen2 = new Poo102<Integer>();
        gen2.set(300); //Object <---MyClass type
        int num = gen2.get();
        System.out.println(num);	}  }
/*
 * 타입을 정하지 않은 변수를   Poo101 class의 멤버로 구현한다.
 */
 
class MyClass02  {
	@Override
	public String toString()  {     return "MyClass02"; }}

class Poo102 <T> {
	private  T t;
	public void set(T t)  {
		this.t = t; }
	public T get()  {  return t;	}	}