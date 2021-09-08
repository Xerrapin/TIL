package ex07.OOP;

public class Point {
	private int x, y; // 멤버변수

	// getter, setter method : 멤버 함수
	

	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void disp() {
		System.out.println(x + ", " + y);
	}
	
	
	
	
}
