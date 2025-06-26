package ex08_generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenCasting {
	public static void main(String[] args) {
		//일반적인 제네릭 타입에서 하위 타입을 쓸 수 있다.
		//Wrapper클래스
		//Integer,Double,Float -> Number클래스의 자식
		
		List<Number> list = new ArrayList<>();
		
		list.add(1); //Integer값 추가 가능
		list.add(1.1); //Double도 추가 가능
		
		//불공변성
		//타입간 상속관계가 있어도, 제네릭으로 감싸진 타입은
		//서로 별개의 타입으로 취급된다.
		//이를 통해, 예상치 못한 타입 혼란과 런타임 오류를
		//미연에 방지할 수 있다.
		
		Object parent = new Object();
		
		Integer child = new Integer();
		
		parent = child;//다형성
		
		
		ArrayList<Object> parent2 = new ArrayList<>();
		ArrayList<Integer> child2 = new ArrayList<>();
		
		//parent2 = child2; 불가능
		
		List<Integer> integers = Arrays.asList(1,2,3);
		print(integers);
			
	}
	
	public static void print(List<Object> arr) {
		for(Object e : arr) {
			System.out.println(e);
		}
	}
	
	
	
	
	
	
}
