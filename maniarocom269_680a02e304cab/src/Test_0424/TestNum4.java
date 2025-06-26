package Test_0424;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestNum4 {

	public int[] removeDuplicates(int[] i_arr) {
		List<int[]> numbers = Arrays.asList(i_arr);
				Stream.of(numbers)
					.distinct();
					
		return i_arr;
	}
	
	
	public static void main(String[] args) {
//		4. 주어진 배열에서 중복된 값을 제거하는 메서드를 작성하세요.
//
		int[] i_arr = {1,1,1,2,2,2,2,3,3,3,4,4,4,4,4,5,5,5,5,5};
		TestNum4 t = new TestNum4();
		System.out.println(t.removeDuplicates(i_arr));
//		- 메서드명 : removeDuplicates
//		- 매개변수 : 정수형 배열
//		- 반환값 : 정수형 배열

		
	}

}
