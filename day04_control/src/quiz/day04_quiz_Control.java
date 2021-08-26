package quiz;
/*
 * 문제] 1~100중에서 3의 배수의 개수와 합을 구하세요.
 */
import java.util.Scanner;

public class day04_quiz_Control {
	public static void main(String[] args) {
		int count = 0, sum_count = 0;
		for(int i=1; i<=100; i++) {
			if (i % 3 == 0) {
				count++;
				sum_count += i;
			}
		}
		System.out.println("3의 배수의 개수 : " + count);
		System.out.println("3의 배수의 총합 : " + sum_count);
	}
}
