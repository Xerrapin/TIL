package ex08.staticMember;

class Atm {
	int count; // instance member
	static int total; // static member
	
	public Atm(int amount) { // constructor method
		count += amount;
		total += amount;
	}
	
	// static member 에서는 일반멤버 변수 사용할 수 없다.
	public static void View() {
		total = total + 100;
		// count count + 100; // error
	}
	
/*
	// static mamber 에서는 this 사용 불가.
	public static void show(int count, int total) {
		this.count = count;
		this.total = total;
	}
*/
	
	public void display() {
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
} // Atm end

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm at = new Atm(1000);
		at.display(); // c : 1000, t : 1000
		System.out.println("---------------------------");

		Atm at2 = new Atm(1000);
		at2.display(); // c : 1000, t : 1000
		System.out.println("---------------------------");
		
		
		
		
	}

}
