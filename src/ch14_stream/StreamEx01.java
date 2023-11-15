package ch14_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;


/*
 * File에서 읽은 내용을 스트림으로 생성하기
 * Path에서 읽은 파일 이름을 프린트 하기 
 */
public class StreamEx01 {

	public static void main(String[] args) throws IOException {
		System.out.println("파일의 내용을 스트림을 이용하여 화면에 출력");
		BufferedReader br = new BufferedReader
				(new FileReader(new File("src/ch14_stream/StreamEx01.java")));
		br.lines()   //to stream
		.forEach(s -> System.out.println(s));
		
		
		System.out.println("src/ch14_stream/product.txt");
		Scanner sc = new Scanner(new File("src/ch14_stream/product.txt"));
		sc.tokens()
		.forEach(p -> System.out.println(p));
		
		
		System.out.println("src/ch14_stream 폴더 목록=====");
		System.out.println();
		Path path = Paths.get("src/ch14_stream");
		Stream<Path> st = Files.list(path);
		st.forEach(p -> System.out.println(p.getFileName()));
		
		System.out.println("c:");
		System.out.println();
		path = Paths.get("c:/");
		Stream<Path> stream = Files.list(path);
		stream.forEach( p -> {
		
		       System.out.println(p.getFileName()
		    		   + (p.toFile().isDirectory()?">":""));

	});
	}
}


