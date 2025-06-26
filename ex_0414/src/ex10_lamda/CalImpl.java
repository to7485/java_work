package ex10_lamda;

//인터페이스를 구현하면 추상메서드를 반드시 오버라이딩 해야한다.
public class CalImpl implements Calculator{

	@Override
	public int f(int x, int y) {
		return x+y;
	}

	
}
