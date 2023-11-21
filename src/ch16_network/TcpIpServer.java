package ch16_network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		//서버소켓을 생성하여 7777번 포트와 결합(bind) 시킨다.
		try {
			serverSocket = new ServerSocket(7777);
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(getTime() + "서버가 준비되었습니다.");
		while(true) {
			System.out.println(getTime() + "연결요청을 기다립니다.");
			//서버소켓은 클라이언트의 연결요청이 올 때까지 실행을 멈추고 계속 기다린다.
			//클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 소켓을 생성한다.
			Socket socket;
			try { socket =serverSocket.accept();
			System.out.println(socket.getInetAddress() + "로부터 연결 요쳥이 들어왔습니다.");
			socket.close();
		} catch (IOException e) { e.printStackTrace(); }
		}
	}
	//현재 시간을 문자열로 변환하는 함수
	static String getTime()  {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}

}//class end
