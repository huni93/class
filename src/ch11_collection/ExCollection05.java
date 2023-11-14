package ch11_collection;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * 1) 월별 리스트
 * 2) 월별 생산, 판매, 반품 합계현황
 * 3) 제품별 총 생산, 판매, 반품 현황
 * 4) 월별 제품별 생산, 판매, 반품 현황 
 */
public class ExCollection05 {

	public static void main(String[] args) throws FileNotFoundException {
		List tlist = new ArrayList();
		Scanner sc = new Scanner(new File("src/ch11_collection/product2.txt"));
		while(sc.hasNext()) {
			String line = sc.next();
		    Product p = new Product(line);
		    tlist.add(p);
	//	     System.out.println(p);
		}		
		
		System.out.println("1) 월별 리스트");
		
		Iterator<Product> it = tlist.iterator();
		Map <Integer, List<Product>> map1 = new HashMap<>();
		while(it.hasNext()) {
			Product p = it.next();
			if (!map1.containsKey(p.mon)) map1.put(p.mon, new ArrayList());
			map1.get(p.mon).add(p);
		}
		
		System.out.println(map1.keySet());
		
		for (Integer m : map1.keySet()) {
			System.out.println(m + "월==================");
			for (Product p : map1.get(m)) {   //map1.get(m)  List
				System.out.println(p);
			}			
		}
		
		
		System.out.println("2) 월별 \t 생산 \t 판매 \t 반품 합계현황");
		
		it = tlist.iterator();
		Map <Integer, int[]> map2 = new HashMap<>();
		while(it.hasNext()) {
			Product p = it.next();
			if (!map2.containsKey(p.mon)) map2.put(p.mon, new int[3]);
			
			map2.get(p.mon) [p.con-1]+=p.qty;
		}
		for (Integer m : map2.keySet()) {
			System.out.print(m+"월 \t");
			for (int q : map2.get(m)) {
				System.out.print(q+"\t");
			}
			System.out.println();
		}
		
System.out.println("3) 제품별 총 생산, 판매, 반품 현황");
		
		it = tlist.iterator();
		Map <String, int[]> map3 = new HashMap<>();
		while(it.hasNext()) {
			Product p = it.next();
			if (!map3.containsKey(p.carname)) map3.put(p.carname, new int[3]);
			
			map3.get(p.carname) [p.con-1]+=p.qty;
		}
		for (String m : map3.keySet()) {
			System.out.print(m+" \t");
			for (int q : map3.get(m)) {
				System.out.print(q+"\t");
			}
			System.out.println();
		}
		
System.out.println("4) 월별 제품별 생산, 판매, 반품 현황");
		
		it = tlist.iterator();
		Map <String, int[]> map4 = new TreeMap<>();
		while(it.hasNext()) {
			Product p = it.next();
			String key = (p.mon>9?p.mon:"0"+p.mon)+":"+p.carname;
			if (!map4.containsKey(key)) map4.put(key, new int[3]);
			
			map4.get(key) [p.con-1]+=p.qty;}
		String mon="";
		for (String key : map4.keySet()) {
		    String[] temps = key.split(":");
		    if (!temps[0].equals(mon))   //월은 한번만 프린트 한다
			System.out.println(temps[0]+"월>");
		    mon=temps[0];
		    System.out.print("\t" + temps[1] + " \t");
			for (int q : map4.get(key)) {
				System.out.print(q+"\t");
			}
			System.out.println();
		}
		
	}
}  // ex) class end

class Product { 
	int mon;
	int con;
	String carname;
	int qty;
	String remark;
	public Product(String line) {
		String[] str = line.split(",");
		
		this.mon = Integer.parseInt(str[0]);
		this.con = Integer.parseInt(str[1]);
		this.carname = str[2];
		this.qty = Integer.parseInt(str[3]);
		if (str.length==5)
	    this.remark = str[4];
		else
		this.remark="";
	}
	@Override
	public String toString() {
		return "Product [mon=" + mon + ", con=" + con + ", carname=" + carname + ", qty=" + qty + ", remark=" + remark
				+ "]";
	}
	
}
