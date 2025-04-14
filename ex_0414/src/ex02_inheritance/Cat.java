package ex02_inheritance;

public class Cat extends Animal {

	String cat = "고양이";
	
	public Cat() {//자식클래스의 생성자
		super();//부모의 생성자
	}
	
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	
	@Override
	public void animal_info() {
		System.out.printf("=== %s ===\n",cat);
		super.animal_info();
	}
}







