/*
package ex02.operator;

public class OperatorTest3 {
	public static void main(String[] args) {
		// 관계 연산자 : <, >, <=, >=, ==
		
		if( 4 > 7) {
			System.out.println("크다");
		}
		else {
			System.out.println("작거나 같다");
		
		
		
		}
}
	}
}
*/

//*/

// 0, 0.0, NULL 을 제외한 모든 것은 참이다.  !0//*
package ex02.operator;

public class OperatorTest3 {
	public static void main(String[] args) {
		
			// 논리 연산자 : 2진 논리 ==> 결과 : 값, 10진 논리 ==> 결과 : true, false
			int x = 4, y = 7;
			
			System.out.println(x & y); // 4
			System.out.println(4 & 7);
			System.out.println(x | y); // 7
			System.out.println(x ^ y); // 3
			
			boolean flag = false;
			int a = 10, b = 20, c = 30;
			
			flag = (a < b) && ( b < c ); // '&&'연산은 앞이 '거짓'이면 뒤는 수행하지 않는다.
			System.out.println(flag);
			
			// '&&'연산일때는 거짓이 나올 연산을 앞으로.
			
			flag = (a > b) && ( b > c );
			System.out.println(flag);
			
			flag = (a < b) || ( b < c ); // '||'연산은 앞에 것이 '참'이면 뒤는 수행하지 않는다.
			System.out.println(flag);
			
			// '||'연산일때는 참이 나올 연산을 앞으로. -> 연산 횟수를 적게 할 수 있음.
		
			flag = (a > b) || ( b > c );
			System.out.println(flag);
			
		}	
	}

// 0, 0.0, NULL 을 제외한 모든 것은 참이다.  !0