package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ProductGenerator2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/ch11_collection/product1.txt"));
		List<Ramen> li = new ArrayList<Ramen>();
		Map<String, List<Ramen>> map = new HashMap<>();

		while (sc.hasNextLine()) {
			String line = sc.nextLine(); // 입력 스트림에서 다음 라인을 읽음
			String[] str = line.split(","); // 쉼표를 기준으로 문자열을 나눠 배열에 저장
			Ramen s = new Ramen(str[0], str[1], str[2], Integer.parseInt(str[3]), str[4]); // 라면 객체 생성
			li.add(s); // 리스트에 라면 객체 추가
			if (!map.containsKey(s.name)) { //map에 라면 객체 추가
				map.put(s.name, new ArrayList<Ramen>());
			}
			List<Ramen> tli = map.get(s.name); // 라면 리스트를 뽑는다.
			tli.add(s);

			map.put(s.name, tli); // 완성된 리스트
		}
		System.out.println("1) 월별 리스트");

		Iterator<Ramen> it = li.iterator();
		Map<String, List<Ramen>> map1 = new TreeMap<>();
		//TreeMap을 사용하여 월별로 정렬된 Map을 생성
		//TreeMap은 키를 기준으로 정렬된 상태를 유지
		while (it.hasNext()) {
			Ramen s = it.next();
			String key = ((s.month.length() != 1) ? s.month : "0" + s.month);
			//길이가 1이 아니면 그대로 사용하고, 1이면 "0"을 추가하여 두 자리로 만든 후 key 변수에 저장
			if (!map1.containsKey(key))
				map1.put(key, new ArrayList()); // 없으면 객체생성
			map1.get(key).add(s); //해당 키에 대응하는 리스트에 라면 객체를 추가
		}
		
       
		System.out.println(map1.keySet());
        
		for (String m : map1.keySet()) {
			System.out.println(m + "월==================");
			for (Ramen p : map1.get(m)) {
				System.out.println(p);
			}
		}
		System.out.println("2) 월별 제품별 판매횟수");
		Map<String, Integer> map2 = new TreeMap<String, Integer>();
		for (Ramen s : li) {
			String key = ((s.month.length() != 1) ? s.month : "0" + s.month) + ":" + s.name;
			if (!map2.containsKey(key))
				map2.put(key, 0);
			map2.put(key, map2.get(key) + 1); //판매라면이있으면 +1 증가

		}
		String mon = "";
		for (String key : map2.keySet()) {
			String[] temps = key.split(":");
			//":"을 기준으로 키를 분리하여 temps 배열에 저장 이 배열의 첫 번째 요소는 월을 나타냄
			if (!temps[0].equals(mon))
				System.out.println(temps[0] + "월>");
			mon = temps[0];
			System.out.print("\t" + temps[1] + "\t" + map2.get(key)); //temp1 라면 / key값은 총합

			System.out.println();
		}
		System.out.println("3) 연간 제품별 판매 순위");
		
	      it = li.iterator();
			Map <String, Integer> map3 = new HashMap<>();
			while(it.hasNext()) {
				Ramen s = it.next();
				if (!map3.containsKey(s.name)) map3.put(s.name, 0); // 제품이름을 키로 하는 맵에 판매량을 누적
				map3.put(s.name, map3.get(s.name)+s.ea);
			}
			Set<Entry<String, Integer>> s1 = map3.entrySet();
			s1.stream() //entrySet을 스트림으로 변환
			
			.sorted(new Comparator<Entry<String, Integer>>() {
              //판매량을 내림차순으로 정렬하는 Comparator를씀
				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					// TODO Auto-generated method stub
					return o2.getValue() - o1.getValue();
				}
				
			})
			.forEach(s -> System.out.println(s.getKey()+" \t"+s.getValue()));
		    // 정렬된 제품과 수량(합산)을 순서대로 출력
			System.out.println("===========================");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("신라면" + " " + "진라면" + " " + "짜파게티" + " " + "너구리" + " "
		+ "안성탕면" + " " + "불닭볶음면" + " " + "육개장" + " " + "비빔면" + " " + "삼양라면" + " "
	    + "왕뚜껑" + " " + " 택 1 ");
		System.out.println("라면을 입력 하세요. end (9999)");
		while (true) {
			String input = sc2.nextLine();
			if (input.equals("9999")) {
				break;
			}
			if (map.containsKey(input)) { //만약에 map에 상품이 있을경우 리스트업
				List<Ramen> sli = map.get(input);
				for (Ramen s : sli) {
					System.out.println(s);// 해당 상품의 라면 객체들을 출력
				}
			} else {
				System.out.println("입력하신 상품이 없습니다.");
			}
		}
	}
}

class Ramen {
	String review;
	String name;
	String region;
	String month;
	int ea;

	public Ramen(String month, String region, String name, int ea, String review) {
		super();
		this.review = review;
		this.name = name;
		this.region = region;
		this.month = month;
		this.ea = ea;
	}

	@Override
	public String toString() {
		return "ramen [name=" + name + ",region=" + region + " ," + " month=" + month + ", ea=" + ea + ", review="
				+ review + "]";
	}
}
