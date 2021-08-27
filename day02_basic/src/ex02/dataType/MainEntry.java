package ex02.dataType;

public class MainEntry { // extends Object { // user class
	
	public static void main(String[] args) { // 시작점(진입점)
		Show();
		
		MainEntry me = new MainEntry(); // 객체생성, 메모리에 할당, 생성자함수 자동호출
	}
	
	public static void Show() {
		System.out.println("name is jaehyeok"); // 문장종결기호
	}
}


//package ex02.dataType;
//
//public class MainEntry {
//	
//	public static void main(String[] args) {
//		
//		int su = 10;
//		
//		{
//			int x = 100;
//			System.out.println(x);
//		}
//		
////		System.out.println(x);
//		System.out.println(su);
//		
//	}		
//		
//	// stack - block close	
//}
