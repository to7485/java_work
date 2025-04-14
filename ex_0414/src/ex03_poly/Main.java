package ex03_poly;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		//자식객체를 부모타입으로 변환
		Parent p = new Child();
		p.display();//부모가 가지고있는 메서드를 사용 OK
		p.info();//오버라이딩된 메서드가 실행
		//p.childOnly(); 자식이 고유하게 갖고있는 값이나 메서드는 사용 X
		
		//컴파일시 자바 컴파일러는 변수의 선언 타입을 기준으로
		//메서드나 필드 등 어떤 멤버에 접근할 수 있는지 결정
		
		//동적바인딩
		//메서드 호출 시점에 실행되는 메서드의 구현을 결정한다.
		//호출된 메서드가 실제 객체 타입에 따라 실행된다.
		//단, 호출할 수 있는 메서드는 미리 컴파일러가
		//Parent클래스에 있는 메서드로 제한한 후, 런타임에
		//오버라이딩 된 메서드를 실행하는 것이다.
		
		//만약 자식클래스에 있는 메서드를 사용하고 싶다면
		//강제로 타입을 변환한 후 사용해야한다.
		((Child)p).childOnly();
		
		Parent son = new Son();
		Parent daughter = new Daughter();
		
		//Parent타입으로 선언된 변수로 info()메서드 호출
		//실행 시 실제 객체 타입에 따라 재정의된 메서드가 호출
		son.info();
		daughter.info();
		
		//다양한 자식 객체들을 하나의 배열로 관리할 수 있다.
		Parent[] p_arr = {
				new Son(), 
				new Daughter(), 
				new Son(), 
				new Twin()};
		
		//다형성을 사용하면 코드가 간결해지고, 서로 다른 객체들이
		//같은 인터페이스(또는 부모클래스의 메서드)를 통해 처리되기 때문에
		//확장성과 유지보수성이 높아진다.
		
//		for(Parent x: p_arr) {
//			x.info();
//		}
		System.out.println("------------------");
		List<Parent> list = new ArrayList<>();
		
		list.add(new Son());
		list.add(new Daughter());
		list.add(new Twin());
		
		list.forEach(Parent::info);
		
		//다형성은 복합적인 개념이고
		//상속 + 오버라이딩 + 타입변환
		
		
		
		
	}
}





