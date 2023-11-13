package ch11_collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx4 {

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
		System.out.println(li.indexOf(new Person("홍길동", 10))); //-1 해당하는 객체 없음
		//indexOf() 는 equals()만을 비교한다
		System.out.println(li.indexOf(p1));  // 5
	}
	public static void print (List li) {
		for (Object ob : li) {
			System.out.println(ob);
			
		}
	}

}
