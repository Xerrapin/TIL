package ex08.inheritance;

class Point{
	protected int x, y;
	
	public Point() {
		x = y = 10;
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point(int x) { this.x = x; }
	public int getX() { return x; }
	public void setX(int x) { this.x = x; }
	public int getY() {	return y; }
	public void setY(int y) { this.y = y; }
	public void disp() {
		System.out.print("x = " + x + ", y = " + y);
	}	
}

class Circle extends Point { // 상속 - extends
	private int r;
	Point pt;
	
	public Circle() {
		pt = new Point(r);
		pt.setX(0); pt.setY(0);	
	}

//	public Circle() {
//		super();
//	}
	public Circle(int x, int y) {
		super(x, y);
	}
	
	public Circle(int x) {
		super(x);
	}
	
	public Circle(int x, int y, int r) { 
		super(x, y);
		this.r = r;
	}
	public int getR() { return r; }
	public void setR() { this.r = r; }
	public void disp() { 
		super.disp(); // 부모(Point)가 갖고 있는 disp() 메소드 호출한것임
		System.out.print("x = " + x + ", y = " + y + ", r = " + r);
	}
} // Circle end

// 사각형 클래스 만들기 - point 상속 받아서 구현하기.
class Rect extends Point {
	private int x1, y1;

	public Rect(int x, int y) {
		super(x, y);
	}

	public Rect(int x) {
		super(x);
	}
	
	public Rect(int x, int y, int x1, int y1) {
		super(x, y);
		this.x1 = x1;
		this.y1 = y1;
	}
	
	public void disp() {
		super.disp();
		System.out.print(", x1 =" + x1 + ", y1 = " + y1);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		
		// 사각형 객체 생성해서 출력
		Rect rec = new Rect(10, 20, 30, 40);
		rec.disp();
	}
}
