package ex04.exception;

import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) throws Exception { // 예외처리 위임(JVM이 위임을 받음)
		
		System.out.println("x, y integer data input : ");
		int x, y, result = 0;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		result = x / y;
		
		System.out.println(x + " / " + y + " = " + result);
				
	}
}




/*
package ex04.exception;
import java.util.Scanner;


public class ExceptionEx {

	public static void main(String[] args) {
		try {
			System.out.println("x, y integer data input : ");
			int x, y, result = 0;
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y;
			
			System.out.println(x + " / " + y + " = " + result);
		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			System.out.println(e.getMessage());
			e.printStackTrace();
		
		}

	}

}
// */