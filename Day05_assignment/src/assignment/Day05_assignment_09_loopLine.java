package assignment;

import java.util.Scanner;

public class Day05_assignment_09_loopLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_num = sc.nextInt();
		
		loopline(input_num);
		
	}
	
	public static void loopline(int num) {
		
		while(num > 0) {	
			System.out.println("-------------------");
			num--;
		}
	}
}