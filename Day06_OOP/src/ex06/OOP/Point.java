package ex06.OOP;
// 접근지정자 : private < default < protected // 다른 패키지 접근 가능 < public
class Point {
	private int x, y; // 멤버변수 - int : 0, double : 0.0, String : NULL
	
//	public void setXY(int xx, int yy) {
//		x = xx;
//		y = yy;
//	}
	
	// constructor method
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() { // 매개변수 없는 생성자함수 - 디폴트 생성자함수
		x = y = 100;
	}
	public Point(int x) { // 매개변수 1개짜리 생성자함수
		this.x = x;
		y = 999;
	}
	
	
	public void setX(int xx) {
		x = xx;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int yy) {
		y = yy;
	}
	public int getY() {
		return y;
	}
	
	public void display() {
		System.out.println(getX() + ", " + getY());
	}
	
} // point end
