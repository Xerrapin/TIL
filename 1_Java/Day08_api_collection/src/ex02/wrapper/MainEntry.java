package ex02.wrapper;

class Point { }

public class MainEntry {

	public static void main(String[] args) {
		
		Integer iA = new Integer(10);
		Integer iB = new Integer("10");
		
		String su = "30";
		Point pt = new Point();
		
		System.out.println(iA.MAX_VALUE);
		System.out.println(iA.MIN_VALUE);
		
		System.out.println(pt);
		System.out.println(pt.toString());
		System.out.println(iA.getClass().getName() + '@' + Integer.toHexString(pt.hashCode()));
		
		System.out.println();
		System.out.println(iA); // 10
		System.out.println(iA.getClass().getName() + '@' + Integer.toHexString(iA.hashCode()));
		
		System.out.println();
		System.out.printf("%d %o %x %X", 10, 10, 10, 10); // 10, 8, 16, 16진수(대문자)
		System.out.printf("%d %d %d %d", 012, 0xA, 0xa, 0x12); // 0숫자 - 8진수, 0x숫자 - 16진수

		int x = 77;
		double y = 5.5;
		System.out.println(x + ", " + y);
		x = (int)y; // static 영역에 있음.
		System.out.println(x + ", " + y);				
		
		// Boxing vs UnBoxing
		int c = iA.intValue(); // jdk 4.x 이전에 사용하던 메소드
		int d = iB; // jdk 5.x 이후부터 autoboxing, unboxing
		int num  = Integer.parseInt(su);
		
		System.out.println(c + num);
		System.out.println(c + d);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("1111111", 2);
		System.out.println(f);
		System.out.println(e + 20);
	}
}