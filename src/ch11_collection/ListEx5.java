package ch11_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Collections class
 * sort(List) : 사용자정의 클래스는 반드시 Comparable 인터페이스를 구현한 클래스만 가능함
 * sort(List, Comparator) : Comparable 인터페이스를 구현하지 않은 클래스도 가능함
 * 
 * Comparable 인터페이스를 쓰려면 compareTo 메소드를 구현해야하고,
 * Comparator 인터페이스를 쓰려면 compare 메소드를 구현해야 한다는 점이다
 * 
 * Comparable은 "자기 자신과 매개변수 객체를 비교"하는 것이고,
 * Comparator는 "두 매개변수 객체를 비교"한다는 것이다.
 */
public class ListEx5 {

	public static void main(String[] args) {
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 30));
		li.add(new Person("이정민", 10));
		li.add(new Person("김윤민", 16));
		Person p1 = new Person("김삿갓", 20);
		li.add(p1);
		print(li);
		System.out.println("===================Comparable");
		Collections.sort(li);
		print(li);
		System.out.println("===================Comperson");
		Collections.sort(li);
		print(li);
		System.out.println("===================Comparator");
		Collections.sort(li, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.name.compareTo(o2.name);
				// return 01.name.compareTo(o2.name);
			}
		});

		print(li);
	}

	public static void print(List li) {
		for (Object ob : li) {
			System.out.println(ob);

		}
	}
}
class CompPerson implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return (o1.age - o2.age);
		// return 01.name.compareTo(o2.name);
	}
}
	

