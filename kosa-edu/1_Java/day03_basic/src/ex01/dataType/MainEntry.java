package ex01.dataType;

public class MainEntry {
	public static void main(String[] args) {
//		int x = 9;
//		long y = 8;
//		
//		
//		System.out.println(x); // 4byte 정수데이터
//		System.out.println(100); // int
//		System.out.println(y); // 8byte long
		System.out.println(100L);
		
		short sh = 100; // -32,768 ~ 32,767
		int iNum = -32768; // -2,147,483,648 ~ 2,147,483,647
		
		double d = 12.34;
		float f = 12.34f;
		
		int a=9, b, c; // 지역변수는 반드시 초기화가 되어 있어야 한다.
		System.out.println(a); 
		
		iNum = sh; // int = short, 묵시적 형변환 : 작은데이터형이 큰데이터형으로 자동 형변환
		sh = (short)iNum; // short = int, 명시적 형변환 : 큰데이터형이 작은데이터형으로 이동
		
		System.out.println(sh);
		System.out.println(iNum);
		
		
		
		
		
	}
}
