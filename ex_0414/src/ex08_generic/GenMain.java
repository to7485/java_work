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
		
		
		
		
		
		
		
	}
}
