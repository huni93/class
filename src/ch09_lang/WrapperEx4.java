package ch09_lang;
/*
 *  switch 구문에서 조건값으로 사용할 수 있는 자료형
 *  
 *   byte, short, int, char, String
 *   Byte, Short, Integer, Character
 */
public class WrapperEx4 {

	public static void main(String[] args) {
	    Integer data = 1;
	    switch(data) {
	    case 1  : System.out.println("성공"); break;
	    default : System.out.println("실패"); break;
	    }
	}
}
