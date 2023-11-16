package ch14_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx09 {

	public static void main(String[] args) {
		List<String> list1 =
		Arrays.asList("자바 8 버전에 ", "추가된 스트림을", "열심히 공부하자");
		list1.stream()
		.flatMap(s -> Arrays.stream(s.split(" ")))
		.forEach(word -> System.out.println(word));

		List<String> list2 = Arrays.asList("10,20,30", "40,50,60");
		// flatMapToInt : IntStream 으로 리턴
		IntStream isr = list2.stream().flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		});
		//isr.forEach(n -> System.out.println(n));  forEach가 최종이라 에러남
		//System.out.println(isr.count()); // 6
		//System.out.println(isr.sum());  //210
		System.out.println(isr.average());  // 35.0
	}

}
