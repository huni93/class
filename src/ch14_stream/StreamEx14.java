package ch14_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx14 {

	public static void main(String[] args) {
		Student2[] stuarr = { 
	            new Student2("김길동",1,89,56,66),
	            new Student2("김삿갓",1,85,88,80),
	            new Student2("김삿갓",1,80,88,80),
	            new Student2("김삿갓",1,90,88,80),
	            new Student2("이몽룡",2,90,78,95),
	            new Student2("임꺽정",3,60,56,88),
	            new Student2("임꺽정",1,90,72,72)};
		
		System.out.println("1. 학생 이름만 뽑아서 List<String>에 저장한다");
		List<String> names =
				Stream.of(stuarr)
				.map(Student2::getName)
				.collect(Collectors.toList());
		
		System.out.println(names);
		
		System.out.println("2. 학생 이름만 뽑아서 String[]에 저장한다");
		
		String[] arrnames = 
		Stream.of(stuarr)
		.map(Student2::getName)
		.toArray(String[]::new);
		
		System.out.println(Arrays.asList(arrnames));
		
		System.out.println("3. Map<String, Student>로 변환 한다 key는 name ");
		
		Map<String, Student2> map =
				Stream.of(stuarr)
				.distinct() //Student2 동등객체 정의 (equals(), hashCode())
				.collect(Collectors.toMap(s -> s.getName(), s -> s));
		for (String name : map.keySet()) {
			System.out.println(name + "-" + map.get(name));			
		}
		
		System.out.println("4. Stream의 size : Collectors.counting()");
		long count = Stream.of(stuarr)
				.collect(Collectors.counting());
		System.out.println("size:" + count);
		
		count = Stream.of(stuarr).count();
		System.out.println("size:" + count);
		
		System.out.println("5. score의 합 : Collectors.summingInt()");
		int sumtotal = Stream.of(stuarr)
//		.collect(Collectors.summingInt(s -> s.getScore()));		
		.collect(Collectors.summingInt(Student2 :: getScore));
		
		System.out.println("score 합계:" + sumtotal);
		
		sumtotal = Stream.of(stuarr).mapToInt(s -> s.getScore()).sum();
		System.out.println("score 합계:" + sumtotal);
		
		
		System.out.println("6. score합 Collectors.reducing()");
		int redtotal = Stream.of(stuarr)
	//  .collect(Collectors.reducing(10000, s -> s.getScore(),(a,b) -> a+b));
						  //초기값, mapper, 계산 method
		        .collect(Collectors.reducing(10000, Student2::getScore,
		        		 Integer::sum));
		        System.out.println("score 합계:" + redtotal);
		
		
		System.out.println("7. score의 최소, 최대값 구하기 Collectors.minBy(). maxBy()");
		
		Optional<Student2> stu = Stream.of(stuarr)
		.collect(Collectors.minBy(Comparator.comparingInt(s -> s.getScore())));
		System.out.println("점수가 가장 낮은 학생:" + stu.get());
		
		stu = Stream.of(stuarr)
		.collect(Collectors.maxBy(Comparator.comparingInt(s -> s.getScore())));
		System.out.println("점수가 가장 높은 학생:" + stu.get());
		
		System.out.println("8. 학생이름 리스트 프린트하기 : Collectors.joining()");
		
		String list = Stream.of(stuarr).map(Student2::getName)
				.collect(Collectors.joining("==","[","]"));
		//"delimiter", "start", "end"
		System.out.println(list);
					
	}
}
