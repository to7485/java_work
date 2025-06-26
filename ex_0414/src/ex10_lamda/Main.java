package ex10_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
	//다형성에 의해서 Calculator 인터페이스를 구현한 객체들은
		//매개변수로 들어올 수 있다.
		public static int add(Calculator cal) {
			return cal.f(10, 7);
		}
		
	public static void main(String[] args) {
		//연산식 : int value = 2*2+2;
		//람다식(lamda-Expression)
		//함수를 식처럼 사용하겠다.
		//람다식을 왜 쓸까?
		//코드가 간결해진다.
		
		//인터페이스 -> 클래스로 구현 -> 메서드 사용
		Calculator ci = new CalImpl();
		System.out.println("구현체 : " + ci.f(10, 7));
		
		Calculator cal = ci;
		
		//익명클래스 사용하기
		Calculator cal = new Calculator() {

			@Override
			public int f(int x, int y) {
				return x+y;
			}
			
		};
		
		System.out.println("익명클래스 : " + cal.f(10, 7));
		
		//람다식으로 구현하기
		//람다식은 함수의 선언부에서 매개변수 부분과 코드블럭
		//부분만 살린다.
		//매개변수와 코드블럭 사이에 ->를 쓰면 끝난다.
		//(매개변수들) -> {실행할 코드;}
		
		Calculator lamda = (int x, int y) -> {return x+y;};
		
		System.out.println("람다식 : " + lamda.f(10, 7));
		
		//람다식은 함수형 인터페이스를 구현한 객체라고 볼 수 있다.
		//표면상으로는 new 키워드를 사용하지 않지만 일반적인
		//자바 객체들처럼 Heap영역에 할당이 된다.
		
		System.out.println("주소 : " + System.identityHashCode(lamda));
		
		//자바는 객체지향 언어로서 모든 메서드는 객체를 통해 이루어진다.
		//람다식은 익명함수처럼 보이지만 실제로는 함수형 인터페이스를
		//구현한 객체이기 때문에, 다른 메서드처럼 추상 메서드의 이름으로
		//호출하는것이 자연스럽다.
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		list.forEach(x -> System.out.println(x));
		
		//add(lamda);
		add((int x, int y) -> {return x+y;});
		
		Calculator lamda2 = add();
		System.out.println(lamda2.f(10, 7));
		
		//자바에서 제공하는 함수형 인터페이스
		//Function<T,R>
		//추상메서드 R apply(T t)
		
		//Predicate<T>
		//추상메서드 boolean test(T t)
		
		//Consumer<T>
		//추상메서드 void accept(T t)
		
		//Supplier<T>
		//추상메서드 T get()
		
		//BinaryOperator<T>
		//추상메서드 T apply(T t1, T t2)
		
		//BiFunction<T,U,R>
		//추상메서드 R apply(T t, U u)
		
		//BiPredicate<T,U>
		//추상메서드 boolean test(T t, U u);
		
		//BiConsumer<T,U>
		//추상메서드 void accept(T t, U u);
		
		//람다식의 연결
		//andThen
		
		Function<Integer,Integer> addFive = x -> x + 5;
		Function<Integer,Integer> multiplyByTwo = x -> x * 2;
		
		Function<Integer,Integer> addThenMultiply = addFive.andThen(multiplyByTwo);
		
		System.out.println(addThenMultiply.apply(5));
		
		//compose
		Function<Integer,Integer> addThenMultiply2 = addFive.compose(multiplyByTwo);
		System.out.println(addThenMultiply2.apply(5));
		
		//Predicate와 논리연산
		//and(), or(), negate();
		
		Predicate<Integer> isPostive = x -> x > 0;
		Predicate<Integer> isEven = x -> x % 2 == 0;
		
		Predicate<Integer> positiveAndEven = isPostive.and(isEven);
		
		System.out.println(positiveAndEven.test(4));
		System.out.println(positiveAndEven.test(3));
		
		Predicate<Integer> positiveOrEven = isPostive.or(isEven);
		
		System.out.println(positiveOrEven.test(4));
		System.out.println(positiveOrEven.test(3));
		
		//negate()
		
		System.out.println(isPostive.negate().test(5));
		
		//참조연산자 ::
		//람다식 내부에서 메서드를 호출할 때 보다 간결하게
		//표현하기 위해서 사용하는 연산자
		
		//1. 정적 메서드 참조
//		Function<String, Integer> parseInt = x -> Integer.parseInt(x);
		Function<String, Integer> parseInt = Integer::parseInt;
		
		//2. 인스턴스 메서드 참조
		Consumer<String> printer = System.out::println;
		
		//3. 생성자 참조
		Supplier<List<String>> listSupplier = ArrayList<String>::new;
		
		//4. 클래스의 특정 메서드 참조
		Function<String, Integer> length = String::length;
	}
	
	
	
	//람다식을 반환값으로 받는 경우
	public static Calculator add() {
		return (int x, int y) -> {return x + y;};
	}
	
	
	
	
}
