package Lab_4;

import java.util.ArrayList;

public class SolarSystem {
	
	public ArrayList<Planet> namelist = new ArrayList<Planet>();

	public void addPlanet(Planet planet) {
			namelist.add(planet);
	}
	public  void printAllPlanets() {
		for ( Planet i : namelist) {
				System.out.println(i.toString());
		}
	}
	public int getPlanetCount() {
		return namelist.size();
	}

	public static void main(String[] argm) {
		Planet mercury = new Mercury();
		Planet venus = new Venus();
		Planet earth = new Earth();
		Planet saturn = new Saturn();

		SolarSystem solarsystem = new SolarSystem();
		solarsystem.addPlanet(mercury);
		solarsystem.addPlanet(venus);
		solarsystem.addPlanet(earth);
		solarsystem.addPlanet(saturn);

		solarsystem.printAllPlanets();
		System.out.println(solarsystem.getPlanetCount());
	}
	
	
}
