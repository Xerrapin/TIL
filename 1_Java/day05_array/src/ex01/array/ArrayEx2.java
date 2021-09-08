package ex01.array;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
//		int[] a = new int[5]; // 하나씩 입력 a[0] = 1; ...;
		
		int[] a = {1, 2, 3, 4, 5};
//		System.out.println("a[0] = " + a[0]);		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
		
		int[] arr = new int[15];
		int x = 5;
		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i;
//			arr[i] = i+5;
			arr[i] = i * 5;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if((i+1) % 5 == 0) System.out.println();
		}
		System.out.println("====================");
		
		
		
		// 임의의 배열에 데이터 입력 받아서 출력 및 합 구하는 프로그램 작성
		int[] b = new int[5];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5개의 숫자를 입력하세요.");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
			sum += b[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print((i+1) + "번째 수는 : " + b[i] + "   ");
		 
		}
		
		System.out.println("\nsum = " + sum);
		
		
		
		
		
		
		
		
		
	}
}