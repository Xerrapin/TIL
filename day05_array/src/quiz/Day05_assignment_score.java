package quiz;

import java.util.Scanner;

// 성적처리 프로그램 작성
// 7명의 데이터 3과목 입력 받아서 총점/평균/학점까지 구하는 프로그램 작성
// 배열 사용

public class Day05_assignment_score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int SU, sub_num = 3;
		
		System.out.println("몇명의 점수를 입력하시겠습니까?");
		SU = sc.nextInt();
		
		int[][] subject = new int[SU][sub_num];
		int[] total_score_arr = new int[SU]; 
		float[] avg_arr = new float[SU];
		char[] grade_arr = new char[SU];
		String[] name =  new String[SU]; 
		
		System.out.print(SU + "명의 이름, 국어, 전산, 영어 성적을 입력해주세요.");
		
		// 점수 입력
		for(int i = 0; i<SU; i++) { 
			name[i] = sc.next(); // 이름 입력
			for (int j = 0; j < sub_num; j++) {
				subject[i][j] = sc.nextInt();
			}
		} // for end
	
		for(int k = 0; k<SU; k++) {
			for (int l = 0; l < sub_num; l++) {
//				System.out.print(subject[k][l] + " ");
				total_score_arr[k] += subject[k][l];
			}
			avg_arr[k] = total_score_arr[k] / sub_num;
//			System.out.println();
			
/*
			if (avg_arr[k] < 100 && avg_arr[k] >= 90) {
				grade_arr[k] = 'A'; 
			} else if (avg_arr[k] >= 80) {
				grade_arr[k] = 'B';
			} else if (avg_arr[k] >= 70) {
				grade_arr[k] = 'C';
			} else if (avg_arr[k] >= 60) {
				grade_arr[k] = 'D';
			} else {
				grade_arr[k] = 'F';
			}
*/
			
			switch((int)avg_arr[k] / 10) {
			case 10: grade_arr[k] = 'A'; break;
			case 9: grade_arr[k] = 'A'; break;
			case 8: grade_arr[k] = 'B'; break;
			case 7: grade_arr[k] = 'C'; break;
			case 6: grade_arr[k] = 'D'; break;
			case 5: case 4: case 3: case 2: case 1: case 0: grade_arr[k] = 'F';
			 
			}
		} // for end

		// 결과 출력
		for (int m = 0; m < SU; m++) { 
			System.out.print("이름 : " + name[m]);
			System.out.print(" | 총점 : " + total_score_arr[m]);
			System.out.print(" | 평균 : " + avg_arr[m]);
			System.out.println(" | 학점 : " + grade_arr[m]);
		}
		
	}
}