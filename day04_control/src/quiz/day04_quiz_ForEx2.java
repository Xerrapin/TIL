package quiz;
//2. 전체 구구단 출력
public class day04_quiz_ForEx2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) { 
			System.out.printf("%d * %d = %2d | ", j, i, i*j);
			}
			System.out.println();
		}
	}
}