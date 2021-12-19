package ex05.utilpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class MainEntry {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // system이 갖고 있는 날짜 얻어옴.
		
		System.out.print(c.get(Calendar.YEAR) + "년");
		System.out.print(c.get(Calendar.MONTH) + 1 + "월"); // *월은 0부터 시작
		System.out.print(c.get(Calendar.DATE) + "일");
//		System.out.print(c.get(Calendar.HOUR) + "시");
//		System.out.print(c.get(Calendar.MINUTE) + "분");
//		System.out.println(c.get(Calendar.SECOND) + "초");
				
		System.out.println("\n=========================");
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println("현재 시간은 " + h + ":" + m + ":" + s);
		
//		StringTokenizer st = new StringTokenizer("this is a test");
//		while (st.hasMoreTokens()) { // 다음 토큰(요소)가 있다면...
//			System.out.println(st.nextToken());
//	    }
		
	    StringTokenizer st = new StringTokenizer("홍길동/홍길서/홍길남/홍길북", "/"); // 뒤에 구분자 작성
	    while (st.hasMoreTokens()) {
	    	System.out.println(st.nextToken());
	     }
	
	}

}
