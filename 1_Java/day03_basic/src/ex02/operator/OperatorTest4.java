package ex02.operator;

public class OperatorTest4 {
	public static void main(String[] args) {
		// 삼항(조건) 연산자 : 조건 ? 참 : 거짓 ;
		
		int x = 3, result = 0, y = 5, z = 7;
		
//		result = (x == 3) ? x : 0;
		
//		System.out.println(result);
		
		result = (x > y ) ? x : 
								(y > z) ? y : z ; 
				
		System.out.println(result);
		
		// 대입(배정) 연산자 : =, +=, *=, /=, <<=, >>=,.....
		x = 8;
		x = x + y;
		// x += y;
		
		x = x * y;
		
		
		
		}	
	}