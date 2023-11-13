package ch06_oop;

public class ExOop03 {

	public static void main(String[] args) {
// 1. card1 선언 , 객체 생성하기
		Card card1 = new Card();
// 2. card1.kind = "Heart", number=1로 초기화하기
		card1.kind = "Heart";
		card1.number = 1;
// 3. card1 출력하기		
        System.out.println(card1.toString());
// 4. card2 객체 생성하기
        Card card2= new Card();
// 5. card2.kind = "spade", number=1로 초기화하기
        card2.kind = "Spade";
        card2.number = 1;
// 6. card2 출력하기
        System.out.println(card2);
// 7. card의 static 가로와세로를 (50,80) 으로 변경하기
        Card.width = 50;
        Card.height = 80;
// 8. card1 출력하기
        System.out.println(card1);
// 9. card2 출력하기
        System.out.println(card2);
	}
}//ex class end

class Card {
	String kind;
	int number;
	static int width;
	static int height;
	@Override
	public String toString() {
		return kind + ":" + number+ "("+width+","+height+")";
	}
	
}