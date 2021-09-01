package ex04.Abstract;

public class MainEntry {

	public static void main(String[] args) {
		
		// 3. 배열 이용한 형태
		Shape[] ss = new Shape[3]; // 배열 선언 및 생성
		ss[0] = new Circle();
		ss[1] = new Rectangle();
		ss[2] = new Triangle();
		String[] name = { "Circle", "Rectangle", "Triangle"};
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].show(name[i]);
		}
		
		System.out.println("=============================");
		// 2. Shape 부모 추상 클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("new Circle");
		
		sh = new Rectangle();
		sh.show("new Rectangle");
		
		sh = new Triangle();
		sh.show("new Triangle");
	
		System.out.println("=============================");
		// 1. 각자의 클래스로 객체 생성 형태
		Circle c = new Circle();
		c.show("Circle");
		
		Rectangle r = new Rectangle();
		r.show("rectangle");
	
		Triangle t = new Triangle();
		t.show("triangle");		
		
		Shape s = new Circle();
		s.show("Circle");
		
	
	
	
	}
}
