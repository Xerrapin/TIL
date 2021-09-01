package ex03.string;

public class StringAddress {

	public static void main(String[] args) {
		String s1 = new String("korea");
		String s2 = new String("korea");
		
		System.out.println(s1 + ", " + s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String s3 = "busan";
		System.out.println(s3.hashCode());
		s3 = "Hello";
		System.out.println(s3.hashCode());
		s3 = "kbs";
		System.out.println(s3.hashCode());
		s3 = "korea";
		System.out.println(s3.hashCode());
		s2 = "kbs";
		System.out.println(s2.hashCode());
		String msg = "cdfghij";
		System.out.println("daegu " + msg);
		System.out.println(msg);
		
		msg = msg.concat("happy");		
		System.out.println(msg);
		msg = msg + " hahaha";
		System.out.println(msg);
		String s4 = "abcdef".substring(2);
		System.out.println("substring : " + s4);
		
		String s5 = "abcdefghijeiwrw".substring(2, 5); // 시작값 포함, 끝값 미포함 // 이 범위만 추출
		System.out.println(s5);
		
	}
}
