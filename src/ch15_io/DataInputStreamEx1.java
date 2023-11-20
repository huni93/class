package ch15_io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1 {

	public static void main(String[] args) {
		try {		
		FileInputStream fis = new FileInputStream("src/ch15_io/sample.dat");
		DataInputStream dis = new DataInputStream(fis);
		File f = new File("src/ch15_io/sample.dat");
		System.out.println("file length:" + f.length());
		
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readBoolean());
		//10, 20.0f, true
		
		dis.close();
	}  catch (IOException e) {
		e.printStackTrace();
	}
}//main
}
