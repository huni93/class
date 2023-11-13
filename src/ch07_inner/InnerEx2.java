package ch07_inner;
//지역내부클래스에서 사용되는 메서드의 지역변수는 상수화(final) 되어야 한다.
public class InnerEx2 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(1111);	}}
class Outer2 {
	private static int outercv = 20;
	private int outeriv = 10;
	void method(int pv) {
		//지역내부클래스에서 사용되는 메서드의 지역변수는 상수화(final) 되어야 한다.
		int i = 0;
		 //pv++;
		//i++;  //final 아님
		outeriv++;
		class LocalInner { // 지역내부클래스
			int liv = outeriv;  //외부클래스의 private 멤버 접근 가능
			int liv2 = outercv;  //외부클래스의 private 멤버 접근 가능
			void method()  {
				//지역 내부클래스에서 내부클래스가 속한 메서드의 지역변수 변경 안됨
				//i = 100;  ==int를 쓰면 가능. i++;
				//pv++;  // ==int pv =0; pv++; 
				System.out.println("i=" + i);
				System.out.println("pv=" +pv);
				System.out.println(liv + "," + liv2);
				System.out.println(outeriv + "," + outercv);
				//외부클래스의 private 멤버 접근 가능 
							}		}
		LocalInner li = new LocalInner();
		li.method();  }}
	
