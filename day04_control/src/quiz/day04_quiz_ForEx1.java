package quiz;
//1. 원하는 단을 입력 받아서 구구단 출력
import java.util.Scanner;

public class day04_quiz_ForEx1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("출력하길 원하는 구구단 단수를 입력하세요.");
		int gugudan = sc.nextInt();
		
		for(int i=2; i<=9; i++) {
			System.out.println(i + "*" + gugudan + " = " + (i*gugudan));
		}	
	}
}
