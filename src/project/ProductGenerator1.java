package project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ProductGenerator1 {

	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		String[] ramens = { "신라면", "진라면", "짜파게티", "너구리", "안성탕면", "불닭볶음면", "육개장", "비빔면", "삼양라면", "왕뚜껑" };
		String[] remark = { "맛있어요", "그냥그래요", "맛없어요" };
		String[] region = { "전라도", "경상도", "충청도", "경기도", "강원도" };
		String[] price = {"1.000","1.100","1.200","1.300","1.400","1.500"};
		int limit = 0;		
		try {
			fos = new FileOutputStream("src/ch11_collection/product1.txt");
			ps = new PrintStream(fos);
			while (limit++ < 100) {
				ps.print((int) (Math.random() * 12) + 1 + ",");// 1~12월까지의 판매월				
				ps.print(region[(int) (Math.random() * 5)] + ",");// 지역
				ps.print(ramens[(int) (Math.random() * 10)] + ","); // 라면 이름
				ps.print((int) (Math.random() * 5) + 1+ ","); // 수량 1~5. 라면 판매량
				ps.print(price [(int) (Math.random() * 6)]);
				ps.print(",");
				ps.print(remark[(int) (Math.random() * 3)]);  //리뷰

				ps.println();
			}
			System.out.println("파일 생성 완료");
			ps.flush();
			ps.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}