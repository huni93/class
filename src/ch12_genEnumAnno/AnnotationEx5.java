package ch12_genEnumAnno;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111") // 유효하지 않은 애너테이션은 무시된다.
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101", hhmmss="235959"))

public class AnnotationEx5 {

	public static void main(String[] args) {
		// AnnotaionEx5의 Class객체를 얻는다.
				Class<AnnotationEx5> cls = AnnotationEx5.class;
				
				TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
				System.out.println("anno.testedBy()="+anno.testedBy());
		      	System.out.println("anno.testDate().yymmdd()="+anno.testDate().yymmdd());
				System.out.println("anno.testDate().hhmmss()="+anno.testDate().hhmmss());
				System.out.println("anno.count()="+anno.count());
			} // main의 끝
		}

		@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정 
		@interface TestInfo {
			int       count()	    default 1;
			String    testedBy();
			String[]  testTools()   default "JUnit";
			TestType  testType()    default TestType.FIRST;
			DateTime  testDate();
		}

		@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정
		@interface DateTime {
			String yymmdd();
			String hhmmss();
		}

		enum TestType { FIRST, FINAL }