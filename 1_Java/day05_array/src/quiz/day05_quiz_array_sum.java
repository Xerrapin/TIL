package quiz;

import java.util.Scanner;

public class day05_quiz_array_sum {

	public static void main(String[] args) {

		int input1_column, input2_row;
		Scanner sc = new Scanner(System.in);
		
		input1_column = sc.nextInt();
		input2_row = sc.nextInt();
		
		
		int count = 0;
		int[] sum_column = new int[2];
		int[] sum_row = new int[3];

		// 2차원 배열에 임의의 데이터 입력 받아서 값 출력하고 행끼리 더한 결과 출력
		int[][] b = new int[2][3];
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = sc.nextInt();
			} 
		} 
	
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				sum_column[i] += b[i][j];
				System.out.print(b[i][j]+ " ");
			}
//			System.out.print(i + "번째 행끼리 더한 결과 : "+ sum_column[i] + "\t");
			System.out.print(" : " + sum_column[i] + "\n");	
		}
		System.out.println(". . .");	
		
		for (int l = 0; l < b[0].length; l++) {
			for (int k = 0; k < b.length; k++) {
		
			sum_row[l] += b[k][l];
			
			}
			
//			System.out.print(l + "번째 열끼리 더한 결과 : "+ sum_row[l] + "\t");    
		System.out.print(sum_row[l] + " ");
		}
	

			
	}
}
