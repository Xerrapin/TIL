package quiz;

public class Employee {

	private String name, dept, position;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void show() {
		System.out.println("이름 : " + name + "부서 : "+ dept + "직급 : " + position);
	}

}
