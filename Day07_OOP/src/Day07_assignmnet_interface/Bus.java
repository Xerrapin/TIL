package Day07_assignmnet_interface;

public class Bus implements Trans {

	@Override
	public void start() {
		System.out.println(name() + " start");

	}

	@Override
	public void stop() {
		System.out.println(name() + " start");

	}
	
	public String name() {
		return "Bus";
	}
}
