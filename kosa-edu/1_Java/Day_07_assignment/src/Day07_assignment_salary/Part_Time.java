package Day07_assignment_salary;

public class Part_Time extends Employee {
	private int working_hours;
	
	// getter, setter
	public int getWorking_hours() {
		return working_hours;
	}
	public void setWorking_hours(int working_hours) {
		this.working_hours = working_hours;
	}
	
	// constructor
	public Part_Time() {
		super();
	}
	
	// constructor
	public Part_Time(String name, String phone, String department, String position, int working_hours) {
		super(name, phone, department, position);
		this.working_hours = working_hours;
	}
	
	@Override
	public void show() {
		super.show();
		
		System.out.println("시간 : " + working_hours);
		System.out.println(working_hours + " 시간 일한 급여 : " + working_hours * 8720);		
	}	
}
