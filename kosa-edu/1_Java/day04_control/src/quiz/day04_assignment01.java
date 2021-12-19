package quiz;

public class day04_assignment01 {
	public static void main(String[] args) {
		int total = 0, sum;
		for(int i = 1; i <= 5; i++) {
			sum = 0;
			for(int j = 1; j <= i; j++) {
				sum += j;
			}
			total += sum;
			System.out.println("a" + total);
		}
		System.out.println(total);
	}
}
