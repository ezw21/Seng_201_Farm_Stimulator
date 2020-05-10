package Lab_4;

class SpaceStation implements RemoteControllable {
	
	public String task;
	public String location;
	
	
	@Override
	public String getStatusReport() {
		// TODO Auto-generated method stub
		return getLocation() + "\nThe station is on a mission to: " + task;
	}

	@Override
	public void updateMission(String mission) {
		// TODO Auto-generated method stub
		task = mission;
	}
	
	public SpaceStation(String planet) {
		location = planet;
		return;
	}
	
	public String getLocation() {
		return "The space station floats around the planet " + location ;
	}
	

	public static void main(String[] args) {
		SpaceStation station = new SpaceStation("Mars");
		System.out.println(station instanceof RemoteControllable);
		station.updateMission("Store food rations for hungry space travelers");
		System.out.println(station.getStatusReport());
    }
}
	