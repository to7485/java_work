package ex10_lamda;

import java.util.Arrays;
import java.util.List;

public class Main2 {

	public static int add(MyFunction func) {
		return func.f(10, 7);
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//오버로딩						오버라이딩
		//상속과 상관없음				상속관계에서만 사용이된다.
		//							부모클래스의 메서드를 자식이 재정의
		//메서드의 중복정의				메서드의 재정의
		//
		
		Overloading ol = new Overloading();
		
		ol.f();
		ol.f(100);
		ol.f("홍길동");
		ol.f(100,'c');
		
		add((x, y) -> )
		
		
		//배열과 스트림
		//배열 -> 크기가 정해져있고, index가 있고 같은 자료형의 데이터를 담을 수 있는 자료구조
		
		//스트림 -> 배열,컬렉션을 통해 생성, 원본의 데이터를 가지고 가공하거나 필터링을 해주는것
		
		int[] arr = {1,1,1,1,1,2,2,2,2,3,3,3,3,3,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("------------------");
		
		Arrays.stream(arr)
			.filter(x -> x % 2 == 0)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
	}
}
