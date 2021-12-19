package assignment02;

public class Score {
	private String name;
	private char grade;
	private int kor, eng, com;
	private int total_score;	

	// setter, getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal_score() {
		return total_score = kor + eng + com;
	}

	public void setTotal_score(int total_score) {
		this.total_score = kor + eng + com;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	// »ý¼ºÀÚ
	public Score() {}
	
	public Score(String name, int kor, int eng, int com) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.com = com;
	}
	
	public char getGrade() {
		if (this.avg() <= 100 && this.avg() >= 90) {
			this.grade = 'A'; 
		} else if (this.avg() >= 80) {
			this.grade = 'B';
		} else if (this.avg() >= 70) {
			this.grade = 'C';
		} else if (this.avg() >= 60) {
			this.grade = 'D';
		} else {
			this.grade = 'F';
		}
		return this.grade;
	}
	
	public double avg() {
		return (double)total_score / 3;
	}
}
