package Game_Structure;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

/**
 * SuperMarket Class is implemented as a View class (Project is trying to approach to Model-view-controller design pattern)
 * This class implemented to display content of SuperMarket panel to the user and relays user command/action to the Controller. 
 * @author Edward Wong - University of Canterbury SENG_201 
 * 15/05/2020
 */
public class SuperMarket {
	
	// Init to get access of another class
	private JPanel JPanel;
	private Game_Profile Game_Profile;
	private Base_Component Base_Component;
	private Inventory Inventory;
	
	//Supermarket
	final JCheckBox chckbxItem_1 = new JCheckBox("[0] Tomato Seed $30");
	final JCheckBox chckbxItem_2 = new JCheckBox("[1] Pumpkin Seed $30");
	final JCheckBox chckbxItem_3 = new JCheckBox("[2] Pea Seed -  $60");
	final JCheckBox chckbxItem_4 = new JCheckBox("[3] Lettuce Seed -  $60");
	final JCheckBox chckbxItem_5 = new JCheckBox("[4] Turnip Seed -  $90");
	final JCheckBox chckbxItem_6 = new JCheckBox("[5] Corn Seed -  $90");
	final JCheckBox chckbxItem_7 = new JCheckBox("[6] Burger -  $60");
	final JCheckBox chckbxItem_8 = new JCheckBox("[7] Fertilizer -  $100");
	final JCheckBox chckbxItem_9 = new JCheckBox("[8] Relic Chair -  $210");
	final JCheckBox chckbxItem_10 = new JCheckBox("[9] Water Jar -  $150");
	final JCheckBox chckbxItem_11 = new JCheckBox("[10] Axe - $ 600");
	final JCheckBox chckbxItem_12 = new JCheckBox("[11] Mask - $15");
	
	final JLabel Brief_In_Shop = new JLabel("Info Format : Name (Day to Grow) (Sell Price) - Description");
	final JLabel Shop_Description = new JLabel();	
	JLabel Gold_IN_Shop = new JLabel();
	JLabel Product_Title = new JLabel("Product");
	
	//Button
	final JToggleButton Shop_Information = new JToggleButton();
	JButton Check_Cart_Total = new JButton();
	JButton Purchase = new JButton("PURCHASE");
	JButton clear_selection = new JButton();
	
	
	/**
	 * Construct game profile and upadate with access of other classes
	 * @param jPanel 			SuperMarket Panel
	 * @param game_Profile 		Access the data (model class) from Game_Profile
	 * @param base_Component	Access to update stats ,energy ,inventory
	 * @param inventory			Access Inventory panel for updating
	 */
	public SuperMarket(JPanel jPanel, Game_Structure.Game_Profile game_Profile, Base_Component base_Component,Inventory inventory ) {
		super();
		JPanel = jPanel;
		Game_Profile = game_Profile;
		Base_Component = base_Component;
		Inventory = inventory;
		
		initSuperMarket();		//init of all component
		init();					// add all component
	}
	
	/**
	 * Add component to SuperMarket panel
	 */
	private void init() {
		//Add SuperMarket component
		JPanel.add(Brief_In_Shop);
		JPanel.add(Shop_Description);
		JPanel.add(Gold_IN_Shop);
		JPanel.add(chckbxItem_1);
		JPanel.add(chckbxItem_2);
		JPanel.add(chckbxItem_3);
		JPanel.add(chckbxItem_4);
		JPanel.add(chckbxItem_5);
		JPanel.add(chckbxItem_6);
		JPanel.add(chckbxItem_7);
		JPanel.add(chckbxItem_8);
		JPanel.add(chckbxItem_9);
		JPanel.add(chckbxItem_10);
		JPanel.add(chckbxItem_11);
		JPanel.add(chckbxItem_12);
		JPanel.add(Check_Cart_Total);
		JPanel.add(Purchase);
		JPanel.add(Shop_Information);
		JPanel.add(clear_selection);

		
	}
	/**
	 * initSuperMarket including set fond, background, bounds, layout, Opaque, button, allignment
	 * Init component in SuperMarket panel design
	 */
	public void initSuperMarket() { 						//Init component in supermarket
		
		Check_Cart_Total.setText("CHECK TOTAL");
		Check_Cart_Total.setFont(new Font("Tahoma", Font.BOLD, 11));
		Check_Cart_Total.setBounds(365, 110, 112, 25);
		
		Purchase.setFont(new Font("Tahoma", Font.BOLD, 11));
		Purchase.setBounds(365, 150, 112, 25);
		
		JPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		JPanel.setBackground(new Color(100, 149, 237));
		JPanel.setLayout(null);
		JPanel.setOpaque(true);
		Product_Title.setBackground(new Color(165, 42, 42));
		Product_Title.setHorizontalAlignment(SwingConstants.CENTER);
		Product_Title.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		Product_Title.setBounds(10, 11, 120, 36);
		Product_Title.setOpaque(true);
		chckbxItem_1.setBackground(new Color(95, 158, 160));
		chckbxItem_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		chckbxItem_1.setBounds(20, 50, 170, 20);

		chckbxItem_2.setBackground(new Color(95, 158, 160));
		chckbxItem_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		chckbxItem_2.setBounds(20, 80, 170, 20);

		chckbxItem_3.setBackground(new Color(95, 158, 160));
		chckbxItem_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		chckbxItem_3.setBounds(20, 110, 170, 20);

		chckbxItem_4.setBackground(new Color(95, 158, 160));
		chckbxItem_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		chckbxItem_4.setToolTipText("");
		chckbxItem_4.setBounds(20, 140, 170, 20);

		chckbxItem_5.setBackground(new Color(95, 158, 160));
		chckbxItem_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		chckbxItem_5.setBounds(20, 170, 170, 20);

		chckbxItem_6.setBackground(new Color(95, 158, 160));
		chckbxItem_6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		chckbxItem_6.setBounds(20, 200, 170, 20);

		chckbxItem_7.setBackground(new Color(95, 158, 160));
		chckbxItem_7.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		chckbxItem_7.setBounds(187, 65, 170, 20);

		chckbxItem_8.setBackground(new Color(95, 158, 160));
		chckbxItem_8.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		chckbxItem_8.setBounds(187, 95, 170, 20);

		chckbxItem_9.setBackground(new Color(95, 158, 160));
		chckbxItem_9.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		chckbxItem_9.setBounds(187, 125, 170, 20);

		chckbxItem_10.setBackground(new Color(95, 158, 160));
		chckbxItem_10.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		chckbxItem_10.setBounds(187, 155, 170, 20);

		chckbxItem_11.setBackground(new Color(95, 158, 160));
		chckbxItem_11.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		chckbxItem_11.setBounds(187, 185, 170, 20);
	
		chckbxItem_12.setBackground(new Color(95, 158, 160));
		chckbxItem_12.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		chckbxItem_12.setBounds(187, 215, 170, 20);
		
		Brief_In_Shop.setBackground(new Color(255, 228, 225));
		Brief_In_Shop.setHorizontalAlignment(SwingConstants.CENTER);
		Brief_In_Shop.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		Brief_In_Shop.setBounds(140, 10, 420, 35);
		Brief_In_Shop.setOpaque(true);

		Shop_Description.setText(""
				+ "<html>Each seed can plant 9 crops.(Sell price is for each crop)<br>"
				+ "Tomato (2days) (90G)<br> - Can I make Ketchup from this?<br>"
				+ "Pumpkin (3days) (140G)<br> - Big Gold Pumpkin.<br>"
				+ "Pea (2days) (130G)<br>- Easy to plant!<br>"
				+ "Lettuce (1day) (70G) <br>- Can't fertilze this? Aw..<br>"
				+ "Turnip (3days) (210G)<br>- It can grow everywhere!<br>"
				+ "Corn (2days) (150G) <br>- Maybe I can use it somewhere else...");
		Shop_Description.setBackground(new Color(175, 238, 238));
		Shop_Description.setHorizontalAlignment(SwingConstants.CENTER);
		Shop_Description.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		Shop_Description.setBounds(480, 50, 223, 230);
		Shop_Description.setOpaque(true);
		
		Gold_IN_Shop.setText("GOLD = " + Game_Profile.getFarmer_gold());
		Gold_IN_Shop.setBackground(new Color(255, 165, 0));
		Gold_IN_Shop.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		Gold_IN_Shop.setHorizontalAlignment(SwingConstants.CENTER);
		Gold_IN_Shop.setBounds(571, 11, 133, 36);
		Gold_IN_Shop.setOpaque(true);
		
		Shop_Information.setText("INFO");
		Shop_Information.setFont(new Font("Tahoma", Font.BOLD, 11));
		Shop_Information.setBounds(365, 190, 112, 23);
		
		clear_selection.setText("Clear");
		clear_selection.setFont(new Font("Tahoma", Font.BOLD, 11));
		clear_selection.setBounds(365, 230, 112, 25);
		
		
		Check_Cart_Total.addActionListener(new ActionListener() {// Check cart total
			
			// Shop - Cart Checking
			public void actionPerformed(ActionEvent e) { 
				checkCart();															//End of Cart check
			}}); 																		// End of Action listener
		Purchase.addActionListener(new ActionListener() {	// Shop - Cart Checking & Purchase
			 
			public void actionPerformed(ActionEvent e) {
				purchase();
			} // End of Action Performed
		}); // End of Action Listener
		Shop_Information.addActionListener(new ActionListener() {	//show supermarket product info
			public void actionPerformed(ActionEvent arg0) {							 	
				shop_information();												// End of INFO (Shop)
				
			}// End of Action Performed
			}); // End of Action Listener
		clear_selection.addActionListener(new ActionListener() { //clear selection in supermarket
			public void actionPerformed(ActionEvent e) {
				cartClear();}});											
	}
	/**
	 * purchase Set of action after user select item and perform purchasing
	 */
	public void purchase() {																		//Purchasing in supermarket algorithm
		// Cart_Process
		
		int my_cart_total = Game_Profile.getCart_total();
		my_cart_total = checkCart();				 												// Get cart total by using checkCart Method
		
		/*
		 * Checkbox item list {chckbxItem_1 : chckbxItem_12}
		 * {tomato seed, pumpkin seed, pea seed, lettuce seed, turnip seed, corn seed,
		 * Burger, Fertilizer, Relic chair, Water Jar, Axe, Mask}
		 */
		
		// Purchase process
		int my_current_gold = Game_Profile.getFarmer_gold();										//Use my_current_gold to hold farmer_gold
		
		if (my_current_gold >= my_cart_total) {														// Check is Gold sufficient to buy cart_items
			if (chckbxItem_1.isSelected()) {
				
				Game_Profile.setFarmer_tomato_seed(Game_Profile.getFarmer_tomato_seed() + 1);		//Update farmer tomato seed
				my_current_gold -= Game_Profile.getPrice_tomato_seed();								// GOLD - Price

			}// [1]
			if (chckbxItem_2.isSelected()) {
				
				Game_Profile.setFarmer_pumpkin_seed(Game_Profile.getFarmer_pumpkin_seed() + 1);		//Update farmer pumpkin seed
				my_current_gold -= Game_Profile.getPrice_pumpkin_seed();							// GOLD - Price
			}// [2]
			if (chckbxItem_3.isSelected()) {
				
				Game_Profile.setFarmer_pea_seed(Game_Profile.getFarmer_pea_seed() + 1);				//Update farmer pea seed
				my_current_gold -= Game_Profile.getPrice_pea_seed();								// GOLD - Price
			}// [3]
			if (chckbxItem_4.isSelected()) {
				
				Game_Profile.setFarmer_lettuce_seed(Game_Profile.getFarmer_lettuce_seed() + 1);		//Update farmer lettuce seed
				my_current_gold -= Game_Profile.getPrice_lettuce_seed();							// GOLD - Price
			}// [4]
			if (chckbxItem_5.isSelected()) {
				
				Game_Profile.setFarmer_turnip_seed(Game_Profile.getFarmer_turnip_seed() + 1);		//Update farmer turnip seed
				my_current_gold -= Game_Profile.getPrice_turnip_seed();								// GOLD - Price
			}// [5]
			if (chckbxItem_6.isSelected()) {
				
				Game_Profile.setFarmer_corn_seed(Game_Profile.getFarmer_corn_seed() + 1);			//Update farmer corn seed
				my_current_gold -= Game_Profile.getPrice_corn_seed();								// GOLD - Price
			}// [6]
			if (chckbxItem_7.isSelected()) {
				Game_Profile.setFarmer_burger(Game_Profile.getFarmer_burger() + 1);					//Update farmer burger 
				my_current_gold -= Game_Profile.getPrice_burger();									// GOLD - Price
			}// [7]
			if (chckbxItem_8.isSelected()) {
				
				Game_Profile.setFarmer_fertilizer(Game_Profile.getFarmer_fertilizer() + 1);			//Update farmer fertilizer 
				my_current_gold -= Game_Profile.getPrice_fertilizer();								// GOLD - Price
			}// [8]
			if (chckbxItem_9.isSelected()) {
				
				Game_Profile.setFarmer_relic_chair(Game_Profile.getFarmer_relic_chair() + 1);		//Update farmer relic_chair 
				my_current_gold -= Game_Profile.getPrice_relic_chair();								// GOLD - Price
			}// [9]
			if (chckbxItem_10.isSelected()) {
				
				Game_Profile.setFarmer_water_jar(Game_Profile.getFarmer_water_jar() + 1);			//Update farmer water_jar 
				my_current_gold -= Game_Profile.getPrice_water_jar();								// GOLD - Price
			}// [10]
			if (chckbxItem_11.isSelected()) {
				
				Game_Profile.setFarmer_axe(Game_Profile.getFarmer_axe() + 1);						//Update farmer axe 
				my_current_gold -= Game_Profile.getPrice_axe();										// GOLD - Price
			}// [11]
			if (chckbxItem_12.isSelected()) {
				
				Game_Profile.setFarmer_mask(Game_Profile.getFarmer_mask() + 1);						//Update farmer mask 
				my_current_gold -= Game_Profile.getPrice_mask();									// GOLD - Price
			}// [12]
			setDialog("<html> Thanks ! " + Game_Profile.getFarmer_name() + ""														//Display message after purchase
					+ "<br>Hanli : The purchased item will be sent to your Farm.<br> [Gold deduct = " + my_cart_total + "]") ;
			
			
			Game_Profile.setFarmer_gold(my_current_gold);											// Update Farmer_GOLD
			Inventory.UpdateInventory();															// Update inventory
			Gold_IN_Shop.setText("GOLD = " + Game_Profile.getFarmer_gold());						// Update GOLD Bag in Shop
			Base_Component.UpdateStats();															//Update Stats
		}
		else {
			setDialog("<html> ... ... [beep beep beep] <br>"										//Display error message
					+ "Transaction declined.<br>"
					+ "Hanli: Check your GOLD before you come into my shop!");
		}
		
	}
	/**
	 * checkCart check the total amount of selected item
	 * @return cart total to display or purchase
	 */	
	public int checkCart() {																	//Check card method for supermarket
		int my_cart_total = Game_Profile.getCart_total();
		
		if (chckbxItem_1.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_tomato_seed();								//Cart total + Item price
		}// [1]
		if (chckbxItem_2.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_pumpkin_seed();								//Cart total + Item price
		}// [2]
		if (chckbxItem_3.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_pea_seed();									//Cart total + Item price
		}// [3]
		if (chckbxItem_4.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_lettuce_seed();								//Cart total + Item price
		}// [4]
		if (chckbxItem_5.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_turnip_seed();								//Cart total + Item price
		}// [5]
		if (chckbxItem_6.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_corn_seed();									//Cart total + Item price
		}// [6]
		if (chckbxItem_7.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_burger();									//Cart total + Item price
		}// [7]
		if (chckbxItem_8.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_fertilizer();								//Cart total + Item price
		}// [8]
		if (chckbxItem_9.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_relic_chair();								//Cart total + Item price
		}// [9]
		if (chckbxItem_10.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_water_jar();									//Cart total + Item price
		}// [10]
		if (chckbxItem_11.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_axe();										//Cart total + Item price
		}// [11]
		if (chckbxItem_12.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_mask();										//Cart total + Item price
		}// [12]
		setDialog("Your current Cart total = " + my_cart_total);								//display cart total message
		
		return my_cart_total;
	}
	/**
	 * shop_information 2 set of Info switching when the toggle button is pressed
	 */
	public void shop_information() {															// Show supermarket product info

		if (Shop_Information.isSelected()) {													//Toggle button is pressed
			//Switching Label colour
			Brief_In_Shop.setBackground(new Color(175, 238, 238)); 								// Blue
			Shop_Description.setBackground(new Color(255, 228, 225)); 							// Pink
			Brief_In_Shop.setText("Info Format : Name - Description");
			Shop_Description.setText(""
					+ "<html> Burger - Recover one Energy YUM YUM!! (TWICE per day)<br><br>"
					+ "Fertilizer - You can irrigate after fertilzing!<br> Consume one Energy. (ONCE per day)<br>"
					+ "Relic chair - A mysterious chair that let you rest... (Once per day)<br>"
					+ "Water Jar - I guess it can carry some juice?<br><br>"
					+ "Axe - Chop lumber and sell it for 330$.<br> Consume one Energy (ONCE per day)<br>"
					+ "Mask - Why??  Why Not??");
		}else {
			// Switching Label colour
			Brief_In_Shop.setBackground(new Color(255, 228, 225));								// Pink
			Shop_Description.setBackground(new Color(175, 238, 238)); 							// Blue
			Brief_In_Shop.setText("Info Format : Name (Day to Grow) (Profit) - Description");
			Shop_Description.setText(""
					+ "<html>Each seed can plant 9 crops.<br>"
					+ "Tomato (2days) (90G each)<br> - Can I make Ketchup from this?<br>"
					+ "Pumpkin (3days) (140eachG)<br> - Big Gold Pumpkin.<br>"
					+ "Pea (2days) (130G)<br>- Easy to plant!<br>"
					+ "Lettuce (1day) (70G) <br>- Can't fertilze this? Aw..<br>"
					+ "Turnip (3days) (210G)<br>- It can grow everywhere!<br>"
					+ "Corn (2days) (150G) <br>- Maybe I can use it somewhere else...");
			}
		
	}
	/**
	 * cartClear allow user to use Clear button to unselect all selected box
	 */
	public void cartClear() { 									//Clear cart algorithm for supermarket
		chckbxItem_1.setSelected(false);
		chckbxItem_2.setSelected(false);
		chckbxItem_3.setSelected(false);
		chckbxItem_4.setSelected(false);
		chckbxItem_5.setSelected(false);
		chckbxItem_6.setSelected(false);
		chckbxItem_7.setSelected(false);
		chckbxItem_8.setSelected(false);
		chckbxItem_9.setSelected(false);
		chckbxItem_10.setSelected(false);
		chckbxItem_11.setSelected(false);
		chckbxItem_12.setSelected(false);
		// End of CLEAR (Supermarket)
	}
	
	public void setDialog(String text) {
		Base_Component.setDialog(text);
	}
	
}
