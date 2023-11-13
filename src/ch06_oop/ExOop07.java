package ch06_oop;
/*
 * 원(Circle) 클래스 구현하기
 *  1. 멤버변수
 *       반지름(r),x좌표(x),y좌표(y), 원의번호(no)
 *       원의번호 생성 변수 static count
 *  2. 생성자 : new Circle(r,x,y);  new Circle(x,y); new Circle(r);
 *  3. 멤버메서드
 *     (1) double area()  : 원의 넓이 리턴. Math.PI 상수 사용  (Math.PI *(r*r)
 *     (2) double length(): 원의 둘레 리턴. Math.PI 상수 사용  ( 2*Math.PI*r)
 *     (3) void move(int a, int b): x,y좌표를 x+a, y+b로 이동.
 *     (4) void scale(double m): 반지름을 m배 확대/축소. r=r*m
 *     (5) String toString() :
 *         1번원 : 반지름:10, 좌표:(10,10), 넓이:314.xxx, 둘레:xxx.xxx
 *         ... */

/*
1번원=>반지름:10, 좌표(10,10), 넓이:314.159, 둘레:62.832
1번원=>반지름:10, 좌표(20,20), 넓이:314.159, 둘레:62.832
1번원=>반지름:30, 좌표(20,20), 넓이:2827.433, 둘레:188.496
2번원=>반지름:1, 좌표(20,20), 넓이:3.142, 둘레:6.283
2번원=>반지름:1, 좌표(30,30), 넓이:3.142, 둘레:6.283
2번원=>반지름:3, 좌표(30,30), 넓이:28.274, 둘레:18.850
3번원=>반지름:100, 좌표(0,0), 넓이:31415.927, 둘레:628.319
3번원=>반지름:100, 좌표(10,10), 넓이:31415.927, 둘레:628.319
3번원=>반지름:300, 좌표(10,10), 넓이:282743.339, 둘레:1884.956
*/
public class ExOop07 {

	public static void main(String[] args) {
		Circle[] carr= new Circle[3];  
		carr[0] = new Circle(10,10,10);  //반지름 : 10, (10,10) 좌표
		carr[1] = new Circle(20,20);     //반지름 : 1,  (20,20) 좌표
		carr[2] = new Circle(100);       //반지름 : 100,(0,0) 좌표
		for(Circle c : carr) {
			System.out.println(c);
			c.move(10,10);
			System.out.println(c);
			c.scale(3);
			System.out.println(c);
		}
	}
}

class Circle {
    double r; int x,y,no; static int count;
	Circle(int r, int x, int y) {
		this.r = r;   this.x = x;   this.y = y;
		no =++count; }
    Circle (int x, int y) {   this (1, x, y); }
    
    Circle (int r)  { this (r, 0, 0);   }
    
    double area  () {  return Math.PI * (r*r); }
    double length() {  return 2 * Math.PI *r;  }
    void move(int a, int b)  {this.x+=a;   y+=b;  }
    void scale(double m)  {r=r*m;  }
    
    public String toString()   {
    	return
        no + "번원 : 반지름:" +(int)r + ",좌표 :(" +x+","+y+"), 넓이 :"
           + String.format("%.3f", area() )
           + ", 둘레:" + String.format("%.3f",length());
    }
	}
