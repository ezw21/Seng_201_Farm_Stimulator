package Game_Structure;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class Base_Component {
	
	private JFrame JFrame;
	private Game_Profile Game_Profile;
	
	//Stats
	final JLabel Energy_bar = new JLabel("");
	final JLabel energy_value = new JLabel("2");
	final JLabel Stats = new JLabel();
	
	final JMenuBar menuBar = new JMenuBar();
	final JLabel Dialog = new JLabel();
	/// Main Button Setup
	JButton btnA = new JButton("A");
	JButton btnO = new JButton("B");
	private int game_state = 2;
	private int condition = 0;
	
	JMenu Home = new JMenu();
	JMenu Farm = new JMenu("Farm");
	JMenu Animal = new JMenu("Animal");
	JMenu Town = new JMenu("Town");
	
	JMenuItem Go_Home = new JMenuItem();
	JMenuItem Go_To_Animal = new JMenuItem("Go to Barn & Chicken Hoop");
	JMenuItem Trading_market = new JMenuItem("Go to Trading Market");
	JMenuItem Trade_Items = new JMenuItem("Go to Supermarket");
	JMenuItem Go_to_farm = new JMenuItem("Go to Farm");
	
	// Menu & Item -> Crop
	JMenuItem eat_burger = new JMenuItem("Eat Burger");
	JMenuItem Chop_tree_strumps = new JMenuItem("Chop Tree stumps");
	JMenuItem Fertilizing = new JMenuItem("Use Fertilizer on  crops");
	JMenuItem Open_Inventory = new JMenuItem();
	JMenuItem relic_chair = new JMenuItem();
	JMenuItem end_day = new JMenuItem("Sleep without making diary..");
	
	
	
	
	public Base_Component(javax.swing.JFrame jFrame, Game_Structure.Game_Profile game_Profile) {
		super();
		JFrame = jFrame;
		Game_Profile = game_Profile;
		
		initframeDesign();
		initMenu();
		init();
	}

	public void init() {
		
		
		
		JFrame.getContentPane().add(menuBar);
		JFrame.getContentPane().add(Dialog);
		JFrame.getContentPane().add(Stats);
		menuBar.add(Home);
		menuBar.add(Animal);
		menuBar.add(Farm);
		menuBar.add(Town);
		JFrame.getContentPane().add(btnA);
		JFrame.getContentPane().add(btnO);
		JFrame.getContentPane().add(Energy_bar);
		JFrame.getContentPane().add(energy_value);	
		
		Town.add(Trade_Items);
		Town.add(Trading_market);
		
		Home.add(Go_Home);
		Home.add(Open_Inventory);
		Home.add(relic_chair);
		Home.add(eat_burger);
		Home.add(end_day);
		Animal.add(Go_To_Animal);

		Farm.add(Go_to_farm);
		Farm.add(Chop_tree_strumps);
		Farm.add(Fertilizing);
		

		
		btnA.addActionListener(new ActionListener() {			// This button is stored in initialize as its a seperate Introduction button in Main frame //Button B is just for dessign
			public void actionPerformed(ActionEvent e) {
				proceedButton();
			} // End of actionPerformed
		}); // End of actionListener
	}
	
	public void UpdateEnergy() {					//Update energy status to energy bar and energy value
		
		energy_value.setText("" + Game_Profile.getFarmer_energy());		// Show energy on energy_value
		if (Game_Profile.getFarmer_energy() >= 4) {
			Energy_bar.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Health4.png")));
		} else if (Game_Profile.getFarmer_energy() == 3) {
			Energy_bar.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Health3.png")));
		} else if (Game_Profile.getFarmer_energy() == 2) {
			Energy_bar.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Health2.png")));
		} else if (Game_Profile.getFarmer_energy() == 1) {
			Energy_bar.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Health1.png")));
		} else if (Game_Profile.getFarmer_energy() == 0) {
			Energy_bar.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Health0.png")));
		}
	}

	public void UpdateStats() {						// Update day num, gold in stats
		Stats.setText("<html>" + Game_Profile.getFarm_name() + "'s Farm<br>" 
				+ Game_Profile.getFarmer_name() + "<br>"
				+ "Gold = " + Game_Profile.getFarmer_gold() + "<br>"
						+ "Day " + Game_Profile.getDay_num());
	}
	
	public void proceedButton() {					//Carry on introduction in state
		
		if ((game_state == 2) && (condition == 0)) { //Introduction on Main_Scene
			Dialog.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
			Dialog.setText("<html><br><br>Welcome back ! Let me walk you through the village.");
			condition = 1;
		} //[2][0] 
		else if ((game_state == 2) && (condition == 1)) { //Introduction on main Scene
			
			Dialog.setText("<html> ^^^^^^^^^^^^^^^^^^^^^^^^^^^^<br>"
					+ "Above was the Action Menu.<br> You can choose any action you want to perform in each day.<br>"
					+ "On the top of the screen, thee is a MenuBar that provide the options.<br>"
					+ "And your Energy level is displayed on the corner.");
			condition = 2;
		} //[2][1]
		else if ((game_state == 2) && (condition == 2)) { //Introduction on main Scene
			
			Dialog.setText("<html>Some of the Action will reduce your Energy_level<br>"
					+ "Under Crop's selection,<br>"
					+ "'Harvest ' 	- reduce one Energy. <br>"
					+ "'Watering'   - non-Energy Consuming action!"); 
			condition = 3;
		} //[2][1]
		else if ((game_state == 2) && (condition == 3)) { //Introduction on main Scene
			Dialog.setText("<html>You can always Press 'INFO' to see the information of the Action.<br>"
					+ "But keep in Mind, you will start with 4 ENERGY on the 1st day.<br>"
					+ "Sleeping will recover 3 Energy for your in the next day!!<br>"
					+ "[Whisper]You might get increase of Energy level by acheiving or doing something...");
			
			condition = 4;
		} //[2][3]
		else if ((game_state == 2) && (condition == 4)) { //Introduction on main Scene
			Dialog.setText("<html> Your inventory is under the 'Home' Tab, you will have a small GOLD bag to keep your moeny.<br>"
					+ "Under 'Animal' tab, you can walk to your Barn.<br>"
					+ "'Farm tab' allowed you to travel to your farm land and perform various actions.<br>"
					+ "And there is multiple place you can visit in 'Town'");
			
			condition = 5;

		} //[2][4]
		else if ((game_state == 2) && (condition == 5)) { //Introduction on main Scene
			Dialog.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
			Dialog.setText("Sooooooooooooo....... " + Game_Profile.getFarmer_name()+ " wat chu wanna do?");
			condition = 0;						//End of proceed procedure, Loop back to first introduction
		} //[2][5]
	}

	public void initframeDesign() {							//init all component outside panel
	
		
		energy_value.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnA.setBounds(560, 403, 55, 55);
		btnA.setFont(new Font("Tahoma", Font.BOLD, 15));		
		btnO.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnO.setBounds(625, 403, 55, 55);		
		Energy_bar.setHorizontalAlignment(SwingConstants.CENTER);
		Energy_bar.setBounds(583, 11, 40, 40);
		energy_value.setHorizontalAlignment(SwingConstants.CENTER);
		energy_value.setBounds(588, 50, 30, 30);
		
		
		// Init MenuBar & Dialog Setup & Stats Label
		
		menuBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		menuBar.setBounds(0, 0, 300, 20);
		Dialog.setText("Press A to continue...");
		Dialog.setVerticalAlignment(SwingConstants.BOTTOM);
		Dialog.setHorizontalAlignment(SwingConstants.LEFT);
		Dialog.setBackground(new Color(250, 250, 210));
		Dialog.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		Dialog.setBounds(10, 390, 540, 68);
		Dialog.setOpaque(true);
		Stats.setHorizontalAlignment(SwingConstants.CENTER);
		Stats.setBackground(new Color(250, 250, 210));
		Stats.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		Stats.setBounds(633, 0, 91, 75);
		Stats.setOpaque(true);
	}	
	
	public void initMenu() {								//Init component in Menu 
		Home.setText("Home");
		Home.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		Go_Home.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		Go_Home.setText("GO Home");
		Open_Inventory.setText("Open Inventory");
		Open_Inventory.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		relic_chair.setText("Sit on Relic Chair");
		relic_chair.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		eat_burger.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		end_day.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		end_day.setHorizontalAlignment(SwingConstants.CENTER);
		Animal.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		Go_To_Animal.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		Farm.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		Go_to_farm.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		Chop_tree_strumps.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		Fertilizing.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		Town.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		Trade_Items.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		Trading_market.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
	}
	
	public void setDialog(String text){
		Dialog.setText(text);
	}

	public JMenuItem getGo_Home() {
		return Go_Home;
	}

	public JMenuItem getGo_To_Animal() {
		return Go_To_Animal;
	}

	public JMenuItem getGo_to_farm() {
		return Go_to_farm;
	}

	public JMenuItem getEat_burger() {
		return eat_burger;
	}

	public JMenuItem getChop_tree_strumps() {
		return Chop_tree_strumps;
	}

	public JMenuItem getOpen_Inventory() {
		return Open_Inventory;
	}

	public JMenuItem getRelic_chair() {
		return relic_chair;
	}

	public JMenuItem getEnd_day() {
		return end_day;
	}

	public JMenuItem getTrading_market() {
		return Trading_market;
	}

	public JMenuItem getTrade_Items() {
		return Trade_Items;
	}

	public JMenuItem getFertilizing() {
		return Fertilizing;
	}
	
	
	
}
