package ex01_class_object;

public class Main {
	public static void main(String[] args) {
		
		//사람을 1명 만든다.
		//객체를 생성 -> Heap영역에 올린다.
		//String s; 객체변수
		  Person p;
		  
		  String s = new String("홍길동");
		  //Heap메모리 영역에 올라간 객체를 변수 p에 대입
		  //변수 p는 객체까지 접근할 수 있는 주소값을 가지고 있다.
		  p = new Person();
		  
		System.out.println(p);//주소값을 출력
		
		//객체를 생성해서 변수에 대입
		Phone phone = new Phone();
		//ㄴ phone 변수로 재사용이 가능하다.
		phone.setBrand("애플");
		
		
		
		
		//익명 객체를 만들어서 매개변수로 전달
		p.setPhone(new Phone());
		
		p.getPhone().setBrand("샘송");
		
		
		
		
	}
}
