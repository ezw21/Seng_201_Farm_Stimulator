package Lab;

public class LocationBeacon {

	public int hours;
	public int minutes;
	public int distance;
	
	public void heartBeat(int startHour, int startMinute, int startDistance, int speed, int duration) {
		hours = startHour;
		minutes = startMinute;
		distance = startDistance;
		
		
		for (int i = 0; i < duration; i += 10) {
			minutes += 10;
			distance += (speed / 6);
			if (minutes >= 60) {
				hours += 1;
				minutes -= 60;
				if (hours == 24){
					hours = 0;
				}
			}
			else if (hours == 24) {
				hours = 0;
			}
			
			System.out.println("[" + hours + ":" + minutes + "] Starman is " + distance + "km away from Earth");
		}
	}
	
	public static void main(String[] args) {
		
		LocationBeacon beacon = new LocationBeacon();
		beacon.heartBeat(23, 28, 630000, 10000, 90);
    }
}
