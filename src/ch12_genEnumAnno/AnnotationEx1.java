package ch12_genEnumAnno;

public class AnnotationEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Child extends Parent {
	@Override
	void parentmethod() { } // 조상 메서드의 이름을 잘못적었음. 
}