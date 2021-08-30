package Day06_assignment;

import java.util.Scanner;

public class Score {
	private String name;
	private int kor, com, eng, total_score;
	private float avg;
	private char grade;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTotal_score() {
		return total_score;
	}
	public void setTotal_score() {
		this.total_score = this.kor + this.eng + this.com;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = (float)this.total_score / 3;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade() {
		if (avg < 100 && avg >= 90) {
			this.grade = 'A'; 
		} else if (avg >= 80) {
			this.grade = 'B';
		} else if (avg >= 70) {
			this.grade = 'C';
		} else if (avg >= 60) {
			this.grade = 'D';
		} else {
			this.grade = 'F';
		}
	}
	
	
	public Score(String name, int kor, int com, int eng, int total_score, float avg, char grade) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total_score = total_score;
		this.avg = avg;
		this.grade = grade;
	}
	
	
	public Score() {
		name = "임재혁";
		kor = 100;
		com = 100;
		eng = 100;
		total_score = 0;
		avg = 0;
		grade = ' ';
	}
	

	public void disp() {
		System.out.print("이름 : " + this.name);
		System.out.print(" | 총점 : " + this.total_score);
		System.out.print(" | 평균 : " + this.avg);
		System.out.println(" | 학점 : " + this.grade);
	}
	
	
	public static void input(Score score) {
		Scanner sc = new Scanner(System.in);
		Score score1 = new Score();
		
		System.out.println("이름, 국어, 영어, 전산 성적을 입력하세요.");
		score1.setName(sc.next());
		score1.setKor(sc.nextInt()); // 0~100점 사이 값 제한
		score1.setEng(sc.nextInt()); // 문자 예외처리
		score1.setCom(sc.nextInt());
	
		score.setTotal_score();
		score.setAvg();
		score.setTotal_score();
	}
	
	
}
