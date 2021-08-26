package ex04.For;

import java.util.Scanner;

public class For_star_test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i=1; i<=5; i++ ) {
			
			for (int j=1; j<=5; j++) {
				System.out.print("*");
			} // j end
			System.out.println();
		} // i end
	}
}