package ex01_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam1 {
	public static void main(String[] args) {
		List<String> orders = Arrays.asList(
			    "Alice:TV", "Bob:TV", "Alice:Phone", "Charlie:TV", 
			    "David:Tablet", "Eve:Phone", "Frank:Phone", "Alice:Phone"
			);
		
		System.out.println(orders);
		
		//key가 String이고 value가 Integer인 HM을 만듦
		Map<String, Integer> productCount = new HashMap<>();
		
		//ArrayList에서 요소를 하나씩 꺼내서
		for(String value : orders) {
			
			//:를 기준으로 잘라서 배열을 만듦
			String[] part = value.split(":");
			
			//["Alice","TV"]
			//["BoB","TV"]
			// ...
			
			//상품이름이 들어갔음
			//String product = "TV";
			String product = part[1];
			
			//productCount.put("TV", 1);
			//productCount.put("TV", 2);
			productCount.put(product, productCount.getOrDefault(product, 0)+1);
		
		}
		
		//가장 많이 주문된 상품 찾기
		String maxProduct = null;
		int maxCount = 0;
		
		for(Map.Entry<String, Integer> entry : productCount.entrySet()) {
			if(entry.getValue() > maxCount) {
				maxProduct = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		
		System.out.println(maxProduct + " => " + maxCount);
		
	}
}
