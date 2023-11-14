package ch13_thread;
/*
 * Thread 예제1
 * Thread 생성
 *   1. Thread 클래스 상속 => Thread1.java
 * start() 기능
 *   1. 스택영역을 병렬화 함.
 *   2. 자신의 스택 영역에 run()메서드 호출 
 */
class Thread1 extends Thread {
	Thread1 (String name) {
		super(name);  }

	@Override
	public void run()   {   //Running 상태
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "=" + getName());
			
			try {
				sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //1000밀리초 = 1초 대기, 대기상태
		}}}  //Dead 상태
public class ThreadEx01 {

	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Thread1 t1 = new Thread1 ("First");  //New 상태
		Thread1 t2 = new Thread1 ("Second");  //New 상태
		t1.start(); //Runnable 상태
		t2.start(); //Runnable 상태
        /*
         *  start() 기능
         *  1. 스택영역을 병렬화 함.
         *  2. 자신의 스택 영역에 run()메서드 호출 
         */
		// t1.run(); t2.run();
		System.out.println("main 스레드 종료");
	}
}
