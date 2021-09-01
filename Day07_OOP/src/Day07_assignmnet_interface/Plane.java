package Day07_assignmnet_interface;

public class Plane implements Trans {

	@Override
	public void start() {
		System.out.println(name() + " start");

	}

	@Override
	public void stop() {
		System.out.println(name() + " stop");

	}
	
	public String name() {
		return "Plane";
	}

}
