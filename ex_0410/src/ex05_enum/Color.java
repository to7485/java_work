package ex05_enum;

public enum Color {
	RED(1),GREEN(2),BLUE(3);
	
	private int color;
	
	private Color(int color) {
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}
}
