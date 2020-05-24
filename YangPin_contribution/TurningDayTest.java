package Game_Structure;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TurningDayTest {

//	private Game_Profile Game_Profile;
//	private Base_Component  Base_Component;
//	private Barn Barn;
//	private Controller Controller;
//	private Inventory Inventory;
//	
//	public TurningDay(Game_Structure.Game_Profile game_Profile, Base_Component  base_Component, Barn barn, Controller controller,Inventory inventory ) {
//		super();
//		Game_Profile = game_Profile;
//		Base_Component = base_Component;
//		Barn = barn;
//		Controller = controller;
//		Inventory = inventory;
//	}
//
//	public void setDialog(String text) {
//		Base_Component.setDialog(text);
//	}
//	
	String farmer_name = "steve";
	int energy = 3;
	int axe_durability = 5;
	int farmer_axe = 1;
	int farmer_gold = 100;
	int farmer_type = 1;

	int farmer_corn_feed = 5;
	int animal_healthiness = 14;
	boolean isFeed_animal = true;

	int end_day = 2;
	int day_num = 2;
	int relic_aura = 3;
	boolean rest = true;

	int eat_burger = 1;
	int farmer_burger = 1;
	
	int my_cart_total;
	int profit = 0;

	int farmer_tomato = 1;
	boolean sell_1 = true;

	int farmer_pumpkin = 1;
	boolean sell_2 = true;

	int farmer_pea = 1;
	boolean sell_3 = true;

	int farmer_lettuce = 1;
	boolean sell_4 = true;

	int farmer_turnip = 1;
	boolean sell_5 = true;

	int farmer_corn = 1;
	boolean sell_6 = true;

	int animal_cow = 5;
	boolean sell_8 = true;

	int animal_goat = 5;
	boolean sell_9 = true;

	int animal_chicken = 5;
	boolean sell_10 = true;

	int farmer_mask = 5;
	boolean sell_11 = false;

	public void NextDay() { // going into nextday
		if (end_day > 1) {
			end_day--; // Game contract day -1 (day closer to end)
			day_num++; // Day num + 1
			farmer_gold += 1000; // Daily 1000 allowance
			if ((animal_cow >= 1) || (animal_goat >= 1) || (animal_chicken >= 1)) {
				animal_healthiness--; // Animal health - 1 daily
			}

//			// Update & Refresh ALL STATUS
//			Game_Profile.setFeed_animal(true);
//			Game_Profile.setFarmer_energy(3);
//			Game_Profile.setWatering(true);
//			Game_Profile.setRest(true);
//			Game_Profile.setEat_burger(2);
//			Game_Profile.setFertilizing(true);
//			
//			//Daily bonus and message	(May trigger hidden event)
//			Controller.FarmerType_advantage();																		//Provide advantage to farmer base on farmer_type
//			Controller.AnimalAllowance();																						//daily bonus from animal cocunt * happiness
//			Controller.MorningMessage();
//			HiddenEvent();
//			updateAll();
		}
	}
	public void randomEvent() {
		if (end_day == 2) {														//Happens the day before ending
			
			int random_case = testRandom();

			if (farmer_tomato >= 3 && random_case == 0) {													//random case 1 - Cooking contest Chef need tomato
				farmer_gold += 1500;						// Sell 3 tomato for 1500G
				farmer_tomato -= 3;						// Sold 3 tomato
				System.out.println("<html>Hi " + farmer_name + ".<br>I need 3 fresh tomato for a cooking contest. Do you have any in your inventory?<br>"
						+ "Yes? That's cool! As a return I will pay you 1500G.<br> Passed 3 tomato to Mr Qun. [Tomato - 3 , +1500G] ");
			}else {
				System.out.println("<html>Hi " + farmer_name + ".<br>I need 3 fresh tomato for a cooking contest. Do you have any in your inventory?<br>"
						+ "NO? Aw... What kind of farmer dont plant tomato..zzZ <br> Mr Qun left. ");
			}
			
			if (animal_chicken >= 1 && animal_cow >= 1 && random_case == 1) {		//random case_2 = The Wolf
				System.out.println("<html> A wolf sneaked into the barn last night!!<br> The mighty Cow protected the chicken. <br>What a great job!!");
				
			} else if (animal_chicken >= 1 && random_case == 1) {
				animal_chicken --;					// chicken was stolen by wolf
				animal_healthiness = 0;													// Animal was scared, happiness = 0 (only affect 1 bonus allowance in the last day of game)
				System.out.println("<html> A wolf sneaked into the barn last night!!<br> The chicken, the poor chicken was gone.... <br>[Chicken - 1, Animal happiness = 0]");
			} else if (animal_chicken >= 0 && animal_cow >= 0 && random_case == 1) {
				System.out.println("<html> A wolf sneaked into the barn last night!!<br> Nothing happens... HAHAHA");
			}
			
			if (random_case == 2) {																							//random case 3 - Mysterious berry
				energy += 3;
				System.out.println("<html> Who are you?!! <br>Receive mysterious power berry from mysterious person.<br> [Energy + 3] ");
			}
		}
	}
	
	
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
	
	
	public void HiddenEvent() { // Hidden event in game
		if (relic_aura == 3 && end_day != 1) {
			System.out.println(
					"<html>We heard that you have a vintage relic chair, can we rent it for a museum exihbition?<br>"
							+ "...<br>Yes?? Good to hear that! We will pay you 2000G in return.<br> [+2000G]");
			farmer_gold += 2000; // Update farmer gold
			rest = false; // Cant rest for the day
//			Base_Component.UpdateStats();
		}
	}

	public void endDay() {
		if (farmer_mask > 20) {							//Limit of mask bonus = 20
			farmer_mask = 20;
		}
		farmer_gold = (farmer_gold + animal_cow * 13500 + animal_goat * 9000 + animal_chicken * 3300 + farmer_mask * 300);					//Calculate final sumup with bonus (mask hidden event) 
		
		
		System.out.println("<html>Well done " + farmer_name +" Your farm looks GREAT!<br>"							//Greet
				
				+ "So you have: " + animal_cow + " Cow, " + animal_goat + " Goat, "				//Show counting bonus to player
						+ "" + animal_chicken + " Chicken, " + farmer_mask + " Mask. "
						
						+ "That will brings you " + animal_cow * 13500 + "G " 								//Show user the amount of bonus
								+ animal_goat * 9000 + "G " + animal_chicken * 3300 + "G " + farmer_mask * 300 + " G. <br>"
										
								+ "And your total GOLD will now become " + farmer_gold + "<br>"					//Show Actual gold amount
								
												+ "Thanks for playing! You can now call yourself a Real FARMER!!! [End Game]");				//Thanks & let user know game is end
//		Barn.updateAll();																													//Update stats, for player to check gold
	}

	public void eatBurger() { // Eat burger actions
		if (eat_burger <= 1 && farmer_burger >= 1) { // Check not allow to eat 3rd time a day
			eat_burger++; // Update daily eat frequent
			farmer_burger--; // Update burger amount
			energy++; // Update Energy
			System.out.println("<html>Yummy, bacon egg mayo is love! I feel stronger!!" // Display effect tp user
					+ "<br> [Energy + 1]");
//			Inventory.UpdateInventory();																	// Update Inventory
//			Base_Component.UpdateEnergy();																		//Update Energy lv
		} else {
			System.out.println("I'm too full to eat again.");
		}
	}

//	public void updateAll() {
//		Base_Component.UpdateEnergy();
//		Base_Component.UpdateStats();
//		Inventory.UpdateInventory();
//		Barn.UpdateBarn();
//	}

	@Test
	void testNextDay() {
		TurningDayTest test = new TurningDayTest();
		test.NextDay();
		assertEquals(1, test.end_day);
		assertEquals(3, test.day_num);
		assertEquals(1100, test.farmer_gold);
		assertEquals(13, test.animal_healthiness);
	}

	@Test
	void testHiddenEvent() {
		TurningDayTest test = new TurningDayTest();
		test.HiddenEvent();
		assertEquals(2100, test.farmer_gold);
	}
	
	@Test
	void testEatBurger() {
		TurningDayTest test = new TurningDayTest();
		test.eatBurger();
		assertEquals(2, test.eat_burger);
		assertEquals(0, test.farmer_burger);
		assertEquals(4, test.energy);
	
	}
	
	
	@Test
	void testRandomEvent() {
		TurningDayTest test = new TurningDayTest();
		test.randomEvent();
		assertEquals(1, test.farmer_tomato);
		assertEquals(5, test.animal_cow);
		assertEquals(14, test.animal_healthiness);
		assertEquals(100, test.farmer_gold);
		assertEquals(5, test.farmer_mask);
	}
	
	@Test
	void testEndDay() {
		TurningDayTest test = new TurningDayTest();
		test.farmer_mask = 21;
		test.endDay();
		assertEquals(135100, test.farmer_gold);
		assertEquals(20, test.farmer_mask);
	}
}
