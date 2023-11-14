package ch13_thread;
/*
 * 동기화 : synchronized 예약어 표현.
 *   동기화 블럭  :
 *            lock 객체를 소유한 스레드만 동기화 영역을 실행
 *            lock 은 Object 객체여야 한다. 객체여야함.
 *            기본자료형은 lock으로 사용할 수 없다.
 *            모든 스레드가 공유하는 공유 객체여야 함.
 *   동기화메서드 : 
 */
class PrintThread extends Thread {
	char ch; 
	PrintThread(char ch)  {  this.ch = ch;  }
	static int[] aaa = new int [3];  //객체타입은 상관없음
	public void run()  {
		for (int i = 0; i < 20; i++) {
			synchronized(aaa)  {
			for (int j = 0; j < 80; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}}
public class ThreadEx05 {

	public static void main(String[] args) {
		Thread t1 = new PrintThread('A');
		Thread t2 = new PrintThread('B');
		Thread t3 = new PrintThread('C');
		t1.start(); t2.start(); t3.start();
	}
}
