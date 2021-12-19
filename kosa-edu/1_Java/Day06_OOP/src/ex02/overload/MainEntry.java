package ex02.overload;

public class MainEntry {

	public static void line(int n, String str) { 
		for (int i = 0; i < n; i++) {
			System.out.print(str);
		}
		System.out.println();
	
	}
	
	public static void main(String[] args) {
	
		line(20, "#");
		line("A");
		line(); // 호출
		line("*");
		
	}
	
	private static void line(String str) {
		for (int i = 0; i < 10; i++) {
			System.out.print(str);
		}
		System.out.println();
	}

	public static void line() { // 정의부
		System.out.println("=======================");
		
	}
	
}