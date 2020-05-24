package Game_Structure;

import javax.swing.JLabel;
/**
 * Controller Class is implemented as a Controller-class (Project is trying to approach to Model-view-controller design pattern)
 * This class contain most of the method for trigger button that change data with certain algorithm (Unrelated to GUI design)
 * It interact with Model class- Game_Profile to create data for the View class
 * Mostly do calculation at the back and only display message in Dialog label to show user the result
 * @author Edward Wong - University of Canterbury SENG_201 
 * 16/05/2020
 */
public class Controller {
	
	private Game_Profile Game_Profile;
	private Base_Component  Base_Component;
	
	/**
	 * Construct a game_Profile and update with Base_Component class
	 * @param game_Profile		Access the data (model class) from Game_Profile
	 * @param base_Component	Access to update stats ,energy ,inventory
	 */
	public Controller(Game_Structure.Game_Profile game_Profile, Base_Component  base_Component) {
		super();
		Game_Profile = game_Profile;
		Base_Component = base_Component;
		
		
	}
	/**
	 * chopTree A set of algorithm that allow user to perform chop tree action if they meet the condition
	 * Then update Dialog to show message, update Inventory and stats if data is changed
	 */
	public void chopTree() {																												//Chop tree algorithm											
		if (Game_Profile.getFarmer_energy() == 0) {																							//Check farmer energy condition																					
			setDialog("<html>Chopping tree stumps required ENERGY..<br> I wish my hand wasn't that sore.");				 					// Farmer energy = 0, cant chop
			
		}else if ((Game_Profile.getFarmer_axe() >= 1) && (Game_Profile.getAxe_durability() > 1)) {											// Check condition farmer have axe,energy, durability > 1 
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 330);																// Update farmer_gold
			Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);																// Update Farmer energy - 1
			setDialog("<html>Chopping tree stumps in the mountain...... <br>Sell lumber to the blacksmith for 330G.");						//Show effect to farmer
			Game_Profile.setAxe_durability(Game_Profile.getAxe_durability() - 1);															// Update Axe durability - 1
			
		}else if ((Game_Profile.getFarmer_axe() >= 1) && (Game_Profile.getAxe_durability() == 1)) {											// Check condition farmer have axe,energy, durability > 1 
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 330);																//Update farmer_gold
			Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);																// Update Farmer energy - 1
			Game_Profile.setAxe_durability(5);																								// Update Axe durability = 5
			Game_Profile.setFarmer_axe(Game_Profile.getFarmer_axe() - 1);																	// Update farmer axe amount - 1
			setDialog("<html>Chopping tree stumps in the mountain...... <br>Sell lumber to the blacksmith for 330G.");						//Show effect to farmer
		}else {																																//Farmer dont have axe
			setDialog("I cant Chop tree stumps with my bare hand...");
		}
		
	}
	
	@SuppressWarnings("restriction")
	/*
	 * feedAnimal A set of algorithm the allow user to feed Animals in barn and chicken hoop if condition is met
	 * Update inventory, Dialog, Barn stats if action is performed
	 */
	public void feedAnimal() {																												// Feed animal algorithm
		
			//Init local vrb for Barn activites
		if ((Game_Profile.getAnimal_cow() >= 1) || (Game_Profile.getAnimal_goat() >= 1) || (Game_Profile.getAnimal_chicken() >= 1)) {			// Check conditon if farmer have any animal
	
			if ((Game_Profile.getFarmer_corn_feed() >= 1) && (Game_Profile.isFeed_animal() == true)) {											// Check condition, farmer have corn feed and daily feeding status is available
	
				setDialog("<html>There, there, you all seems to have a good mood today.<br>"													// Display effect to user
						+ "[Corn feed -1] [Animal healthiness + 1]");
				Game_Profile.setFeed_animal(false);																								// Update Feed_Animal status
				Game_Profile.setFarmer_corn_feed(Game_Profile.getFarmer_corn_feed() - 1);														// Update Corn Feed amount
				Game_Profile.setAnimal_healthiness(Game_Profile.getAnimal_healthiness() + 2);													// Update healthiness
			}
			else {
				setDialog("<html>You can't feed them twice a Day, or you might not have enough Corn Feed..<br>"									// Display effect to user
						+ "Corn Feed = " + Game_Profile.getFarmer_corn_feed());
			}
	
		}else {
			setDialog("You dont have animal...");																								// Display effect to user
		}
	}
	/**
	 * AnimalAllowance A set of algorithm that calculate animal allowance and get called in every new Day
	 * Allowance for Animals {cow, goat, chicken}:({150,100,50}*happiness)
	 * Update Inventory, Stats, Dialog if action is performed
	 */
	public void AnimalAllowance() { 																																// Calculate allowance from animal 
		/*
		 * Although count of Animal {Cow,Goat,Chicken} is limited to 1 in this version of game
		 * Algorithm was implemented to multiple with animal count to ensure further enhance to be easier
		 */
		if (Game_Profile.getAnimal_healthiness() <= 3) {																											// If healthiness <= 3, animalAllowance is forfeit
			setDialog("Your animals seems to be in a sour mood, take care of them before they get sick.");															// Display message
		}else {	
			if (Game_Profile.getAnimal_cow() >= 1) {																												// Check farmer have cow
				Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + (Game_Profile.getAnimal_cow() * 150 * Game_Profile.getAnimal_happiness()));				//Perform calculation
			}
			if (Game_Profile.getAnimal_goat() >= 1) {																												// Check farmer have cow
				Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + (Game_Profile.getAnimal_goat() * 100 * Game_Profile.getAnimal_happiness()));			//Perform calculation
			}
			if (Game_Profile.getAnimal_chicken() >= 1) {																											// Check farmer have cow
				Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + (Game_Profile.getAnimal_chicken() * 50 * Game_Profile.getAnimal_happiness()));			//Perform calculation
			}
		}
	}
	/**
	 * FarmerType_advantage A set of algorithm to check farmer type and provide advantage respectively
	 * Type {0, 1, 2, 3} ; {Extra energy daily, Extra happiness daily, Extra 30G for selling crops, Challenge mode - None}
	 */
	public void FarmerType_advantage() {	
		/*
		 * Provide advantage base on farmer type		
		 * Contain Advantage for type [0]. [1] 
		 * Advantage of [2] in trading market(extra profit)
		 * Advantage of [3] = None
		 *  */

		if (Game_Profile.getFarmer_type() == 0) {																							// Check farmertype meet condition
			Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() + 1);																// Receive extra energy
		} else if ((Game_Profile.getFarmer_type() == 1) && (Game_Profile.getAnimal_happiness() <= 15)) {									// Check farmertype meet condition , Daily extra animal happiness(max 15)
			if ((Game_Profile.getAnimal_cow() >= 1) || (Game_Profile.getAnimal_goat() >= 1) || (Game_Profile.getAnimal_chicken() >= 1)) {	//	Check farmer have any Animals
				Game_Profile.setAnimal_happiness(Game_Profile.getAnimal_happiness() + 1);													// Extra happiness
			}
			
		}
	}
	/**
	 * MorningMessage Display a message in Dialog to show it's the Next day
	 * Update Dialog
	 */
	public void MorningMessage() {							

		setDialog("<html>My farm is getting bigger.. Let's work harder!<br>"			//Display message
				+ "Day = " + Game_Profile.getDay_num());
		
	}
	
	public void relicChair() {												//relic chair actions
		//After 3days archeology came and rent your chair to show in museum , get paid 1000G

		if ((Game_Profile.getFarmer_relic_chair() >= 1) &&(Game_Profile.isRest())) {
			Game_Profile.setRelic_aura(Game_Profile.getRelic_aura() + 1);	// Getting hidden charge for special event 
			Game_Profile.setRest(false);									//Set daily rest to be used
			setDialog("This vintage chair is worth for the price!");
		} else if (Game_Profile.getRelic_aura() == 0) {
			setDialog("It will be good if I have a chair at home.");
		}
		else if ((Game_Profile.isRest() == false) && (Game_Profile.getRelic_aura() != 3 )) {
			setDialog("I don wan to sit anymore..");
		}
	}
	/**
	 * fertilizer Allow user to perform fertilizing to all crops which update the daily Watering status to true
	 * Fertilizing consume energy and need to be bought from supermarket
	 */
	public void fertilizer() {																												//fertilizing algorithm
		if ( Game_Profile.getFarmer_energy() == 0) {																						// Check condition farmer need energy > 0 to perform action
			setDialog("<html>Nobody can help you to fertilize your Crops!<br>[No ENERGY to perform fertilizing.]");							//Display message
		}else if ((Game_Profile.getFarmer_fertilizer()) >= 1 && (Game_Profile.isFertilizing())) {											// Check condition farmer have fertilizer and daily fertilizing status = true
			Game_Profile.setFarmer_fertilizer(Game_Profile.getFarmer_fertilizer() - 1);														//Update fertilizer amount
			Game_Profile.setFertilizing(false);																								//Update fertilize status, once a day
			Game_Profile.setWatering(true);																									//Update watering status = true
			setDialog("<html>Manure helps crop to grow!<br> [Irrigate now to grow you crops faster.]");										//Display message
		}else if (Game_Profile.getFarmer_fertilizer() == 0) {																				// condition farmer don have fertilizer
			setDialog("<html>You need to find manure from somewhere, maybe ur own feces?<br>[Fertilizer = 0]");								// No fertilizer
			
		}else if (Game_Profile.isFertilizing() == false) {																					// Condition farmer already fertilized crops today(once per day0
			setDialog("<html>Over - fertilization can hurt benefica soil microorganisms!<br> [You already ferilized your crops today]");	//Crops is fertilized
		}
		Base_Component.UpdateEnergy();																										// Update energy bar and label
	}
	
	
	public void setDialog(String text) {
		Base_Component.setDialog(text);
	}
}
