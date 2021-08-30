package Day06_assignment;

public class TV {
	int ch, volume;
	String color;
	
	public TV(int ch, int volume, String color) {
		this.ch = ch;
		this.volume = volume;
		this.color = color;
	}
	
	public TV() {
		ch = 1;
		volume = 1;
		color = "black";
	}
	
	
	public int getCh() {	
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void show() {
		System.out.println("TV의 채널 : " + this.ch);
		System.out.println("TV의 볼륨 : " + this.volume);
		System.out.println("TV의 색상 : " + this.color);
	}

}
