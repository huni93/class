package ch12_genEnumAnno;

public class AnnotationEx2 {

	public static void main(String[] args) {
		NewClass nc = new NewClass();

		nc.oldField = 10;                     //@Depreacted가 붙은 대상을 사용
		System.out.println(nc.getOldField()); //@Depreacted가 붙은 대상을 사용

	}

}
