import java.util.ArrayList;

public class Farm {
	private String farmName;
	public int farmType;
	private int money;
	public Farmer farmer;
	ArrayList<Crop> cropList = new ArrayList<Crop>();
	ArrayList<Animal> animalList = new ArrayList<Animal>();
	
	public int cropNutrient = 3;
	public int cropEnergy = 2;
	public int cropPest = 1;
	
	public int animalNutrient = 3;
	public int animalEnergy = 2;
	public int animalHealth = 1;
	
	/**
	 * A constructor to instantiate a farm object. The farm contains below attributes. 
	 * 
	 * @param farmName
	 * @param farmType
	 * @param money
	 * @param farmer
	 * @param cropList
	 * @param animalList
	 * @param cropNutrient
	 * @param cropEnergy
	 * @param cropPest
	 * @param animalNutrient
	 * @param animalEnergy
	 * @param animalHealth
	 */
	
	public Farm(String farmName, int farmType, int money, Farmer farmer, ArrayList<Crop> cropList, ArrayList<Animal> animalList, 
			int cropNutrient, int cropEnergy, int cropPest, int animalNutrient, int animalEnergy, int animalHealth) {
		this.farmName = farmName;
		this.farmType = farmType;
		this.money = money;
		this.farmer = farmer;
		this.cropList = cropList;
		this.animalList = animalList;
		this.cropNutrient = cropNutrient;
		this.cropEnergy = cropEnergy;
		this.cropPest = cropPest;
		this.animalNutrient = animalNutrient;
		this.animalEnergy = animalEnergy;
		this.animalHealth = animalHealth;
	}
	
	/**
	 * A constructor to instantiate a list object for a list of crop the farm possesses.
	 * @param newList
	 */
	public void setCropList(ArrayList<Crop> newList) {
		cropList = newList;
	}
	
	/**
	 * A constructor to instantiate a list object for a list of animal the farm possesses.
	 * @param newList
	 */
	public void setAnimalList(ArrayList<Animal> newList) {
		animalList = newList;
	}
	/**
	 * 	A function to set the farm type in integer. 
	 * @param farmType
	 */
	public void setFarmType(int farmType) {
		this.farmType = farmType;
	}
	/**
	 * A function to return the farm type in integer. 
	 * @param farmType
	 */
	public int getFarmType(int farmType) {
		return farmType;
	}
	
}
