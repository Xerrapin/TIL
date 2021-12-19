package Day06_assignment;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
//		Employee e = new Employee();
//		e.disp();
	
//		Score score = new Score();
//		input(score);
//		score.disp();		

		TV myTv = new TV();
		myTv.show();
	}
	
	public static void input(Score score) {
		Scanner sc = new Scanner(System.in);
		Score score1 = new Score();
		
		System.out.println("이름, 국어, 영어, 전산 성적을 입력하세요.");
		score1.setName(sc.next());
		score1.setKor(sc.nextInt()); 
		score1.setEng(sc.nextInt()); 
		score1.setCom(sc.nextInt());
	
		score.setTotal_score();
		score.setAvg();
		score.setGrade();
	}
}