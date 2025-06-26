package ex01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exam {
	
	//주어진 배열에서 중복된 값을 제거하는 메서드 작성하기
	public int[] removeDuplicates(int[] arr) {
		//Hashset에 배열의 모든 내용을 넣으면 됨
		Set<Integer> s = new HashSet<Integer>();
		for(int i : arr) {
			s.add(i);
		}
		
		int[] result = new int[s.size()];
		int index = 0;
		for(int num: s) {
			result[index++] = num;
		}
		
		return result;
	}
	
	//주어진 숫자 배열에서 가장 큰 값을 찾는 메서드
	public int findMaxValue(int[] arr) {
		int max = arr[0];
		for(int i: arr) {
			if(max < i) {
				max = i;
			}
		}
		return max;
	}
	
	//Map을 사용하여 주어진 단어들의 빈도를 계산하는 메서드를 작성하고 결과를 출력하세요
	public Map<String, Integer> wordFrequency(String text){
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		//공백을 기준으로 단어 나누기
		String[] words = text.split(" ");
		
		//각 단어의 빈도수 계산
		for(String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
		}
		
		return wordCount;
	}
	
//	String[] m = new String[] { "A", "A", new String("A") };
	public void func(String[] m, int n) {
        for (int i = 1; i < n; i++) {
        	//equals() -> 값을 비교
            if (m[i - 1].equals(m[i])) {
                System.out.print("O");
            } else {
                System.out.print("N");
            }
        }
        for (String mo : m) {
            System.out.print(mo);
        }
    }
	
	//int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 메서드 만들기
	//만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라.
	public int sumOfDigits(int n) {
		int sum = 0;
		while(n > 0) {
			sum += n % 10; //12345
			n /= 10;
		}
		
		return sum;
	}
	
	
	
	
	
	
	
}







