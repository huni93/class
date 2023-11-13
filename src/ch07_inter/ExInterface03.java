package ch07_inter;
public class ExInterface03 {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		Television r1 = new Television();
		r1.num=8;
		r1.turnOff();
		
		rc.turnOn(); //Tv를 켭니다. //Tv의 볼륨을 10으로 설정합니다. //Tv를 끕니다.
		rc.setVolume(10); rc.turnOff(); rc.setMute(true); //무음 처리합니다.
		
		rc = new Audio();
		rc.turnOn();  //Audio를 켭니다.
		rc.setVolume(20); //Audio의 볼륨을 20으로 설정합니다.
		rc.turnOff(); //Audio를 끕니다.
		rc.setMute(false); //무음을 해제합니다.
		RemoteControl.changeBattery();  //건전지를 교환합니다.
	}
}
interface RemoteControl1 {}

interface RemoteControl {
	void turnOn(); void turnOff(); void setVolume(int volume);
	default void setMute (boolean state) {
		if(state) System.out.println("무음 처리합니다.");
		else System.out.println("무음을 해제합니다.");   }
	static void changeBattery()  {
		System.out.println("건전지를 교환합니다.");   }}

class Television implements RemoteControl,RemoteControl1 {
	int num = 0;
	@Override
	public void turnOn()  { System.out.println("TV를 켭니다.");}
	@Override
	public void turnOff()  { System.out.println("TV를 끕니다.");}
	@Override
	public void setVolume(int volume) {
		System.out.println("Tv의 볼륨을" + volume + "으로 설정합니다.");
	}
}
class Audio implements RemoteControl{

	@Override
	public void turnOn() {	System.out.println("Audio를 켭니다.");	
	}
	@Override
	public void turnOff() {	System.out.println("Audio를 끕니다.");	
	}
	@Override
	public void setVolume(int volume) {	
		System.out.println("Audio의 볼륨을" + volume + "으로 설정합니다.");
	}	
}
















