package ch11_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 *  Iterator : 반복자
 *  it.hasNext() : 다음에 입력된 주소 있으면 true
 *  it.next() : 다음주소 return 
 */
public class IteratorEx1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");      list.add("2");
		list.add("13");      list.add("42");
		list.add("5");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Iterator it = list.iterator();  //Collection ---> Iterator
		
		while(it.hasNext())  {
			//Object obj = it.next();
			System.out.println(it.next());
		}
	}
}
