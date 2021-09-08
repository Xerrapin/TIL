package quiz;
import java.util.Scanner;
//20210825 계산기
public class day03_assignment_operations {
	public static void main(String[] args) {
		int input1, input2, result = 0;
		String oper; 
		System.out.print("연산자를 입력하십시오. : ");
		oper = new Scanner(System.in).nextLine();
		
		System.out.print("두 수를 입력하십시오. : ");
		input1 = new Scanner(System.in).nextInt();
		input2 = new Scanner(System.in).nextInt();
		
		try {
			
			if (oper.equals("+")) {
				result = input1 + input2;
			} 
			else if (oper.equals("-")) {
				result = input1 - input2;
			}
			else if (oper.equals("*")) {
				result = input1 * input2;
			}
			else if (oper.equals("/")) {
				result = input1 / input2;
			}
		}	
			catch(Exception e) {
				System.out.println("Exception error");	
		}
		
		System.out.println("두 수의 \"" + oper + "\" 연산의 결과는 : " + result);
	}
}
