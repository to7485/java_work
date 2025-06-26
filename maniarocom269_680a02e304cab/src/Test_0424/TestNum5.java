package Test_0424;

public class TestNum5 {
	public void maxNum() {
		int[] f_arr = {3,2,5,7,9,4,2,1,6,8};
		int max = f_arr[0];

		for (int i = 0; i < f_arr.length; i++) {
			if (f_arr[i] > max) {
				max = f_arr[i];
			}
		}
		System.out.println("최대값 : " + max );
		
		
	}

	public static void main(String[] args) {
		// 5. 주어진 숫자 배열에서 가장 큰 값을 찾는 메서드를 작성하세요.
		
		TestNum5 t = new TestNum5();
		t.maxNum();
	}

}
