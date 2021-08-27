package ex05.sort;

import java.util.Arrays;

// 가장 큰것이 뒤에 정렬됨

public class ArraysSort {
	public static void main(String[] args) {
		int[] a = {7, 3, 5, 2, 8 };
		int temp;
		
		System.out.println("************ 소트 전 출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}

		// sort
		System.out.println("\n오름차순 정렬됨");
		Arrays.sort(a); // 정렬 알고리즘이 이미 내부적으로 처리 되어 있는 메소드
		
		// 내림차순 정렬
		System.out.println("내림차순 정렬 ");
		for (int i = a.length-1; i >= 0 ; i--) {
			System.out.print(a[i] + "  ");
		}
				
		System.out.println("\n************ 소트 후 출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}
}