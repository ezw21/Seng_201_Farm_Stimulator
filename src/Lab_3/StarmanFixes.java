package Lab_3;


public class StarmanFixes {
	public float addition(float num_1, float num_2) {
		return num_1 + num_2;
	}
	
	public double oneTurn;			//how far one turn of socket wrench goes
	public double tightenAmount; 	//how far the wheel nut has been tightened
	
	public void setOneTurn(double amount) {
		oneTurn = amount;
	}
	
	public double getTightenAmount() {
		return tightenAmount;
	}
	
	public void tightenQuarter() {
		tightenAmount += oneTurn * 0.25;
		System.out.println("Starman tightens the nut one quarter of a turn");
	}
	
	public void tightenHalf() {
		tightenQuarter();
		tightenQuarter();
		System.out.println("The nut has been tightened half a turn");
	}
	
	public void tightenFull() {
		tightenHalf();
		tightenHalf();
		System.out.println("The nut has been tightened a full turn");
	}
	
	public static void main(String[] args) {
		
		StarmanFixes wheelnut = new StarmanFixes();
		wheelnut.setOneTurn(3.5);
		wheelnut.tightenHalf();
		wheelnut.tightenFull();
		wheelnut.tightenFull();
		System.out.println(wheelnut.getTightenAmount());
    }
}
