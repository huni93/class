package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductGenerator2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/ch11_collection/product1.txt"));
		List<Ramen> li = new ArrayList<Ramen>();
		Map<String, List<Ramen>> map = new HashMap<>();

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] str = line.split(",");
			Ramen s = new Ramen(str[0], str[1], str[2], Integer.parseInt(str[3]), str[4]);
			li.add(s);
			if (!map.containsKey(s.name)) {
				map.put(s.name, new ArrayList<Ramen>());
			}
			List<Ramen> tli = map.get(s.name);
			tli.add(s);

			map.put(s.name, tli);
		}
		System.out.println("1) 월별 리스트");

		Iterator<Ramen> it = li.iterator();
		Map<String, List<Ramen>> map1 = new HashMap<>();
		while (it.hasNext()) {
			Ramen s = it.next();
			if (!map1.containsKey(s.month))
				map1.put(s.month, new ArrayList());
			map1.get(s.month).add(s);
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
			map2.put(key, map2.get(key) + 1);

		}
		String mon = "";
		for (String key : map2.keySet()) {
			String[] temps = key.split(":");
			if (!temps[0].equals(mon))
				System.out.println(temps[0] + "월>");
			mon = temps[0];
			System.out.print("\t" + temps[1] + "\t" + map2.get(key));

			System.out.println();
		}
		Scanner sc2 = new Scanner(System.in);
		System.out.println("라면을 입력 하세요. end (9999)");
		while (true) {
			String input = sc2.nextLine();
			if (input.equals("9999")) {
				break;
			}
			if (map.containsKey(input)) {
				List<Ramen> sli = map.get(input);
				for (Ramen s : sli) {
					System.out.println(s);
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
