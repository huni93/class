package ch09_lang;

public class ClassEx1 {

	public static void main(String[] args) {	
		Student s1 = new Student();
		s1.num = 99;
		s1.name = "김자바";
		System.out.println("s1:" + s1);
		Student s2;
		
	try {
		Class<?> c = Class.forName("ch09_lang.Student");
		 s2 =        (Student) c.newInstance();
		 s2.num = 10;
	     s2.name = "잘몰라";
		 System.out.println("s2:" + s2);
		 System.out.println("s2==s1:" + (s2==s1));
		 		 		 		 
	}  catch (ClassNotFoundException e ) {
		e.printStackTrace();
		
	}  catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}  catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}}
class Student {
	int num;
	String name;
	
	@Override 
	public String toString()  {
		return num + ":"+name;		
	}
}