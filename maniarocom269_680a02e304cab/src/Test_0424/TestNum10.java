package Test_0424;


class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}


public class TestNum10 {
	public static void main(String[] args) {
		   
			Box<Integer> integerBox = new Box<>();
			integerBox.set(10);
			Integer intValue = integerBox.get();
		    System.out.println("Integer 박스의 값: " + intValue);
		    
		    
		    Box<String> stringBox = new Box<>();
			stringBox.set("Hello, Generics!");
			String strValue = stringBox.get();
			System.out.println("String 박스의 값: " + strValue); 
			
			

		    Box<Double> doubleBox = new Box<>();
		    doubleBox.set(3.14);
		    Double doubleValue = doubleBox.get();
		    System.out.println("Double 박스의 값 " + doubleValue);
			
		}
		
	}


