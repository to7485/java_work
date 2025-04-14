package ex01_class_object;

public class Phone {

	//대개 필드는 외부에서 접근하지 못하도록 private으로 선언
	private String brand;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	
}
