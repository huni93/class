package ch07_oop;

public class BikeEx1 {

	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());  //출발 버튼을 누른다.
		System.out.println("바퀴" + ab.wheel + "개가 굴러간다.");
		System.out.println(ab.stop());   //정지 버튼을 누른다.
		System.out.println("천천히 멈춘다.");
		System.out.println("================");
		Bike bi = new Bike(2);
		System.out.println(bi.drive());  //bike 페달을 밟는다.
		System.out.println("바퀴" + bi.wheel + "개가 굴러간다.");
		System.out.println(bi.stop());   //bike 브레이크를 잡는다.
		System.out.println("천천히 멈춘다.");   }  }


class Bike  {
	int wheel;
	Bike(int wheel) {  this.wheel = wheel; }  //default 생성자 없음
	String drive() { return "bike 페달을 밟는다.";  }
    String stop()  {  return  "bike 브레이크를 잡는다.";}}
class AutoBike extends Bike {
	boolean power;
	AutoBike(int wheel)  {   super(wheel);   }
	void power()   {   power = !power;  }
	
	@Override
     String drive() {
		if(!power) power();     return "출발 버튼을 누른다";  }
	@Override
	 String stop() {   if (power)  return  "정지 버튼을 누른다";
	 else              return "이미 정지되어 있음.";  }}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

