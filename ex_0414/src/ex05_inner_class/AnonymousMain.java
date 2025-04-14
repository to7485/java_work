package ex05_inner_class;
//익명 클래스
//이름이 없는 클래스
//선언과 동시에 객체를 생성하며
//주로 인터페이스나 추상클래스를 구현하거나 상속할 때 사용
//new 생성자(){익명클래스};
interface Greeting{
	void sayHello();
}

abstract class Animal{
	abstract void sound();
}

public class AnonymousMain {
	public static void main(String[] args) {
		Greeting greeting = new Greeting() {

			@Override
			public void sayHello() {
				System.out.println("안녕하세요!");
			}
		};
		
		greeting.sayHello();
		
		Animal dog = new Animal() {
			
			@Override
			void sound() {
				System.out.println("멍멍!");
			}
		};
		
		dog.sound();
		
		
	}
}







