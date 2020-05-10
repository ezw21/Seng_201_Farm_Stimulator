package Lab_4;

import java.util.ArrayList;



public class StarmanOrganises {
	private ArrayList<RemoteControllable> list_1 = new ArrayList<RemoteControllable>();
	
	public void addControllable(Object o) {
		if (o instanceof RemoteControllable) {
			list_1.add((RemoteControllable)o);
		}
	}
	
	public void getAllStatusReports() {
		for (int i = 0; i < list_1.size(); i ++) {
			System.out.println(list_1.get(i).getStatusReport());

		}
/**	DO THE SAME THING IN A FANCY WAY
 * 
 * 	for ( RemoteControllable r : list_1) {
		System.out.println(r.getStatusReport());
			
		}
 */
	}
	
	public static void main(String[] argm) {
		SpaceStation station = new SpaceStation("Mars");
		station.updateMission("Store food rations for hungry space travelers");

		Rover rover = new Rover();
		rover.setLocation(100.0, 42.0);
		rover.updateMission("Find water");

		StarmanOrganises organise = new StarmanOrganises();
		organise.addControllable(station);
		organise.addControllable(rover);
		organise.getAllStatusReports();
	}
}
