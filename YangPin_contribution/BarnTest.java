package Game_Structure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BarnTest {
	
	int energy = 3;
	int axe_durability = 5;
	int farmer_axe = 1;
	int farmer_gold = 100;
	int farmer_type = 1;
	
	int animal_cow = 5;
	int animal_goat = 5;
	int animal_chicken = 5;
	int farmer_corn_feed = 5;
	int animal_healthiness = 14;
	boolean isFeed_animal = true;
	
	public void playInBarn() {								//Play in Barn algorithm
		if(animal_healthiness >= 15) {														//Reach max animal happiness
			System.out.println("<html>They looks Overjoyed! I should keep up the good work.<br>[Animal hapiness = 15]");
		}else if ((animal_cow >= 1) || (animal_goat >= 1) || (animal_chicken >= 1)) {
			if (energy != 0) {
				energy --;							// Update energy
				animal_healthiness ++;					// Update happiness
				System.out.println("<html>They are having lot of fun today!<br>"								// Display effect to user
						+ "[Energy - 1] [Animal happiness + 1]<br>");
			}else {
				System.out.println("<html>You need some rest!");												// Display effect to user
			}
			
		} else {
			System.out.println("You dont have animal...");
		}
//		updateAll();
	}
	
	
//	public void updateAll() {
//		Base_Component.UpdateEnergy();
//		Base_Component.UpdateStats();
//		Inventory.UpdateInventory();
//		UpdateBarn();
//	}

	
	
	@Test
	void test() {
		BarnTest test = new BarnTest();
		test.playInBarn();
		assertEquals(2, test.energy);
		assertEquals(15, test.animal_healthiness);
	}

}
