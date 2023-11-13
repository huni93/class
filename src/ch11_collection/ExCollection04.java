package ch11_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ExCollection04 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = 
				  new Scanner(new File ("src/ch11_collection/student.txt"));
		List<Student2> li = new ArrayList<Student2>();
		Map<String, Student2> map = new HashMap<>();
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine(); // 한줄읽기
			String[] str = line.split(",");
			Student2 s = new Student2(str[0], str[1],
					                  Integer.parseInt(str[2]),
					                  Integer.parseInt(str[3]),
					                  Integer.parseInt(str[4]));
			li.add(s);
			map.put(s.stno, s);
			
		}	
		// 순서대로 다시 나열
		Collections.sort(li, new Comparator<Student2>() {
			
			@Override
			public int compare(Student2 o1, Student2 o2) {
				return o2.tot - o1.tot;
			}
		});
		for (Student2 s : li) {
			System.out.println(s);
		}
		Scanner sc2 = new Scanner(System.in);
		System.out.println("학번을 입력 하세요. end (9999)");
		while(true)  {
			String input = sc2.nextLine();
			if(input.equals("9999")) { break; }
			//map 하기전
		/*	for (int i=0; i < li.size(); i++) {
				if (li.get(i).stno.equals(input)) {
					System.out.println((i+1) + "등:" + li.get(i));
				}
			} */
			Student2 s = map.get(input);
			System.out.println("등수 : " + (li.indexOf(s)+1));
			System.out.println(s);
		}
		
		/*
		 *  1. (합계) 내림차순 프린트 
		 *  2. stno를 입력해서 등수 확인
		 */		
	}
}
 class Student2 {
	 String stno;
	 String name;
	 int kor;
	 int math;
	 int eng;	
	 int tot;
	public Student2(String stno, String name, int kor, int math, int eng) {
		super();
		this.stno = stno;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		tot=kor+math+eng;
	}
	@Override
	public String toString() {
		return "Student2 [stno=" + stno + ", name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng
				+ ", tot=" + tot + "]";
	}
	
	}
	 
 