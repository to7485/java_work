package ex03_Polymorphism;

public class ComputerRoom {

//	Samsung com1;
//	Samsung com2;
	
//	LZ com1;
//	LZ com2;
	
	Computer com1; //Computer클래스를 상속받은 클래스의 객체들
	Computer com2;
	
	public void allPowerOn() {
		com1.powerOn();
		com2.powerOn();
	}
	
	public void allPowerOff() {
		com1.powerOff();
		com2.powerOff();
	}

}
