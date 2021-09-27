package ex03.di.annot;

public class Cats {
	
	private MyCats myCats;
	
	// constructor
	public Cats() { }
	public Cats(MyCats myCats) {
		this.myCats = myCats;
	}

	// setter
	public void setMyCats(MyCats myCats) {
		this.myCats = myCats;
	}
	
	public void catsInfoPrint() {
		System.out.println("--------------------------------------------");
		System.out.println("cats Name : " + myCats.getName());
		System.out.println("cats Age : " + myCats.getAge());
		System.out.println("cats Hobby : " + myCats.getHobbys());
		System.out.println("cats Weight : " + myCats.getWeight());
		System.out.println("cats Color : " + myCats.getColor());	
		System.out.println("--------------------------------------------");
	}
	
	//	class point{
	//		int x, y;
	//		public point(int x, int y) {
	//			
	//		}		
	//	}	
}
