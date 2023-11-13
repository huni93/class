package ch08_exp;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			//ArrayIndexOutOfBoundsException 예외 발생
			System.out.println(args[0]);  // 1)입력않함
			//NumberFormatException 예외발생
			System.out.println(Integer.parseInt("a"));
			System.out.println(10/Integer.parseInt("0"));
			String str = null;
			System.out.println(str.charAt(0)); //NullPointerException
		}
          catch (ArrayIndexOutOfBoundsException e)  {
        	  System.out.println("command 라인에 피라미터를 입력하세요");
        } catch (ArithmeticException e)  {
        	System.out.println("0으로 나누지 마세요");
        } catch (NullPointerException e) {
        	System.out.println("Null 입니다");
        } catch (NumberFormatException e) {
        	System.out.println("a를 숫자로 입력하세요");
        } catch (RuntimeException e)  {
        	System.out.println("1.오류발생 : 전산부로 전화요망");
        	e.printStackTrace();       }
          catch (Exception e)  {  //Parent 타입 Exception이 위에 있으면 오류
        	System.out.println("2.오류발생 : 전산부로 전화요망");
        }		
	}
}

