package ex01.objectClass;

class Rectangle { // extends Object {
	int x, y;
	
	public Rectangle() { x = y = 10; }
	public void disp() { // 출력 함수 사용자가 따로 만들었음
		System.out.println(x + ", " + y);
	}
	
	@Override
	public String toString() { // super class object
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
//	public String toString() { // toString() override  
//		return x + ", " + y;
//	}
}

public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.disp();
		System.out.println(r); // 해당 객체의 메모리 위치 출력, 123a439b ( 16진수 )
		System.out.printf("메모리 위치값 10진수로 표현 : %d\n", 0x123a439b );
		System.out.println(r.hashCode());
		System.out.println(r.toString()); //toString()
				
	}
}