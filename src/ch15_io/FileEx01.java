package ch15_io;

import java.io.File;

/*
 * File 클래스 예제
 *  - 파일이나 폴더의 정보를 관리하는 클래스.
 *  - file이 없어도 객체는 만들어짐. 
 */
public class FileEx01 {

	public static void main(String[] args) {
		String filePath = "c:\\program Files";
		File f1 = new File(filePath);  //c:\ 폴더
		String files[] = f1.list(); //c:\ 하위 파일또는폴더의 이름들
		for (String f : files) {
			File f2 = new File(filePath,f);
			if(f2.isDirectory())  //폴더니?
				System.out.printf("%s : 디렉토리%n",f);
			else if(f2.isFile())  //파일?
				System.out.printf("%s : 파일(%,dbyte)%n",f,f2.length());;
		}

	}

}
