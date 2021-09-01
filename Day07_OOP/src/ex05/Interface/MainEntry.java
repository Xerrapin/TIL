package ex05.Interface;

interface A { // interface - abstract method, final field 만 갖는다.
	int x = 99; // final static int x = 99; 
	// final : 값 변경 금지.
	// static finally 생략됨. / 이탤릭체로 누워있는거.
	final int y = 777;
	char ch = 'A';
	
	// 추상메소드 abstract 생략가능함 - 무조건 추상메소드임
	public void show(); // public abstract void show();
	public abstract void disp();
} // A end

interface B {
	void bView();	
}

interface C {
	String name = "Happy";
	public void cDraw();
}

// interface 간에 상속에서도 extends 키워드 사용한다.
interface D extends B {
	void dView();
}

class Rect implements D {

	@Override
	public void bView() {
		
	}

	@Override
	public void dView() {
		
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
} // Rect end

class Shape {
	
}


// class Multi implements B, C, A extends Shape {
// class 와 interface를 동시에 상속받을때는 클래스를 먼저 상속 받아야 한다.
// extends implements
class Multi extends Shape implements B, C, A {

	
	
	@Override
	public void show() { // A 
		System.out.println(x);
//		x = 8; // 값 변경 금지 because final 이라서.
	}

	@Override
	public void disp() { // A
		System.out.println("A interface");
		
	}

	@Override
	public void cDraw() { // C
		System.out.println("C interface");
		
	}

	@Override
	public void bView() { // B
		System.out.println("B interface");
	}
}

class Point implements A {

	@Override
	public void show() {
		
	}

	@Override
	public void disp() {
		
	}
	
}

class Circle implements C {

	@Override
	public void cDraw() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
		B b = new Multi();
		b.bView();
		
		A a = new Multi();
		a.disp();
		
		Multi m = new Multi();		
		m.cDraw();
		m.disp();

		Circle c = new Circle();
		c.cDraw();
	}
	
}
