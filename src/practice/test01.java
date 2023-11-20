package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.jar.Attributes.Name;

import practice.Product.CU;


public class test01 {

	public static void main(String[] args) throws FileNotFoundException {
		List<Product> tlist = new ArrayList<>();
        List<Product.CU> li = new ArrayList<>();
        Map<String, Product.CU> map = new HashMap<>();
        Scanner sc = new Scanner(new File("src/practice/product.txt"));

        while (sc.hasNext()) {
            String line = sc.next();
            Product p = new Product(line);
            tlist.add(p);
            System.out.println(p);
        }

   System.out.println("1)월별 리스트");
   Iterator<Product> it = tlist.iterator();
   Map<Integer ,List<Product>> map1 = new HashMap<>();
   while(it.hasNext()) {
      Product p = it.next();
      if(!map1.containsKey(p.mon)) map1.put(p.mon, new ArrayList());
      map1.get(p.mon).add(p);
   }
   System.out.println(map1.keySet());
   
   for(Integer m : map1.keySet()) {
      System.out.println( m+"월=============");
      for(Product p : map1.get(m)) {//map1.get(m) List
         System.out.println(p);
      }
   }
   
   System.out.println("2)월별 \t 판매 \t제품명 \t 반품 \t 증정");
   
    it = tlist.iterator();
    Map<Integer, int []> map2 = new HashMap<>();
    while (it.hasNext()) {
       Product p = it.next()   ;
       if(!map2.containsKey(p.mon))map2.put(p.mon, new int [4]);
       map2.get(p.mon)[p.con-1]+=p.qty;
    }
    for(Integer m : map2.keySet()) {
       System.out.print(m+"월\t");
       for(int q : map2.get(m)) {
          System.out.print(q+"\t");
       }
       System.out.println();
    }
   
    System.out.println("3)재고 , 판매 , 입고요청 , 서비스");
      
    it = tlist.iterator();
    Map<String, int []> map3 = new HashMap<>();
    while (it.hasNext()) {
       Product p = it.next()   ;
       if(!map3.containsKey(p.name))map3.put(p.name, new int [4]);
       map3.get(p.name)[p.con-1]+=p.qty;
    }
    for(String m : map3.keySet()) {
       System.out.print(m+"\t");
       for(int q : map3.get(m)) {
          System.out.print(q+"\t");
       }
       System.out.println();
}
    System.out.println("4)월별 판매 , 불량 , 입고요청 , 서비스");
      
    it = tlist.iterator();
    Map<String, int []> map4 = new TreeMap<>();
    while (it.hasNext()) {
       Product p = it.next()   ;
       String key = (p.mon>9? p.mon:"0"+p.mon)+":" + p.name;
       if(!map4.containsKey(key))map4.put(key, new int [4]);
       map4.get(key)[p.con-1]+=p.qty;
    }
    String mon = "";
    for(String key : map4.keySet()) {
       String[] temps = key.split(":");
       if(!temps [0].equals(mon))//월은 한번만 프린트 한다
       System.out.println(temps[0]+"월>");
       mon=temps[0];
       System.out.print("\t"+temps[1]+"\t");
       for(int q : map4.get(key)) {
          System.out.print(q+"\t");
       }
       System.out.println();
}
    while (sc.hasNextLine()) {
            String line = sc.nextLine();  // 한줄 읽기
            String[] str = line.split(",");
            if (str.length >= 5) {
                
               Product.CU s = new Product.CU(
                        str[0],
                        Integer.parseInt(str[ 1]),
                        str[ 2],
                        Integer.parseInt(str[3]),
                        str[4]
                );
                li.add(s);
                map.put(s.mon, s);
            }              
                
            else {
                
               
            // Handle the case where the line doesn't have enough elements
                System.out.println(
            "Product: " + line);
            }
        }
        Collections.sort(li, new Comparator<Product.CU>() {
            @Override
            public int compare(Product.CU o1, Product.CU o2) {
                return o2.tot - o1.tot;
            }
        });

        for (Product.CU s : li) {
            System.out.println(s);
        }
        Scanner sc2 = new Scanner(System.in);
        System.out.println("월별 판매량");

        while (true) {
            String input = sc2.nextLine();

            if (input.equals("9999")) {
                break;
            } else {
                int m = 0;

          
                if (input.matches("\\d+")) {
                    m = Integer.parseInt(input);

                    if (map1.containsKey(m)) {
                        System.out.println(m + "월=============");
                        for (Product p : map1.get(m)) {
                            System.out.println(p);
                        }
                        System.out.println();
                    } else {
                        System.out.println("해당 월의 데이터가 없습니다.");
                 
                    }
                } else {
                    System.out.println("올바른 월을 입력하세요.");
                }
            }
        }
       
        }
    }

   
   
   
   
   
   



//ex class end
//mon 월별 con 판매량  df 제품 명 ec 반품 rt 증정품 
class Product{
int mon;
int con;
String name;
int qty;
String rem;

public Product (String line) {
   String[]str = line.split(",");
   
   this.mon = Integer.parseInt(str[0]);
   this.con = Integer.parseInt(str[1]);
   
   this.name = str[2];
   
   this.qty = Integer.parseInt(str[3]);
   
   
   
   if(str.length==5)
      this.rem = str[4];
   else
      this.rem = " ";
   
}

@Override
public String toString() {
   return "Product [mon=" + mon + ", con=" + con + ", name=" + name + ", qty=" + qty + ", rem=" + rem + "]";
}
static class CU {
     String mon;
     String name;
     String rem;
     int con;
     int qty;
     int tot;

     public CU(String mon, int con, String name, int qty, String rem) {
         super();
         this.mon = mon;
         this.con = con;
         this.name = name;
         this.qty = qty;
         this.rem = rem;  // Initialize rem to an empty string
         tot = con + qty;
     }

     @Override
     public String toString() {
         return "CU [mon=" + mon + ", name=" + name + ", rem=" + rem + ", con=" + con + ", qty=" + qty + ", tot="
                 + tot + "]";
     }
 }
}




//오버라이딩

