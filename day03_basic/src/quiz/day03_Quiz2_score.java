package quiz;

import java.util.Scanner;
//20210825 점수
public class day03_Quiz2_score {
	public static void main(String[] args) {
		// 이름, 국어, 영어, 전산 점수 입력.
		String name;
		int kor, eng, elec, total_score;
		float avg;
		name = new Scanner(System.in).next();
		kor = new Scanner(System.in).nextInt();
		eng = new Scanner(System.in).nextInt();
		elec = new Scanner(System.in).nextInt();
		
		total_score = kor + eng + elec;
		
		avg = total_score / 3 ;
	
		System.out.println(name + "님의 성적표 *****");
		System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 전산 : " + elec);
		System.out.println("총점 : " + total_score + "평균 : " + avg );
		
	}
}