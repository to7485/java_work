package ex02_inheritance;

//추상클래스를 상속받으면 추상메서드를 반드시 오버라이딩
//해야함
public class Bear extends Animal{

	@Override
	public void cry() {
		System.out.println("크어엉");
	}
	
	//오버라이딩된 메서드가 아님
	public void eat() {
		System.out.println("연어를 먹는다.");
	}

}
