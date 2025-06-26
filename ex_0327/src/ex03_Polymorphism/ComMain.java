package ex03_Polymorphism;

public class ComMain {
	public static void main(String[] args) {
		//컴퓨터실 만듦
		ComputerRoom cr = new ComputerRoom();
		cr.com1 = new Samsung();
		
		//Computer com2 = new LZ();
		//cr.com2 = new LZ();
		
		cr.com2 = new Apple();
		
		cr.allPowerOn();
		cr.allPowerOff();
		
	}
}
