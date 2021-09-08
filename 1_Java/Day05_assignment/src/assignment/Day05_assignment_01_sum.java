package assignment;

public class Day05_assignment_01_sum {
	public static void main(String[] args) {
		
		int sum = 0;
		int[] a = {7, 5, 3, 8, 2 };
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		System.out.println(sum);
	}
}