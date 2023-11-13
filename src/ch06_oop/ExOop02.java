package ch06_oop;
/*
 *  Rectangle 객체를 3개 저장할 배열 을 생성하기
 *  0번직사각형: 가로 : 10, 세로 : 20
 *  1번직사각형: 가로 : 11, 세로 : 21
 *  2번직사각형: 가로 : 12, 세로 : 22
 *  인 객체를 생성하고,
 *  각각의 넓이와 둘레 출력하기  
 */
public class ExOop02 {

	public static void main(String[] args) {
		Rectangle arr[] = new Rectangle[3];				
		Rectangle r1 = new Rectangle ();
		r1.width=10;		r1.height=20;
		
		Rectangle r2 = new Rectangle();
		r2.width=11;		r2.height=21;

		Rectangle r3 = new Rectangle();
		r3.width=12;		r3.height=22;
        arr[0]=r1;
        arr[1]=r2;
        arr[2]=r3;
        
        for (Rectangle r: arr) {
			r.area();
			r.length();
		}
        System.out.println("=======================");
        Rectangle arr2[] = new Rectangle[3];
        for (int i = 0; i < arr2.length; i++) {
        	arr2[i]=new Rectangle();
        	arr2[i].width=10+i;
        	arr2[i].height=20+i;
        	arr2[i].area();
        	arr2[i].length();
		}
        System.out.println("=======================");
        Rectangle arr3[] = new Rectangle[3];
        for (int i = 0; i < arr2.length; i++) {
        	arr2[i]=new Rectangle(10+i,20+i);
        	arr2[i].area();
        	arr2[i].length();
		}
	}
}
