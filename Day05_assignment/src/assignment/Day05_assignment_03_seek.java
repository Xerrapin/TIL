package assignment;

import java.util.Scanner;

public class Day05_assignment_03_seek {
	public static void main(String[] args) {
		int[] a = { 7, 5, 7, 8, 2, 7, 3, 7, 7, 90 };
		int cnt = 0, comp;
		System.out.println("찾으려는 숫자를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		comp = sc.nextInt();
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == comp) {
				cnt ++;
			}	
		}
		
		System.out.println("배열안에 " + comp + "은(는) " + cnt + "개 있습니다.");
		
	}
}