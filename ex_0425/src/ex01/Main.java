package ex01;

import java.util.Arrays;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		Exam e = new Exam();
		
		int[] i_arr = {1,1,1,2,2,2,2,3,3,3,4,4,4,4,4,5,5,5,5,5};
		System.out.println(Arrays.toString(e.removeDuplicates(i_arr)));
		
		int[] f_arr = {3,2,5,7,9,4,2,1,6,8};
		System.out.println(e.findMaxValue(f_arr));
		
		Student s = new Student("홍길동", 22, "20250001");
		s.info();
		
		String text = "apple banana apple apple orange banana apple orange orange";
		
		Map<String, Integer> map = e.wordFrequency(text);
		
		for(Map.Entry<String, Integer> e1 : map.entrySet()) {
			System.out.println(e1.getKey()+" : " + e1.getValue());
		}
		
		//apple: 4
		//banana: 2
		//orange: 3
		
		String[] m = new String[] { "A", "A", new String("A") };
        e.func(m, m.length);
        
        System.out.println();
        int num = 12345;
        System.out.println(e.sumOfDigits(num));
        
        Box<Integer> b1 = new Box<>();
        b1.setValue(10);
        Box<String> b2 = new Box<>();
        b2.setValue("Hello, Generics");
        Box<Double> b3 = new Box<>();
        b3.setValue(3.14);
        
        System.out.println("Integer 박스의 값 : " + b1.getValue());
        System.out.println("String 박스의 값 : " + b2.getValue());
        System.out.println("Double 박스의 값 : " + b3.getValue());
        
			
	}
}






