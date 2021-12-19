package quiz;
import java.util.Scanner;
//20210826_세 수 정렬
public class day03_assignment_int3 {
	public static void main(String[] args) {
		int x, y, z, Num1 = 0, Num2 = 0 , Num3 = 0;
		System.out.println("세 정수를 입력하십시오.");
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		z = new Scanner(System.in).nextInt();
		
		if (x > y && x > z) {
			Num1 = x;
			if (y > z) {
				Num2 = y;
				Num3 = z;
			} else {
				Num2 = z;
				Num3 = y;
			}
		}
		else if (y > x && y > z) {
			Num1 = y;
			if (x > z) {
				Num2 = x;
				Num3 = z;
			} else {
				Num2 = z;
				Num3 = x;
			}
		}
		else if (z > x && z > y) {
			Num1 = z;
			if (x > y) {
				Num2 = x;
				Num3 = y;
			} else {
				Num2 = y;
				Num3 = x;
			}
		}		
	
		System.out.println("큰 수 : " + Num1);
		System.out.println("중간 수 : " + Num2);
		System.out.println("작은 수 : " + Num3);	
	}
}
