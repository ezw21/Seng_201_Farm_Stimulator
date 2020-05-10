package Lab_4;

public class Mercury extends Planet{
	
	Mercury () {

			super("Mercury", 1, "Hot");
		}
	
	public static void main(String[] argm) {
		Mercury mercury = new Mercury();
		System.out.println(mercury instanceof Planet);
		System.out.println(mercury);
	}

}

