package quiz;

import java.util.Scanner;

//  과제7]  대문자 <--> 소문자 변경 프로그램 작성 ( if ) 

public class day04_assignment07 {
	public static void main(String[] args) {
		char ch = ' ';
		
		System.out.print("알파벳을 입력해주세요(대문자 <--> 소문자) : ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		if (ch >= 65 && ch <= 96) {
			ch += 32;
		}
		else if (ch >= 97 && ch <= 122) { 
			ch -= 32;
		}
		
		System.out.println(ch);
	}
}
