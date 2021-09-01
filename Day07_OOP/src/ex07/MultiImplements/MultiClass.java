package ex07.MultiImplements;

import ex04.Abstract.Shape;
import ex06.Interface.IDraw;

public class MultiClass extends Shape 
						implements Test, IDraw {

	@Override
	public void draw() {
		System.out.println("IDraw abstract class");
		System.out.println(result);
	}

	@Override
	public void tView() {
		System.out.println("Test interface");
		result = 7.7;
		System.out.println(result);
	}

	@Override
	public double calc(double x) {
		System.out.println("Shape class");
		return 5.5;
	}

	@Override
	public void show(String name) {
		System.out.println();
	}

}
