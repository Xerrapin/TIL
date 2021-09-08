package Day07_assignmnet_interface;

public class MainEntry {

	public static void main(String[] args) {
		Trans tr_b = new Bus();
		tr_b.start();
		tr_b.stop();
		
		Trans tr_p = new Plane();
		tr_p.start();
		tr_p.stop();	
	}
}
