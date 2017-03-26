import java.util.*;

public class tester {

	public static void main(String[] args) {
		testZoo();
	}
	
	public static void oldTest(String[] args) {
		Animal[]  animals;
		int i;
		animals = new Animal[9];
		for (i = 0; i < 9; i++) {
			if (i%3 == 0) {
				animals[i] = new horse();
			}
			else if (i %3 == 1 ){
				animals[i] = new Lion();
			}
			else if (i %3 == 2) {
				animals[i] = new Bat();
			}
		}
		for (Animal a: animals) {
			a.makeNoise();
		}
		for ( i = 0; i < animals.length; i++) {
			Animal a = animals[i];
			a.move();
			eat(a);
			if (a instanceof Flyable) {
				((Flyable )a).startflying();
			}
			System.out.println();
		}
	}
    public static void eat(Animal a) {
    		//charge();
    		/* a.charge()  */
    		System.out.println(" I EAT " + a.getFoodSource());
    	//}
    }
    
    public static void testZoo() {
    	Random r = new Random();
    	Animal a;
    	ArrayList<Animal> zoo = new ArrayList<Animal>();
    	ArrayList<Flyable> aviary = new ArrayList<Flyable>();
    	
    	for (int i=0; i < 20; i++) {
    		int r1 = r.nextInt(5);
    		if (r1 == 0) {
    			a = new horse();
    		} else if (r1 == 1) {
    			a = new Bat();
    			r1 = r.nextInt(2);
    			if (r1 == 1) { 
    				((Flyable )a).startflying(); 
    			}
    		} else if (r1 == 2) {
    			a = new Lion();
    		}
    		else {
    			a = new horse();
    		}
    		zoo.add(a);
    	}
    	showZoo(zoo);
    	System.out.println("Now carnivores are eating...\n\n");
    	eatMeat(zoo);
    	showZoo(zoo);
    	//ArrayList<Animal> zoo = new ArrayList<Animal>();
    	
    	//  Let's use add(), get(), remove(), size(), capacity()
    	//r.nextInt(10);
    	// zoo.add(int, animal);
    	//zoo.get(index)
    }

    public static void eatMeat(ArrayList<Animal> zoo) {
    	int i;
    	Animal a;
    	Lion leo = null;
    	for (i = 0; i < zoo.size(); i++) {
    		a = zoo.get(i);
    		if (a instanceof Lion) {
    			leo = (Lion)a;
    		}
    		if (leo != null) {
    		   if (a instanceof Lion) { 
    			   ; 
    		   } 
    		   else if (a instanceof Flyable) {
    			   if (!((Flyable)a).isFlying()) {
    				   zoo.remove(a);
    			   }
    		   }
    		   else {
    			   zoo.remove(a); }
    		   }
    			   
    		}
    	}
    
    public static void showZoo(ArrayList<Animal> zoo) {
    	int i;
    	System.out.println("Printing the entire zoo!!!");
    	for (i = 0; i < zoo.size(); i++) {
    		System.out.println(zoo.get(i));
    	}
    }
}


