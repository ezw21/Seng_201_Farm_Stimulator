package Game_Structure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SuperMarketTest {

	String farmer_name = "steve";
	int energy = 3;
	int axe_durability = 5;
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

	int my_cart_total = 0;
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

	boolean sell_11 = false;

	int farmer_tomato_seed = 0;
	int price_tomato_seed = 2;
	boolean chckbxItem_1 = false;

	int farmer_pumpkin_seed = 0;
	int price_pumpkin_seed = 2;
	boolean chckbxItem_2 = false;

	int farmer_pea_seed = 0;
	int price_pea_seed = 2;
	boolean chckbxItem_3 = false;

	int farmer_lettuce_seed = 0;
	int price_lettuce_seed = 2;
	boolean chckbxItem_4 = false;

	int farmer_turnip_seed = 0;
	int price_turnip_seed = 2;
	boolean chckbxItem_5 = false;

	int farmer_corn_seed = 0;
	int price_corn_seed = 2;
	boolean chckbxItem_6 = false;

	int farmer_burger = 0;
	int price_burger = 2;
	boolean chckbxItem_7 = false;

	int farmer_fertilizer = 0;
	int price_fertilizer = 2;
	boolean chckbxItem_8 = false;

	int farmer_relic_chair = 0;
	int price_relic_chair = 2;
	boolean chckbxItem_9 = false;

	int farmer_water_jar = 0;
	int price_water_jar = 2;
	boolean chckbxItem_10 = false;

	int farmer_axe = 0;
	int price_axe = 2;
	boolean chckbxItem_11 = false;

	int farmer_mask = 0;
	int price_mask = 2;
	boolean chckbxItem_12 = false;

	public void purchase() { // Purchasing in supermarket algorithm
		// Cart_Process
		System.out.println("");
		my_cart_total = 0;

		my_cart_total = checkCart();

		// Purchase process
//		int my_current_gold = Game_Profile.getFarmer_gold();

		if (farmer_gold >= my_cart_total) { // Check is Gold sufficient to buy cart_items
			if (chckbxItem_1 == true) {

				farmer_tomato_seed += 1; // Update farmer tomato seed
				farmer_gold -= price_tomato_seed;

			} // [1]
			if (chckbxItem_2 == true) {

				farmer_pumpkin_seed += 1; // Update farmer pumpkin seed
				farmer_gold -= price_pumpkin_seed;

			} // [2]
			if (chckbxItem_3 == true) {

				farmer_pea_seed += 1; // Update farmer pea seed
				farmer_gold -= price_pea_seed;

			} // [3]
			if (chckbxItem_4 == true) {

				farmer_lettuce_seed += 1; // Update farmer lettuce seed
				farmer_gold -= price_lettuce_seed;

			} // [4]
			if (chckbxItem_5 == true) {

				farmer_turnip_seed += 1; // Update farmer turnip seed
				farmer_gold -= price_turnip_seed;

			} // [5]
			if (chckbxItem_6 == true) {

				farmer_corn_seed += 1; // Update farmer corn seed
				farmer_gold -= price_corn_seed;

			} // [6]
			if (chckbxItem_7 == true) {

				farmer_burger += 1; // Update farmer burger
				farmer_gold -= price_burger;

			} // [7]
			if (chckbxItem_8 == true) {

				farmer_fertilizer += 1; // Update farmer fertilizer
				farmer_gold -= farmer_fertilizer;

			} // [8]
			if (chckbxItem_9 == true) {

				farmer_relic_chair += 1; // Update farmer relic chair
				farmer_gold -= price_relic_chair;

			} // [9]
			if (chckbxItem_10 == true) {

				farmer_water_jar += 1; // Update farmer water jar
				farmer_gold -= price_water_jar;

			} // [10]
			if (chckbxItem_11 == true) {

				farmer_axe += 1; // Update farmer axe
				farmer_gold -= price_axe;

			} // [11]
			if (chckbxItem_12 == true) {

				farmer_mask += 1; // Update farmer mask
				farmer_gold -= price_mask;

			} // [12]
			System.out.println("<html> Thanks ! " + farmer_name + ""
					+ "<br>Hanli : The purchased item will be sent to your Farm.<br> [Gold deduct = " + my_cart_total
					+ "]");

//			Game_Profile.setFarmer_gold(my_current_gold); // Update Farmer_GOLD
//			Inventory.UpdateInventory(); // Update inventory
//			Gold_IN_Shop.setText("GOLD = " + Game_Profile.getFarmer_gold()); // Update GOLD Bag in Shop
//			Base_Component.UpdateStats();
		}

//		else {
//			System.out.println("<html> ... ... [beep beep beep] <br>" + "Transaction declined.<br>"
//					+ "Hanli: Check your GOLD before you come into my shop!");
//		}

	}

	public int checkCart() { // Check card method for supermarket
//		int my_cart_total = Game_Profile.getCart_total();

		if (chckbxItem_1 == true) {

			my_cart_total += price_tomato_seed;
		} // [1]
		if (chckbxItem_2 == true) {

			my_cart_total += price_pumpkin_seed;
		} // [2]
		if (chckbxItem_3 == true) {

			my_cart_total += price_pea_seed;
		} // [3]
		if (chckbxItem_4 == true) {

			my_cart_total += price_lettuce_seed;
		} // [4]
		if (chckbxItem_5 == true) {

			my_cart_total += price_turnip_seed;
		} // [5]
		if (chckbxItem_6 == true) {

			my_cart_total += price_corn_seed;
		} // [6]
		if (chckbxItem_7 == true) {

			my_cart_total += price_burger;
		} // [7]
		if (chckbxItem_8 == true) {

			my_cart_total += price_fertilizer;
		} // [8]
		if (chckbxItem_9 == true) {

			my_cart_total += price_relic_chair;
		} // [9]
		if (chckbxItem_10 == true) {

			my_cart_total += price_water_jar;
		} // [10]
		if (chckbxItem_11 == true) {

			my_cart_total += price_axe;
		} // [11]
		if (chckbxItem_12 == true) {

			my_cart_total += price_mask;
		} // [12]
		System.out.println("Your current Cart total = " + my_cart_total);

		return my_cart_total;
	}

//	
//	public void shop_information() {							// Show supermarket product info
//
//		if (Shop_Information.isSelected()) {	
//			//Switching Label colour
//			Brief_In_Shop.setBackground(new Color(175, 238, 238)); // Blue
//			Shop_Description.setBackground(new Color(255, 228, 225)); // Pink
//			Brief_In_Shop.setText("Info Format : Name - Description");
//			Shop_Description.setText(""
//					+ "<html> Burger - Recover one Energy YUM YUM!! (TWICE per day)<br><br>"
//					+ "Fertilizer - You can irrigate after fertilzing!<br> Consume one Energy. (ONCE per day)<br>"
//					+ "Relic chair - A mysterious chair that let you rest... (Once per day)<br>"
//					+ "Water Jar - I guess it can carry some juice?<br><br>"
//					+ "Axe - Chop lumber and sell it for 330$.<br> Consume one Energy (ONCE per day)<br>"
//					+ "Mask - Why??  Why Not??");
//		}else {
//			// Switching Label colour
//			Brief_In_Shop.setBackground(new Color(255, 228, 225));	// Pink
//			Shop_Description.setBackground(new Color(175, 238, 238)); // Blue
//			Brief_In_Shop.setText("Info Format : Name (Day to Grow) (Profit) - Description");
//			Shop_Description.setText(""
//					+ "<html>Each seed can plant 9 crops.<br>"
//					+ "Tomato (2days) (90G each)<br> - Can I make Ketchup from this?<br>"
//					+ "Pumpkin (3days) (140eachG)<br> - Big Gold Pumpkin.<br>"
//					+ "Pea (2days) (130G)<br>- Easy to plant!<br>"
//					+ "Lettuce (1day) (70G) <br>- Can't fertilze this? Aw..<br>"
//					+ "Turnip (3days) (210G)<br>- It can grow everywhere!<br>"
//					+ "Corn (2days) (150G) <br>- Maybe I can use it somewhere else...");
//			}
//		
//	}

//	public void cartClear() { 								//Clear cart algorithm for supermarket
//		chckbxItem_1.setSelected(false);
//		chckbxItem_2.setSelected(false);
//		chckbxItem_3.setSelected(false);
//		chckbxItem_4.setSelected(false);
//		chckbxItem_5.setSelected(false);
//		chckbxItem_6.setSelected(false);
//		chckbxItem_7.setSelected(false);
//		chckbxItem_8.setSelected(false);
//		chckbxItem_9.setSelected(false);
//		chckbxItem_10.setSelected(false);
//		chckbxItem_11.setSelected(false);
//		chckbxItem_12.setSelected(false);
//		// End of CLEAR (Supermarket)
//	}
//	

	@Test
	void testCheckCart() {
		SuperMarketTest test = new SuperMarketTest();
		test.my_cart_total = 0;
		test.chckbxItem_1 = false;
		test.chckbxItem_2 = false;
		test.chckbxItem_3 = false;
		test.chckbxItem_4 = true;
		test.chckbxItem_5 = false;
		test.chckbxItem_6 = false;
		test.chckbxItem_7 = true;
		test.chckbxItem_8 = false;
		test.chckbxItem_9 = false;
		test.checkCart();
		assertEquals(4, test.my_cart_total);
	}
		
	@Test
	void testPurchase() {
		SuperMarketTest test1 = new SuperMarketTest();
//		test1.my_cart_total = 0;
		test1.farmer_gold = 90;
		test1.chckbxItem_1 = false;
		test1.chckbxItem_2 = false;
		test1.chckbxItem_3 = false;
		test1.chckbxItem_4 = true;
		test1.chckbxItem_5 = false;
		test1.chckbxItem_6 = false;
		test1.chckbxItem_7 = true;
		test1.chckbxItem_8 = false;
		test1.chckbxItem_9 = false;
		test1.checkCart();
		test1.purchase();
		assertEquals(4, test1.my_cart_total);
		assertEquals(86, test1.farmer_gold);
		assertEquals(1, test1.farmer_lettuce_seed);
		assertEquals(1, test1.farmer_burger);
	}
	
	@Test
	void testPurchase2() {
		SuperMarketTest test1 = new SuperMarketTest();
//		test1.my_cart_total = 0;
		test1.farmer_gold = 0;
		test1.chckbxItem_1 = true;
		test1.chckbxItem_2 = true;
		test1.chckbxItem_3 = true;
		test1.chckbxItem_4 = true;
		test1.chckbxItem_5 = false;
		test1.chckbxItem_6 = false;
		test1.chckbxItem_7 = true;
		test1.chckbxItem_8 = false;
		test1.chckbxItem_9 = false;
		test1.checkCart();
		test1.purchase();
		assertEquals(10, test1.my_cart_total);
		assertEquals(0, test1.farmer_gold);
		assertEquals(0, test1.farmer_lettuce_seed);
		assertEquals(0, test1.farmer_burger);
	}
		



}
