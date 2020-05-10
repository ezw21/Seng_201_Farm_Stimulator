package Lab;

public class StarmanSummits {
	public int count = 0;
	public double position;
	
	public void climbMountain(double height, double dash, double slide) {
		while (position < height) {
			if (count == 0) {
				count += 1;
				position += dash;
			}
			else {
				
			position -= slide;
			//new attempt
			position += dash;
			count += 1;
			}
		}
		
		System.out.println("Starman needs to dash " + count + " times before he reaches the top of the mountain");
		
	}
	
	public static void main(String[] args) {
		StarmanSummits starman = new StarmanSummits();
		starman.climbMountain(21287.4, 16.4, 4.3);
    }
}
