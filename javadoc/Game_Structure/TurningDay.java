package Game_Structure;
import java.util.Random;

/**
* Turning Class is implemented as a Controller-class (Project is trying to approach to Model-view-controller design pattern)
* This class contain most of the method for trigger button that change data with certain algorithm (Unrelated to GUI design)
* It interact with Model class- Game_Profile to create data for the View class
* Mostly do calculation at the back and only display message in Dialog label to show user the result
* @author Edward Wong - University of Canterbury SENG_201 
* 16/05/2020
*/
public class TurningDay {
	private Game_Profile Game_Profile;
	private Base_Component  Base_Component;
	private Barn Barn;
	private Controller Controller;
	private Inventory Inventory;
	
	/**
	 * Construct game profile and upadte with access of other classes
	 * @param game_Profile			Access the data (model class) from Game_Profile
	 * @param base_Component		Access to update stats ,energy ,inventory
	 * @param barn					Access to allow update barn
	 * @param controller			Access ro perform certain trigger actions
	 * @param inventory				Access Inventory for updating
	 */
	public TurningDay(Game_Structure.Game_Profile game_Profile, Base_Component  base_Component, Barn barn, Controller controller,Inventory inventory ) {
		super();
		Game_Profile = game_Profile;
		Base_Component = base_Component;
		Barn = barn;
		Controller = controller;
		Inventory = inventory;
	}
	

	/**
	 * NextDay this is a advance controller method which perform 'Sleep' for user to move onto next day
	 * A set of action will be performed each time this method get called which - turn into next day, energy, daily allowance, calculate animal allowance
	 * Also it refresh the boolean/int  status - watering, feedAnimal, Rest(on chair), eat_burger, fertilizing
	 * Then it apply the farmerType advantage and display a Morning message to user
	 * AnimalAllowance also check for animal healthiness, if condition met, user might get allowance forfeit
	 * On the day before Contract end(End game) there will be 3 random event occur randomly, user receive advantage/disadvantage base on certain condition
	 * When Animal allwaonce bad case / random event occur, it will overwrite morningmessage
	 * Thers also hidden event, when user perform some set of action and accumulate a certain value that met hidden condition, hidden event occur
	 * hidden ecent wont happen on the day before ending which will never intersect with random event
	 * After all updateAll method is called to update profile in all aspect
	 */
	public void NextDay() {							//going into nextday

		if (Game_Profile.getEnd_day() > 1) {																		//condition not end day
			Game_Profile.setEnd_day(Game_Profile.getEnd_day() - 1);													// Game contract day -1 (day closer to end)
			Game_Profile.setDay_num(Game_Profile.getDay_num() + 1);													//Day num + 1
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 1000);										//Daily 1000 allowance
			
			if ((Game_Profile.getAnimal_cow() >= 1) || (Game_Profile.getAnimal_goat() >= 1) || (Game_Profile.getAnimal_chicken() >= 1)) {	//farmer have animal
				Game_Profile.setAnimal_healthiness(Game_Profile.getAnimal_healthiness() - 1);							//Animal health - 1 daily
			}														

			refreshDaily();																							// Update & Refresh ALL STATUS
			
			//Daily bonus and message	(May trigger hidden event)
			Controller.FarmerType_advantage();																		//Provide advantage to farmer base on farmer_type													
	     	Controller.MorningMessage();																			//Display message to show turned into next day
			Controller.AnimalAllowance();																			//daily bonus from animal cocunt * happiness
			randomEvent(testRandom());																							//happens on the day before end, random event
			HiddenEvent();																							//Event occur when certain hidden condition is met
			updateAll();																							//update profile in all aspect
		} 
	}
	/**
	 * randomEvent 3 case of random event happens randomly(by luck and Probability) on the day before ending
	 * @param random_case Get a random number from testRandom to decide which random event to occur 
	 */
	public void randomEvent(int random_case) {
		if (Game_Profile.getEnd_day() == 2) {																				//Happens the day before ending
			
																							//call a method to get random case number

			if ((Game_Profile.getFarmer_tomato() >= 3) && (random_case == 0)) {												//random case 1 - Cooking contest Chef need tomato
				Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 1500);											// Sell 3 tomato for 1500G
				Game_Profile.setFarmer_tomato(Game_Profile.getFarmer_tomato() - 3);											// Sold 3 tomato
				setDialog("<html>Hi " + Game_Profile.getFarmer_name() + ".<br>I need 3 fresh tomato for a cooking contest. Do you have any in your inventory?<br>"
						+ "Yes? That's cool! As a return I will pay you 1500G.<br> Passed 3 tomato to Mr Qun. [Tomato - 3 , +1500G] ");
			}else {
				setDialog("<html>Hi " + Game_Profile.getFarmer_name() + ".<br>I need 3 fresh tomato for a cooking contest. Do you have any in your inventory?<br>"
						+ "NO? Aw... What kind of farmer dont plant tomato..zzZ <br> Mr Qun left. ");
			}
			
			if ((Game_Profile.getAnimal_chicken() >= 1) && (Game_Profile.getAnimal_cow() >= 1) && (random_case == 1)) {		//random case_2 = The Wolf
				setDialog("<html> A wolf sneaked into the barn last night!!<br> The mighty Cow protected the chicken. <br>What a great job!!");
				
			} else if ((Game_Profile.getAnimal_chicken() >= 1) && (random_case == 1)) {
				Game_Profile.setAnimal_chicken(Game_Profile.getAnimal_chicken() - 1);										// chicken was stolen by wolf
				Game_Profile.setAnimal_happiness(0);																		// Animal was scared, happiness = 0 (only affect 1 bonus allowance in the last day of game)
				setDialog("<html> A wolf sneaked into the barn last night!!<br> The chicken, the poor chicken was gone.... <br>[Chicken - 1, Animal happiness = 0]");
			}else if ((Game_Profile.getAnimal_chicken() >= 0) && (Game_Profile.getAnimal_cow() >= 0) && (random_case == 1)){
				setDialog("<html> A wolf sneaked into the barn last night!!<br> Nothing happens... HAHAHA");
			}
			
			if (random_case == 2) {																							//random case 3 - Mysterious berry
				Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() + 3);											//Energy + 3
				setDialog("<html> Who are you?!! <br>Receive mysterious power berry from mysterious person.<br> [Energy + 3] ");
			}
		}
	}
	/**
	 * HiddenEvent Hidden event happens when user perform certain action and accumulate certain variable that met hidden condition
	 */
	public void HiddenEvent() {																								//Hidden event in game
		if (Game_Profile.getRelic_aura() == 3 && (Game_Profile.getEnd_day() != 1)) {										// Not on the day before ending(prevent overwriting randomEvent)
			setDialog("<html>We heard that you have a vintage relic chair, can we rent it for a museum exihbition?<br>"
					+ "...<br>Yes?? Good to hear that! We will pay you 2000G in return.<br> [+2000G]");
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 2000);												//Update farmer gold
			Game_Profile.setRest(false);																					//Cant rest for the day
			Base_Component.UpdateStats();
		}
	}
	/**
	 * refreshDaily Refresh all status of perform action to positive on daily base
	 */
	public void refreshDaily() {
		// Update & Refresh ALL STATUS
		Game_Profile.setFeed_animal(true);
		Game_Profile.setFarmer_energy(3);
		Game_Profile.setWatering(true);
		Game_Profile.setRest(true);
		Game_Profile.setEat_burger(0);
		Game_Profile.setFertilizing(true);
	}
	/**
	 * testRandom Randomly decide a number between a range (0 - 2 in this case) for random event
	 * @return	num (a random number generated by system to perform random event)
	 */
	public int testRandom() {
		int min = 0; int max = 3;
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		int num;
		Random r = new Random();
		num = r.nextInt(max - min);
		return num;
	}
	/**
	 * endDay happens when the contract end(end of game)
	 * 
	 */
	public void endDay() {
		
		Game_Profile.setEnd_day(0);																											// Game contract is ended
		
		if (Game_Profile.getFarmer_mask() > 20) {																							//Limit of mask bonus = 20
			Game_Profile.setFarmer_mask(20);										
		}
		Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + (Game_Profile.getAnimal_cow() * 13500) + (Game_Profile.getAnimal_goat() * 9000)
				+ (Game_Profile.getAnimal_chicken() * 3300) + (Game_Profile.getFarmer_mask() * 300));										//Calculate final sumup with bonus (mask hidden event) 
		
		
		setDialog("<html>Well done " + Game_Profile.getFarmer_name() +" Your farm looks GREAT!<br>"											//Greet
				
				+ "So you have: " + Game_Profile.getAnimal_cow() + " Cow, " + Game_Profile.getAnimal_goat() + " Goat, "						//Show counting bonus to player
						+ "" + Game_Profile.getAnimal_chicken() + " Chicken, " + Game_Profile.getFarmer_mask() + " Mask. "
						
						+ "That will brings you " + (Game_Profile.getAnimal_cow() * 13500) + "G " 								//Show user the amount of bonus
								+ (Game_Profile.getAnimal_goat() * 9000) + "G " + (Game_Profile.getAnimal_chicken() * 3300) + "G " + (Game_Profile.getFarmer_mask() * 300) + " G. <br>"
										
								+ "And your total GOLD will now become " + Game_Profile.getFarmer_gold() + "<br>"							//Show Actual gold amount
								
												+ "Thanks for playing! You can now call yourself a Real FARMER!!! [End Game]");				//Thanks & let user know game is end
		Barn.updateAll();																													//Update stats, for player to check gold
	}
	/**
	 * eatBurger Limit the daily burger eating count to 2, so that it wont be a loophole as unlimited energy refill
	 */
	public void eatBurger() {																									// Eat burger actions
		if ((Game_Profile.getEat_burger() <= 1) && (Game_Profile.getFarmer_burger() >= 1)){										// Check not allow to eat 3rd time a day
			Game_Profile.setEat_burger(Game_Profile.getEat_burger() + 1);														// Update daily eat frequent
			Game_Profile.setFarmer_burger(Game_Profile.getFarmer_burger() - 1);													//Update burger amount
			Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() + 1);													//Update Energy
			setDialog("<html>Yummy, bacon egg mayo is love! I feel stronger!!"													//Display effect tp user
					+ "<br> [Energy + 1]");	
			Inventory.UpdateInventory();																						// Update Inventory
			Base_Component.UpdateEnergy();																						//Update Energy lv
		} else {
			setDialog("I'm too full to eat again.");																			//Display error message
		}
	}
	
	public void updateAll() {
		Base_Component.UpdateEnergy();
		Base_Component.UpdateStats();
		Inventory.UpdateInventory();
		Barn.UpdateBarn();
	}
	public void setDialog(String text) {
		Base_Component.setDialog(text);
	}
}