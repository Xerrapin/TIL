package quiz;

public class Student {
	
	private String name, grade, group;

	public Student(String name, String grade, String group) {
		this.name = name;
		this.grade = grade;
		this.group = group;
	}

	public void show() {
		System.out.println("이름 : " + name+ "학년 : "+ grade + "반 : " + group);
	}

}