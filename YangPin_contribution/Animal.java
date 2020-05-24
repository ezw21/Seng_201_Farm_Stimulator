
public class Animal {
	private String animalName;
	public int purchasingPrice;
	public int healthHappiness;
	
	/**
	 * 
	 * @param animalName
	 * @param healthHappiness
	 * @param purchasingPrice
	 */
	public Animal(String animalName, int healthHappiness, int purchasingPrice) {
		this.animalName = animalName;
		this.healthHappiness = healthHappiness;
		this.purchasingPrice = purchasingPrice;
	}
	
	/**
	 * 
	 * @return an animal name
	 */
	public String getAnimalName() {
		return animalName;
	}
	
	/**
	 * Unnecessary, as the constructor exists.
	 * @param animalName
	 */
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
	/**
	 * 
	 * @param food
	 */
	public void feedAnimal(int food) {
		healthHappiness += food;
	}
	
	/**
	 * a method to play with animal and increase it's happiness.
	 * @param play
	 */
	public void playAnimal() {
		healthHappiness += 1;
	}
	
	/**
	 * In Mainfuction, covert happiness to money each day.
	 * @param healthHappiness
	 */
	public void covertMoney(int healthHappiness) {
		Farm.money += healthHappiness;
	}
	/**
	 * clean the farm to increase animal happiness in odd days.
	 */
	public void cleanAniamal() {
		if (farmDay%2 != 0) {
			healthHappiness += 1;
		}
	}
	
}
