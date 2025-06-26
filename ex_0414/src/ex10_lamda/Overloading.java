package ex10_lamda;

public class Overloading {

	//오버로딩
	//1. 매개변수의 개수가 달라야 한다.
	//2. 매개변수의 개수가 같을 때 순서가 달라야 한다.
	//3. 매개변수의 개수가 같을 때 타입이 달라야 한다.
	
	public void f() {
		System.out.println("매개변수 없는 메서드");
	}
	
	public void f(int x) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	
	public void f(String s) {
		System.out.println("문자열을 인자로 받는 메서드");
	}
	
	public void f(int x, char c) {
		System.out.println("정수와 문자를 매개변수로 받는 메서드");
	}
	
	
}
