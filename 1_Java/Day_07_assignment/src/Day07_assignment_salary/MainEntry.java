package Day07_assignment_salary;

public class MainEntry {

	public static void main(String[] args) {
		Regular reg = new Regular("임재혁", "000-0000-0000", "개발", "사원", 500);
		reg.show();
		System.out.println("===================================");
		
		Sales sal = new Sales("임재혁", "000-0000-0000", "영업", "대리", 600, 0.5);
		sal.show();
		System.out.println("===================================");
		
		Part_Time par = new Part_Time("임재혁", "000-0000-0000", "인사", "사원", 50);
		par.show();
	}
}
