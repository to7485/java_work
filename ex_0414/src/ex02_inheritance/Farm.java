package ex02_inheritance;

public class Farm {

	//클래스 타입변환
	//자식 객체를 부모타입으로 변환하는것(자동타입변환)
	
	
	//부모타입으로 변환이 일어나면 자식 클래스에 단독으로 정의된
	//내용을 쓸 수 없음
	//단, 오버라이딩된 메서드만 사용이 가능하다.
	
	Animal animal1; //개,고양이든 animal을 상속받은 객체가 다 들어올 수 있음
	Animal animal2;
	
	//매개변수로 Animal타입의 객체를 다 받을 수 있다.
	//다형성
	//클래스 타입변환 + 오버라이딩 + 추상화 -> 다형성
	public void sound(Animal animal) {
		animal.cry();
	}
	
	
	
	
}
