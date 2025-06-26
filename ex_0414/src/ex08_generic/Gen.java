package ex08_generic;
//제네릭
//클래스에 들어가는 필드, 메서드의 타입을 미리 정하지 않음
//객체를 만들 때 설정
public class Gen<T> {

	//타입별로 필드나 메서드를 따로 만들지 않아도 된다는 점
	T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	//제네릭 메서드
	//메서드의 선언부에 타입 매개변수를 따로 추가를 하는 것.
	//이 경우, 메서드 내부에서 사용되는 타입이 메서드 호출시 결정
	public <E> void printArray(E[] arr) {
		for(E e : arr) {
			System.out.print(e+" ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
