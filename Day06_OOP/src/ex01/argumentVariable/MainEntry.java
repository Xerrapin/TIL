package ex01.argumentVariable;

// 가변길이 배열

public class MainEntry {
	public static void main(String[] args) {
		plus(1, 2);
		plus(3);
		plus(10, 22, 3, 4, 5, 6, 7, 9);
		plus("A", "kbs");
		plus("33", "kbs", "mbc", "sbs");
		
		
		int hap = plus1(1, 2, 3);
		System.out.println(hap);
		System.out.println(plus1(10, 20, 30, 40, 50));
		
		System.out.println(plus2("a", "b", "c"));
		
	}
	
	private static String plus2(String...x) {
		String sum = "";
		for (int i = 0; i < x.length; i++) {
			sum += x[i] + " ";
		}
		return sum;
	}

	private static int plus1(int...k) {
		int sum = 0;
		for (int i = 0; i < k.length; i++) {
			sum+= k[i];
		}
		return sum;
	}

	public static void plus(String...str) {
		String sum = "";
		for (int i = 0; i < str.length; i++) {
//			System.out.print(str[i] + " ");
			sum += str[i] + " ";
		}
		System.out.println(sum);
	}
	
	public static void plus(int...x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
		sum += x[i];
		System.out.print(x[i] + " ");
		}
		System.out.println(" sum = " + sum);
	}
	
}
