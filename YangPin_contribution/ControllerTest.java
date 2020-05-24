package Game_Structure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ControllerTest {
	int energy = 3;
	int axe_durability = 5;
	int farmer_axe = 1;
	int farmer_gold = 100;
	int farmer_type = 1;
	
	public int chopTree() {

		
		if (energy == 0) {
		
		}else if ((farmer_axe >= 1) && (axe_durability >= 1)) {
			farmer_gold += 300;
			energy --;
			axe_durability --;
			return farmer_gold;
		}else if ((farmer_axe >= 1) && (axe_durability == 1)) {
			farmer_gold += 300;
			energy --;
			axe_durability = 5;
			return farmer_gold;
		}else {
			return farmer_gold;
		}
		return farmer_gold;
	}
	
	
	
	int animal_cow = 5;
	int animal_goat = 5;
	int animal_chicken = 5;
	int farmer_corn_feed = 5;
	int animal_healthiness = 8;
	boolean isFeed_animal = true;
		
	public void feedAnimal() {								//Feed animal algorithm
		
		//Init local vrb for Barn activites
	if ((animal_cow >= 1) || (animal_goat >= 1) || (animal_chicken >= 1)) {

		if ((farmer_corn_feed >= 1) && (isFeed_animal == true)) {

			System.out.println("<html>There, there, you all seems to have a good mood today.<br>"	// Display effect to user
					+ "[Corn feed -1] [Animal healthiness + 1]");
			isFeed_animal = false;													// Update Feed_Animal status
			farmer_corn_feed --;			// Update Corn Feed amount
			animal_healthiness += 2;								// Update healthiness
		}
		else {
			System.out.println("<html>You can't feed them twice a Day, or you might not have enough Corn Feed..<br>"
					+ "Corn Feed = " + farmer_corn_feed);
		}

	}else {
		System.out.println("You dont have animal...");
		}
	}
	
	public void FarmerType_advantage() {					//Provide advanrage base on farmer type		
		// Advantage for type [0]. [1] 
		// Advantage of [2] in trading market(extra profit)
		if (farmer_type == 0) {																	//Advantage of Blacksmith , Daily extra energy
			energy ++;
		} else if ((farmer_type == 1) && (animal_healthiness <= 15)) {			//Advantage of Traveller , Daily extra animal happiness(max 15)
			if ((animal_cow >= 1) || (animal_goat >= 1) || (animal_chicken >= 1)) {
				animal_healthiness ++;							
			}
			
		}
	}
	
				
	@Test
	void test() {
		ControllerTest test = new ControllerTest();
		test.chopTree();
		assertEquals(2, test.energy);
	}
		
	@Test
	void test1() {
		ControllerTest test = new ControllerTest();
		test.feedAnimal();
		assertEquals(10, test.animal_healthiness);	
	}
	
	@Test
	void test2() {
		ControllerTest test = new ControllerTest();
		test.FarmerType_advantage();
		assertEquals(9, test.animal_healthiness);
	}

}
