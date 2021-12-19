package quiz;

public class day04_assignment_star3 {

	public static void main(String[] args) {
		for(int i = 1, k = 5; i<=5; i++, k--) {
			for(int j = 1; j<k; j++) {
				System.out.print(" ");
				
			}
			for(int l = 1; l<=i; l++) {
				System.out.print("*");
			}
		System.out.println();	
		}	
	}
}
