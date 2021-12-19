package assignment;

public class Customer {
	static int cus_num;
	private String name, address, tel;

	// »ı¼ºÀÚ
	public Customer() {
	}

	public Customer(int cus_num, String name, String address, String tel) {
		super();
		Customer.cus_num = cus_num;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	// setter, getter
	public int getCus_num() {
		return cus_num;
	}
	public void setCus_num(int cus_num) {
		Customer.cus_num = cus_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}


}