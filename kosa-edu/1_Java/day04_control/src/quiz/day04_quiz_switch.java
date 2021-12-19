package quiz;

import java.util.Scanner;


//사칙연산 프로그램 작성 - 연산자 1개, 정수숫자 2개


public class day04_quiz_switch {
	public static void main(String[] args) {
		

		try {
			
		
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자를 입력해주세요 (+, -, *, /) : ");
		String oper = sc.next();
		System.out.print("첫번째 숫자를 입력해주세요.");
		int input1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력해주세요.");
		int input2 = sc.nextInt();
		
		switch (oper) {
		case "+": result = input1 + input2; break;
		case "-": result = input1 - input2; break;
		case "*": result = input1 * input2; break;
		case "/": result = input1 / input2; break;
		default : {
			System.out.println("error");
			System.exit(0);
			}
		
		}
		
		System.out.println("두 숫자의 \'" + oper + "\' 연산의 결과는 : " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}
				
		
	}
}