package Lab_2;

public class SpaceStrings {
	
	public String starman = "Starman";
	public String rocketName = "Falcon Heavy";
	
	public int getStringLength(String word) {
		return word.length();
	}
	
	public int getLetterPosition(String word, char alphabet) {
		return word.indexOf(alphabet);
	}
	
	public String makeAllCaps(String word) {
		return word.toUpperCase();
	}
	
	public String makeAllLower(String word) {
		return word.toLowerCase();
	}
	
	public String makeHugeString(String word_1, String word_2) {
		return word_1 + word_2;
	}
    public static void main(String[] args) {
    	SpaceStrings space = new SpaceStrings();
		
    	String starman = "Starman Sez";
    	String rocketship = "Red Tesla";

    	System.out.println(space.getStringLength(starman));
    	
    	System.out.println(space.getLetterPosition(starman, 'r'));
    	System.out.println(space.makeAllCaps(starman));
    	System.out.println(space.makeAllLower(starman));
    	System.out.println(space.makeHugeString(starman, rocketship));
    	
    }
}
