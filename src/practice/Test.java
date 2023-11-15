package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/ch11_collection/product1.txt"));
		List<Ramen1> li = new ArrayList<Ramen1>();
		Map<String, List<Ramen1>> map = new HashMap<>();

		while (sc.hasNextLine()) {
			String line = sc.nextLine(); // 한줄읽기
			String[] str = line.split(",");
			Ramen1 s = new Ramen1(str[0], str[1], str[2], Integer.parseInt(str[3]), str[4]);
			li.add(s);
			if (!map.containsKey(s.name)) {
				map.put(s.name, new ArrayList<Ramen1>());			
			}
			List<Ramen1> tli = map.get(s.name);
			tli.add(s);
			
			map.put(s.name, tli);								
		}
		
		Scanner sc2 = new Scanner(System.in);
		   for (Ramen1 s : li) {
		   System.out.println(s);        }
		   System.out.println("1) 월별 리스트");
			
			Iterator<Ramen1> it = li.iterator();
			Map <String, List<Ramen1>> map1 = new HashMap<>();
			while(it.hasNext()) {
				Ramen1 s = it.next();
				if (!map1.containsKey(s.month)) map1.put(s.month, new ArrayList());
				map1.get(s.month).add(s);
			}
			
			System.out.println(map1.keySet());
			
			for (String m : map1.keySet()) {
				System.out.println(m + "월==================");
				for (Ramen1 p : map1.get(m)) {   
					System.out.println(p);
				}			
			}
			
		System.out.println("2) 월별 제품별 판매횟수");
	      Map<String, Integer> map2 = new TreeMap<String, Integer>();
	      for (Ramen1 s : li) {
	         
	         String key = ((s.month.length()!=1)? s.month : "0" + s.month)+ ":" + s.name;
	         if(!map2.containsKey(key)) map2.put(key, 0);
	         map2.put(key, map2.get(key)+1);

	      }      
	      String mon = "";
	      for (String key : map2.keySet()) {
	         String[]temps = key.split(":");
	         if(!temps[0].equals(mon)) //월은 한번만 표현으로 한다
	            System.out.println(temps[0] + "월>");
	         mon = temps[0];
	         System.out.print("\t" + temps[1] + "\t"+ map2.get(key)); 
	         
	         System.out.println();
	      }
	       
		System.out.println("라면을 입력 하세요. end (9999)");
		while (true) {
			String input = sc2.nextLine();
			if (input.equals("9999")) {
				break;
			}
			if(map.containsKey(input)) {
			List<Ramen1> sli = map.get(input);
			for (Ramen1 s : sli) {
				System.out.println(s);}
		   }else   {
			   System.out.println("입력하신 상품이 없습니다.");
		   }
		}	
	}
}
class Ramen1 {
	String review;
	String name;
	String region;
	String month;
	int ea;
	
	public Ramen1(String month, String region, String name, int ea, String review) {
		super();
		this.review = review;
		this.name = name;
		this.region = region;
		this.month = month;
		this.ea = ea;
	}

	@Override
	public String toString() {
		return "ramen1 [name=" + name + ",region=" + region + " ," + " month=" + month + ", ea=" + ea + ", review="
				+ review + "]";
	}
}

