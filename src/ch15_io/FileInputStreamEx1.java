package ch15_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * FileInputStream : 파일로 부터 데이터를 읽기
 *  int read() : 1byte를 읽어서 리턴.
 *  int read(byte[] buf) : buf의 크기만큼 읽어서 데이터를 buf에 저장.
 *   실제 읽은 바이트수 리턴
 *  int read(byte[] buf, int start, int len) :
 *            데이터를 len 바이트 만큼 읽어서 buf에 start 인덱스 부터 저장.
 *            실제 읽은 바이트수 리턴 
 */
public class FileInputStreamEx1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis =
				new FileInputStream("src/ch15_io/FileInputStreamEx1.java");
		System.out.println("********* read() 메서드를 이용하기");
		int data = 0;
		while ((data = fis.read()) != -1) { //int 한글깨짐
			System.out.print((char)data);
		}
		fis = new FileInputStream("src/ch15_io/FileInputStreamEx1.java");
		System.out.println("********* read(byte[] buf) 메서드를 이용하기");
		byte[] buf = new byte[10];
		while ((data = fis.read(buf)) != -1) { 
			System.out.println(new String(buf, 0, data));  }
		
		
		fis = new FileInputStream("src/ch15_io/FileInputStreamEx1.java");
		System.out.println("********* read(byte[] buf) 메서드를 이용하기");
		File fi = new File("src/ch15_io/FileInputStreamEx1.java");
		System.out.println("length:" + fi.length());
		System.out.println(fis.available()+"==============");
		buf = new byte[fis.available()];  //한글 안깨짐
		System.out.println(fis.available());
		while ((data = fis.read(buf, 0, buf.length)) != -1) { 
			System.out.println(new String(buf, 0, data));
			System.out.println("end------------------------------");}
	}

}
