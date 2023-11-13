package ch07_oop;

public class SingletonEx { //이미 만들어진 참조변수의 중복 제거

	public static void main(String[] args) {
    // Singleton so = new Singleton();  // 생성자 접근 불가. 객체생성불가
	   SingleObject so1 = SingleObject.getObject();
	   SingleObject so2 = SingleObject.getObject();
	   
	   System.out.println(so1+","+so2);
	   System.out.println(so1==so2);
	   Object o1 = new Object();
	   Object o2 = new Object();
	   System.out.println(o1 + "," + o2);
	   System.out.println(o1==o2);
	   
	   System.out.println(so1.getValue());
	   System.out.println(so2.getValue());   so1.setValue(500);
	   System.out.println(so1.getValue());  //500
	   System.out.println(so2.getValue());  //500
	   if(so1 ==so2)
		   System.out.println
		   ("so1참조변수의 객체와 so2 참조변수의 객체는 같은 객체임.");	
	}
}
class SingleObject  {
	//Singleton은 이미 만들어진 참조 변수외에 다른 참조 변수를 만들 필가 없을때 작성함
	private static SingleObject obj = new SingleObject();
	private SingleObject()  {}   //생성자
	private int value = 100;
	//obj.value;
	public static SingleObject getObject() { //SingleObject.getObject ()
		    // SingleObject.gecObject()
		  return obj;  	}
	public int getValue()  { return value;	}
	
	public void setValue (int value)  {   //obj.value=5;
		this.value = value; 	}  }

















