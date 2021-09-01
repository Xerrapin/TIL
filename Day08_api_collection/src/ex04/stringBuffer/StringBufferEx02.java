package ex04.stringBuffer;

public class StringBufferEx02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil"); // 문자열 추가
		System.out.println(sb);
		
		sb.insert(7, " my"); // 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); // 변경 (교체)
		System.out.println(sb); 
		
		sb.setLength(5); // 길이 변경 
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.setLength(20); // 길이 변경 이후 늘려도 삭제되어있음.
		System.out.println(sb);

	}
}
