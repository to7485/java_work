package Test_0424;


public class Student {
	String name;
	int age;
	int num;
	
	public Student(String name, int age, int num) {
		this.name = name;
		this.age = age;
		this.num = num;
	}
	


	public void studentInfo() {
		System.out.println("이름 : "+ name + ", 나이 : "+ age + ", 학번 : " + num);
	}



	public static void main(String[] args) {
//		'학생' 클래스를 작성하고, '이름', '나이', '학번'을 인스턴스 변수로 가지며 이를 출력하는 메서드를 작성하세요.
//
//		- 필드는 생성자를 통해 초기화 합니다.
//		- Main클래스에서 객체를 생성하여 임의의 값을 넣고 출력하세요
		Student s = new Student("홍길동", 25, 1);
		s.studentInfo();
		 
	}
}
