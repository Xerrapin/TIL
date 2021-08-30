package ex07.OOP;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		pt.disp();
		pt.setX(1); pt.setY(2);
		pt.disp();
		
		Circle c = new Circle();
		c.setR(5);
		c.setX(100); c.setY(100);
		c.disp();

		Circle c2 = new Circle();
		c2.setR(50);
		c2.disp();
		
		Rectangle rec = new Rectangle();
		rec.setX(1);
		rec.setY(2);
		rec.setX2(3);
		rec.setY2(4);
		rec.disp();
	}
}
