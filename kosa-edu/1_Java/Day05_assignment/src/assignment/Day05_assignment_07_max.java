package assignment;

import java.util.Scanner;

public class Day05_assignment_07_max {
	public static void main(String[] args) {
		int input1, input2;
		
		Scanner sc = new Scanner(System.in);
		input1 = sc.nextInt();
		input2 = sc.nextInt();
		
		System.out.println(max(input1, input2));
	}

	public static int max(int num1, int num2) {
		int max_num, min_num;
		
		if (num1 > num2) {
			max_num = num1;
			min_num = num2;
		}
		else {
			max_num = num2;
			min_num = num1;
		}
		
		return max_num;
	}
}