package ch14_stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx05 {
/*
 *   Method  reference
 *                    람다식                  메소드 참조
 *   static 메소드  :  a -> 클래스이름.메소드(a)   클래스이름::메소드이름
 *   인스턴스 메소드  :  (a, b) -> a.메소드(b)    클래스이름::메소드이름
 *                  (a) -> 객체.메소드(a)      클래스이름::메소드이름
 *   생성자(a)      :  new  생성자 (a)          생성자이름::new
 *   배열 생성자(a)  :  new  타입 (a)            타입::new 
 */
	public static void main(String[] args) {
		List<String> list = 
				Arrays.asList("홍길동", "김삿갓", "홍길동", "임꺽정", "홍길동" );	      	
		list.stream()
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		// Stream distinct() : 기존의 스트림의 요소 중 중복 제거 후 다시 스트림으로 리턴
		list.stream()
		.distinct()
		.forEach(System.out :: println);
		System.out.println();
		// filter(Predicate p) : p의 결과가 true 인 요소들로만 Stream 으로 리턴
		list.stream()
		.filter(n -> n.startsWith("홍"))
		.forEach(System.out :: println);
		System.out.println();
		list.stream()
		.filter(n -> n.startsWith("홍")).distinct()//홍 중복 제거후 다시 스트림
		.forEach(n -> System.out.println(n));
		System.out.println();

	}

}
