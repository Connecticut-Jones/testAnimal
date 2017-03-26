
public class horse extends Animal {
	
	void makeNoise()
	{
		System.out.println("neigh");
	}
	void move()
	{
		System.out.println("gallop");
	}
	String getFoodSource() { return "HAY"; };
	public String toString() { return "Horse"; }
}
