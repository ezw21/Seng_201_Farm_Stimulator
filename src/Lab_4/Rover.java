package Lab_4;

public class Rover implements RemoteControllable {
	public double lati;
	public double longi;
	public String mission_value;
	

	@Override
	public String getStatusReport() {
		// TODO Auto-generated method stub
		return getLocation() + "\nThe rover is driving to: " + mission_value;
	}

	@Override
	public void updateMission(String mission) {
		// TODO Auto-generated method stub
		mission_value = mission;
		
	}
	public void setLocation(double latitude, double longitude) {
		lati = latitude;
		longi = longitude;
	}
	
	public String getLocation() {
		return "The rover is located " + lati + ", " + longi + " on the planet." ;
	}
	
	public static void main(String[] argm) {
		Rover rover = new Rover();
		System.out.println(rover instanceof RemoteControllable);
		rover.setLocation(100.0, 42.0);
		rover.updateMission("Find water");
		System.out.println(rover.getStatusReport());
	}
}
