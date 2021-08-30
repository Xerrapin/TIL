package Day06_assignment;

import java.util.Random;

public class lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random random = new Random();
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for (int j = 1; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
				}
			}
		}
		System.out.print("로또번호 : ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

	}

}
