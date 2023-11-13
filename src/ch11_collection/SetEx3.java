package ch11_collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 *  TreeSet 예제
 *     Set > SortedSet > 구현클래스.
 *     Set : 중복불가 : 동등객체 (equals(), hashcode())
 *     SortedSet : 정렬됨
 *     
 *     => 사용자정의 클래스는 반드시 Comparable 인터페이스를 구현한 클래스만
 *        TreeSet에 요소로 저장 가능
 *        
 *   정렬 관련 인터페이스
 *   - Comparator : 기본 정렬 방식을 추가로 변경할때 사용
 *   - Comparable : 기본 정렬 방식 지정할때 사용.
 */
public class SetEx3 {

	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
		set = new TreeSet<>(new Descending()); //8.0 이전버전
//	    new Descending() --> (o1,o2) -> o1.compareTo(o2)* -1  ***람다
		set = new TreeSet<>(Comparator.reverseOrder()); //8.0 이후버전
		String from = "bat";String to = "d";
		set.add("abc");set.add("alien");set.add("bat");set.add("azz");
	    set.add("car");set.add("Car");set.add("disc");set.add("dance");
	    
	    System.out.println(set);
	    System.out.println("from:" + from + ",to:" + to);
//	    System.out.println(set.subSet(from, to));  //정렬되어야 함. ascending
	    System.out.println(set.subSet(to, from));  // descending
	    System.out.println("from:" + from + ",to:" + to + "zzzz");
//	    System.out.println(set.subSet(from, to + "zzzz"));
	    System.out.println(set.subSet(to + "zzzz", from));
	    
	}}

class Descending implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2) * -1;
	}}