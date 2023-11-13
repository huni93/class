package ch09_lang;
/*
 * String은 오버라이딩을 통해 같은 객체로 나타낸다.
 * String 객체는 equals() , hashCode()메소드를 재정의 하였슴
 */
public class EqualsEx2 {

	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		if(s1==s2)  {
			System.out.println("s1과 s2는 같은 객체임");
	}   else {
		    System.out.println("s1과 s2는 다른 객체임");
	}
		if(s1.equals(s2))  {
			System.out.println("s1과 s2는 같은 내용의 객체임");
	}   else {
		    System.out.println("s1과 s2는 다른 내용의 객체임");
	}
       System.out.println("e1.hashCode()="  +  e1.hashCode());
       System.out.println("e2.hashCode()="  +  e2.hashCode());
       System.out.println("s1.hashCode()="  +  s1.hashCode());
       System.out.println("s2.hashCode()="  +  s2.hashCode());      
	}
}
