package ch14_stream;

import java.util.stream.Stream;
//filter
public class StreamEx04 {

	public static void main(String[] args) {
		Stream<String> strArrStrm = Stream.of(
				"abc", "def", "jkl", "ABC", "GHI", "JKL");
		strArrStrm
		.filter(s -> s.compareTo("a") > 0)
		.forEach(s -> System.out.println(s));
	}
}
