package ch07_inter;
public class ExInterface01 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat();
		if (a instanceof Flyable)  { // true
			Flyable f = (Flyable) a;
			f.fly();
		}
		a = new Monkey();
		a.eat();
		if (a instanceof Flyable)  { // false
			((Flyable) a).fly(); 
		}
	}
}
abstract class Animal  {
	String name;
	Animal(String name)  {  this.name=name;  }
	abstract void eat(); }
interface Flyable { void fly();  }
class Dove extends Animal implements Flyable {
	Dove()    {   super("비둘기");  }
	
	@Override
	public void fly() {
		System.out.println(name + "은 날아 다니는 새입니다.");  }
	@Override
	void eat() {
		System.out.println(name + "는 작은 벌레를 잡아 먹는다.");  }}

class Monkey extends Animal {
	Monkey() {   super ("원숭이");  }
	void eat()  {
		System.out.println(name + "는 나무에서 열매를 따 먹는다.");
	}	
	}














