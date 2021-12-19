package assignment;

import java.util.Scanner;

public class Customer_list {
	private String name, address, tel;

	public Customer_list() {
	}

	public Customer_list(String name, String address, String tel) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	// 고객 리스트 출력
	public void show() {
		System.out.println("name : " + name);
		System.out.println("address : " + address);
		System.out.println("tel : " + tel);		
	}
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력해주세요 : ");
		this.name = sc.next();
		System.out.print("주소를 입력해주세요 : ");
		this.address = sc.next();
		System.out.print("번호를 입력해주세요 : ");
		this.tel = sc.next();
	}	
}