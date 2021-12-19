package ex03.Abstract;

abstract class Shape { // 추상클래스, Super class
	double result = 0;
	public abstract double calc(); // 추상메소드
	public abstract void draw();
	
	public void show() { // 일반 메소드
		System.out.println("Super class Shape");
	}
	
} // Shape end

class Circle extends Shape {
	double r = 5.0;
	
	@Override
	public double calc() {
		result = r * r * Math.PI;
		return 0;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이 : " + result + " 인 원을 그렸습니다.");
		
	}
	
	
} // Circle end


class Triangle extends Shape {
	int w = 10, h = 20;
	
	@Override
	public double calc() {
		result = (w * h) / 2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : " + result + " 인 삼각형을 그렸습니다.");
		
	}	
}

class Rectangle extends Shape {
	int rec_w = 11, rec_h = 22;

	@Override
	public double calc() {
		result = rec_w * rec_h;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이 : " + result + " 인 사각형을 그렸습니다.");

	}
	
	
	
}

public class MainEntry {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.draw();
		Circle c = new Circle();
		c.draw();
		Rectangle rec = new Rectangle();
		rec.draw();
		
		//	Shape s = new Triangle(); // 상속 받은 자손 클래스로는 객체 생성 할 수 있다.
		//	Shape s = new Shape(); // 미완성 클래스 ← 자체적으로 객체 생성할 수 없다. 
	}
}
