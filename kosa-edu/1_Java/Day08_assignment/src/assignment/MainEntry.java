package assignment;

import java.util.Vector;

/*
Customer class
name, address, tel field
생성자함수, set/get method

고객 추가 / 삭제 / 고객 리스트 출력 / 수정 / 프로그램 종료 출력하는 프로그램 작성하기.
*/

public class MainEntry {

	public static void main(String[] args) {
		int check = 0;
		Customer_list cus = new Customer_list("홍길동", "송파", "010");
		Customer_list cus2 = new Customer_list("name_test", "test", "011");
		
//		cus.input();
		
//		cus.show();
//		cus2.show();
		
		// Vector 형식으로 보여주기.
		Vector<Customer_list> v = new Vector<Customer_list>();
		v.add(cus);
		v.add(cus2);
		
		for (int i = 0; i < v.size(); i++) {
			v.get(i).show();
		}
		
		
		
		
		
		
	/*	
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("1. 고객 추가");
			System.out.println("2. 고객 삭제");
			System.out.println("3. 고객 리스트 출력");
			System.out.println("4. 고객 정보 수정");
			System.out.println("5. 프로그램 종료");
			
			check = sc.nextInt();
				
			if (check == 0) break;
		}
		
		*/
	}

}
