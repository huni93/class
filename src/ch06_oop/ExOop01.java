package ch06_oop;

public class ExOop01 {
    /*
     * 1) 직사각형 (Rectangle) 클래스 만들기
     * 가로(width) , 세로(height)의 변수를 가지고 있는
     * 
     * 모든 멤버의 접근제한자는 생략한다
     * 모든 멤버는 instance 멤버이다
     * 멤버 메서드로는 넓이를 print하는 area(),둘레를 print하는 length()를 가진다.
     */
	/*  출력
	 * 넓이 : 10*5=50
	 * 둘레 : (10+5)*2=30
	 * 넓이 : 30*20=60
	 * 둘레 : (30*20)*2=100
	 */
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle ();
		r1.width=10;
		r1.height=5;
		r1.area();
		r1.length();
		//가로 : 30, 세로가 20인 직사각형의 객체를 생성하고, 넓이, 둘레를 출력하기
		Rectangle r2 = new Rectangle();
		r2.width=30;
		r2.height=20;
		r2.area();
		r2.length();

	}

}
class Rectangle {
	int width;
	int height;
	Rectangle(){}
	Rectangle(int w, int h) {
		width =w;
		height=h;
	}

    void area() {
    	System.out.println("넓이:"+width+ "*" + height + "="+(width*height));
    }
    void length() {
    	System.out.println("둘레:("+width+"+"+height+")*2=" 		
    			+((width+height)*2));
    }
}