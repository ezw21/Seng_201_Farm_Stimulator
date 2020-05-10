package Lab_2;

public class SpaceCalculations {
	
	public float addition(float num_1, float num_2) {
		return num_1 + num_2;
	}
	
	public float subtraction(float num_1, float num_2) {
		return num_1 - num_2;
	}
	
	public float multiplication(float num_1, float num_2) {
		return num_1 * num_2;
	}
	
	public int intDivision(int num_1, int num_2) {
		return num_1 / num_2;
	}
	
	public float floatDivision(float num_1, float num_2) {
		return num_1 / num_2;
	}
	
	public double circumference(double num) {
		return 2 * Math.PI * num;
	}
	
	public double toAU(double num) {
		return num / 149597870700.0;
	}
	
	public static void main(String[] args) {
		
		SpaceCalculations space = new SpaceCalculations();

		System.out.println(space.addition(10, 4));
		System.out.println(space.subtraction(32, 20));
		System.out.println(space.multiplication(7, 6));
		System.out.println(space.intDivision(9, 4));
		System.out.println(space.floatDivision(9,4));
		System.out.println(space.circumference(8.75));
		System.out.println(space.toAU(1337133713371337.0));
    	
    }
	
}
