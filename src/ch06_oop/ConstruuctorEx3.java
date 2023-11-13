package ch06_oop;

public class ConstruuctorEx3 {

	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3("blue");
		System.out.println("c1;"+c1);
		System.out.println("c2;"+c2);
	}
}
class Car3 {
	String color;   //색상
	String gearType; // 변속기 종류 - auto(자동) , manual (수동)
	int door;   //문의 개수
	Car3() {
		this("white", "auto", 4);
	}
	Car3(String color) {
		this(color, "auto", 4);
	}
	Car3(String color , String gearType, int door ) {
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	@Override
	public String toString() {
		return "Car3 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
	
}