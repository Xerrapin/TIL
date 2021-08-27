package ex01.array;

public class MainEntry {
	public static void main(String[] args) {
		
		
		// 배열 생성 방법 1.  
		char[] ch; // 배열 선언
		ch = new char[4]; // 배열 생성, 메모리에 할당
		
		// 2. 
		char[] ch2 = new char[4];
		
		// 배열초기화
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		// 3.
		char[] ch3 = {'J', 'A', 'V', 'A', 'k', 'b'};
		
		// 배열의 길이(크기)
		System.out.println("배열의 길이(크기) : " + ch2.length); // 
		
		// 배열의 내용 출력
		System.out.println("ch2[2] = " + ch[2] );
		System.out.println("========================");
		
		for(int i=0; i<4; i++) { // 배열의 길이를 직접 넣었음
			System.out.println("ch2["+i+"] = " + ch[i] );
		}
		
		System.out.println("========================");
		
		for(int i=0; i<ch3.length; i++) { // 배열의 길이를 이용해 출력
			System.out.println("ch3["+i+"] = " + ch3[i] );
		}
		
		
		
	}
}