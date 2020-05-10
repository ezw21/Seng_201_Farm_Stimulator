package Lab_4;

import java.util.Collection;
import java.util.List;

import Lab_4.Astronaut;

public class StarmansBoss {
	
	public int sum;
	public int getCollectiveAge(Collection<Astronaut> o) {
		for ( Astronaut astronaut : o) {
			sum += astronaut.age;
				
			}
		
		return sum;
	}
	
	public static void main(String[] argm) {
		Astronaut spaceman = new Astronaut("Spaceman", 20, "Hash browns", "0001 to Mars");
		Astronaut spacegirl = new Astronaut("Spacegirl", 21, "Pizza", "0002 to the Moon");
		Astronaut spacedog = new Astronaut("Spacedog", 7, "Hash browns", "0001 to Mars");

		List<Astronaut> astronautList = List.of(spaceman, spacegirl, spacedog);

		StarmansBoss boss = new StarmansBoss();
		System.out.println(boss.getCollectiveAge(astronautList));
	}
}
