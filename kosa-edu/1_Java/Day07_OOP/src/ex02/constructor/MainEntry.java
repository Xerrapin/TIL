package ex02.constructor;

// default constructor / API 만들기
public class MainEntry {
	
	/**
	 * @param args 메인은 아무값도 넘겨받지 않습니다.
	 * @param x 곱을 구하는 것에 첫번째 정수형 변수
	 * @param y 곱을 구하는 것에 첫번째 정수형 변수
	 * @param gob 곱을 구하는 것에 첫번째 정수형 변수
	 */
	
	
	
	public static void main(String[] args) {
		int x, y, gob = 1;
		char ch = 'A';
		String msg;
		
		x = 5; y = 10;
		msg = "th1 fighting!!!";
		
		gob = gob(x, y);

		System.out.println(ch);
		System.out.println(msg);
		System.out.println(x + " * " + y + " = " + gob);
		
	}

	private static int gob(int x, int y) {
		return x * y;
	}
}