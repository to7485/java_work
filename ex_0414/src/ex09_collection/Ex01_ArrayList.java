package ex09_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		arr[1] = 10;
		
		System.out.println(Arrays.toString(arr));
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		for(int i = 0; i < 10; i++) {
			list.add(i+1);
		}
		System.out.println(list);
		list.add(1,10);
		
		System.out.println(list);
		
		ArrayList<Person> p_list = new ArrayList<>();
		
		Person p = new Person();
		
		p_list.add(p);
		System.out.println(p);//Person객체의 주소
		System.out.println(p_list.get(0));//list의 첫번째요소의 값
		
		//p객체에 내용 세팅하기
		p_list.get(0).setName("홍길동");
		p_list.get(0).setAge(30);
		
		List<Integer> list5 = new ArrayList<>();
		
		Set<Integer> hs3 = new HashSet<>();
		
		
		
	}
}





