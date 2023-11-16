package ch14_stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx15 {

	public static void main(String[] args) {
		Student2[] stuarr = { 
	            new Student2("김길동",1,89,56,66),
	            new Student2("김삿갓",1,85,88,80),
	            new Student2("김삿갓",1,80,88,80),
	            new Student2("김삿갓",1,90,88,80),
	            new Student2("이몽룡",2,90,78,95),
	            new Student2("임꺽정",2,60,56,88),
	            new Student2("임꺽정",2,90,72,72)};
		
		System.out.println("1.Map<Boolean, List<Generic>> Collectors.partitioningBy()");
		Map<Boolean, List<Student2>> stu =
				Stream.of(stuarr)
				.collect(Collectors.partitioningBy(s -> s.getBan()==1));
		
		System.out.println("1학년 리스트");
		stu.get(true).stream().forEach(System.out::println);
		System.out.println("2학년 리스트");
		stu.get(false).stream().forEach(System.out::println);
		
		System.out.println("2.Collectors.partitioningBy(key, 집계(counting)");
		Map<Boolean, Long> stuCount = Stream.of(stuarr)
		.collect(Collectors.partitioningBy(s -> s.getBan()==1,
		                            Collectors.counting()));
        System.out.println("1학년 학생수:" + stuCount.get(true));
        System.out.println("2학년 학생수:" + stuCount.get(false));
        
        System.out.println("3. Collectors.partitioningBy(key, 집계(1등)\" ");
        Map<Boolean, Optional<Student2>> stuTopScore = 
        Stream.of(stuarr)
        .collect(Collectors.partitioningBy(s -> s.getBan()==1,
        Collectors.maxBy(Comparator.comparingInt(Student2::getScore))));
        System.out.println("1학년 1등" + stuTopScore.get(true).get());
        System.out.println("2학년 1등" + stuTopScore.get(false).get());
        
        System.out.println("4. Collectors.partitioningBy(key, 집계(합불)\" ");
        Map<Boolean, Map<Boolean, List<Student2>>> stuFail = 
        Stream.of(stuarr)
        .collect(Collectors.partitioningBy(s -> s.getBan()==1,
        		 Collectors.partitioningBy(s -> s.getScore()<=250)));
        System.out.println("1학년 불합격 리스트");
        stuFail.get(true).get(true).stream().forEach(System.out::println);
        System.out.println("2학년 불합격 리스트");
        stuFail.get(false).get(true).stream().forEach(System.out::println);
		
	}
	
}
