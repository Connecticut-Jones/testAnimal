
public class Bat extends Animal implements Flyable {

	int x_loc, y_loc, x_speed, y_speed;
	boolean isFlyingNow;
	
	//Animal methods
	void makeNoise() {
		System.out.println("Screech");
	}
	void move() {
		System.out.println("crawl");
	}
	
	String getFoodSource() { return "FRUIT"; };
	
	public void startflying() {
		x_speed = 30;
		y_speed = 40;
		isFlyingNow = true;
		System.out.println ("  !! took off flying!!");
	}
	public void stopFlying() {
		x_speed = 0;
		y_speed = 0;
		isFlyingNow = false;
	}
	public boolean isFlying() { return isFlyingNow; }

	public String toString() {
		if (isFlying()) {
			return "Bat (now flying)";
		} else {
			return "Bat (hanging)";
		}
	}
}
