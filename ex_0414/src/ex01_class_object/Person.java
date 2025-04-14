package ex01_class_object;

//사람에 대한 정의
public class Person {

	//이름,나이,성별,키
	//필드,멤버변수 -> 객체별로 갖는 값
	String name;
	int age;
	private Phone phone; //사람은 핸드폰을 가질 수 있다.
	
	//먹는다,인사한다,잔다,공부한다
	//메서드, 인스턴스 메서드
	//반환값과 반환형의 타입은 일치해야한다.
	//반환형으로 우리가 만든 클래스타입도 들어올 수 있다.
	//접근제한자 반환형 메서드명(매개변수){
	//	return 반환값
	//}
	
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	public Phone getPhone() {
		return phone;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
