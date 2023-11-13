package ch09_lang;

public class CloneEx1 {

	public static void main(String[] args)  {
		Point original = new Point(3, 5);
		original.hashCode();
        Point copy = (Point) original.clone2(); //복제 (clone)해서 새로운 객체를 생성
        copy.y=999;
        System.out.println(original);
        System.out.println(copy);
	}
}
class Point implements Cloneable {	
	int x;  int y;
	public Point (int x, int y) {
		super();
		this.x = x;   this.y = y;  }
	
	@Override
	protected Object clone()  {
		try {
			return super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;		
	}
	//복사 2 Override 지워야 에러안남
	protected Object clone2()  {
		try {
			return super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;		
	}
	@Override
	public String toString()  {
		return "point [x=" + x + ", y=" + y + "]";}
	}



