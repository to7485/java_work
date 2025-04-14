package ex02_inheritance;

public class Main {
	public static void main(String[] args) {
		//Animal animal = new Animal();
		
		Dog dog = new Dog();
		System.out.printf("=== 강아지 ===\n");
		dog.animal_info();//부모에서 물려받은 메서드
		dog.cry();
		
		Cat cat = new Cat();
		cat.animal_info();//오버라이딩한 메서드
		cat.cry();
		
		Farm f = new Farm();
		
		f.animal1 = new Bear();//직계자식
		f.animal2 = new Poodle();//후손객체
		
		//f.animal1.eat(); //단독으로 정의된 메서드는 사용이 불가능함
		f.animal1.cry(); //오버라이딩 한 메서드는 사용이 가능함
		
		//만약 자식 클래스에 정의된 내용을 사용하고 싶다면 다시
		//자식타입으로 바꾸면된다.
		((Bear)f.animal1).eat();
			
		f.sound(cat);
		f.sound(dog);
		
		Snake s = new Snake();
		System.out.printf("=== 뱀 ===\n");
		s.animal_info();
		
		
		
	}
}






