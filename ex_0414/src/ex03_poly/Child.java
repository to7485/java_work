package ex03_poly;

public class Child extends Parent{
	
	//부모로부터 오버라이딩된 메서드
	@Override
	public void info() {
		System.out.println("자식클래스의 info()");
	}
	//자식클래스에만 있는 메서드
	public void childOnly() {
		System.out.println("자식 클래스에서만 사용가능");
	}
	
	
	
	
}
