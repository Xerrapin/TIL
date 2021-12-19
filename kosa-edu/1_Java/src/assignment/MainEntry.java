package assignment;

import java.util.Scanner;
import java.util.Vector;

/*
Customer class
name, address, tel field
생성자함수, set/get method
고객 추가 / 삭제 / 고객 리스트 출력 / 수정 / 프로그램 종료 출력하는 프로그램 작성하기.
* Vertor 사용.
*/

public class MainEntry {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Vector<Customer> v = new Vector<Customer>();		
			
			while(true) {
				System.out.println("1. 고객 추가");
				System.out.println("2. 고객 삭제");
				System.out.println("3. 고객 리스트 출력");
				System.out.println("4. 고객 정보 수정");
				System.out.println("5. 프로그램 종료");
				System.out.print("원하시는 작업의 숫자를 입력해주세요 : ");
				
				switch(sc.nextInt()) {
				case 1:
					add(v); break;
				case 2:
					del(v); break;
				case 3:	
					show(v); break;
				case 4: 
					update(v);
					break;
				case 5:
					System.out.println("종료합니다.");
					System.exit(0);
				} // switch end
			} // while end
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // main end
	
	// case 1: 고객 추가
	private static void add(Vector<Customer> v) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고객 이름, 주소, 번호를 입력하세요.");
		int cus_num = 0;
		String name = sc.next();
		String address = sc.next();
		String tel = sc.next();
		
		v.add(new Customer(cus_num, name, address, tel));
		cus_num++;
	}
	
	// case 2: 고객 삭제
	public static void del(Vector<Customer> v) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 고객의 번호를 입력하세요.");
		int num = sc.nextInt();
		v.remove(num-1);
	}
	
	// case 3: 고객 리스트 출력
	public static void show(Vector<Customer> v) {
		for (int i = 0; i < v.size(); i++) {
			System.out.println("=======고객정보=======");
			System.out.println("고객번호 : " + v.get(i).getCus_num() + 1);
			System.out.println("고객이름 : " + v.get(i).getName());
			System.out.println("고객주소 : " + v.get(i).getAddress());
			System.out.println("고객번호 : " + v.get(i).getTel());
			System.out.println("=======고객정보=======\n");
		}
	}
	
	// case 4: 고객 정보 수정
	public static void update(Vector<Customer> v) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 고객 번호를 입력하세요.");
		int num = sc.nextInt();
		if (num < 0 || num >= v.size()) {
			System.out.print("범위 내의 숫자를 입력해주세요.");
		} 
		else {		
		System.out.println("수정될 고객 정보를 입력하세요.");
		String name = sc.next();
		String address = sc.next();
		String tel = sc.next();
		v.set(num-1, new Customer(num, name, address, tel));
		}
	}	
}	

