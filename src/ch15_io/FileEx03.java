package ch15_io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx03 {

	public static void main(String[] args) {
		String currDir = System.getProperty("user.dir");
		//user.dir--> C:\Users\KITCOOP\eclipse-workspace\javapro
		System.out.println(currDir);
		File dir = new File(currDir+"/src/ch15_io");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mma");
		File[] files = dir.listFiles();
		for (File f : files) {
			String name = f.getName();
			String attribute = ""; String size = "";
			if(f.isDirectory()) {
				attribute = "DIR";
			}else {
				size = f.length() + "";
				attribute = f.canRead() ? "R" : " ";
				attribute += f.canWrite() ? "W" : " ";
				attribute += f.isHidden() ? "H" : " ";   }
			System.out.printf("%s %3s %6s %s%n",
			df.format(new Date(f.lastModified())), attribute, size, name);
		}

	}

}// end of class
