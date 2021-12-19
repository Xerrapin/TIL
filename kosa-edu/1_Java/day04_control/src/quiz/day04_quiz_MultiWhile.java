package quiz;
// while구문 이용해서 구구단 전체 출력
public class day04_quiz_MultiWhile {
	public static void main(String[] args) {
		int i, j = 1;
		
		while(j<=9) {
			i = 2;
			while(i<=9) {
				System.out.printf("%d * %d = %2d | ", i, j, i*j);
				i++;
			}
			System.out.println();
			j++;
		}
	}
}
