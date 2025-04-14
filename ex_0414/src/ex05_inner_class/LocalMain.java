package ex05_inner_class;

//지역 내부 클래스
//메서드 안에 정의된 클래스
//메서드가 끝나면 같이 종료되서 사용할 수 없다.

public class LocalMain {
	
	public void someMethod() {
		//메서드 안에서 정의된 지역 내부 클래스
		//클래스를 외부로 뺄 필요 없이, 한정된 범위 내에서만 잠깐 사용할 때
		//재사용성이 없고, 메서드 안에서만 사용하는 클래스라면
		//외부에 클래스를 선언하지 않아도 돼서 코드가 간결해짐
		
		//단순 변수, 함수로는 부족할 때
		//일회성 객체에 상태/기능을 동시에 담고 싶을 때
		class LocalHelper{
			void help() {
				System.out.println("도와줄게요!");
			}
		}
		
		LocalHelper helper = new LocalHelper();
		helper.help();
		
	}
}
