package ch02_var;

/*
 * 실수형 리터널의 기본자료형은 double 임
 * float 리터널로 표시하기 위해서는 접미사를 붙여야 한다.
 *  F,f : float 리터널
 *  D,d : double 리터널
 *  L,l : long 리터널
 */
/*
 * 자료형
 *      기본형 - 논리형 : boolean(1bit)
 *            문자형 : char(2)
 *            정수형 : byte(1), short(2), int(4), long(8)
 *            실수형 : float(4), double(8)
 *      참조형 - 배열, 클래스, 인터페이스 
 */
public class VarEx1 {

	public static void main(String[] args) { // 실행 메소드
		// TODO Auto-generated method stub
        // 변서의 선언 및 초기화
		        byte b1 = -22;
		        byte b2; //변수의 선언. b2 저장공간 메모리 1바이트(8bit) 할당.
		        //바이트로 저장할 수 있는 값의 범위. -128 ~ 127 저장가능
		        //정수 리터럴은 기본 int
		        b2= -128; //변수의 초기화 		        
		        b1=127;		        		        
		        short s1 = -220; //2 byte 16bit
		        int i1 = 100;   //4 byte 32bit
		        long l1 =1000; // auto casting 8 byte 64byte
		        int i2 = (int) l1;//명시적 캐스팅
		        //변수값 내용을 화면에 출력하기
		        //System.out.println : 화면에 값을 출력.
		        System.out.println("b1=" + b1); //b1=-22
		        System.out.println("s1=" + s1);
		        System.out.println("i1=" + i1);
		        System.out.println("l1=" + l1);
		        //실수 리터럴은 기본 double 64bit		        
		        float f1 = 1.0F; //4byte
		         f1 = l1; //플롯타입이 더 작음에도 불구하고 
		                  //롱타임이 오토캐스팅 가능 F=float 
		         double d1  = 1.0;
		         double d12 = 1L;
		         
		         System.out.println("f1=" + f1);
		         System.out.println("d1=" + d1);		                   	        
		        
	}//main end

}//end class 
