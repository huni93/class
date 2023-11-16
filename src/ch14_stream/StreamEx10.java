package ch14_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx10 {

	public static void main(String[] args) {
		List<Student> studentlist1 =Arrays.asList(
				new Student("홍길동", 10), new Student("강나라", 20),
				new Student("장일동", 30));
		List<Student> studentlist2 =Arrays.asList(
				new Student("나자바", 10), new Student("신용권", 20),
				new Student("유미선", 30));
		
		List<List<Student>> stu = new ArrayList<List<Student>>();
		          stu.add(studentlist1);
		          stu.add(studentlist2);
		long sum = stu.stream()
//		.flatMap(s -> s.stream())
		.flatMap(List::stream)
		.mapToInt(s -> s.getScore())
		.count();
		System.out.println(sum);

	}

}
