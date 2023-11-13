package ch12_genEnumAnno;
/*
 * 열거 타입 (Enumeration Type)
 * 한정된 값만을 갖는 데이터 타입
 * 한정된 값은 열거 상수 (Enumeration Constant)로 정의 
 * 모두 대문자로 작성
 * 관례적으로 두단어가 합쳐질경우 _ 을 이용한다.
 */
enum Direction1  {EAST, SOUTH, WEST, NORTH }
/*
 *  Enum 메서드
 *  
 *  String name()   : 열거형 상수의 이름을 문자열로 리턴
 *  int ordinal()   : 열거형 상수가 정의된 순서를 리턴(0부터 시작)
 *  valueOf(String name) : [지정된 열거형에서] name 과 일치하는 열거형 상수를 리턴
 *  values()  :  열거형 상수들을 배열 형태로 리턴
 */
public class EnumEx1 {
	public static void main(String[] args) {
		Direction1 d1 = Direction1.EAST;
		Direction1 d2 = Direction1.valueOf("WEST");
		Direction1 d3 = Enum.valueOf(Direction1.class, "EAST");
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);
		System.out.println("d1==d2 ? " + (d1==d2));
		System.out.println("d1==d3 ? " + (d1==d3));
		System.out.println("d1.equals(d3) ? " + d1.equals(d3));
//		System.out.println("d2 > d3 ? " + (d1 > d3));  //에러
		System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3));
		System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2));
		System.out.println("==================");
		
	switch(d1)  {
	case EAST: // Direction1.EAST라고 쓸 수 없다.
			System.out.println("The direction is EAST."); break;
	case SOUTH: 
			System.out.println("The direction is SOUTH."); break;
	case WEST: 
			System.out.println("The direction is WEST."); break;
	case NORTH: 
			System.out.println("The direction is NORTH."); break;
	default:
			System.out.println("Invalid direction.");  break;
		}
	Direction1[]  dArr = Direction1.values();
	for (Direction1 d : dArr)  // for (Direction1 d : Direction1.values())
			System.out.printf("%s=%d%n" , d.name(), d.ordinal());
		}
	}

