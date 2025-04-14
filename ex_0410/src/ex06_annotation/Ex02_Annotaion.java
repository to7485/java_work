package ex06_annotation;

import java.lang.annotation.Annotation;

@TestInfo(name="홍길동",skills= {"Java","Spring"})
public class Ex02_Annotaion {
	public static void main(String[] args) {
		Annotation[] annotations = Ex02_Annotaion.class.getAnnotations();
		
		for(Annotation anno : annotations) {
			System.out.println(anno);
		}
		
		TestInfo testInfo = Ex02_Annotaion.class.getAnnotation(TestInfo.class);
		System.out.println(testInfo.name());
			
	}
}
