
public class Lion extends Animal {
	void makeNoise() {
		System.out.println("Roar");
	}
	void move() {
		System.out.println("Run");
	}
	void charge() {
		System.out.println(" i am charging you now!!!\n");
	}
	String getFoodSource() { return "MEAT"; };
	public String toString() { return "Lion"; }
}
