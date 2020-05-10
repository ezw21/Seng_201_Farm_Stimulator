package Lab_2;

public class Starmansays {
	private String name = "Starman";
	private int age = 1;
	private String rocketShip = "Falcon Heavy";
	private String poweredBy = "Electricity";
	private boolean inSpace = true;
			
	public void printName() {
		System.out.println(name);
	}
	
	public void printAge() {
		System.out.println(age);
	}
	
	public void printRocket() {
		System.out.println("My Rocket is" + rocketShip + "and it is powered by " + poweredBy);
	}
	
	public boolean isInSpace() {
		return (inSpace);
	}
	
	public static void main(String[] arg) {
		Starmansays starman = new Starmansays();
		starman.printName();
		starman.printAge();
		starman.printRocket();
		System.out.println(starman.isInSpace());
	}
}
