package Day07_assignment_salary;

import java.util.Scanner;

public class Regular extends Employee {
	protected int salary; // 급여

	// constructor
	public Regular(String name, String phone, String department, String position, int salary) {
		super(name, phone, department, position);
		this.salary = salary;
	}
	
	public Regular() {
		salary = 40000000;
	}

	// getter, setter
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}	
	
	@Override
	public void show() {
		super.show();
		System.out.println("salary : " + salary);
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("급여를 입력하세요");
		salary = sc.nextInt();
	}
	
}
