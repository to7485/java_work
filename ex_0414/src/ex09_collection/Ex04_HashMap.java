package ex09_collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex04_HashMap {
	public static void main(String[] args) {
		
		HashMap<String, List<Integer>> student = new HashMap<>();
		
		student.put("홍길동", Arrays.asList(100,90,48));
		student.put("박개발", Arrays.asList(62,10,94));
		student.put("김춘삼", Arrays.asList(20,78,52));
		
		System.out.println(student.get("박개발").get(1));//10
		
		System.out.println(student);
		
		//getOrDefault(Object key, V defaultValue);
		//key를 통해서 조회된 value가 있다면 value를 반환
		//조회된 value가 없으면 default값을 반환
		
		HashMap<String, Integer> hs2 = new HashMap<>();
		
		hs2.put("cherry", 7);
		hs2.put("date", 4);
		
		Integer grapeValue = hs2.getOrDefault("cherry", 0);
		System.out.println(grapeValue);
		
		//keySet()
		//Map에 들어있는 모든 key를 Set형태로 반환한다.
		Set<String> keys = hs2.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		
		//values()
		//Map에 들어있는 모든 value를 Collection형태로 반환
		Collection<Integer> values = hs2.values();
		
		for(Integer val : values) {
			System.out.println(val);
		}
		
		//entrySet()
		//모든 key-value 쌍을 Map.Entry객체로 구성된 Set형태로 반환
		Set<Map.Entry<String, Integer>> entries = hs2.entrySet();
		
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
		
		
		
		
		
		
		
	}
}
