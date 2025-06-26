package ex09_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex02_HashSet {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(3);
		hs.add(5);
		hs.add(1);
		hs.add(2);
		
		System.out.println(hs);
		
		List<Integer> numberList = Arrays.asList(1,2,3,2,1,4,5,5,6,7,7,7,8);
		Set<Integer> numberSet = new HashSet<>(numberList);
		
		//Collection -> 인터페이스
		//List	Set -> 인터페이스
		//AL	HS
		System.out.println(numberList);
		System.out.println(numberSet);
		
		List<Integer> result_list = new ArrayList<>(numberSet);
		
		System.out.println(result_list);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
