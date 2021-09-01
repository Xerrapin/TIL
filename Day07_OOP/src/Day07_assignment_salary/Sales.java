package Day07_assignment_salary;

public class Sales extends Regular {
	double commission;

	public Sales(String name, String phone, String department, String position, int salary, double commission) {
		super(name, phone, department, position, salary);
		this.commission = commission;
	}
	
	public double getCommission() {
		return commission;
	}

	public void setCommission() {
		this.commission = (float) (salary*commission);
	}

	@Override
	public void show() {
		setCommission();
		super.show();
	}

}
