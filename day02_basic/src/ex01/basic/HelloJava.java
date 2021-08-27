package ex01.basic;

public class HelloJava {

	public static void main(String[] args) { // 시작점(진입점)
		
		
		System.out.println("hello java");
		System.out.println(123);
		System.out.println();	
		
		
		System.out.println("Hello World!"); // 문자열
		System.out.println(100); // 정수형
		System.out.println(12.34); // 실수형
		System.out.println("Lim Jae Hyeok");
		System.out.println('T'); // 문자
		System.out.printf("%d %c %s %s %f \n", 30, 'A', "A", "string", 5.789);
		System.out.println(true); // boolean # 논리형
		
		
	} // main end

} // class end

// package > class > method > field

/*java : 여러줄 주석 */

/**
 * 도큐먼트 주석
 */

/*
ctrl + shift + / 여러줄 주석
ctrl + shift + \ 여러줄 주석 취소
*/
// Hello : 한줄 주석
// 제어 문자 : \n, \t, \a, \b.. : (\문자)
// 출력 서식 : %d, %f, %c, %s,... (%문자) <- API확인하기
// 모든 프로그램은 메모리상에 할당이 안되어 있으면 사용할 수 없다.
// package > class > method > field

