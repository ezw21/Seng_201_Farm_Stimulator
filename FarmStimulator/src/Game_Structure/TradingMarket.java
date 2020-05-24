package Game_Structure;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
/**
 * TradingMarket Class is implemented as a View class (Project is trying to approach to Model-view-controller design pattern)
 * This class contain the View design and button action of this Panel - Barn
 * @author Edward Wong - University of Canterbury SENG_201 
 * 19/05/2020
 */
public class TradingMarket {
	//Init Object & component in TradingMarket Panel
	private JPanel JPanel;
	private Game_Profile Game_Profile;
	private Base_Component Base_Component;
	private Inventory Inventory;
	private Barn Barn;
	
	//Trade Market
	final JCheckBox sell_1 = new JCheckBox("");
	final JCheckBox sell_2 = new JCheckBox("");
	final JCheckBox sell_3 = new JCheckBox("");
	final JCheckBox sell_4 = new JCheckBox("");
	final JCheckBox sell_5 = new JCheckBox("");
	final JCheckBox sell_6 = new JCheckBox("");
	final JCheckBox sell_7 = new JCheckBox("");
	final JCheckBox sell_8 = new JCheckBox("");
	final JCheckBox sell_9 = new JCheckBox("");
	final JCheckBox sell_10 = new JCheckBox("");
	final JCheckBox sell_11 = new JCheckBox("");
	final JCheckBox sell_12 = new JCheckBox("");
	final JCheckBox sell_13 = new JCheckBox("");
	final JCheckBox sell_14 = new JCheckBox("");
	final JCheckBox sell_15 = new JCheckBox("");
	final JCheckBox sell_16 = new JCheckBox("");
	
	final JButton btn_cow = new JButton("9000G");
	final JButton btn_goat = new JButton("6000G");
	final JButton btn_chicken = new JButton("2200G");
	JButton btn_corn_feed = new JButton("15G");
	JButton expand_farm = new JButton("Expand farm 2000G");
	
	//Trade Market label
	JLabel Buy_lbl = new JLabel("Buy");
	JLabel Sell_lbl = new JLabel("Sell");
	JLabel Trade_Market_Character = new JLabel("Trader Picture");
	JButton Sell_btn = new JButton("Sell");
	JLabel sell_tomato = new JLabel("New label");
	JLabel sell_pumpkin = new JLabel("New label");
	JLabel sell_pea = new JLabel("New label");
	JLabel sell_lettuce = new JLabel("New label");
	JLabel sell_turnip = new JLabel("New label");
	JLabel sell_corn = new JLabel("New label");
	JLabel sell_strawberry = new JLabel("New label");
	JLabel sell_cow = new JLabel("New label");
	JLabel sell_goat = new JLabel("New label");
	JLabel sell_chicken = new JLabel("New label");
	JLabel sell_mask = new JLabel("New label");
	JLabel Hidden_item_1 = new JLabel("New label");
	JLabel Hidden_item_2 = new JLabel("New label");
	JLabel Hidden_item_3 = new JLabel("New label");
	JLabel Hidden_item_4 = new JLabel("New label");
	JLabel Hidden_item_5 = new JLabel("New label");
	
	/**
	 * Construct game profile and upadte with access of other classes
	 * @param jPanel			TradingMarket Panel
	 * @param game_Profile		Access the data (model class) from Game_Profile
	 * @param base_Component	Access to update stats ,energy ,inventory
	 * @param inventory			Access Inventory for updating
	 * @param barn				Access to allow update barn
	 */
	public TradingMarket(JPanel jPanel, Game_Structure.Game_Profile game_Profile, Base_Component base_Component,Inventory inventory, Barn barn ) {
		super();
		JPanel = jPanel;
		Game_Profile = game_Profile;
		Base_Component = base_Component;
		Inventory = inventory;
		Barn = barn;
	
		initTradingMarket();		// init all component
		init();						// add all component
	}
	

	/**
	 * Add component to TradingMarket panel
	 */
	private void init() {
		//Tradin Market
				JPanel.add(Buy_lbl);
				JPanel.add(Sell_lbl);
				JPanel.add(Trade_Market_Character);
				JPanel.add(sell_1);
				JPanel.add(sell_2);
				JPanel.add(sell_3);
				JPanel.add(sell_4);
				JPanel.add(sell_5);
				JPanel.add(sell_6);
				JPanel.add(sell_7);
				JPanel.add(sell_8);
				JPanel.add(sell_9);
				JPanel.add(sell_10);
				JPanel.add(sell_11);
				JPanel.add(sell_12);
				JPanel.add(sell_13);
				JPanel.add(sell_14);
				JPanel.add(sell_15);
				JPanel.add(sell_16);
				JPanel.add(Sell_btn);
				JPanel.add(sell_tomato);
				JPanel.add(sell_pumpkin);
				JPanel.add(sell_pea);
				JPanel.add(sell_lettuce);
				JPanel.add(sell_turnip);
				JPanel.add(sell_corn);
				JPanel.add(sell_strawberry);
				JPanel.add(sell_cow);
				JPanel.add(sell_goat);
				JPanel.add(sell_chicken);
				JPanel.add(sell_mask);
				JPanel.add(Hidden_item_1);
				JPanel.add(Hidden_item_2);
				JPanel.add(Hidden_item_3);
				JPanel.add(Hidden_item_4);
				JPanel.add(Hidden_item_5);
				JPanel.add(btn_cow);
				JPanel.add(btn_goat);
				JPanel.add(btn_chicken);
				JPanel.add(btn_corn_feed);
				JPanel.add(expand_farm);
	}
	/**
	 * initTradingMarket including set fond, background, bounds, layout, Opaque, button, allignment
	 * Init component in TradingMarket panel design
	 */
	public void initTradingMarket() {						//Init component in trading market panel
		Sell_btn.setFont(new Font("Tahoma", Font.BOLD, 11));
		Buy_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		Buy_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Buy_lbl.setBounds(514, 11, 200, 40);
		Sell_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		Sell_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Sell_lbl.setBounds(10, 11, 200, 40);
		Trade_Market_Character.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/character.png")));
		Trade_Market_Character.setHorizontalAlignment(SwingConstants.CENTER);
		Trade_Market_Character.setBounds(210, 0, 304, 262);
		sell_1.setBounds(38, 58, 32, 32);
		sell_2.setBounds(38, 90, 32, 32);
		sell_3.setBounds(38, 122, 32, 32);
		sell_4.setBounds(38, 154, 32, 32);
		sell_5.setBounds(38, 186, 32, 32);
		sell_6.setBounds(38, 218, 32, 32);
		sell_7.setEnabled(false);
		sell_7.setBounds(38, 250, 32, 32);
		sell_8.setBounds(102, 58, 32, 32);
		sell_9.setBounds(102, 90, 32, 32);
		sell_10.setBounds(102, 122, 32, 32);
		sell_11.setBounds(102, 154, 32, 32);
		sell_12.setEnabled(false);
		sell_12.setBounds(102, 186, 32, 32);
		sell_13.setEnabled(false);
		sell_13.setBounds(102, 218, 32, 32);
		sell_14.setEnabled(false);
		sell_14.setBounds(102, 250, 32, 32);
		sell_15.setEnabled(false);
		sell_15.setBounds(166, 58, 32, 32);
		sell_16.setEnabled(false);
		sell_16.setBounds(166, 90, 32, 32);
		Sell_btn.setBounds(144, 262, 89, 29);
		sell_tomato.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_tomato.jpg")));
		sell_tomato.setBounds(0, 58, 32, 32);
		sell_pumpkin.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_pumpkin.jpg")));
		sell_pumpkin.setBounds(0, 90, 32, 32);
		sell_pea.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_pea.jpg")));
		sell_pea.setBounds(0, 122, 32, 32);
		sell_lettuce.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_lettuce.jpg")));
		sell_lettuce.setBounds(0, 154, 32, 32);
		sell_turnip.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_turnip.jpg")));
		sell_turnip.setBounds(0, 186, 32, 32);
		sell_corn.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_corn.jpg")));
		sell_corn.setBounds(0, 218, 32, 32);		
		sell_strawberry.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_strawberry.jpg")));
		sell_strawberry.setBounds(0, 250, 32, 32);	
		sell_cow.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Beefalo_Small.png")));
		sell_cow.setBounds(70, 58, 32, 32);
		sell_goat.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Volt_Goat_1_Small.png")));
		sell_goat.setBounds(70, 90, 32, 32);		
		sell_chicken.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Gobbler_Small.png")));
		sell_chicken.setBounds(70, 124, 32, 32);		
		sell_mask.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Visor_Small.png")));
		sell_mask.setBounds(70, 154, 32, 32);		
		Hidden_item_1.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/question_mark.png")));
		Hidden_item_1.setBounds(70, 186, 32, 32);		
		Hidden_item_2.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/question_mark.png")));
		Hidden_item_2.setBounds(70, 218, 32, 32);		
		Hidden_item_3.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/question_mark.png")));
		Hidden_item_3.setBounds(70, 250, 32, 32);		
		Hidden_item_4.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/question_mark.png")));
		Hidden_item_4.setBounds(134, 58, 32, 32);		
		Hidden_item_5.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/question_mark.png")));
		Hidden_item_5.setBounds(134, 90, 32, 32);
		btn_cow.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Beefalo_Small.png")));
		btn_cow.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_cow.setBounds(561, 62, 121, 32);
		btn_goat.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Volt_Goat_1_Small.png")));
		btn_goat.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_goat.setBounds(561, 105, 121, 32);
		btn_chicken.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_chicken.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Gobbler_Small.png")));
		btn_chicken.setBounds(561, 154, 121, 32);
		btn_corn_feed.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_corn_feed.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Cut_Grass_2.png")));
		btn_corn_feed.setBounds(561, 197, 121, 32);
		expand_farm.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		expand_farm.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Basic_Farm.png")));
		expand_farm.setBounds(517, 248, 190, 34);
		
		Sell_btn.addActionListener(new ActionListener() { 														//Algorithm of trading (sell) 
			public void actionPerformed(ActionEvent e) {   
				Trading();}});
		btn_cow.addActionListener(new ActionListener() {														//algorithm of trading cow
			public void actionPerformed(ActionEvent e) {
				if (Game_Profile.getFarmer_gold() < 9000) {
					setDialog("<html>Your need more GOLD");
				}else if ((Game_Profile.getAnimal_cow() ==  0) && (Game_Profile.getFarmer_gold() >= 9000)) {	// Only one cow is allowed, farmer no cow yet
					Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() - 9000);	//Update Gold
					Game_Profile.setAnimal_cow(1);									//buy one cow
					setDialog("<html> Congratulations! you just got yours Farm a Cow. <br> -9000G");

				} else {
					setDialog("<html>Your Barn is occupied... <br>Maybe you can upgrade your farm?");}
				Barn.updateAll();}});																			//Update all stats
		btn_goat.addActionListener(new ActionListener() {														//algorithm of trading goat
			public void actionPerformed(ActionEvent e) {
				if (Game_Profile.getFarmer_gold() < 6000) {														//condition Gold < price
					setDialog("<html>Your need more GOLD");
				}else if ((Game_Profile.getAnimal_goat() ==  0) && (Game_Profile.getFarmer_gold() > 6000)) {	// Only one goat is allowed, farmer no goat yet
					Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() - 6000);	//Update Gold
					Game_Profile.setAnimal_goat(1);									//buy one goat
					setDialog("<html>Congratulations! you just got your Farm a Goat + 1.<br> -6000G");													
												//Update in Inventory

				}else {
					setDialog("<html>Your Barn is occupied... <br>Maybe you can upgrade your farm?");
				}
				Barn.updateAll();																				//Update in Inventory
			}});
		btn_chicken.addActionListener(new ActionListener() { 													//algorithm of trading chicken
			public void actionPerformed(ActionEvent e) {
				if (Game_Profile.getFarmer_gold() < 2200) {														//condition Gold < price
					setDialog("<html>Your need more GOLD");
				}else if ((Game_Profile.getAnimal_chicken() ==  0) && (Game_Profile.getFarmer_gold() >= 2200)) {// Only one chicken is allowed, farmer no chicken yet
						Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() - 2200);						//Update Gold
						Game_Profile.setAnimal_chicken(1);														//buy one chicken
						setDialog("<html> Congratulations! you just got your Farm a Chicken + 1.<br> -2200G");											
						

				} else {
						setDialog("<html>Your Chicken Hoop is occupied... <br>Maybe you can upgrade your farm?");
				}
				Barn.updateAll();																				//Update all stats
			}});		
		btn_corn_feed.addActionListener(new ActionListener() {													//algorithm of trading corn feed
			public void actionPerformed(ActionEvent e) {
				if (Game_Profile.getFarmer_gold() < 15) {														//condition Gold < price
					setDialog("<html>Your need more GOLD");
				}else {
					Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() - 15);							// Update Farmer Gold
					Game_Profile.setFarmer_corn_feed(Game_Profile.getFarmer_corn_feed() + 1);					// Update Farmer Corn Feed
					setDialog("<html>Corn feed + 1.<br> -15G<br> Corn Feed = " + Game_Profile.getFarmer_corn_feed());
					Barn.updateAll();
				}}});					
		expand_farm.addActionListener(new ActionListener() {  													//algorithm of expanding farm land
			public void actionPerformed(ActionEvent e) {
				
				if ((Game_Profile.getFarmer_gold() < 2000) && (Game_Profile.getCrop_Plot(4).isUnlock() == false)) {//condition Gold < price
					setDialog("<html>Expanding your farm require tools!<br>[Insufficient GOLD]");
				}
				if (Game_Profile.getCrop_Plot(4).isUnlock() == false) {											//Not unlocked
					if (Game_Profile.getFarmer_gold() >= 2000) {												//condition Gold > price
						Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() - 2000);						//Update farmer gold
						Game_Profile.getCrop_Plot(4).setUnlock(true);											//Update crop plot 4 status
						setDialog("<html>Weedling the flame torch ...<br>I found a new area to Plant!!"
								+ "<br> [You can now plants crop in Crop plot 4.<br>[-2000G]");					// Update Dialog of crop plot 4 in farm
																												// Show user the effect
						Game_Profile.getCrop_Plot(4).setUnlock(true);
					}
				}else{
					setDialog("Your farm is fully expanded.");
				}Barn.updateAll();}});
		
	}
	/**
	 * Trading allow farmer to sell the crops/animal to trade market
	 */
	public void Trading() {																						//Sell and buy in trading market
		Game_Profile.setProfit(0);													//Set profit = 0 avoid intersecting with previous selling
		
		if ((sell_1.isSelected() == true) && (Game_Profile.getFarmer_tomato() >= 1)) {						//Farmer have items to sell
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 90); 		// Update FarmerGold
			Game_Profile.setFarmer_tomato(Game_Profile.getFarmer_tomato() - 1);		// Update Farmer tomato
			Game_Profile.setProfit(Game_Profile.getProfit() + 90); 					// Update profit
			
			if (Game_Profile.getFarmer_type() == 2) {								//Advantage of Engineer , Extra 30G for every crops
				Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 30);
				Game_Profile.setProfit(Game_Profile.getProfit() + 30); 				// Update profit
			}	
		}else {
			sell_1.setSelected(false);
		}// End of checkBox 1
		if ((sell_2.isSelected() == true) && (Game_Profile.getFarmer_pumpkin() >= 1)) {						//Farmer have items to sell
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 140); 		// Update FarmerGold
			Game_Profile.setFarmer_pumpkin(Game_Profile.getFarmer_pumpkin() - 1);	//Update Farmer pumpkin
			Game_Profile.setProfit(Game_Profile.getProfit() + 140); 				// Update profit
			if (Game_Profile.getFarmer_type() == 2) {								//Advantage of Engineer , Extra 30G for every crops
				Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 30);
				Game_Profile.setProfit(Game_Profile.getProfit() + 30); 				// Update profit
			}	
		}else {
			sell_2.setSelected(false);
		} // End of checkBox 2
		if ((sell_3.isSelected() == true) && (Game_Profile.getFarmer_pea() >= 1)) {						//Farmer have items to sell
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 130); 		// Update FarmerGold
			Game_Profile.setFarmer_pea(Game_Profile.getFarmer_pea() - 1);			//Update Farmer pea
			Game_Profile.setProfit(Game_Profile.getProfit() + 130); 				// Update profit
			if (Game_Profile.getFarmer_type() == 2) {								//Advantage of Engineer , Extra 30G for every crops
				Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 30);
				Game_Profile.setProfit(Game_Profile.getProfit() + 30); 				// Update profit
			}	
		} else {
			sell_3.setSelected(false);
		}// End of checkBox 3
		if ((sell_4.isSelected() == true) && (Game_Profile.getFarmer_lettuce() >= 1)) {						//Farmer have items to sell
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 70); 		// Update FarmerGold
			Game_Profile.setFarmer_lettuce(Game_Profile.getFarmer_lettuce() - 1);	//Update Farmer lettuce
			Game_Profile.setProfit(Game_Profile.getProfit() + 70); 					// Update profit
			if (Game_Profile.getFarmer_type() == 2) {								//Advantage of Engineer , Extra 30G for every crops
				Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 30);
				Game_Profile.setProfit(Game_Profile.getProfit() + 30); 				// Update profit
			}	
		} else {
			sell_4.setSelected(false);
		}// End of checkBox 4
		if ((sell_5.isSelected() == true) && (Game_Profile.getFarmer_turnip() >= 1)) {						//Farmer have items to sell
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 210); 		// Update FarmerGold
			Game_Profile.setFarmer_turnip(Game_Profile.getFarmer_turnip() - 1);		//Update Farmer turnip
			Game_Profile.setProfit(Game_Profile.getProfit() + 210); 				// Update profit
			if (Game_Profile.getFarmer_type() == 2) {								//Advantage of Engineer , Extra 30G for every crops
				Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 30);
				Game_Profile.setProfit(Game_Profile.getProfit() + 30); 				// Update profit
			}	
		}else {
			sell_5.setSelected(false);
		} // End of checkBox 5
		if ((sell_6.isSelected() == true) && (Game_Profile.getFarmer_corn() >= 1)) {						//Farmer have items to sell
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 150); 		// Update FarmerGold
			Game_Profile.setFarmer_corn(Game_Profile.getFarmer_corn() - 1);			//Update Farmer corn
			Game_Profile.setProfit(Game_Profile.getProfit() + 150); 				// Update profit
			if (Game_Profile.getFarmer_type() == 2) {								//Advantage of Engineer , Extra 30G for every crops
				Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 30);
				Game_Profile.setProfit(Game_Profile.getProfit() + 30); 				// Update profit
			}		
		}else {
			sell_6.setSelected(false);
		} // End of checkBox 6
		
		// Strawberry is not invented yet 
		
		if ((sell_8.isSelected() == true) && (Game_Profile.getAnimal_cow() >= 1)) {						//Farmer have items to sell
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 4500); 		// Update FarmerGold
			Game_Profile.setAnimal_cow(Game_Profile.getAnimal_cow() - 1);			//Update Farmer cow
			Game_Profile.setProfit(Game_Profile.getProfit() + 4500); 				// Update profit
			
		}else {
			sell_8.setSelected(false);
		} // End of checkBox 8
		if ((sell_9.isSelected() == true) && (Game_Profile.getAnimal_goat() >= 1)) {						//Farmer have items to sell
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 3000); 		// Update FarmerGold
			Game_Profile.setAnimal_goat(Game_Profile.getAnimal_goat() - 1);			//Update Farmer Goat
			Game_Profile.setProfit(Game_Profile.getProfit() + 3000); 				// Update profit
			
		}else {
			sell_9.setSelected(false);
		} // End of checkBox 9
		if ((sell_10.isSelected() == true) && (Game_Profile.getAnimal_chicken() >= 1)) {						//Farmer have items to sell
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 1100); 		// Update FarmerGold
			Game_Profile.setAnimal_chicken(Game_Profile.getAnimal_chicken() - 1);	//Update Farmer chicken
			Game_Profile.setProfit(Game_Profile.getProfit() + 1100); 				// Update profit
	
		}else {
			sell_10.setSelected(false);
		} // End of checkBox 10
		if ((sell_11.isSelected() == true) && (Game_Profile.getFarmer_mask() >= 1)) {						//Farmer have items to sell
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 5); 		// Update FarmerGold
			Game_Profile.setFarmer_mask(Game_Profile.getFarmer_mask() - 1);			//Update Farmer mask
			Game_Profile.setProfit(Game_Profile.getProfit() + 5); 					// Update profit
		}else {
			sell_11.setSelected(false);
		} // End of checkBox 11
		
		if (Game_Profile.getProfit() >= 400 ) {																//hidden event extra bonus with profit > 400 per crate
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 100);								// bonus Gold
			setDialog("<html>Good Work! " + Game_Profile.getFarmer_name() + "<br>"
					+ "Heres another 100G for your bonus! [Receive bonus from KANG.] <br>"
					+ "Profit of this crate = " + (Game_Profile.getProfit() + 100));
		}else if (Game_Profile.getProfit() == 0) {															//No item to sell
			setDialog("The Crate is EMPTY!");
		}
		else {
		
			setDialog("Profit of this crate = " + Game_Profile.getProfit());								//Display message
		}	// End of Sell Process
			
		Game_Profile.setProfit(0);																			// Clear Profit after using it														
		Inventory.UpdateInventory();																		// Update Inventory
		Barn.UpdateBarn();																					//Update animal in barn
		//End of selling action - 

		Base_Component.UpdateStats();																		//update stats
	}
	
	public void setDialog(String text) {
		Base_Component.setDialog(text);
	}
	
;
//		assertEquals(0, test.farmer_mask);
	
}
