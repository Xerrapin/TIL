package ex03.Switch;

import java.util.Scanner;

public class SwitchEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1, 2, 3 중에서 숫자 입력");
		int point = sc.nextInt();
		
		switch ( point) {
		case 1: System.out.print("집"); break;
		case 2: System.out.print("차"); break;
		case 3: System.out.print("옷"); break;
		
		default:
			System.out.println("error");
			System.exit(0);
		} // end switch
		
		System.out.println("상품에 당첨되셨습니다!!");
		
	}
}

/*
 * package ex03.Switch;
 * 
 * import java.util.Scanner;
 * 
 * public class SwitchEx03 { public static void main(String[] args) { Scanner sc
 * = new Scanner(System.in);
 * 
 * System.out.print("1, 2, 3 중에서 숫자 입력"); int point = sc.nextInt();
 * 
 * switch ( point) { case 1: System.out.print("집"); break; case 2:
 * System.out.print("차"); break; case 3: System.out.print("옷"); break;
 * 
 * default: System.out.println("error"); System.exit(0); } // end switch
 * 
 * System.out.println("상품에 당첨되셨습니다!!");
 * 
 * } }
 */