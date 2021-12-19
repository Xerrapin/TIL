package assignment;

import java.util.Scanner;

public class Day05_assignment_08_score {
	static String name;
	static int kor, eng, com;

	public static void main(String[] args) {
		
		input();
		output();
		
	}
	private static void output() {
		
		System.out.print("이름 : " + name);
		System.out.print(" | 총점 : " + total(kor, eng, com));
		System.out.print(" | 평균 : " + average(kor, eng, com));
		System.out.println(" | 학점 : " + grade(average(kor, eng, com)));	
	}
	
	public static void input() {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 국어, 영어, 전산 성적을 입력하세요.");
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		com = sc.nextInt();
	}
	
	public static int total(int kor, int eng, int com) {
		return kor + eng + com;
	}
	
	public static float average(int kor, int eng, int com) {
		return ( kor + eng + com ) / 3;
	}

	public static char grade(float num) {
		char grade;
		if (num <= 100 && num >= 90) {
			grade = 'A'; 
		} else if (num >= 80) {
			grade = 'B';
		} else if (num >= 70) {
			grade = 'C';
		} else if (num >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		return grade;
	}
	
}