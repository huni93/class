package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductGenerator {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/ch11_collection/product.txt"));
		List<Ramen> li = new ArrayList<Ramen>();
		Map<String, List<Ramen>> map = new HashMap<>();

		while (sc.hasNextLine()) {
			String line = sc.nextLine(); // 한줄읽기
			String[] str = line.split(",");
			Ramen s = new Ramen(Integer.parseInt(str[0]), str[1], str[2], Integer.parseInt(str[3]), str[4]);

			li.add(s);
			if (!map.containsKey(s.name)) {
				map.put(s.name, new ArrayList<Ramen>());
			}
			List<Ramen> tli = map.get(s.name);
			tli.add(s);

			map.put(s.name, tli);

		}

		Scanner sc2 = new Scanner(System.in);
		System.out.println("라면을 입력 하세요. end (9999)");
		while (true) {
			String input = sc2.nextLine();
			if (input.equals("9999")) {
				break;
			}
			List<Ramen> sli = map.get(input);
			for (Ramen s : sli) {
				System.out.println(s);
			}
		}
		/*
		 * 1. (합계) 내림차순 프린트 2. stno를 입력해서 등수 확인
		 */
	}
}

class Ramen {
	String review;
	String name;
	String region;
	int month;
	int ea;

	public Ramen(int month, String region, String name, int ea, String review) {
		super();
		this.review = review;
		this.name = name;
		this.region = region;
		this.month = month;
		this.ea = ea;
	}

	@Override
	public String toString() {
		return "ramen [name=" + name + ",region=" + region + " , month=" + month + ", ea=" + ea + ", review=" + review + "]";
	}
}
