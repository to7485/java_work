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
}
