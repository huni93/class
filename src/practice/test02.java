package practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 *대용량 데이터를  product.txt 파일로 생성하기
 */
public class test02 {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		String[] gs = {"김밥","과자","라면","소주","담배"};
		String[] remark = {"불량","유통기한지남","찌그러짐"};
		String[] remark2 = {"1+1","2+1"};
		int limit = 0;		int con = 0; int con1=0;
		try {	fos = new FileOutputStream("src/practice/product.txt");
			    ps = new PrintStream(fos);
			while(limit++<100) {
				ps.print((int)(Math.random()*12)+1+","); //1 ~ 12까지의 판매월
				con = (int)(Math.random()*4)+1;   //1~3까지의 값. 1:입고, 2:출고 , 3:환불 4:추가증정
				ps.print(con + ",");
				ps.print(gs[(int)(Math.random()*5)]+ ","); //판매 제품
				ps.print((int)(Math.random()*5)+1); //수량 1 ~ 5. 자동차 판매량
				if(con==3) {  //반품
					ps.print(",");
					ps.print(remark[(int)(Math.random()*3)]); //반품사유
				}
				if(con==4) {//추가 증정
					ps.print(",");
					ps.print(remark2[(int)(Math.random()*2)]);//추가 증정
					
				}
				ps.println();		}
			System.out.println("파일 생성 완료");
			ps.flush(); ps.close(); fos.close();
		} catch(IOException e) {
			e.printStackTrace();
			
		}
	}}