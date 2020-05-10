package Lab_4;
import java.util.ArrayList;
import Lab_3.GreenAlien;


public class GreenAlienTransporter {
	public String transporter;
	public int eyeCount;
	public String favouriteCandy;
	
	public int sum;
	
	public ArrayList<String> shoppinglist;
	public ArrayList<GreenAlien> namelist;
	
	

	
	GreenAlienTransporter(String name) {
		//overloaded with different parameter, to customize GreenAlien
		namelist = new ArrayList<GreenAlien>();
		transporter = name;

		
	}
	
	public boolean addPassenger(GreenAlien alien) {
		if (namelist.contains(alien)) 
			return false;
		else {
			namelist.add(alien);
			return true;
		}
		
	}
	 
	public boolean removePassenger(GreenAlien alien) {
		if (namelist.contains(alien)) {
			namelist.remove(alien);
			return true;
		
		}
		else return false;
	}
	
	public void listPassengers() {
		System.out.println("The passengers on " + transporter + " are:");
		
		for (int i = 0; i < namelist.size(); i++) {
		System.out.print(namelist.get(i).name + ", ");
		}
		
	}
	
	public int countEyes() {
		for (int i = 0; i < namelist.size(); i++) {
			sum += namelist.get(i).eyeCount;
		}
		
		return sum;
	}
	
	public ArrayList<String> shoppingList() {
		shoppinglist = new ArrayList<String>();
		for (int i = 0; i < namelist.size(); i++) {
			shoppinglist.add(namelist.get(i).favouriteCandy);
			
		}return shoppinglist;
		
	}
	
	public void printDetails() {
		
		listPassengers();
		System.out.println("\nThe number of eyes on this transporter is: " + countEyes());
	}
	
	public static void main(String[] args) {
		GreenAlienTransporter transporter = new GreenAlienTransporter("Fun Club");

		GreenAlien kloup = new GreenAlien("Kloup", 9, "Biscuits");
		GreenAlien gwerp = new GreenAlien("Gwerp", 4, "Marshmellows");
		GreenAlien blarg = new GreenAlien("Blarg", 3, "Pop Rocks");
		GreenAlien lesap = new GreenAlien("Lesap", 5, "Chocolate");
		GreenAlien hugso = new GreenAlien("Hugso", 2, "Pop Rocks");

		transporter.addPassenger(kloup);
		transporter.addPassenger(gwerp);
		transporter.addPassenger(blarg);
		transporter.addPassenger(lesap);
		transporter.addPassenger(hugso);

		transporter.printDetails();
    }
}
