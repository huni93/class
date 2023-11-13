package ch06_oop;

public class ConstruuctorEx2 {
    /*
     * 생성자도 오버로딩이 가능하다.
     */
	public static void main(String[] args) {
		Car c1 = new Car("blue", 1234);
		Car c2 = new Car("red");
		Car c3 = new Car(1234);
		Car c4 = new Car(c1);
		System.out.println("c1:" +c1);
		System.out.println("c2:" +c2);
		System.out.println("c3:" +c3); 
		System.out.println("c4:" +c4);

	}

}
class Car {
	String color;
	int number;
	Car(String color, int n) {
		this.color=color;
		number=n;
    }
	Car(String color) {	
		this.color=color;
		number=1;
    }
	Car(int n)  {
		this.color="white";
		number=n;
    }
	Car(Car c)  {
		this.color=c.color;
		number=c.number;
    }
	@Override
	public String toString() {
		return "Car [color=" + color + ", number=" + number + "]";
	}
	
}