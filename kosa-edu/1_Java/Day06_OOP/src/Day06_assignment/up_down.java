package Day06_assignment;

import java.util.Random;
import java.util.Scanner;

public class up_down {
	
	public static void main(String[] args) {
		int num = 0, cnt = 5;
		int input1;
		Random random = new Random();	
		num = random.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		
		while(cnt > 0) {
			System.out.print("1~100 사이의 숫자를 입력해주세요 : ");
			input1 = sc.nextInt();
			if(input1 == num) {
				System.out.println("정답입니다!!!");
			}
			else if(input1 < num) {
				System.out.println("정답은 더 큰 숫자입니다.");
			}
			
			else if(input1 > num) {
				System.out.println("정답은 더 작은 숫자입니다.");
			}
			cnt--;
		}
		System.out.print("정답은 : " + num + "입니다.");
		
	}

}
