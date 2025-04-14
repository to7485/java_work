package ex02_inheritance;

public class Snake extends Animal{

	//자식클래스만의 고유한 특징을 정의
	int leg = 0;
	String fur = "털이 없음";
	
	@Override
	public void animal_info() {
		System.out.println("눈 : " + eyes);
		System.out.println("다리 : " + leg);
		if(tail) {
			System.out.println("꼬리 : 있음");
		}
		System.out.println("털 : " + fur);
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}
}






