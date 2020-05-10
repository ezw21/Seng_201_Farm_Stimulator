package Lab_3;

import Lab_2.SpaceCalculations;

public class LiftoffWatch {
	public double temperature;
	public String weather;
	public double winds;
	
	public void setTemp(double temp) {
		temperature = temp;
	}
	
	public void setWeather(String state) {
		weather = state;
	}
	
	public void setWind(double speed) {
		winds = speed;
	}
	public boolean canWeLaunch() {
		if ((temperature  >= 16.5) && (temperature <= 34.0)) {
			if ((weather == "Sunny") && (winds <= 60)) {
				return true;
			}
			
			else if ((weather == "Cloudy") && (winds <= 45)) {
				return true;
			}
			
			else {
				return false;
			}
		
		}
		return false;
	}
	public static void main(String[] args) {
		LiftoffWatch launch = new LiftoffWatch();

		launch.setTemp(27.0);
		launch.setWeather("Sunny");
		launch.setWind(53);
		System.out.println(launch.canWeLaunch());

    	
    }
}
