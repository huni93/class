package ch11_collection;

import java.util.HashSet;
import java.util.Set;

/*
 *  Student클래스 구현하기
 *  1. 멤버변수 : 학번(studno), 이름(name), 전공(major)
 *  2. 멤버메서드 : toString() 오버라이딩
 *  3. 학번과 이름이 같으면 같은 학생으로 인식하도록 오버라이딩 하기
 *  4. 생성자 (학번(studno), 이름(name), 전공(major))
 *  
 *  등록 학생 수: 3
 *  Student [studno=2134, name = 홍길동, major= 경영]
 *  Student [studno=2345, name = 홍길순, major= 경영]
 *  Student [studno=4567, name = 홍길동, major= 경영]
 */
public class ExCollection02 {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("1234","홍길동","경영"));
		set.add(new Student("2345","홍길순","경영"));
		set.add(new Student("2345","홍길순","컴공")); //추가 불가
		set.add(new Student("1234","홍길동","통계")); //추가 불가
		set.add(new Student("4567","홍길동","경영"));
		System.out.println("등록 학생 수:" + set.size()); //3
		for (Student s : set) {			System.out.println(s);		}
	}}

class Student {
	String studno;
	String name;
	String major;
	public Student(String studno, String name, String major) {
		super();
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	@Override
	public String toString() {
		return "Student [studno=" + studno + ", name=" + name + ", major=" + major + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s  = (Student) obj;
		return studno.equals(s.studno) && name.equals(s.name);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return studno.hashCode()+name.hashCode();
}
}
