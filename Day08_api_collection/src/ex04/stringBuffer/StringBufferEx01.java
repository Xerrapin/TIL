package ex04.stringBuffer;

public class StringBufferEx01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.hashCode());
		
		System.out.println("length       |     capacity");
		int len = sb.length();
		int size = sb.capacity();
		System.out.println(len + "\t     |     " + size);
	
		sb.append("kosa");
		len = sb.length();	size = sb.capacity();
		System.out.println(len + "\t     |     " + size);
	
		sb.append("happyvirus");
		len = sb.length();	size = sb.capacity();
		System.out.println(len + "\t     |     " + size);
		
		sb.append("12345 712980");
		len = sb.length();	size = sb.capacity();
		System.out.println(len + "\t     |     " + size); // 16 + 16 + \null(2byte) : 34

		sb.append("12345 71298012391823091283");
		len = sb.length();	size = sb.capacity();
		System.out.println(len + "\t     |     " + size); // 34 + 34 + \null(2byte) : 70
		
		System.out.println(sb.hashCode());
		
		sb.trimToSize(); // 용량 크기 조정
		len = sb.length();	size = sb.capacity();
		System.out.println(len + "\t     |     " + size); 
		
	}
}
