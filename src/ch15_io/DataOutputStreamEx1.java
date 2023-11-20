package ch15_io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx1 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("src/ch15_io/sample.dat");
			dos = new DataOutputStream(fos);
			
			dos.writeInt(10); //4 byte
			dos.writeFloat(20.0f); // 4 byte
			dos.writeBoolean(true); //1 byte
			
			dos.close();
			System.out.println("end");
		} catch (IOException e) {
			e.printStackTrace();
		}

	} //main

}
