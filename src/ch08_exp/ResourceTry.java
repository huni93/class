package ch08_exp;
//Try-with-resources
public class ResourceTry {

	public static void main(String[] args) {
		//jdk 1.7 이상 사용 가능
		
		try (AutoCloseableUse cr = new AutoCloseableUse() ) {
			System.out.println("process");
		}	System.out.println();		
	}  // main의 끝
}
class AutoCloseableUse implements AutoCloseable{
	
	public void close()  {
		System.out.println("close()가 호출됨===");
	}
}
