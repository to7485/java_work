package ex04_abstract;

//추상클래스
//왜 씀?
//공통 필드, 메서드를 공유
//상속 -> 추상화
//서브클래스에서 구체적으로 구현하도록 강제할 때 사용
//단일상속만 가능하다.(두 개이상의 부모를 갖는게 불가능하다)

abstract class Animal{
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	//추상 메서드(몸체가 없다)
	//자식들한테 makeSound()쓰라고 강제함
	abstract void makeSound();
	
	//추상클래스에 일반메서드 생성도 가능
	public void sleep() {
		System.out.println(name+"이 잠을 잔다.");
	}
}

class Dog extends Animal{

	public Dog(String name) {
		super(name);//부모의 생성자가 매개변수를 가져서 생략 불가능
		// TODO Auto-generated constructor stub
	}

	//추상메서드는 반드시 오버라이딩 해야하는 강제성을 띈다.
	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Main {
	public static void main(String[] args) {
		
	}
}
