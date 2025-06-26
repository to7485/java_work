package ex01;

//학생 클래스를 작성하고 '이름','나이','학번'을
//필드로 가지며 이를 출력하는 메서드 작성하기
//- 필드는 생성자를 통해 초기화된다.
//- Main클래스에서 객체를 생성하여 임의의 값을 넣고 출력해라
public class Student {
	String name;
	int age;
	String id;
	
	public Student(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public void info() {
		System.out.printf("이름 : %s, 나이: %d, 학번 : %s\n",name,age,id);
	}
	
}

