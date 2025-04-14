package ex02_inheritance;

//클래스에 final클래스를 붙히면
//더 이상 상속을 해 줄 수 없는 클래스가 된다.
public class Dog extends Animal{

	//자식클래스에 직접적으로 정의는 안하지만
	//부모클래스의 필드나 메서드는 사용할 수 있다.
	
	//강아지가 우는거는 "멍멍"이라고  출력하고 싶다.
	//메서드는 그냥 cry를 쓰고싶어
	
	//메서드의 오버라이딩 (메서드의 재정의)
	//부모의 것을 물려받아서 자식의 상황에 맞게
	//재정의 하는것
	
	String dog = "강아지";
	
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
	
//	@Override
//	public void animal_info() {
//		System.out.printf("=== %s ===\n",dog);
//		super.animal_info();//부모의 메서드를 호출
//	}
	
	
	
	
	
	
}
