package ch09_lang;

public class StringEx4 {

	public static void main(String[] args) {
		String s = "HTML-CSS-JavaScript-Java-JSP-스프링";
		String[] subject = s.split("-");
		for (int i = 0; i < subject.length; i++) {
			System.out.println((i + 1) + ":" + subject[i]);			
		}
		s = "홍길동,김삿갓,이몽룡,성춘향,임꺽정";
		String[] names = s.split(",");
		for (String n : names) {
			System.out.println(n);
		}
		System.out.println("전체이름:" + names.length + "명");
	}
}
