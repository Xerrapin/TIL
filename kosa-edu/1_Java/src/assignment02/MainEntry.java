package assignment02;

import java.util.Scanner;
import java.util.Vector;

/* 
 * 이름, 국어, 영어, 전산 점수
 * 총점, 평균, 학점(평점)
 * vertor 사용.
 */

public class MainEntry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Score> s = new Vector<Score>();
		
		while(true) {
			try {	
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 프로그램 종료");
			
			switch(sc.nextInt()) {
			case 1:
				add(s); break;
			case 2:
				show(s); break;
			case 3:
				System.out.println("종료합니다.");
				System.exit(0);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
} // main end

	// case 1: 성적 입력
	private static void add(Vector<Score> s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름, 성적을 입력하세요.");
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		
		s.add(new Score(name, kor, eng, com));
	} // add end
	
	// case 2: 성적 출력
	public static void show(Vector<Score> s) {
		for (int i = 0; i < s.size(); i++) {
			System.out.println("=======학생정보=======");
			System.out.println("학생이름 : " + s.get(i).getName());
			System.out.println("　총점　　: " + s.get(i).getTotal_score());
			System.out.println("　평균　　: " + s.get(i).avg());
			System.out.println("　학점　　: " + s.get(i).getGrade());
			System.out.println("=======학생정보=======\n");
		}
	} // show end


	

}
