package quiz;

public class day04_assignment06 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 1; i<=100; i++) {
			if (i % 2 == 0) {
				System.out.printf("%2d ", i);
				count +=1;
			}
			else if (count != 0 && count % 10 == 0) {
				System.out.println("");
			}
		}
	}
}
