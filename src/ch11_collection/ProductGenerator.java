package ch11_collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ProductGenerator {

	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		String[] ramens = { "신라면", "진라면", "짜파게티", "너구리", "안성탕면", 
				            "불닭볶음면", "육개장", "비빔면", "삼양라면", "왕뚜껑"};
		String[] remark = { "맛있어요", "그냥그래요", "맛없어요" };
		String[] region = { "전라도", "경상도", "충청도", "경기도", "강원도" };
		int limit = 0;
		int con = 0;
		try {
			fos = new FileOutputStream("src/ch11_collection/product1.txt");
			ps = new PrintStream(fos);
			while (limit++ < 100) {
				ps.print((int) (Math.random() * 12) + 1 + ",");// 1~12월까지의 판매월
				con = (int) (Math.random() * 4 + 1) ; // 1~3까지의 값. 지역
				ps.print(region[(int) (Math.random() * 5)] + "," );
				ps.print(ramens[(int) (Math.random() * 10)] + ","); // 라면 이름
				ps.print((int) (Math.random() * 5) + 1); // 수량 1~5. 라면 판매량
				
					ps.print(",");
					ps.print(remark[(int) (Math.random() * 3)]); 
				
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
