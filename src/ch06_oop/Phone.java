package ch06_oop;

public class Phone {
  String color;   //null
  boolean power;  //false
  String no;      //null
  
  void power( ) {
	  power = !power;
  }
  void send(String no) {
	  System.out.println(no + "로 전화 송신중~~");
  }
  void receive(String no) {
	  System.out.println(no + "로 전화 수신중~~");
  }
}
