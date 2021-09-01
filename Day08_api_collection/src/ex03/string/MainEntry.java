package ex03.string;

// String : 불변객체
public class MainEntry {

	public static void main(String[] args) {
		Integer x = 999;
		String str = "abc";
		System.out.println("str : " + str);
		System.out.println("str hashcode : " + str.hashCode());
		
		char data[] = {'a', 'b', 'c'};
		str = new String(data);
		System.out.println("str : " + str);
		System.out.println("str hashcode : " + str.hashCode());
		
	
		str = "Korea";
		System.out.println("str : " + str);
		System.out.println("str hashcode : " + str.hashCode());
		
		str = "seoul";
		System.out.println("str : " + str);
		System.out.println("str hashcode : " + str.hashCode());
		
		
		
	}
}