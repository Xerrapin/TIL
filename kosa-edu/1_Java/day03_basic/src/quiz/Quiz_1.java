package quiz;

public class Quiz_1 {
	public static void main(String[] args) {
		// 1. 변수 선언
		int pay = 567890;
		int man, chun, back, sip; // 몫 변ㄴ수
		int m_na, ch_na, b_na;
		
		
		// 2. 메시지출력 및 입력
		
		// 3. 처리(계산)
		man = pay / 10000; m_na = pay % 10000;
		chun = m_na / 1000; ch_na = m_na % 1000;
		back = ch_na / 100; b_na = ch_na % 100;
		sip = b_na / 10;
		
		// 4. 결과출력(화면)
		System.out.println("\n\n만원 : " + man + "장\n천원 : " + chun + "개\n백원 : " + back + "개\n십원 : "+ sip + "개");
		System.out.println("\n\n만원 : " + pay / 10000 + 
							"장\n천원 : " + (pay % 10000) / 1000 + 
							"개\n백원 : " + (pay % 1000) / 100 + 
							"개\n십원 : "+ (pay % 100) / 10 + "개");

	}
}



/*
package quiz;

public class Quiz_1 {
	public static void main(String[] args) {
		int pay = 567890;

		System.out.println("만원 : " + pay/10000 + "장"); pay %= 10000; 
		System.out.println("천원 : " + pay/1000 + "장"); pay %= 1000;
		System.out.println("백원 : " + pay/100 + "개"); pay %= 100;
		System.out.println("십원 : " + pay/10 + "개");
	}
}
*/