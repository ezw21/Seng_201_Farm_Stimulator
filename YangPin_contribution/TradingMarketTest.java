package Game_Structure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TradingMarketTest {

	int energy = 3;
	int axe_durability = 5;
	int farmer_axe = 1;
	int farmer_gold = 100;
	int farmer_type = 1;

	int farmer_corn_feed = 5;
	int animal_healthiness = 14;
	boolean isFeed_animal = true;

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

	public void Trading() { // Sell and buy in trading market
//		Game_Profile.setProfit(0);;

		if (sell_1 == true && farmer_tomato >= 1) {
			farmer_gold += 90; // Update FarmerGold
			farmer_tomato --; // Update Farmer tomato
			profit += 90; // Update profit

			if (farmer_type == 2) { // Advantage of Engineer , Extra 30G for every crops
				farmer_gold += 30;
				profit += 30; // Update profit
			}
		} else {
			sell_1 = false;
		} // End of checkBox 1
		if (sell_2 == true && farmer_pumpkin >= 1) {
			farmer_gold += 140; // Update FarmerGold
			farmer_pumpkin --; // Update Farmer pumpkin
			profit += 140; // Update profit
			if (farmer_type == 2) { // Advantage of Engineer , Extra 30G for every crops
				farmer_gold += 30;
				profit += 30; // Update profit
			}
		} else {
			sell_2 = false;
		} // End of checkBox 2
		if (sell_3 == true && farmer_pea >= 1) {
			farmer_gold += 130; // Update FarmerGold
			farmer_pea--; // Update Farmer pea
			profit += 130; // Update profit
			if (farmer_type == 2) { // Advantage of Engineer , Extra 30G for every crops
				farmer_gold += 30;
				profit += 30; // Update profit
			}
		} else {
			sell_3 = false;
		} // End of checkBox 3
		if (sell_4 == true && farmer_lettuce >= 1) {
			farmer_gold += 70; // Update FarmerGold
			farmer_lettuce--; // Update Farmer lettuce
			profit += 70; // Update profit
			if (farmer_type == 2) { // Advantage of Engineer , Extra 30G for every crops
				farmer_gold += 30;
				profit += 30; // Update profit
			}
		} else {
			sell_4 = false;
		} // End of checkBox 4
		if (sell_5 == true && farmer_turnip >= 1) {
			farmer_gold += 210; // Update FarmerGold
			farmer_turnip--; // Update Farmer turnip
			profit += 210; // Update profit
			if (farmer_type == 2) { // Advantage of Engineer , Extra 30G for every crops
				farmer_gold += 30;
				profit += 30; // Update profit
			}
		} else {
			sell_5 = false;
		} // End of checkBox 5
		if (sell_6 == true && farmer_corn >= 1) {
			farmer_gold += 150; // Update FarmerGold
			farmer_corn--; // Update Farmer corn
			profit += 150; // Update profit
			if (farmer_type == 2) { // Advantage of Engineer , Extra 30G for every crops
				farmer_gold += 30;
				profit += 30; // Update profit
			}
		} else {
			sell_6 = false;
		} // End of checkBox 6

		// Strawberry is not invented yet

		if (sell_8 == true && animal_cow >= 1) {
			farmer_gold += 4500; // Update FarmerGold
			animal_cow --; // Update Farmer cow
			profit += 4500; // Update profit

		} else {
			sell_8 = false;
		} // End of checkBox 8
		if (sell_9 == true && animal_goat >= 1) {
			farmer_gold += 3000; // Update FarmerGold
			animal_goat--; // Update Farmer goat
			profit += 3000; // Update profit

		} else {
			sell_9 = false;
		} // End of checkBox 9
		if (sell_10 == true && animal_chicken >= 1) {
			farmer_gold += 1100; // Update FarmerGold
			animal_chicken--; // Update Farmer chicken
			profit += 1100; // Update profit

		} else {
			sell_10 = false;
		} // End of checkBox 10
		if (sell_11 == true && farmer_mask >= 1) {
			farmer_gold += 5; // Update FarmerGold
			farmer_mask --; // Update Farmer mask
			profit += 5; // Update profit

		} else {
			sell_11 = false;
		} // End of checkBox 11

		if (profit >= 400) {
			farmer_gold += 100;
//			System.out.println("<html>Good Work! " + farmer + "<br>"
//					+ "Heres another 100G for your bonus! [Receive bonus from KANG.] <br>"
//					+ "Profit of this crate = " + profit + 100));
		}
//		else if (Game_Profile.getProfit() == 0) {
//			setDialog("The Crate is EMPTY!");
//		}
//		else {
//		
//			setDialog("Profit of this crate = " + Game_Profile.getProfit());
//		}	// End of Sell Process
//			
//		Game_Profile.setProfit(0);													// Clear Profit after using it														
//		Inventory.UpdateInventory();															// Update Inventory
//		Barn.UpdateBarn();
// //End of selling action - 
//
//		Base_Component.UpdateStats();
	}

//	public void setDialog(String text) {
//		Base_Component.setDialog(text);
//	}


	@Test
	void testTrading() {
		TradingMarketTest test = new TradingMarketTest();
		test.Trading();
		assertEquals(0, test.farmer_tomato);
		assertEquals(4, test.animal_cow);
		assertEquals(9390, test.profit);
		assertEquals(9590, test.farmer_gold);
	}

	@Test
	void testTrading2() {
		TradingMarketTest test = new TradingMarketTest();
		test.farmer_type = 2;
		test.animal_cow = 3;
		test.Trading();
		assertEquals(0, test.farmer_tomato);
		assertEquals(2, test.animal_cow);
		assertEquals(9570, test.profit);
		assertEquals(9770, test.farmer_gold);
	}
	
	@Test
	void testTrading3() {
		TradingMarketTest test = new TradingMarketTest();
		test.farmer_type = 2;
		test.animal_cow = 3;
		test.sell_11 = true;
		test.farmer_mask = 1;
		test.Trading();
		assertEquals(0, test.farmer_tomato);
		assertEquals(2, test.animal_cow);
		assertEquals(9575, test.profit);
		assertEquals(9775, test.farmer_gold);
		assertEquals(0, test.farmer_mask);
	}

}
