package Day07_assignment;

public class Plain extends Trans {

	@Override
	public void start() {
		System.out.println(name() + " start");
	}

	@Override
	public void stop() {
		System.out.println(name() + " stop");
	}
	
	public String name() {
		return "Bus";
	}

}
