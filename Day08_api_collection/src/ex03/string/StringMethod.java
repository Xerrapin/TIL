package ex03.string;

public class StringMethod {

	public static void main(String[] args) {
		String s1 = "happydoyeon";
		String s2 = "SEOUL";
		
		System.out.println(s2.replace("EO", "korea"));
		System.out.println(s2);
		s2 = s2 = s2.replace("EO", "korea");
		System.out.println(s2);
		s1 = s1 + s2;
		System.out.println(s1);
		
		System.out.println("-----------------------");
		String s3 = new String("       ab       cd");
		System.out.println(s3);
		System.out.println(s3.length()); // 공백포함.
		s3 = s3.trim(); // 공백제거(오른쪽, 왼쪽)
		System.out.println(s3.length());
		System.out.println(s3);
		
		System.out.println("=======================");
		String s4 = new String("ab/defgh/2434523/kiukw/87387");
//		String s4 = new String("ab defgh 2434523 kiukw 87387");
//		String[] s5 = s4.split(" "); // 공백으로 구분짓는다.
		String[] s5 = s4.split("/"); // 공백으로 구분짓는다.
		for (int i = 0; i < s5.length; i++) {
			System.out.println("분리된데이터 : " + i + "번째 문자열 " + s5[i]);
		}
		
		System.out.println("************************");
		String s6 = "1234567890asfd 45612351 safdafsd awefsadf";
		char ch = s6.charAt(8);
		System.out.println(ch);
		
		System.out.println("소문자 출력 : toLowerCase() : " + s2.toLowerCase());
		System.out.println("대문자 출력 : toUpperCase() : " + s2.toUpperCase());
		
		System.out.println(s1.length());
		char[] ch2 = s1.toCharArray();
		
		for (int i = 0; i < s1.length(); i++) {
			System.out.print(ch2[i] + "*");	
		}
		
	}
}