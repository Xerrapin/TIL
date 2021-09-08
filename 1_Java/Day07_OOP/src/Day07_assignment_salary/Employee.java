package Day07_assignment_salary;

import java.util.Scanner;

public class Employee {
	private String name;
	private String phone;
	private String department;
	private String position;
	
	public Employee(String name, String phone, String department, String position) {
		this.name = name;
		this.phone = phone;
		this.department = department;
		this.position = position;
	}
	
	public Employee() {
		this.name = "홍길동";
		this.phone = "010-0000-0000";
		this.department = " ";
		this.position = " ";
	}
	
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void show() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phone);
		System.out.println("department : " + department);
		System.out.println("position : " + position);
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("번호를 입력하세요");
		phone = sc.next();
		System.out.println("부서를 입력하세요");
		department = sc.next();
		System.out.println("직급을 입력하세요");
		position = sc.next();
		
	}
	
}
