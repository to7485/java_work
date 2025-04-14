package ex06_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception{
	
	public MyException(String msg) {
		super(msg);
	}
}

public class TryMain {
	//main에 예외 던지기를 하면
	//JVM이 처리를 한다.
	//예외 메시지와 함께 printStackTrace()를 콘솔에 출력하고
	//프로그램을 비정상종료시킨다.
	public static void main(String[] args)throws Exception {
		//오류(Error)
		//시스템에 심각한 문제가 생겼을 때 발생
		//개발자가 직처리할 수 없다.
		//주로 JVM 내부의 심각한 오류로 인한 발생(메모리 부족)
		
		//OutOfMemoryError: 힙 메모리가 부족할 때
		//StackOverflowError : 재귀 호출이 너무 깊을 때
		
		//이런 문제는 애초에 발생하지 않게 코드를 설계해야함
		
		//예외(Exception)
		//프로그램에서 발생할 수 있는 문제 상황을 처리하기 위한 클래스
		//개발자가 직접 예외 처리를 해줘야 한다.
		
		//Checked Exception(체크 예외)
		//컴파일이 확인됨
		//반드시 try-catch로 처리하거나 throws로 떠넘겨야한다.
		//예외 처리를 강제함(컴파일 에러 발생 가능)
		//IOException
		//SQLException
		//FileNotFoundException
		
		//UnChecked Exception(런타임 예외)
		//RuntimeException을 상속한 예외들
		//컴파일러가 예외 처리를 강제하지 않음
		//개발자가 실수로 만든 예외가 대부분
		
		//NullPointerException
		//ArrayIndexOutOfBoundsException
		//NumberFormatException
		
		Scanner sc = new Scanner(System.in);
		//예외처리문법
		try {
			//예외가 발생할 가능성이 있는 코드
			//예외가 발생하게 되면 그 즉시 catch메서드로 이동
			int[] arr = {1,5,7,3,2,7,9};
			System.out.print("번호 선택 : ");
			int select = sc.nextInt();
			System.out.println("선택한 번호의 숫자 : " + arr[select]);
		} catch (InputMismatchException e) {
			//e.printStackTrace();
			//예외가 발생했을 때 예외의 정보를 자세하게
			//출력하는 메서드
			System.out.println("숫자만 입력하세요");
		}catch (ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			//예외가 발생했을 때 예외의 정보를 자세하게
			//출력하는 메서드
			System.out.println("없는 번호입니다.");
		}finally {
			//예외 발생 유무와 상관없이 실행되는 구문
			//필요없으면 안써도됨
			//보통 외부 연동이나 예외가 발생해도 정상 종료되어야
			//할 구문들에서 사용하다.
		}
		
		
		//Exception 클래스
		//모든 예외들의 부모클래스
		//하위 객체들이 들어올 수 있다.
		
		try {
			throw new MyException("내가 만든 예외");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			checkAge(15);
		} catch (Exception e) {
			System.out.println("예외 처리됨 : " + e.getMessage());
		}
	}
	
	//예외 던지기
	//메서드 안에서 예외가 발생했을 때 바로 처리하는것이 아니라
	//함수를 호출한쪽에서 처리하는 것
	
	//throws 예외의 종류
	//static정적 변수, 메서드는 실행하면 가장 먼저 메모리 올라간다.
	public static void checkAge(int age)throws Exception{
		if(age < 18) {
			throw new Exception("18세 미만은 입장할 수 없습니다.");
		}
		System.out.println("입장 가능");
	}
	
	
	
	
	
	
	
	
	
}
