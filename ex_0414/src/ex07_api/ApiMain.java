package ex07_api;

public class ApiMain {
	public static void main(String[] args) {
		//자바의 모든 클래스는 Object클래스를 상속받는다.
		//equals()
		//toString()
		
		//String클래스
		//length,charAt,split,replace,indexof,
		//substring
		
		//불변의 법칙
		String str1 = "abc";
		String str2 = "abc";
		
		//객체끼리의 ==은 주소값을 비교하는것
		//같은 주소를 공유하고 있다.
		System.out.println(str1 == str2);
		System.out.println(System.identityHashCode(str2));
		str2 = "zxc";
		System.out.println(System.identityHashCode(str2));
		System.out.println(str1);
		
		//문자열의 값은 수정이 되는게 아니라
		//연결을 버리고 새로운 값을 갖는 메모리를 할당받는다.
		
		
		//StringBuilder
		//가변속성을 지닌 클래스
		//내부에 여유공간을 두기 때문에 문자열을 합칠 때 메모리에
		//새롭게 생성하는 과정을 현저히 생략할 수 있다.
		//append,delete,inert,reverse
		
		//Math클래스
		//수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은
		//클래스로 자바에서 수학 계산이 필요할 때 사용
		//모든 메서드는 정적메서드임
		
		//올림,버림, 반올림 할 때 무조건 소수점 첫째자리에서 함
		System.out.println(Math.ceil(3.141592*100)/100);
		System.out.println(Math.floor(3.141592));
		
		
		
		
		
		
	}
}
