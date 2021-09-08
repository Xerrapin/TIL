package ex01.inheritance;

public class Point { // extends object
	protected int x, y;
//	final double d = 5.5; // 초기화도 해야함.

	//Constructor method
	public Point() {
		this(0, 0);
		System.out.println("default contructor call");
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("Point 2");
	}

	public Point(int x) {
		super();
		this.x = x;
		y = 999;
		System.out.println("Point 1");
	}

	// getter, setter 
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

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	// output method
//	public void disp() {
//		System.out.print(x + ", " + y);
//	}
	
//	public String toString() {
//		return x + ", " + y;
//	}

	
	
	
	
	
	
	
	
	
}
