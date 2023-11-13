package ch10_util;
/*
 * StringTokenizer 클래스는 문자열을 구분자를 이용하여 분리할 때 사용한다.
 */
import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		String source = "100,200,300,400";
		StringTokenizer st =  new StringTokenizer(source, ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("==================");
	    String expression = "x=100*(200+300)/2";
	    StringTokenizer st1 =
	    		new StringTokenizer (expression, "+-*/=()", false); 
	    //false 를 붙이면 기호를 빼고 출력된다. 아무것도안쓰면 false가 됨
	    
	    while(st1.hasMoreTokens()) {
	    	System.out.println(st1.nextToken());
	    }
	}// main의 끝
}
