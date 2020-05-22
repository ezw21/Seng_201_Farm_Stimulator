package Game_Structure;

import javax.swing.JLabel;

public class Controller {
	private Game_Profile Game_Profile;
	private Base_Component  Base_Component;
	
	public Controller(Game_Structure.Game_Profile game_Profile, Base_Component  base_Component) {
		super();
		Game_Profile = game_Profile;
		Base_Component = base_Component;
	}

	public Game_Profile getGame_Profile() {
		return Game_Profile;
	}
	
	public void setGame_Profile(Game_Profile game_Profile) {
		Game_Profile = game_Profile;
	}
	
	public void setDialog(String text) {
		Base_Component.setDialog(text);
	}
	
	@SuppressWarnings("restriction")
	public void chopTree() {																	//Chop tree algorithm
		if (Game_Profile.getFarmer_energy() == 0) {																							
			setDialog("<html>Chopping tree stumps required ENERGY..<br> I wish my hand wasn't that sore.");									// Farmer energy = 0, cant chop
			
		}else if ((Game_Profile.getFarmer_axe() >= 1) && (Game_Profile.getAxe_durability() > 1)) {// Check Farmer have axe,energy, durability > 1 
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 330);																//Update farmer_gold
			Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);																// Update Farmer energy - 1
			setDialog("<html>Chopping tree stumps in the mountain...... <br>Sell lumber to the blacksmith for 330G.");					//Show effect to farmer
			Game_Profile.setAxe_durability(Game_Profile.getAxe_durability() - 1);															// Update Axe durability - 1
			
		}else if ((Game_Profile.getFarmer_axe() >= 1) && (Game_Profile.getAxe_durability() == 1)) {// Check Farmer have axe,energy, durability > 1 
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 330);																//Update farmer_gold
			Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);																// Update Farmer energy - 1
			Game_Profile.setAxe_durability(5);																								// Update Axe durability = 5
			Game_Profile.setFarmer_axe(Game_Profile.getFarmer_axe() - 1);																	// Update farmer axe amount - 1
			setDialog("<html>Chopping tree stumps in the mountain...... <br>Sell lumber to the blacksmith for 330G.");					//Show effect to farmer
		}else {																																//Farmer dont have axe
			setDialog("I cant Chop tree stumps with my bare hand...");
		}
		
	}
	
	@SuppressWarnings("restriction")
	public void feedAnimal() {								//Feed animal algorithm
		
		//Init local vrb for Barn activites
	if ((Game_Profile.getAnimal_cow() >= 1) || (Game_Profile.getAnimal_goat() >= 1) || (Game_Profile.getAnimal_chicken() >= 1)) {

		if ((Game_Profile.getFarmer_corn_feed() >= 1) && (Game_Profile.isFeed_animal() == true)) {

			setDialog("<html>There, there, you all seems to have a good mood today.<br>"	// Display effect to user
					+ "[Corn feed -1] [Animal healthiness + 1]");
			Game_Profile.setFeed_animal(false);													// Update Feed_Animal status
			Game_Profile.setFarmer_corn_feed(Game_Profile.getFarmer_corn_feed() - 1);			// Update Corn Feed amount
			Game_Profile.setAnimal_healthiness(Game_Profile.getAnimal_healthiness() + 2);								// Update healthiness
		}
		else {
			setDialog("<html>You can't feed them twice a Day, or you might not have enough Corn Feed..<br>"
					+ "Corn Feed = " + Game_Profile.getFarmer_corn_feed());
		}

	}else {
		setDialog("You dont have animal...");
	}
	}
	
	public void AnimalAllowance() { 					//Calculate and allowance from animal {cow, goat, chicken}:({150,100,50}*happiness)
		
		if (Game_Profile.getAnimal_healthiness() <= 3) {
			setDialog("Your animals seems to be in a sour mood, take care of them before they get sick.");
		}else {
			if (Game_Profile.getAnimal_cow() >= 1) {
				Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + (150 * Game_Profile.getAnimal_happiness()));
			}
			if (Game_Profile.getAnimal_goat() >= 1) {
				Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + (100 * Game_Profile.getAnimal_happiness()));
			}
			if (Game_Profile.getAnimal_chicken() >= 1) {
				Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + (50 * Game_Profile.getAnimal_happiness()));
			}
		}
	}
	
	public void FarmerType_advantage() {					//Provide advanrage base on farmer type		
		// Advantage for type [0]. [1] 
		// Advantage of [2] in trading market(extra profit)
		if (Game_Profile.getFarmer_type() == 0) {																	//Advantage of Blacksmith , Daily extra energy
			Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() + 1);
		} else if ((Game_Profile.getFarmer_type() == 1) && (Game_Profile.getAnimal_happiness() <= 15)) {			//Advantage of Traveller , Daily extra animal happiness(max 15)
			if ((Game_Profile.getAnimal_cow() >= 1) || (Game_Profile.getAnimal_goat() >= 1) || (Game_Profile.getAnimal_chicken() >= 1)) {
				Game_Profile.setAnimal_happiness(Game_Profile.getAnimal_happiness() + 1);							
			}
			
		}
	}
	
}
