package Lab_4;

public class Planet {
	public String ini_name; int ini_order; String ini_temperature; 
	
	public Planet(String name, int order, String temperature) {
		ini_name = name; ini_order = order; ini_temperature = temperature;
	}
	
	public String getName() {
		return ini_name;
	}
	
	public String getTemperature() {
		
		
		if (ini_name == "Saturn") return "Cold";
		
		else if (ini_name == "Earth") return "Warm";
		
		else return "Hot";
	}
	
	public String orderFromSun() {
		return ini_name + " is number " + ini_order +  " from the Sun";
	}
	
	public String toString() {
		return orderFromSun() + " and is " + ini_temperature;
	}
}
