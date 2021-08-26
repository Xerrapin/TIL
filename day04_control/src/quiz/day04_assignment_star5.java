package quiz;

public class day04_assignment_star5 {

	public static void main(String[] args) {

		for(int i = 1, k = 5; i<=5; i++, k--) {
			for(int j = 1; j<k; j++) {
				System.out.print(" ");
			}
			for(int l = 1; l<=(i*2-1); l++) {
				System.out.print("*");
			}
		System.out.println();	
		}			
	}
}
