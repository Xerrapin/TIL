package ex06.OOP;

public class MainEntry {	
	public static void main(String[] args) {
		
		Point pt = new Point(); // 객체 생성, 메모리에 할당, 생성자함수 자동호출
//		pt.setXY(12, 13);
		
		pt.setX(200);
		pt.setY(100);
		pt.display();
		
		//		System.out.println(pt.x + ", " + pt.y); // 초기화 확인
//		pt.x = 9;
//		pt.y = 8;
//		System.out.println(pt.x + ", " + pt.y);
		
	}

}
