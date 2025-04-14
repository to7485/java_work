package ex05_inner_class;

//정적 내부 클래스
//static 키워드로 정의된 내부 클래스
//외부 클래스의 객체 없이도 사용할 수 있다.

class Computer{
	
	private String model;
	private int price;
	
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("모델명 : " + model);
		System.out.println("가격 : " + price+"만원");
	}
	
	//정적내부클래스
	//컴퓨터의 스펙 정보를 정의하는 클래스
	public static class Specifications{
		private String cpu;
		private int ramGB;
		private int ssdGB;
		
		public Specifications(String cpu, int ramGB, int ssdGB) {
			this.cpu = cpu;
			this.ramGB = ramGB;
			this.ssdGB = ssdGB;
		}
		
		public void printSpecs() {
			System.out.println("cpu : " + cpu);
			System.out.println("RAM : " + ramGB);
			System.out.println("SSD : " + ssdGB);
		}
		
	}
}

public class StaticMain {
	public static void main(String[] args) {
		Computer macBook = new Computer("MacBook pro", 250);
		macBook.printInfo();
		
		Computer.Specifications spec = 
				new Computer.Specifications("M2 Pro", 16, 512);
		
		spec.printSpecs();
		
		//논리적으로 소속은 있지만, 외부 객체 없이 사용되는 독립적 클래스
		//외부 클래스의 객체 없이도 사용할 수 있어서 효율적이다. -> 메모리 사용 최적화
		
		//외부 클래스의 정적 맥락과 관련된 클래스를 내부에 묶고싶을 때 적절하다.
		
		//외부에 불필요하게 노출할 필요 없이 외부 클래스에만 관련된
		//유틸 클래스 등을 숨길 수 있다.
	}
}









