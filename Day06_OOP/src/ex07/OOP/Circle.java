package ex07.OOP;

public class Circle {
	float PI = (float) Math.PI;
	
	private int x, y, r;

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

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public void disp() {
		System.out.println(x + ", " + y + ", " + r);
	}
	
	

}
