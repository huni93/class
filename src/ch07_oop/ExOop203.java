package ch07_oop;
/*
 *  Buyer 클래스 :
 *  멤버변수 : int money = 500, int point = 0;
 *          Product[3] cart = new Product[3]; 물건3개 구매 가능
 *          int cnt;
 *  멤버메서드 : buy(.......?)
 *               p상품의 가격만큼 money 차감.
 *               p상품의 포인트 만큼 point 증가.
 *               화면에 구입한 제품 출력.
 *               cart에 제품 추가.
 */
public class ExOop203 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv(100); //100
		Computer com = new Computer(200); //200
		SmartPhone sp = new SmartPhone(150); //150
		b.buy(tv);    b.buy(com);   b.buy(sp);
		System.out.println("구매후 잔액:" + b.money);
		System.out.println("구매후 적립포인트:" + b.point);
		System.out.println("======================");
		for (int i = 0; i < b.cart.length; i++) {
			System.out.println(b.cart[i]);
		}
	}
}
class Buyer {
    int money = 500;
    int point;
    Product cart[] = new Product[3];
    int cnt;
    
    void buy(Product p) {
    	money -= p.price;  
    	point += p.point;
    	System.out.println(p.toString() + "구입함");
    	cart[cnt++] = p;
    }
}









