package Day06_assignment;

// 이름, 직급, 부서, 급여, 연락처
// setter / getter method
// constructor method 2개 이상
// output method

public class Employee {
	protected String name, position, dept, contact;
	private int salary; 

	public void Employee(String name, String position, String dept, String contact, int salary) {
		this.name = name;
		this.position = position;
		this.dept = dept;
		this.contact = contact;
		this.salary = salary;
	}
	
	public Employee() {
		name = "임재혁";
		position = "사장";
		dept = "인사";
		salary = 100000000;
		contact = "010-0000-0000";
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	//이름, 직급, 부서, 급여, 연락처
	public void disp() {

		System.out.println("이름 : " + name);
		System.out.println("직급 : " + position);
		System.out.println("부서 : " + dept);
		System.out.println("급여 : " + salary);
		System.out.println("연락처 : " + contact);	
	}
}
