package ch16_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 *  InetAddress 클래스 : IP 주소 정보 저장하는 클래스
 *   InetAddres getByName("도메인 이름")
 *   InetAddres[] getAllByName("도메인 이름")
 *   InetAddress getByAddress(byte[]) : 숫자형태로
 *   InetAddress getLocalHost()  :  내컴퓨터의 IP 주소 리턴 
 */
public class InetAddressEx1 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.google.com");
		System.out.println("getByName 메서드 호출");
		System.out.println("hostname:" + ip.getHostName()); //도메인
		System.out.println("hostaddress:" + ip.getHostAddress());//숫자 형태의 주소 
		InetAddress[] ips = InetAddress.getAllByName("www.google.com");
		System.out.println("getAllByName 메서드 호출");
		for (InetAddress i : ips) {
			System.out.println("ip 주소:" + i);
		}
		System.out.println("getLocalHost 메서드 호출");
		InetAddress local = InetAddress.getLocalHost(); //내컴퓨터 IP주소
		System.out.println("내컴퓨터:" + local);

	}

}
