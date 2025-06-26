package ex08_generic;

public class GenMain {
	public static void main(String[] args) {
		//제네릭은 객체가 만들어질 때 타입이 결정된다.
		//타입매개변수에는 클래스만 들어갈 수 있다.
		Gen<Integer> g1 = new Gen<Integer>();
		g1.setValue(100);
		System.out.println(g1.getValue());
		
		
		
		
		
		Gen<String> g2 = new Gen<String>();
		g2.setValue("홍길동");
		System.out.println(g2.getValue());
		
		Gen g3 = new Gen();
		
		Integer[] arr ={1,2,3,4,5}; 
		g3.<Double>printArray(arr);
		
		//1. 타입 추론
		//제네릭 메서드를 호출할 때 인자들의 타입을 참고하여 컴파일러가
		//알맞은 타입 매개변수를 자동으로 결정한다.
		//개발자는 타입을 별도로 명시할 필요가 없으므로 코드가 더 간결해진다.
		System.out.println();
		Double[] d_arr = {1.1,2.2,3.3,4.4,5.5};
		g3.<Integer>printArray(d_arr);
		
		//2. 명시적 타입 지정
		//가끔 컴파일러의 추론이 원하는 타입과 다르게 작동할 수 있거나
		//호출 시점에 타입을 명확히 지정하여 코드 가독성을 높이고자 할 때 
		//사용한다.
		//타입을 명시적으로 지정하면 오류를 방지하고 의도를 명확히 할 수 있다.
		
		
		
		
		
		
		
		
		
		
	}
}
