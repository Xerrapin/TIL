package assignment;

import java.util.Scanner;

public class Day05_assignment_06_abs {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		System.out.println(abs(input1));	
	}
	
	public static int abs(int num) {
		int result = 0;
		if (num < 0) {
			result = Math.abs(num);
		}
		else { 
			result = num;
		}
		return result;
	}

}