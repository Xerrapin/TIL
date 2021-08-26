package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;
/*과제8]  두수 입력 받아서 나눗셈 하는 프로그램 작성 (예외처리)
  - 숫자가 아닌 문자 입력 됐을때.
  - 정수가 아닌 실수 데이터 입력 됐을때.
  - 어떤 수를 0으로 나눌 수 없다.
*/  
public class day04_assignment08 {
	public static void main(String[] args) {
		int input1, input2, result = 0;
		
		try {
			Scanner sc = new Scanner(System.in);
			input1 = sc.nextInt();
			input2 = sc.nextInt();
			result = input1 / input2;
			
			System.out.println(result);
		} catch (InputMismatchException ime) { // 지정한 변수 타입과 다른 타입을 입력받았을 때
			System.out.println("입력값이 잘못되었습니다. 정수만 입력해주세요.");
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		} 
	}
}
