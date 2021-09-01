package ex09.api;

// Object class

class Point {
}

public class MainEntry {

	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode());
		System.out.println("Object String : " + pt.toString());
		System.out.println("Object String : " + pt); // toString 은 생략 가능. 
		System.out.printf("10진수 %d\n", 0x123a439b);

		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode());
		System.out.println("Object String : " + pt2.toString());
		System.out.println("Object String : " + pt2); // toString 은 생략 가능. 

		System.out.println("pt2.toString() : toString()의 의미");
		System.out.println(pt2.getClass().getName() + '@' + Integer.toHexString(pt2.hashCode()));
	
		Point pt3 = new Point();
		
		if( pt.hashCode() == pt3.hashCode()) {
			System.out.println("same");
		} else System.out.println("dif");
		
		Point pt4;
		pt4 = pt;
		
		if( pt.hashCode() == pt4.hashCode()) {
			System.out.println("same");
		} else System.out.println("dif");
		
		
		
	}
}
