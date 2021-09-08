package quiz;

public class day04_assignment03 {
	public static void main(String[] args) {
		float sum = 0;
		
		for(float i = 1; i<10; i++ ) {
			sum += i/(i+1);
		}
		System.out.printf("%.2f", sum);
	}
}
