package ex03.method;

// static method : 객체 생성 없이 바로 사용 가능함
// 호출방법 -> objectName.methodName();
//		 className.Method.Name();


class A {
	int x, y;
	 static void setData(int xx, int yy) {
		 System.out.println(xx + ", " + yy);
	 }
}



public class StaticMethod {

	public static void main(String[] args) {
		A.setData(10, 20); // className.Method.Name();

		A a = new A(); // 객체 생성, 메모리에 할당, 생성자함수 자동호출
		a.setData(1, 2); // objectName.methodName();
		
	}

}
