package quiz;

import java.util.Scanner;

/*
 * 전산, 영어, 국어 입력 받아서 평균 60점 이상이면 합격,
 * 각 과목 과락 40점 미만이면 과목 불합격
 */

public class day04_quiz_IF_Switch {

	public static void main(String[] args) {

		int com, eng, kor;
		float avg;
		Scanner sc = new Scanner(System.in);
		
		com = sc.nextInt();
		eng = sc.nextInt();
		kor = sc.nextInt();
		
		avg = (com + eng + kor)/3;
		 
		switch ((int)avg / 10 ) {
		case 10: case 9: case 8: case 7: 
		case 6: 
			switch (com <= 40 ? "com" : eng <= 40 ? "eng" : kor <= 40 ? "kor" : " ") {
			case "com": System.out.println("com " + com + "점으로, 불합격입니다."); break;
			case "eng": System.out.println("eng " + eng + "점으로, 불합격입니다."); break;
			case "kor": System.out.println("kor " + kor + "점으로, 불합격입니다."); break;
			
			default : System.out.println("합격"); break;
			
			} break;
			
		default:
			System.out.println("평균 " + avg + "점으로 불합격입니다.");	
		}
	}
}
