package ex11_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex01_Stream {
	public static void main(String[] args) {
		//스트림
		//컬렉션(데이터들이 들어가있음)
		//데이터들을 하나씩 처리하는 방식이다.
		//데이터를 저장한다기보다는 처리하는 기능에 집중이 되어있다.
		
		List<String> names = Arrays.asList("Tom","Jane","Steve");
		
		//특징
		//1. 선언형이다 : 반복문없이 데이터 처리가 가능하다.
		names.stream().forEach(System.out::println);
		
		System.out.println("---------------");
		//2. 내부반복 : 개발자가 직접 반복문을 작성하지 않는다.(스트림 api가 반복을 대신 처리해준다)
		
		//외부반복(직접 for문씀)
		for(String name: names) {
			System.out.println(name);
		}
		//내부반복(stream이 알아서 반복함)
		names.stream().forEach(System.out::println);
		
		System.out.println("------------------------");
		//3. 불변성 : 원본 데이터는 변경되지 않는다.
		names.stream()
			.filter(s -> s.length() <=3)//문자열의 길이가 3보다 작거나같은 것만
			.forEach(System.out::println);//출력해라
		
		System.out.println(names);
		
		
		//4. 지연연산 : 최종 연산이 실행되기 전까지 중간 연산이 수행되지 않는다.
		
		//5. 최종연산까지 사용하고나면 스트림을 재사용할 수 없다.
		
		System.out.println("------------------");
		//스트림 사용 방법
		//스트림을 생성한다.
		//배열로부터 생성하는것도 가능하다.
		String[] fruits = {"Apple","Banana","Cherry"};
		Stream<String> fruitStream = Arrays.stream(fruits);
		fruitStream.forEach(System.out::println);
		System.out.println("------------------");
		
		//컬렉션객체로부터 생성하는것도 가능하다.
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
		System.out.println("------------------");
		
		//Stream.of()
		Stream<String> stream = Stream.of("A","B","C");
		stream.forEach(System.out::println);
		
		//중간연산
		//중간연산은 스트림을 변환하거나 필터링 하는 연산
		//새로운 스트림을 반환하며, 지연처리가 된다.
		System.out.println("------------------");
		//filter(Predicate)
		//조건에 맞는 요소만 필터링
		List<String> list = Arrays.asList("apple","banana","avocado");
		list.stream()
			.filter(s -> s.startsWith("a"))
			.forEach(System.out::println);
		System.out.println("------------------");
		//map(Function)
		//요소를 변환
		list.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		System.out.println("------------------");
		//distinct()
		//중복을 제거해준다.
		List<Integer> list2 = Arrays.asList(1,1,2,3,4,5,5,5,6,6,7,7,7,7,8,9,10);
		
		list2.stream()
			.distinct()
			.forEach(System.out::println);
		System.out.println("------------------");
		//sorted()
		//오름차순 정렬
		Stream.of("banana","apple","cherry")
			.sorted()
			.forEach(System.out::println);
		System.out.println("------------------");
		//sorted(Comparator)
		Stream.of("banana","apple","cherry")
		//제네릭 타입을 안쓰면 타입의 추론이 일어나는데
		//reversed를 사용하면 무조건 타입을 명시해야함
			.sorted(Comparator.<String,String>comparing(t -> t).reversed())
			.forEach(System.out::println);
		
		//comparing(t -> t) 항등함수
		//항등함수는 입력값을 그대로 반환하는 함수
		//f(x) = x;
		System.out.println("------------------");
		//limit()/ skip()
		//처음부터 x개를 제한
		//처음부터 x개를 건너 뜀
		
		Stream.of(1,2,3,4,5)
			.limit(3)
			.forEach(System.out::println);
		
		System.out.println("------------------");
		Stream.of(1,2,3,4,5)
		.skip(2)
		.forEach(System.out::println);
		System.out.println("------------------");
		//peek()
		//값을 그대로 유지하면서 중간에 볼 수 있다.
		Stream.of("one","two","three")
			.peek(t -> System.out.println("peek : " + t))
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		
		
		List<Integer> list4 = Arrays.asList(1,2,3,4,5);
		
		//안에 있는 요소를 하나씩 꺼내서 작업
		list4.forEach();
		
		list4.stream().forEach();
		
		
		
		
		
	}
}
