package ch15_io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois =
				new ObjectInputStream(new FileInputStream("src/ch15_io/object.ser"));
		Customer c1 = (Customer)ois.readObject();
		Customer c2 = (Customer)ois.readObject();
		ois.close();
		System.out.println("고객1:" + c1);
		System.out.println("고객2:" + c2);

	}

}
