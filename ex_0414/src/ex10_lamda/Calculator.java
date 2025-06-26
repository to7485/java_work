package ex10_lamda;

//컴파일러한테 현재 인터페이스가
//함수형인터페이스임을 알려주는 어노테이션
@FunctionalInterface
public interface Calculator {
	//인터페이스를 함수형인터페이스라고 선언한 순간
	//무조건 1개의 추상메서드만 들어갈 수 있다.
	int f(int x, int y);

}







