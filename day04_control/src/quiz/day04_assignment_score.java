package quiz;

import java.util.Scanner;

public class day04_assignment_score {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, com, eng, total_score;
		float avg;
		String check=null;
		char grade;
		
		try {
			
			do {
			System.out.print("이름, 국어, 전산, 영어 성적을 입력해주세요.");
			
			name = sc.next();
			kor = sc.nextInt();
			com = sc.nextInt();
			eng = sc.nextInt();
			
			avg = (kor + com + eng) / 3;
			if (avg < 100 && avg >= 90) {
				grade = 'A'; 
			} else if (avg >= 80) {
				grade = 'B';
			} else if (avg >= 70) {
				grade = 'C';
			} else if (avg >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			
			total_score = kor + com + eng;
			
			System.out.println(name + "님의 성적표 ******");
			System.out.printf("국어 : %3d 전산 : %3d   영어 : %3d\n", kor, com, eng);
			System.out.printf("총점 : %3d 평균 : %.2f 학점 : %c", total_score, avg, grade);
			
			System.out.println("\n계속 입력하시겠습니까? (y/n)");
			check = sc.next();
			if (check.equals("n")) {
				System.exit(0);
				}
			} while (check.equals("y"));	
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
