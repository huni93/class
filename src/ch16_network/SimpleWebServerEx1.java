package ch16_network;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//http://192.168.0.44:8888/bbbb.html
/* path=index.html 위치  src/ch16_network/index.html */
public class SimpleWebServerEx1 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8888);
			while (true) {
				System.out.println("클라이언트 접속 대기");
				Socket socket = server.accept();  //browser
				System.out.println("스레드 생성");
				HttpThread ht = new HttpThread(socket);
				ht.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static class HttpThread extends Thread {
		private Socket socket;
		BufferedReader br;
		PrintWriter pw;

		HttpThread(Socket client) {
			this.socket = client;
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // url read
				pw = new PrintWriter(socket.getOutputStream()); // bbbb.html 파일을 보냄
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void run() {
			BufferedReader sfile = null;
			try {
				String pathname = "src/ch16_network/";   //web   webapp, webContent view위치
				String line = br.readLine();   //http://192.168.0.44:8888/bbbb.html
				System.out.println("[" + line + "]");
				// -----------------
				if (!line.startsWith("GET /favicon.ico")) {

					line = line.substring(line.indexOf("/") + 1);
					line = line.substring(0, line.indexOf(" "));
					System.out.println("1:" + line);

					pathname += line;

					System.out.println("파일이름 :" + pathname);
					sfile = new BufferedReader(new FileReader(pathname));
					pw.println("HTTP/1.0 200 OK\r\nContent-Type: text/html\r\n\r\n");
					String fileLine = "";
					while ((fileLine = sfile.readLine()) != null) {
						pw.println(fileLine);
						pw.flush();
					}

					// ------------------------------

				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {

					sfile.close();
					br.close();
					pw.close();
					socket.close();
				} catch (Exception i) {
					// i.printStackTrace();
				}

			}
		}
	}
}