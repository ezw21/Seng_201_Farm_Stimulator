package Lab_3;

public class GreenAlien {
	
	public String name;
	public int eyeCount;
	public String favouriteCandy;

	public GreenAlien() {
		//this is constructor to set default value for GreenAlien
		name = "Kloup";
		eyeCount = 6;
		favouriteCandy = "Lollypops";
		
	}
	
	public GreenAlien(String tempName, int tempEye, String tempCandy) {
		//overloaded with different parameter, to customize GreenAlien
		name = tempName;
		eyeCount = tempEye;
		favouriteCandy = tempCandy;
		
	}
	public String toString() {
		return "This Alien is called " + name + " and has " + eyeCount + " eyes. Gross. It seems to enjoy eating " +
	favouriteCandy;
	}
	
	public static void main(String[] args) {
		
		GreenAlien gwerp = new GreenAlien();
		GreenAlien hulk = new GreenAlien("Hulk", 2, "shit");
		
		System.out.println(gwerp);
		System.out.println(hulk);
	}
}

