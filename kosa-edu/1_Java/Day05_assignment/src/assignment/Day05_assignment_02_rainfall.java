package assignment;

public class Day05_assignment_02_rainfall {
	public static void main(String[] args) {
		int[] rainfall_arr = {147, 54, 92, 64, 111};
		float rain_avg = 0;
		int sum = 0;
		for (int i = 0; i < rainfall_arr.length; i++) {
			sum += rainfall_arr[i];
		}
		rain_avg = sum / rainfall_arr.length;
		
		System.out.println("강수량 평균 : " + rain_avg);
		
	}
}