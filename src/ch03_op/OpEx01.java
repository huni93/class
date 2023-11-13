package ch03_op;
/*
 * 증감 연산자
 *   ++ : 숫자의 값을 1 증가
 *   -- : 숫자의 값을 1 감소
 */
public class OpEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5, y=5;
		x++;  //x=x+1;
		y--;  //y=y-1;
    System.out.println("x="+x+",y="+y);
    x=y=5;
    ++x; //전위형  //x=x+1;
    --y;        //y=y-1;
    System.out.println("x="+x+",y="+y);
	}

}
