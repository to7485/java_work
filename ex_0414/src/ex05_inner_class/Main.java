package ex05_inner_class;
//내부 클래스의 종류
//인스턴스 클래스
//정적 클래스
//지역 클래스
class Car{
	
	private String engineType = "V6";
	
	//단순한 동작만 하고 끝
	//엔진이라는 개념이 "상태"를 가지지 않는다.
//	void startEngine() {
//		System.out.println(engineType+"시동 거는 중...");
//	}
	
	//인스턴스 클래스
	//내부클래스의 객체 ->  엔진 1개 만들어짐
	//Engine 객체는 상태가 있는 구성 요소로 존재
	//엔진이라는 객체 자체를 캡슐화 할 수 있다.
	class Engine{
		void start() {
			System.out.println(engineType+" 엔진이 시동됨");
		}
		
		void stop() {
			System.out.println("엔진이 꺼짐");
		}
	}
	
}

//내부클래스로 정의하면
//외부클래스의 내부 구성 요소를 객체 단위로 표현하고 싶을 때
//ex)자동차의 부품인 엔진(Engine),브레이크(break) 등...

//해당 클래스가 외부 클래스 없이는 절대 존재할 수 없을 때
//Engin은 Car없이는 의미가 없음

//상태와 기능을 하나의 단위로 묶고싶을 때
//클래스를 통해 만들면 상태와 기능을 둘 다 가질 수 있다.

//여러 메서드에서 공통으로 사용하는 도우미 객체일때
//반복되는 로직, 상태 변경을 하나의 객체로 묶어 표현이 가능

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		
		//내부클래스의 객체 생성
		Car.Engine engine = car.new Engine();
		engine.start();
		engine.stop();
	}
}








