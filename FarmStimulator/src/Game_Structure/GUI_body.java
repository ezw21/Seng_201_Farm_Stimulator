package Game_Structure;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;



@SuppressWarnings("restriction")
public class GUI_body {
	

	//Init Game_Profile to get vrb from another class 
	Game_Profile Game_Profile;
	GUI_setup GUI_setup;
	
	
	
	
	
	
	
	
	//Init frame & Panel
	JFrame frmBackToNature;
	JPanel Supermarket_Panel = new JPanel();
	JPanel Barn_and_Chicken_Hoop_Panel = new JPanel();
	JPanel Farm_Panel = new JPanel();
	JPanel Trade_Market = new JPanel();
	JLayeredPane layeredPane = new JLayeredPane();
	//Main Scene . Menubar, menu iteem
	JLabel Action_with_requirements = new JLabel("Action_with_requirement {E} / {$}") ;
	JLabel Stats = new JLabel();
	JMenuBar menuBar = new JMenuBar();
	JMenu Home = new JMenu();
	JMenuItem Go_Home = new JMenuItem();
	JMenu Animal = new JMenu("Animal");
	JMenuItem Go_To_Animal = new JMenuItem("Go to Barn & Chicken Hoop");
	JMenu Town = new JMenu("Town");
	JMenuItem Trade_Items = new JMenuItem("Go to Supermarket");
	JLabel Dialog = new JLabel();
	JPanel Main_Scene = new JPanel();
	JMenuItem Trading_market = new JMenuItem("Go to Trading Market");
	
	//Init main screen label
	JLabel Action_Set_Rqrm;
	JLabel Action_no_requirement;
	JLabel Action_Set_Free;
	JLabel Main_Scene_wallpaper = new JLabel("");
	JLabel Product_Title = new JLabel("Product");
	JLabel Cow = new JLabel("Barn is empty...");
	JLabel Goat = new JLabel("Barn is empty...");
	JLabel Chicken = new JLabel("Chicken Hoop is empty...");
	JMenu Farm = new JMenu("Farm");
	JMenuItem Go_to_farm = new JMenuItem("Go to Farm");
	JPanel Inventory = new JPanel();
	
	//Init vrb to process Button A & B
	int game_state = 2;
	int condition = 0;
	int test = 10;
	 
	//Stats
	final JLabel Energy_bar = new JLabel("");
	final JLabel energy_value = new JLabel("2");
	final JLabel happiness_qtn = new JLabel("0");
	final JLabel healthiness_qtn = new JLabel("0");
	
	// Inventory item
	final JLabel lblNewLabel_2 = new JLabel("Inventory");
	final JLabel Tomato_seed = new JLabel("");
	final JLabel Pumpkin_Seed = new JLabel("");
	final JLabel Pea_Seed = new JLabel("");
	final JLabel Lettuce_Seed = new JLabel("");
	final JLabel Turnip_Seed = new JLabel("");
	final JLabel Corn_Seed = new JLabel("");
	final JLabel corn_feed = new JLabel("");
	final JLabel tomato_seed_lbl = new JLabel("Tomato Seed");
	final JLabel pumpkin_seed_lbl = new JLabel("Pumpkin Seed");
	final JLabel pea_seed_lbl = new JLabel("Pea Seed ");
	final JLabel lettuce_seed_lbl = new JLabel("Lettuce Seed");
	final JLabel turnip_seed_lbl = new JLabel("Turnip seed");
	final JLabel corn_seed_lbl = new JLabel("Corn Seed");
	final JLabel corn_feed_lbl = new JLabel("Corn Feed");
	final JLabel Tomato = new JLabel("");
	final JLabel Pumpkin = new JLabel("");
	final JLabel Pea = new JLabel("");
	final JLabel Lettuce = new JLabel("");
	final JLabel Turnip = new JLabel("");
	final JLabel Corn = new JLabel("");
	final JLabel Unknown = new JLabel("X");
	final JLabel tomato_lbl = new JLabel("Tomato");
	final JLabel pumpkin_lbl = new JLabel("Pumpkin");
	final JLabel pea_lbl = new JLabel("Pea");
	final JLabel lettuce_lbl = new JLabel("Lettuce");
	final JLabel turnip_lbl = new JLabel("Turnip");
	final JLabel corn_lbl = new JLabel("Corn");
	final JLabel unknown_lbl = new JLabel("Unknwon");
	final JLabel Axe_lbl = new JLabel("Axe");
	final JLabel burger_lbl = new JLabel("Burger");
	final JLabel water_jar_lbl = new JLabel("Water Jar");
	final JLabel relic_chair_lbl = new JLabel("Relic Chair");
	final JLabel fertilizer_lbl = new JLabel("Fertilizer");
	final JLabel Mask = new JLabel("Mask");
	final JLabel Axe = new JLabel("");
	final JLabel Burger = new JLabel("New label");
	final JLabel Mask_lbl = new JLabel("New label");
	final JLabel Fertilizer = new JLabel("");
	final JLabel Relic_Chair = new JLabel("");
	final JLabel Water_Jar = new JLabel("");
	final JLabel cow = new JLabel("");
	final JLabel goat = new JLabel("");
	final JLabel chicken = new JLabel("");
	final JLabel cow_lbl = new JLabel("Cow");
	final JLabel goat_lbl = new JLabel("Goat");
	final JLabel chicken_lbl = new JLabel("Chicken");

	final JLabel tomato_seed_qtn = new JLabel();
	final JLabel pumpkin_seed_qtn = new JLabel();
	final JLabel pea_seed_qtn = new JLabel();
	final JLabel lettuce_seed_qtn = new JLabel();
	final JLabel turnip_seed_qtn = new JLabel();
	final JLabel corn_seed_qtn = new JLabel();
	final JLabel corn_feed_qtn = new JLabel();
	final JLabel tomato_qtn = new JLabel();
	final JLabel pumpkin_qtn = new JLabel();
	final JLabel pea_qtn = new JLabel();
	final JLabel lettuce_qtn = new JLabel();
	final JLabel turnip_qtn = new JLabel();
	final JLabel corn_qtn = new JLabel();
	final JLabel unknown__qtn = new JLabel(); // No G & S
	final JLabel axe_qtn = new JLabel();
	final JLabel fertilizer_qtn = new JLabel();
	final JLabel burger_qtn = new JLabel();
	final JLabel relic_chair_qtn = new JLabel();
	final JLabel water_jar_qtn = new JLabel();
	final JLabel mask_qtn = new JLabel();
	final JLabel cow_qtn = new JLabel();		
	final JLabel goat_qtn = new JLabel();		
	final JLabel chicken_qtn = new JLabel();
	
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
	
	
	//Init button
	final JToggleButton tglbtnExplain = new JToggleButton("INFO");
	final JButton btnWatering = new JButton("WATERING");
	JButton farm_Info = new JButton("INFO");
	JButton btnSeeding = new JButton("SEEDING");
	JButton Feeding_Chicken = new JButton("FEED ANIMAL ");
	JButton Blank = new JButton("Brush?");
	JButton Play_In_Barn = new JButton("PLAY FOOTBALL IN BARN ");
	JButton Check_Cart_Total = new JButton();
	JButton Purchase = new JButton("PURCHASE");
	JButton clear_selection = new JButton();
	final JToggleButton Shop_Information = new JToggleButton();
	JButton btnHarvesting = new JButton("HARVESTING");
	final JButton btn_cow = new JButton("9000G");
	final JButton btn_goat = new JButton("6000G");
	final JButton btn_chicken = new JButton("2200G");
	JButton btn_corn_feed = new JButton("15G");
	JButton expand_farm = new JButton("Expand farm 2000G");
	JButton Animal_Info = new JButton();
	
	/// Main Button Setup
	JButton btnA = new JButton("A");
	JButton btnO = new JButton("B");
	
	// Farm
	final JLabel crop_1_lbl = new JLabel("Plant something...");
	final JLabel crop_2_lbl = new JLabel("Plant something...");
	final JLabel crop_3_lbl = new JLabel("Plant something...");
	final JLabel crop_4_lbl = new JLabel("Plant something...");
	final JLabel crop_icon_1 = new JLabel("Crop plot 1 is available");
	final JLabel crop_icon_2 = new JLabel("Crop plot 2 is available");
	final JLabel crop_icon_3 = new JLabel("Crop plot 3 is available");
	final JLabel crop_icon_4 = new JLabel("Crop plot 4 is LOCKED");
	
	final JCheckBox chckbxCrop_1 = new JCheckBox("Select Crop Plot");
	final JCheckBox chckbxCrop_2 = new JCheckBox("Select Crop Plot");
	final JCheckBox chckbxCrop_3 = new JCheckBox("Select Crop Plot");
	final JCheckBox chckbxCrop_4 = new JCheckBox("Select Crop Plot");
	final JComboBox<String> Seed_selection = new JComboBox<String>();
	
	//Barn
	JLabel happiness = new JLabel("New label");
	JLabel healthiness = new JLabel("New label");
	  // Launch the application.	 
	// Menu & Item -> Crop
	JMenuItem eat_burger = new JMenuItem("Eat Burger");
	JMenuItem Chop_tree_strumps = new JMenuItem("Chop Tree stumps");
	JMenuItem Fertilizing = new JMenuItem("Use Fertilizer on  crops");
	JMenuItem Open_Inventory = new JMenuItem();
	JMenuItem relic_chair = new JMenuItem();
	JMenuItem end_day = new JMenuItem("Sleep without making diary..");
	
	//Trade Market
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
	

	
	
	
	public static void main(String[] args) {					//init frame body
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_body window_GUI_Body = new GUI_body();
					window_GUI_Body.getFrame().setVisible(true);				
				} catch (Exception e) {
					e.printStackTrace();
					
					}}});
		}// End of main



	
	 //Create the application.
	
	public GUI_body() {			// Set default stats, Testing / Start game in game body
		Game_Profile = new Game_Profile(1, 4000, 1, "Little Shit","Bullshit"	//int farmer_type, int farmer_gold, int day_num, String farmer_name, String farm_name
				,0, 30, 30, 60, 60							//int farm_type, int price_tomato_seed, int price_pumpkin_seed, int price_pea_seed, int price_lettuce_seed
				, 90, 90, 60, 100, 210						//int price_turnip_seed, int price_corn_seed, int price_burger, int price_fertilizer, int price_relic_chair
				, 150, 600, 15, 0, 5						//int price_water_jar, int price_axe, int price_mask, int cart_total, int farmer_tomato
				, 5, 5, 5, 5, 5								//int farmer_pumpkin, int farmer_pea, int farmer_lettuce, int farmer_turnip, int farmer_corn
				, 2, 2, 2, 2, 2 							//int farmer_tomato_seed, int farmer_pumpkin_seed, int farmer_pea_seed, int farmer_lettuce_seed, int farmer_turnip_seed
				, 2, 3, 0, 0, 0								//int farmer_corn_seed, int farmer_burger, int farmer_fertilizer, int farmer_relic_chair, int farmer_water_jar
				, 2, 10, 3, 3, true 						//int farmer_axe, int farmer_mask, int farmer_corn_feed, int animal_happiness, boolean feed_animal
				, 4, 5, 0, 0, 0								//int farmer_energy, int animal_healthiness, int animal_cow, int animal_goat, int animal_chicken
				, true, true, true, true, 0					//boolean plot_1_available, boolean plot_2_available, boolean plot_3_available, boolean plot_4_available int plot_1_harvest_time
				, 0, 0, 0, true, false						//int plot_2_harvest_time, int plot_3_harvest_time, int plot_4_harvest_time	, boolean watering, boolean unlock_plot_4
				, "", "", "", "", 0							//String plot_1_plant, String plot_2_plant, String plot_3_plant, String plot_4_plant, int profit, 											
				, 0, true, 0, 5, true, 5);				//boolean harvest,int harvested_crops, int relic_aura, boolean rest, boolean eat_burger, int axe_durability, boolean fertilizing, end day =5
					
		initialize_body();
		UpdateAll();

	}

	
	
	public GUI_body(Game_Structure.Game_Profile game_Profile) {			//Constructor to get variable from Game_Profile
		super();
		Game_Profile = game_Profile;																	
		initialize_body();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize_body() {
		// Set new frame and add all component into it
		//The building/ constructing of Frame!
		FarmerType_advantage();		// Please refer to the comment in mmethod, however most method literally means what it means...
		initInventory();
		initFrame();
		initMainScene();
		initTGLBtn_Box();
		initFarm();
		initBarn();
		initSuperMarket();
		initMenu();
		initTradingMarket();
		initframeDesign();
		UpdateAll();
		//Init Frame & Menu bar
		setFrame(new JFrame());
		getFrame().setBounds(500, 250, 750, 520);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		getFrame().getContentPane().add(layeredPane);
		getFrame().getContentPane().add(menuBar);
		getFrame().getContentPane().add(Dialog);
		getFrame().getContentPane().add(Stats);
		
		//Init panel
		layeredPane.add(Main_Scene, "name_199216101866600");
		layeredPane.add(Inventory, "name_324997804399200");
		layeredPane.add(Trade_Market, "name_458198648692800");
		layeredPane.add(Farm_Panel, "name_194781174265600");
		layeredPane.add(Barn_and_Chicken_Hoop_Panel, "name_194785506405200");
		layeredPane.add(Supermarket_Panel, "name_194790290626100");
		// Add all label for Inventory panel
		Inventory.add(lblNewLabel_2);
		Inventory.add(Tomato_seed);
		Inventory.add(Pumpkin_Seed);
		Inventory.add(Pea_Seed);
		Inventory.add(Lettuce_Seed);
		Inventory.add(Turnip_Seed);
		Inventory.add(Corn_Seed);
		Inventory.add(corn_feed);
		Inventory.add(tomato_seed_lbl);
		Inventory.add(pumpkin_seed_lbl);
		Inventory.add(pea_seed_lbl);
		Inventory.add(lettuce_seed_lbl);
		Inventory.add(turnip_seed_lbl);
		Inventory.add(corn_seed_lbl);
		Inventory.add(corn_feed_lbl);
		Inventory.add(tomato_seed_qtn);
		Inventory.add(pumpkin_seed_qtn);
		Inventory.add(pea_seed_qtn);
		Inventory.add(lettuce_seed_qtn);
		Inventory.add(turnip_seed_qtn);
		Inventory.add(corn_seed_qtn);
		Inventory.add(corn_feed_qtn);
		Inventory.add(Tomato);
		Inventory.add(Pumpkin); 
		Inventory.add(Pea);
		Inventory.add(Lettuce);
		Inventory.add(Turnip);
		Inventory.add(Corn);
		Inventory.add(Unknown);
		Inventory.add(tomato_lbl);
		Inventory.add(pumpkin_lbl);
		Inventory.add(pea_lbl);
		Inventory.add(lettuce_lbl);
		Inventory.add(turnip_lbl);
		Inventory.add(corn_lbl);
		Inventory.add(unknown_lbl);
		Inventory.add(tomato_qtn);
		Inventory.add(pumpkin_qtn);
		Inventory.add(pea_qtn);
		Inventory.add(lettuce_qtn);
		Inventory.add(turnip_qtn);
		Inventory.add(corn_qtn);
		Inventory.add(unknown__qtn);
		Inventory.add(axe_qtn);
		Inventory.add(fertilizer_qtn);
		Inventory.add(burger_qtn);
		Inventory.add(relic_chair_qtn);
		Inventory.add(water_jar_qtn);
		Inventory.add(mask_qtn);
		Inventory.add(Axe_lbl);
		Inventory.add(burger_lbl);
		Inventory.add(water_jar_lbl);
		Inventory.add(relic_chair_lbl);
		Inventory.add(fertilizer_lbl);
		Inventory.add(Mask);
		Inventory.add(Axe);
		Inventory.add(Burger);
		Inventory.add(Mask_lbl);
		Inventory.add(Fertilizer);
		Inventory.add(Relic_Chair);
		Inventory.add(Water_Jar);
		Inventory.add(cow);
		Inventory.add(goat);
		Inventory.add(chicken);
		Inventory.add(cow_lbl);
		Inventory.add(goat_lbl);
		Inventory.add(chicken_lbl);
		Inventory.add(cow_qtn);
		Inventory.add(goat_qtn);
		Inventory.add(chicken_qtn);
		
		//Add all label in Main_Scene panel
		Main_Scene.add(Action_with_requirements);
		Main_Scene.add(Action_Set_Rqrm);
		Main_Scene.add(Action_no_requirement);
		Main_Scene.add(Action_Set_Free);


		//Add all label in Farm Panel
		Farm_Panel.add(crop_1_lbl);
		Farm_Panel.add(crop_2_lbl);
		Farm_Panel.add(crop_3_lbl);
		Farm_Panel.add(crop_4_lbl);
		Farm_Panel.add(crop_icon_1);	
		Farm_Panel.add(crop_icon_2);		
		Farm_Panel.add(crop_icon_3);				
		Farm_Panel.add(crop_icon_4);
		//4 crop plot selection 
		Farm_Panel.add(chckbxCrop_1);
		Farm_Panel.add(chckbxCrop_2);
		Farm_Panel.add(chckbxCrop_3);
		Farm_Panel.add(chckbxCrop_4);

		// Barn Panel
		Barn_and_Chicken_Hoop_Panel.add(Cow);
		Barn_and_Chicken_Hoop_Panel.add(Goat);
		Barn_and_Chicken_Hoop_Panel.add(Chicken);
		
		// Add all toggle button
		Main_Scene.add(tglbtnExplain);
		Farm_Panel.add(btnWatering);
		Farm_Panel.add(farm_Info);
		Farm_Panel.add(Seed_selection);
		Farm_Panel.add(btnSeeding);
		Barn_and_Chicken_Hoop_Panel.add(Feeding_Chicken);
		Barn_and_Chicken_Hoop_Panel.add(Blank);
		Barn_and_Chicken_Hoop_Panel.add(Play_In_Barn);
		
		Barn_and_Chicken_Hoop_Panel.add(Animal_Info);
		Barn_and_Chicken_Hoop_Panel.add(happiness_qtn);
		Barn_and_Chicken_Hoop_Panel.add(happiness);
		Barn_and_Chicken_Hoop_Panel.add(healthiness);
		Barn_and_Chicken_Hoop_Panel.add(healthiness_qtn);
		
		//Init Main_Scene Wallpaper
		

		Main_Scene.add(Main_Scene_wallpaper);

		//Add SuperMarket component
		Supermarket_Panel.add(Brief_In_Shop);
		Supermarket_Panel.add(Shop_Description);
		Supermarket_Panel.add(Gold_IN_Shop);
		Supermarket_Panel.add(chckbxItem_1);
		Supermarket_Panel.add(chckbxItem_2);
		Supermarket_Panel.add(chckbxItem_3);
		Supermarket_Panel.add(chckbxItem_4);
		Supermarket_Panel.add(chckbxItem_5);
		Supermarket_Panel.add(chckbxItem_6);
		Supermarket_Panel.add(chckbxItem_7);
		Supermarket_Panel.add(chckbxItem_8);
		Supermarket_Panel.add(chckbxItem_9);
		Supermarket_Panel.add(chckbxItem_10);
		Supermarket_Panel.add(chckbxItem_11);
		Supermarket_Panel.add(chckbxItem_12);
		Supermarket_Panel.add(Check_Cart_Total);
		Supermarket_Panel.add(Purchase);
		Supermarket_Panel.add(Shop_Information);
		Supermarket_Panel.add(clear_selection);

		
		// Menu & Item 
		
		Town.add(Trade_Items);
		Town.add(Trading_market);
		menuBar.add(Home);
		Home.add(Go_Home);
		Home.add(Open_Inventory);
		Home.add(relic_chair);
		Home.add(eat_burger);
		Home.add(end_day);
		Animal.add(Go_To_Animal);
		menuBar.add(Animal);
		menuBar.add(Farm);
		menuBar.add(Town);
		Farm.add(Go_to_farm);
		Farm.add(Chop_tree_strumps);
		Farm.add(Fertilizing);
		Farm_Panel.add(btnHarvesting);

		
		//Tradin Market
		Trade_Market.add(Buy_lbl);
		Trade_Market.add(Sell_lbl);
		Trade_Market.add(Trade_Market_Character);
		Trade_Market.add(sell_1);
		Trade_Market.add(sell_2);
		Trade_Market.add(sell_3);
		Trade_Market.add(sell_4);
		Trade_Market.add(sell_5);
		Trade_Market.add(sell_6);
		Trade_Market.add(sell_7);
		Trade_Market.add(sell_8);
		Trade_Market.add(sell_9);
		Trade_Market.add(sell_10);
		Trade_Market.add(sell_11);
		Trade_Market.add(sell_12);
		Trade_Market.add(sell_13);
		Trade_Market.add(sell_14);
		Trade_Market.add(sell_15);
		Trade_Market.add(sell_16);
		Trade_Market.add(Sell_btn);
		Trade_Market.add(sell_tomato);
		Trade_Market.add(sell_pumpkin);
		Trade_Market.add(sell_pea);
		Trade_Market.add(sell_lettuce);
		Trade_Market.add(sell_turnip);
		Trade_Market.add(sell_corn);
		Trade_Market.add(sell_strawberry);
		Trade_Market.add(sell_cow);
		Trade_Market.add(sell_goat);
		Trade_Market.add(sell_chicken);
		Trade_Market.add(sell_mask);
		Trade_Market.add(Hidden_item_1);
		Trade_Market.add(Hidden_item_2);
		Trade_Market.add(Hidden_item_3);
		Trade_Market.add(Hidden_item_4);
		Trade_Market.add(Hidden_item_5);
		Trade_Market.add(btn_cow);
		Trade_Market.add(btn_goat);
		Trade_Market.add(btn_chicken);
		Trade_Market.add(btn_corn_feed);
		Trade_Market.add(expand_farm);
		getFrame().getContentPane().add(btnA);
		getFrame().getContentPane().add(btnO);
		frmBackToNature.getContentPane().add(Energy_bar);
		frmBackToNature.getContentPane().add(energy_value);	

		btnA.addActionListener(new ActionListener() {			// This button is stored in initialize as its a seperate Introduction button in Main frame //Button B is just for dessign
			public void actionPerformed(ActionEvent e) {
				proceedButton();
			} // End of actionPerformed
		}); // End of actionListener
	}
	
	public void UpdateInventory(){		//Update display in inventory panel 
		tomato_seed_qtn.setText("" + Game_Profile.getFarmer_tomato_seed());
		 pumpkin_seed_qtn.setText("" + Game_Profile.getFarmer_pumpkin_seed());
		 pea_seed_qtn.setText("" + Game_Profile.getFarmer_pea_seed());
		 lettuce_seed_qtn.setText("" + Game_Profile.getFarmer_lettuce_seed());
		 turnip_seed_qtn.setText("" + Game_Profile.getFarmer_turnip_seed());
		 corn_seed_qtn.setText("" + Game_Profile.getFarmer_corn_seed());
		 corn_feed_qtn.setText("" + Game_Profile.getFarmer_corn_feed());
		 tomato_qtn.setText("" + Game_Profile.getFarmer_tomato());
		 pumpkin_qtn.setText("" + Game_Profile.getFarmer_pumpkin());
		 pea_qtn.setText("" + Game_Profile.getFarmer_pea());
		 lettuce_qtn.setText("" + Game_Profile.getFarmer_lettuce());
		 turnip_qtn.setText("" + Game_Profile.getFarmer_turnip());
		 corn_qtn.setText("" + Game_Profile.getFarmer_corn());
		 unknown__qtn.setText("X"); // No G & S
		 axe_qtn.setText("" + Game_Profile.getFarmer_axe());
		 fertilizer_qtn.setText("" + Game_Profile.getFarmer_fertilizer());
		 burger_qtn.setText("" + Game_Profile.getFarmer_burger());
		 relic_chair_qtn.setText("" + Game_Profile.getFarmer_relic_chair());
		 water_jar_qtn.setText("" + Game_Profile.getFarmer_water_jar());
		 mask_qtn.setText("" + Game_Profile.getFarmer_mask());
		 cow_qtn.setText("" + Game_Profile.getAnimal_cow());
		 goat_qtn.setText("" + Game_Profile.getAnimal_goat());
		 chicken_qtn.setText("" + Game_Profile.getAnimal_chicken());

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
	public void UpdateBarn_Stats() {				//Update happiness & healthiness
		healthiness_qtn.setText("" + Game_Profile.getAnimal_healthiness());
		happiness_qtn.setText("" + Game_Profile.getAnimal_happiness());
	}
	public void UpdateStats() {						// Update day num, gold in stats
		Stats.setText("<html>" + Game_Profile.getFarm_name() + "'s Farm<br>" 
				+ Game_Profile.getFarmer_name() + "<br>"
				+ "Gold = " + Game_Profile.getFarmer_gold() + "<br>"
						+ "Day " + Game_Profile.getDay_num());
	}
	public void UpdateAll() {						//perform all updates
		UpdateStats();
		UpdateInventory();
		UpdateEnergy();
		UpdateBarn_Stats();
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
	public void NextDay() {							//going into nextday
		if (Game_Profile.getEnd_day() > 1) {
			Game_Profile.setEnd_day(Game_Profile.getEnd_day() - 1);													// Game contract day -1 (day closer to end)
			Game_Profile.setDay_num(Game_Profile.getDay_num() + 1);													//Day num + 1
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 1000);										//Daily 1000 allowance
			if ((Game_Profile.getAnimal_cow() >= 1) || (Game_Profile.getAnimal_goat() >= 1) || (Game_Profile.getAnimal_chicken() >= 1)) {
				Game_Profile.setAnimal_healthiness(Game_Profile.getAnimal_healthiness() - 1);							//Animal health - 1 daily
			}
			

			// Update & Refresh ALL STATUS
			Game_Profile = new Game_Profile(Game_Profile.getFarmer_type(), Game_Profile.getFarmer_gold()	// farmer_type,  farmer_gold
					, Game_Profile.getDay_num(), Game_Profile.getFarmer_name(),Game_Profile.getFarm_name()	// day_num, String farmer_name, String farm_name
					,Game_Profile.getFarm_type(), 30, 30, 60, 60				// farm_type,  price_tomato_seed,  price_pumpkin_seed,  price_pea_seed,  price_lettuce_seed
					, 90, 90, 60, 100, 210										// price_turnip_seed,  price_corn_seed,  price_burger,  price_fertilizer,  price_relic_chair
					, 150, 600, 15, 0, Game_Profile.getFarmer_tomato()			// price_water_jar,  price_axe,  price_mask,  cart_total,  farmer_tomato
					, Game_Profile.getFarmer_pumpkin(), Game_Profile.getFarmer_pea(), Game_Profile.getFarmer_lettuce()// farmer_pumpkin,  farmer_pea,  farmer_lettuce
					, Game_Profile.getFarmer_turnip(), Game_Profile.getFarmer_corn(), Game_Profile.getFarmer_tomato_seed()//  farmer_turnip,  farmer_corn,  farmer_tomato_seed
					, Game_Profile.getFarmer_pumpkin_seed(), Game_Profile.getFarmer_pea_seed()	// farmer_pumpkin_seed,  farmer_pea_seed
					,Game_Profile.getFarmer_lettuce_seed(), Game_Profile.getFarmer_turnip_seed()	// farmer_lettuce_seed,  farmer_turnip_seed
					, Game_Profile.getFarmer_corn_seed(), Game_Profile.getFarmer_burger(), Game_Profile.getFarmer_fertilizer()	// farmer_corn_seed,  farmer_burger, farmer_fertilizer
					, Game_Profile.getFarmer_relic_chair(), Game_Profile.getFarmer_water_jar(), Game_Profile.getFarmer_axe()//farmer_relic_chair,  farmer_water_jar, farmer_axe
					, Game_Profile.getFarmer_mask(), Game_Profile.getFarmer_corn_feed(), Game_Profile.getAnimal_happiness()// farmer_mask,  farmer_corn_feed,  animal_happiness
					, true , 3, Game_Profile.getAnimal_healthiness(), Game_Profile.getAnimal_cow()// bool feed_animal, farmer_energy,  animal_healthiness, animal_cow  
					, Game_Profile.getAnimal_goat(), Game_Profile.getAnimal_chicken(), Game_Profile.isPlot_1_available(), Game_Profile.isPlot_2_available()//animal_goat,  animal_chicken, bool plot_1_available, bool plot_2_available
					, Game_Profile.isPlot_3_available(), Game_Profile.isPlot_4_available(), Game_Profile.getPlot_1_harvest_time(), Game_Profile.getPlot_2_harvest_time()//bool plot_3_available, bool plot_4_available,plot_1_harvest_time, plot_2_harvest_time
					, Game_Profile.getPlot_3_harvest_time(), Game_Profile.getPlot_4_harvest_time() //plot_3_harvest_time,  plot_4_harvest_time	
					, true, Game_Profile.isUnlock_plot4(), Game_Profile.getPlot_1_plant(), Game_Profile.getPlot_2_plant()//bool watering, bool unlock_plot_4, Str plot_1_plant, Str plot_2_plant 
					, Game_Profile.getPlot_3_plant(), Game_Profile.getPlot_4_plant(), 0, Game_Profile.getRelic_aura()	//Str plot_3_plant, Str plot_4_plant,Profit, relic_aura
					, true, 0,Game_Profile.getAxe_durability() , true, Game_Profile.getEnd_day());		// bool rest, bool eat_burger,  axe_durability, bool fertilizing, int end_day
			FarmerType_advantage();																		//Provide advantage to farmer base on farmer_type
			AnimalAllowance();																						//daily bonus from animal cocunt * happiness
			MorningMessage();
			HiddenEvent();
			UpdateAll();
		} else if (Game_Profile.getEnd_day() == 1){														//End of game contract
			Game_Profile.setEnd_day(Game_Profile.getEnd_day() - 1);													// Game contract is ended
			switchPanels(Inventory);
			if (Game_Profile.getFarmer_mask() > 20) {							//Limit of mask bonus = 20
				Game_Profile.setFarmer_mask(20);
			}
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + (Game_Profile.getAnimal_cow() * 13500) + (Game_Profile.getAnimal_goat() * 9000)
					+ (Game_Profile.getAnimal_chicken() * 3300) + (Game_Profile.getFarmer_mask() * 45));					//Calculate final sumup with bonus (mask hidden event) 
			
			
			Dialog.setText("<html>Well done " + Game_Profile.getFarmer_name() +" Your farm looks GREAT!<br>"							//Greet
					
					+ "So you have: " + Game_Profile.getAnimal_cow() + " Cow, " + Game_Profile.getAnimal_goat() + " Goat, "				//Show counting bonus to player
							+ "" + Game_Profile.getAnimal_chicken() + " Chicken, " + Game_Profile.getFarmer_mask() + " Mask. "
							
							+ "That will brings you " + (Game_Profile.getAnimal_cow() * 13500) + "G " 								//Show user the amount of bonus
									+ (Game_Profile.getAnimal_goat() * 9000) + "G " + (Game_Profile.getAnimal_chicken() * 3300) + "G " + (Game_Profile.getFarmer_mask() * 300) + " G. <br>"
											
									+ "And your total GOLD will now become " + Game_Profile.getFarmer_gold() + "<br>"					//Show Actual gold amount
									
													+ "Thanks for playing! You can now call yourself a Real FARMER!!! [End Game]");				//Thanks & let user know game is end
			UpdateAll();																													//Update stats, for player to check gold
		}
	}
	public void AnimalAllowance() { 					//Calculate and allowance from animal {cow, goat, chicken}:({150,100,50}*happiness)

		
		if (Game_Profile.getAnimal_healthiness() <= 3) {
			Dialog.setText("Your animals seems to be in a sour mood, take care of them before they get sick.");
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
	public void MorningMessage() {							//Print message every new day
		if (Game_Profile.getAnimal_healthiness() <= 3) {
			Dialog.setText("Your animals seems to be in a sour mood, take care of them before they get sick.");
		}else {
		Dialog.setText("<html>My farm is getting bigger.. Let's work harder!<br>"
				+ "Day = " + Game_Profile.getDay_num());
		}
	}
	public void HiddenEvent() {								//Hidden event in game
		if (Game_Profile.getRelic_aura() == 3 ) {
			Dialog.setText("<html>We heard that you have a vintage relic chair, can we rent it for a museum exihbition?<br>"
					+ "...<br>Yes?? Good to hear that! We will pay you 2000G in return.<br> [+2000G]");
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 2000);				//Update farmer gold
			Game_Profile.setRest(false);													//Cant rest for the day
			UpdateStats();
		}
	}
	public void cartClear() { 								//Clear cart algorithm for supermarket
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
	}
	public void switchPanels(JPanel panel) { 				//Switch panel method
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.getIgnoreRepaint();
		layeredPane.revalidate();
		
	}
	public void clearTrade_checkbox() {						//Algorithm prepared for clear button in trading market
		sell_1.setSelected(false);
		sell_2.setSelected(false);
		sell_3.setSelected(false);
		sell_4.setSelected(false);
		sell_5.setSelected(false);
		sell_6.setSelected(false);
		sell_6.setSelected(false);
		sell_7.setSelected(false);
		sell_8.setSelected(false);
		sell_9.setSelected(false);
		sell_10.setSelected(false);
		sell_11.setSelected(false);
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
	}	
	public void initFrame() {								//init component in frame and panel
		layeredPane.setBounds(10, 81, 714, 291);
		layeredPane.setLayout(new CardLayout(0, 0));
		Main_Scene.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Main_Scene.setLayout(null);
		Inventory.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Inventory.setLayout(null);
		Inventory.setOpaque(true);
		Trade_Market.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));	
		Trade_Market.setLayout(null);
		Farm_Panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Farm_Panel.setLayout(null);
		
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
	public void initFarm() {								//Init all component in farm panel
		btnSeeding.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSeeding.setBounds(59, 257, 111, 23);
		crop_1_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		crop_1_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		crop_1_lbl.setBounds(30, 10, 140, 30);

		crop_2_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		crop_2_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		crop_2_lbl.setBounds(200, 10, 140, 30);

		crop_3_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		crop_3_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		crop_3_lbl.setBounds(370, 10, 140, 30);

		crop_4_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		crop_4_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		crop_4_lbl.setBounds(540, 10, 140, 30);

		crop_icon_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		crop_icon_1.setBackground(new Color(152, 251, 152));
		crop_icon_1.setHorizontalAlignment(SwingConstants.CENTER);
		crop_icon_1.setBounds(30, 40, 140, 140);
		crop_icon_1.setOpaque(true);

		crop_icon_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		crop_icon_2.setBackground(new Color(152, 251, 152));
		crop_icon_2.setHorizontalAlignment(SwingConstants.CENTER);
		crop_icon_2.setBounds(200, 40, 140, 140);
		crop_icon_2.setOpaque(true);

		crop_icon_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		crop_icon_3.setBackground(new Color(152, 251, 152));
		crop_icon_3.setHorizontalAlignment(SwingConstants.CENTER);
		crop_icon_3.setBounds(370, 40, 140, 140);
		crop_icon_3.setOpaque(true);

		crop_icon_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 14));
		crop_icon_4.setBackground(new Color(152, 251, 152));
		crop_icon_4.setHorizontalAlignment(SwingConstants.CENTER);
		crop_icon_4.setBounds(540, 40, 140, 140);
		crop_icon_4.setOpaque(true);
		
		farm_Info.setFont(new Font("Tahoma", Font.BOLD, 11));
		farm_Info.setBounds(580, 257, 89, 23);	
		
		// Init 4 checkBox

		chckbxCrop_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		chckbxCrop_1.setBounds(73, 185, 97, 23);				

		chckbxCrop_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		chckbxCrop_2.setBounds(243, 185, 97, 23);			
		
		chckbxCrop_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		chckbxCrop_3.setBounds(413, 185, 97, 23);
		
		chckbxCrop_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		chckbxCrop_4.setBounds(583, 185, 97, 23);
		
		btnWatering.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnWatering.setBounds(371, 234, 111, 23);			
		CropSelection();									// All Crop selection checkbox
		btnHarvesting.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHarvesting.setBounds(371, 257, 111, 23);
	
		
}	
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
	public void initSuperMarket() { 						//Init component in supermarket
		
		Supermarket_Panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Supermarket_Panel.setBackground(new Color(100, 149, 237));
		Supermarket_Panel.setLayout(null);
		Supermarket_Panel.setOpaque(true);
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
		
	}
	public void initInventory() {							//Init component in Inventory panel
		UpdateInventory();
		// Init Inventory Panel
		// Follow with inventory items

		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(10, 0, 265, 35);

		//Inventory Seeds - Icon
		
		Tomato_seed.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/seed_tomatoes.jpg")));
		Tomato_seed.setBounds(0, 40, 32, 32);
		
		Pumpkin_Seed.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/seed_pumpkins.jpg")));
		Pumpkin_Seed.setBounds(0, 73, 32, 32);

		Pea_Seed.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/seed_pea.jpg")));
		Pea_Seed.setBounds(0, 106, 32, 32);

		Lettuce_Seed.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/seed_lettuce.jpg")));
		Lettuce_Seed.setBounds(0, 139, 32, 32);

		Turnip_Seed.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/seed_turnips.jpg")));
		Turnip_Seed.setBounds(0, 172, 32, 32);

		Corn_Seed.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/seed_corn.jpg")));
		Corn_Seed.setBounds(0, 205, 32, 32);

		corn_feed.setBackground(new Color(222, 184, 135));
		corn_feed.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Cut_Grass_2.png")));
		corn_feed.setBounds(0, 238, 32, 32);
		corn_feed.setOpaque(true);
		
		//Inventory Seeds - Label
		
		tomato_seed_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		tomato_seed_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		tomato_seed_lbl.setBounds(33, 43, 70, 32);

		pumpkin_seed_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		pumpkin_seed_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		pumpkin_seed_lbl.setBounds(33, 73, 70, 32);

		pea_seed_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		pea_seed_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		pea_seed_lbl.setBounds(33, 106, 70, 32);

		lettuce_seed_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lettuce_seed_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		lettuce_seed_lbl.setBounds(33, 139, 70, 32);

		turnip_seed_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		turnip_seed_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		turnip_seed_lbl.setBounds(33, 172, 70, 32);

		corn_seed_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		corn_seed_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		corn_seed_lbl.setBounds(33, 205, 70, 32);

		corn_feed_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		corn_feed_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		corn_feed_lbl.setBounds(33, 238, 70, 32);

		//Inventory Seeds - Quantity
		tomato_seed_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		tomato_seed_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		tomato_seed_qtn.setBounds(104, 43, 32, 32);

		pumpkin_seed_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		pumpkin_seed_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		pumpkin_seed_qtn.setBounds(104, 73, 32, 32);

		pea_seed_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		pea_seed_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		pea_seed_qtn.setBounds(104, 106, 32, 32);

		lettuce_seed_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		lettuce_seed_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		lettuce_seed_qtn.setBounds(104, 139, 32, 32);

		turnip_seed_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		turnip_seed_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		turnip_seed_qtn.setBounds(104, 172, 32, 32);

		corn_seed_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		corn_seed_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		corn_seed_qtn.setBounds(104, 205, 32, 32);

		corn_feed_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		corn_feed_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		corn_feed_qtn.setBounds(104, 238, 32, 32);

		//Inventory Crops - Icon
		
		Tomato.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_tomato.jpg")));
		Tomato.setBounds(137, 43, 32, 32);

		Pumpkin.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_pumpkin.jpg")));
		Pumpkin.setBounds(137, 73, 32, 32);

		Pea.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_pea.jpg")));
		Pea.setBounds(137, 106, 32, 32);
		
		Lettuce.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_lettuce.jpg")));
		Lettuce.setBounds(137, 139, 32, 32);

		Turnip.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_turnip.jpg")));
		Turnip.setBounds(137, 172, 32, 32);

		Corn.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_corn.jpg")));
		Corn.setBounds(137, 205, 32, 32);

		Unknown.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		Unknown.setHorizontalAlignment(SwingConstants.CENTER);
		Unknown.setBounds(137, 238, 32, 32);

		//Inventory Crops - Label
		
		tomato_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		tomato_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		tomato_lbl.setBounds(170, 43, 70, 32);
		
		pumpkin_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		pumpkin_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		pumpkin_lbl.setBounds(170, 73, 70, 32);
		
		pea_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		pea_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		pea_lbl.setBounds(170, 106, 70, 32);

		lettuce_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lettuce_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		lettuce_lbl.setBounds(170, 139, 70, 32);

		turnip_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		turnip_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		turnip_lbl.setBounds(170, 172, 70, 32);

		corn_lbl.setHorizontalAlignment(SwingConstants.CENTER);
	    corn_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		corn_lbl.setBounds(170, 205, 70, 32);
		
		unknown_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		unknown_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		unknown_lbl.setBounds(170, 238, 70, 32);
	
		//Init Inventory Crops - Quantity
		
		tomato_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		tomato_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		tomato_qtn.setBounds(241, 43, 32, 32);

		pumpkin_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		pumpkin_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		pumpkin_qtn.setBounds(241, 73, 32, 32);

		pea_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		pea_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		pea_qtn.setBounds(241, 106, 32, 32);
		
		lettuce_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		lettuce_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		lettuce_qtn.setBounds(241, 139, 32, 32);
			
		turnip_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		turnip_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		turnip_qtn.setBounds(241, 172, 32, 32);

		corn_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		corn_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		corn_qtn.setBounds(241, 205, 32, 32);
		
		unknown__qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		unknown__qtn.setHorizontalAlignment(SwingConstants.CENTER);
		unknown__qtn.setBounds(241, 236, 32, 32);
		
		// Inventory - Tools & Items - Quantity
		
		axe_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		axe_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		axe_qtn.setBounds(489, 34, 22, 50);

		fertilizer_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		fertilizer_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		fertilizer_qtn.setBounds(668, 136, 22, 50);

		burger_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		burger_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		burger_qtn.setBounds(668, 34, 22, 50);

		relic_chair_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		relic_chair_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		relic_chair_qtn.setBounds(489, 85, 22, 50);

		water_jar_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		water_jar_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		water_jar_qtn.setBounds(668, 85, 22, 50);
	
		mask_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		mask_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		mask_qtn.setBounds(489, 139, 22, 50);
		
		//Inventory Tools & Items - Label
		
		Axe_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		Axe_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Axe_lbl.setBounds(418, 34, 70, 50);

		burger_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		burger_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		burger_lbl.setBounds(588, 34, 70, 50);

		water_jar_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		water_jar_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		water_jar_lbl.setBounds(588, 85, 70, 50);

		relic_chair_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		relic_chair_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		relic_chair_lbl.setBounds(418, 82, 70, 50);

		fertilizer_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		fertilizer_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		fertilizer_lbl.setBounds(588, 139, 70, 50);

		Mask.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		Mask.setHorizontalAlignment(SwingConstants.CENTER);
		Mask.setBounds(418, 139, 70, 50);
		
		
		// Inventory - Tools & Item - Icon
		
		Axe.setBackground(new Color(222, 184, 135));
		Axe.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Axe.png")));
		Axe.setBounds(358, 34, 50, 50);
		Axe.setOpaque(true);
	
		Burger.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Honey_Ham.png")));
		Burger.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		Burger.setBackground(new Color(222, 184, 135));
		Burger.setBounds(528, 34, 50, 50);
		Burger.setOpaque(true);

		Mask_lbl.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Mask_lbl.setBackground(new Color(222, 184, 135));
		Mask_lbl.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Visor.png")));
		Mask_lbl.setBounds(358, 134, 50, 50);
		Mask_lbl.setOpaque(true);

		Fertilizer.setBackground(new Color(222, 184, 135));
		Fertilizer.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Bucket-o-poop.png")));
		Fertilizer.setBounds(528, 134, 50, 50);
		Fertilizer.setOpaque(true);

		Relic_Chair.setBackground(new Color(222, 184, 135));
		Relic_Chair.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Relic_Chair.png")));
		Relic_Chair.setBounds(358, 84, 50, 50);
		Relic_Chair.setOpaque(true);
		
		Water_Jar.setBackground(new Color(222, 184, 135));
		Water_Jar.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Electric_Milk_1.png")));
		Water_Jar.setBounds(528, 84, 50, 50);
		
		Water_Jar.setOpaque(true);
			
		// Inventory - Animal - Icon
		
		cow.setBackground(new Color(222, 184, 135));
		cow.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Beefalo_1.png")));
		cow.setBounds(368, 200, 40, 40);
		cow.setOpaque(true);
	
		goat.setBackground(new Color(222, 184, 135));
		goat.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Volt_Goat_1.png")));
		goat.setBounds(368, 240, 40, 40);
		goat.setOpaque(true);
	
		chicken.setBackground(new Color(222, 184, 135));
		chicken.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Gobbler.png")));
		chicken.setBounds(489, 200, 40, 40);
		chicken.setOpaque(true);
	
		// Inventory - Animal - Label
		
		cow_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		cow_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		cow_lbl.setBounds(418, 205, 50, 32);
	
		goat_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		goat_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		goat_lbl.setBounds(418, 238, 50, 32);
	
		chicken_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		chicken_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		chicken_lbl.setBounds(528, 205, 50, 32);

		// Inventory - Animal - Quantity
		
		cow_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		cow_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		cow_qtn.setBounds(468, 205, 22, 32);


		goat_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		goat_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		goat_qtn.setBounds(468, 237, 22, 32);

		chicken_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		chicken_qtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 11));
		chicken_qtn.setBounds(578, 205, 22, 32);
		
	}	
	public void initMainScene() {							//Init component in MainScene
		tglbtnExplain.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		tglbtnExplain.setBounds(175, 230, 75, 25);			// End of button -INFO (MainScene)
		Main_Scene_wallpaper.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Wiki-background_7.jpg")));
		Main_Scene_wallpaper.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		Main_Scene_wallpaper.setBounds(252, 11, 462, 279);
		Main_Scene_wallpaper.setOpaque(true);
		Action_with_requirements.setForeground(new Color(160, 82, 45));
		Action_with_requirements.setBackground(new Color(222, 184, 135));
		Action_with_requirements.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		Action_with_requirements.setBounds(10, 11, 240, 20);
		Action_with_requirements.setOpaque(true);
		
		
		Action_Set_Rqrm = new JLabel("<html>"
				+ "[0]Tend to crops<br>"
				+ "[1]Play with Animal<br>"
				+ "[2]Harvest Crop<br>"
				+ "[3]Tend to Farm_Land <br>");
		Action_Set_Rqrm.setForeground(new Color(184, 134, 11));
		Action_Set_Rqrm.setBackground(new Color(255, 228, 181));
		Action_Set_Rqrm.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		Action_Set_Rqrm.setBounds(10, 31, 240, 90);
		Action_Set_Rqrm.setOpaque(true);
		
		
		Action_no_requirement = new JLabel("Action_no_requirements");
		Action_no_requirement.setForeground(new Color(160, 82, 45));
		Action_no_requirement.setBackground(new Color(222, 184, 135));
		Action_no_requirement.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		Action_no_requirement.setBounds(10, 120, 240, 20);
		Action_no_requirement.setOpaque(true);
		
		
		Action_Set_Free = new JLabel("<html>"
				+ "[4]Go to Farm / Barn / Chicken hoop<br>"
				+ "[5]Shopping in Supermarket / Pharmacy<br>"
				+ "[6]Trading in Poultry Farm<br>"
				+ "[7]Feeding Animal");
		Action_Set_Free.setForeground(new Color(184, 134, 11));
		Action_Set_Free.setBackground(new Color(255, 228, 181));
		Action_Set_Free.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		Action_Set_Free.setBounds(10, 140, 240, 90);
		Action_Set_Free.setOpaque(true);
		
	}	
	public void initBarn() {								//Init component in Barn panel
		Barn_and_Chicken_Hoop_Panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		Barn_and_Chicken_Hoop_Panel.setLayout(null);
		Cow.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		Cow.setHorizontalAlignment(SwingConstants.CENTER);
		Cow.setBounds(0, 150, 357, 150);
		Goat.setHorizontalAlignment(SwingConstants.CENTER);
		Goat.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		Goat.setBounds(0, 0, 357, 150);
		Chicken.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		Chicken.setHorizontalAlignment(SwingConstants.CENTER);
		Chicken.setBounds(357, 0, 357, 150);

		happiness.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/happiness.png")));
		happiness.setBounds(614, 161, 40, 40);
		
		healthiness.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/healthiness.png")));
		healthiness.setBounds(614, 198, 40, 40);

		happiness_qtn.setText("" + Game_Profile.getAnimal_happiness());
		happiness_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		happiness_qtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		happiness_qtn.setBounds(654, 161, 40, 40);
		
		healthiness_qtn.setText("" + Game_Profile.getAnimal_healthiness());
		healthiness_qtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		healthiness_qtn.setHorizontalAlignment(SwingConstants.CENTER);
		healthiness_qtn.setBounds(654, 198, 40, 40);
		
		Feeding_Chicken.setFont(new Font("Tahoma", Font.BOLD, 11));
		Feeding_Chicken.setBounds(367, 163, 190, 23);
		
		Blank.setFont(new Font("Tahoma", Font.BOLD, 11));
		Blank.setBounds(367, 209, 190, 23);
		
		Play_In_Barn.setFont(new Font("Tahoma", Font.BOLD, 11));
		Play_In_Barn.setBounds(367, 257, 190, 23);
		
		Animal_Info.setFont(new Font("Tahoma", Font.BOLD, 11));
		Animal_Info.setBounds(625, 257, 89, 23);
		
		Check_Cart_Total.setText("CHECK TOTAL");
		Check_Cart_Total.setFont(new Font("Tahoma", Font.BOLD, 11));
		Check_Cart_Total.setBounds(365, 110, 112, 25);
		
		Purchase.setFont(new Font("Tahoma", Font.BOLD, 11));
		Purchase.setBounds(365, 150, 112, 25);
	}
	public void initTGLBtn_Box() {							//Init all toggle button, specific function in different method	   
		//Action & algorithm with more than a if else statement will be implemented in external method and get called to perform button action
		
		//INFO (MainScene)
		tglbtnExplain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				INFO_MainScene();}});								

		//WATERING (Farm)
		btnWatering.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Watering_Farm();}});//End of Action Performed // End of button -WATERING (Farm) 

		//INFO (Farm)
		farm_Info.addActionListener(new ActionListener() {		//Farm -INFO (Button)
			public void actionPerformed(ActionEvent e) {
				Dialog.setText("<html>[SEEDING] - Select Seed & Crop plot, then seed it into soil. <br>"
						+ "[WATERING] - Irrigate all your crops. Can only perform once a day <br>"
						+ "[HARVESTING] - Select Crop plot to harvest<br>");}});
		
		Seed_selection.setBounds(35, 226, 160, 20);				//SEED SELECTION (Farm)
		Seed_selection.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		Seed_selection.addItem("Pick your seed...");
		Seed_selection.addItem("Tomato");
		Seed_selection.addItem("Pumpkin");
		Seed_selection.addItem("Pea");
		Seed_selection.addItem("Lettuce");
		Seed_selection.addItem("Turnip");
		Seed_selection.addItem("Corn");						//End of -SEED SELECTION (Farm)
		
		// SEEDING Action (Farm)
		btnSeeding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SeedingAction();}}); 						//End of Seeding Action Performed
		// Feeding (Farm)
		Feeding_Chicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				feedAnimal();
			}}); 											// End of Animal feeding
		
		// BRUSH (Barn)
		Blank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dialog.setText("Brush your Lanjiao");
			}});												//End of Brush (Barn)
		//PLAY IN BARN (Barn)
		Play_In_Barn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playInBarn();}});								// End of Play (Barn)
		Animal_Info.setText("INFO");
		//INFO (Barn)
		Animal_Info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Dialog.setText("<html>[Feed Chicken] - Place Corn feed into feeding box. (Animal healthiness + 1, once a day.)<br>"
							+ "[Play football in barn ] - Consume one energy, Animals get happier."
							+ "[Animal healthiness drop by 1/day, if you dont feed them they will get sick!<br>"
							+ "[Animal happiness] Happy animal bring more profit for you[Allowance * Animal happiness]");}});	//End of -INFO (Barn)
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
				cartClear();}});														// End of CLEAR (Supermarket)
		Go_Home.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent arg0) {  					//Switch panel to main Scene
				switchPanels(Main_Scene);}});									//card layout siwtching card/panel
		Open_Inventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Inventory);}});									//card layout siwtching card/panel
		relic_chair.addActionListener(new ActionListener() {	//relic chair algorithm
			public void actionPerformed(ActionEvent e) {
				relicChair();
				}});											//End of relic chair
		eat_burger.addActionListener(new ActionListener() {		//eat burger action
			public void actionPerformed(ActionEvent e) {
				eatBurger();}});												//End of eating burger
		end_day.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		//menu button go next day
				NextDay();}});
		Go_To_Animal.addActionListener(new ActionListener() {		// menu button go to barn
			public void actionPerformed(ActionEvent e) {
				switchPanels(Barn_and_Chicken_Hoop_Panel);}});
		Go_to_farm.addActionListener(new ActionListener() {			//menu button go to farm
			public void actionPerformed(ActionEvent e) {
				switchPanels(Farm_Panel);}});
		Chop_tree_strumps.addActionListener(new ActionListener() {	//chop tree action
			public void actionPerformed(ActionEvent e) {
				chopTree();}});
		Fertilizing.addActionListener(new ActionListener() {		//fertilizing action
			public void actionPerformed(ActionEvent e) {
				fertilize();}});
		Trade_Items.addActionListener(new ActionListener() { 		// menu button go to supermarket
			public void actionPerformed(ActionEvent e) { 
				switchPanels(Supermarket_Panel);}});
		Trading_market.addActionListener(new ActionListener()  {	//menu button go to trading market
			public void actionPerformed(ActionEvent e) { 
				switchPanels(Trade_Market);}});
		btnHarvesting.addActionListener(new ActionListener() {		//Algorithm of harvesting
			public void actionPerformed(ActionEvent arg0) {
				Harvesting();}});
		Sell_btn.addActionListener(new ActionListener() { 			//Algorithm of trading (sell) 
			public void actionPerformed(ActionEvent e) {   
				Trading();
			}});
		btn_cow.addActionListener(new ActionListener() {					//algorithm of trading cow
			public void actionPerformed(ActionEvent e) {
				if (Game_Profile.getFarmer_gold() < 9000) {
					Dialog.setText("<html>Your need more GOLD");
				}else if ((Game_Profile.getAnimal_cow() ==  0) && (Game_Profile.getFarmer_gold() >= 9000)) {								// Only one cow is allowed, farmer no cow yet
					Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() - 9000);	//Update Gold
					Game_Profile.setAnimal_cow(1);									//buy one cow
					Dialog.setText("<html> Congratulations! you just got yours Farm a Cow. <br> -9000G");
					Cow.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Cow_1.jpg")));								

				} else {
					Dialog.setText("<html>Your Barn is occupied... <br>Maybe you can upgrade your farm?");
				}
				UpdateAll();																//Update all stats
			}});
		btn_goat.addActionListener(new ActionListener() {					//algorithm of trading goat
			public void actionPerformed(ActionEvent e) {
				if (Game_Profile.getFarmer_gold() < 6000) {
					Dialog.setText("<html>Your need more GOLD");
				}else if ((Game_Profile.getAnimal_goat() ==  0) && (Game_Profile.getFarmer_gold() > 6000)) {								// Only one goat is allowed, farmer no goat yet
					Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() - 6000);	//Update Gold
					Game_Profile.setAnimal_goat(1);									//buy one goat
					Dialog.setText("<html>Congratulations! you just got your Farm a Goat + 1.<br> -6000G");													
					Goat.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Sheep_2.jpg")));							//Update in Inventory

				}else {
					Dialog.setText("<html>Your Barn is occupied... <br>Maybe you can upgrade your farm?");
				}
				UpdateAll();																//Update in Inventory
			}});
		btn_chicken.addActionListener(new ActionListener() { 				//algorithm of trading chicken
			public void actionPerformed(ActionEvent e) {
				if (Game_Profile.getFarmer_gold() < 2200) {
					Dialog.setText("<html>Your need more GOLD");
				}else if ((Game_Profile.getAnimal_chicken() ==  0) && (Game_Profile.getFarmer_gold() >= 2200)) {								// Only one chicken is allowed, farmer no chicken yet
						Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() - 2200);	//Update Gold
						Game_Profile.setAnimal_chicken(1);									//buy one chicken
						Dialog.setText("<html> Congratulations! you just got your Farm a Chicken + 1.<br> -2200G");											
						Chicken.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Chicken_1.jpg")));

				} else {
						Dialog.setText("<html>Your Chicken Hoop is occupied... <br>Maybe you can upgrade your farm?");
				}
					UpdateAll();																//Update all stats
			}});		
		btn_corn_feed.addActionListener(new ActionListener() {				//algorithm of trading corn feed
			public void actionPerformed(ActionEvent e) {
				if (Game_Profile.getFarmer_gold() < 15) {
					Dialog.setText("<html>Your need more GOLD");
				}else {
					Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() - 15);				// Update Farmer Gold
					Game_Profile.setFarmer_corn_feed(Game_Profile.getFarmer_corn_feed() + 1);		// Update Farmer Corn Feed
					Dialog.setText("<html>Corn feed + 1.<br> -15G<br> Corn Feed = " + Game_Profile.getFarmer_corn_feed());
					UpdateAll();
				}}});					
		expand_farm.addActionListener(new ActionListener() {  				//algorithm of expanding farm land
			public void actionPerformed(ActionEvent e) {
				
				if ((Game_Profile.getFarmer_gold() < 2000) && (Game_Profile.isUnlock_plot4() == false)) {
					Dialog.setText("<html>Expanding your farm require tools!<br>[Insufficient GOLD]");
				}
				if (Game_Profile.isUnlock_plot4() == false) {
					if (Game_Profile.getFarmer_gold() >= 2000) {
						Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() - 2000);			//Update farmer gold
						Game_Profile.setPlot_4_available(true);										//Update crop plot 4 status
						Dialog.setText("<html>Weedling the flame torch ...<br>I found a new area to Plant!!"
								+ "<br> [You can now plants crop in Crop plot 4.<br>[-2000G]");			// Update Dialog of crop plot 4 in farm
						crop_icon_4.setText("Crop plot 4 is available");							// Show user the effect
						Game_Profile.setUnlock_plot4(true);
					}
				}else{
					Dialog.setText("Your farm is fully expanded.");
				}UpdateAll();}});}
	public void chopTree() {																	//Chop tree algorithm
		if (Game_Profile.getFarmer_energy() == 0) {																							
			Dialog.setText("<html>Chopping tree stumps required ENERGY..<br> I wish my hand wasn't that sore.");									// Farmer energy = 0, cant chop
			
		}else if ((Game_Profile.getFarmer_axe() >= 1) && (Game_Profile.getAxe_durability() > 1)) {// Check Farmer have axe,energy, durability > 1 
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 330);																//Update farmer_gold
			Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);																// Update Farmer energy - 1
			Dialog.setText("<html>Chopping tree stumps in the mountain...... <br>Sell lumber to the blacksmith for 330G.");					//Show effect to farmer
			Game_Profile.setAxe_durability(Game_Profile.getAxe_durability() - 1);															// Update Axe durability - 1
			
		}else if ((Game_Profile.getFarmer_axe() >= 1) && (Game_Profile.getAxe_durability() == 1)) {// Check Farmer have axe,energy, durability > 1 
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 330);																//Update farmer_gold
			Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);																// Update Farmer energy - 1
			Game_Profile.setAxe_durability(5);																								// Update Axe durability = 5
			Game_Profile.setFarmer_axe(Game_Profile.getFarmer_axe() - 1);																	// Update farmer axe amount - 1
			Dialog.setText("<html>Chopping tree stumps in the mountain...... <br>Sell lumber to the blacksmith for 330G.");					//Show effect to farmer
		}else {																																//Farmer dont have axe
			Dialog.setText("I cant Chop tree stumps with my bare hand...");
		}
		UpdateAll();
	}
	public void fertilize() {																	//fertilizing algorithm
		if ( Game_Profile.getFarmer_energy() == 0) {
			Dialog.setText("<html>Nobody can help you to fertilize your Crops!<br>[No ENERGY to perform fertilizing.]");
		}else if ((Game_Profile.getFarmer_fertilizer()) >= 1 && (Game_Profile.isFertilizing())) {
			Game_Profile.setFarmer_fertilizer(Game_Profile.getFarmer_fertilizer() - 1);						//Update fertilizer amount
			Game_Profile.setFertilizing(false);																//Update fertilize status, once a day
			Game_Profile.setWatering(true);																	//Update watering status = true
			Dialog.setText("<html>Manure helps crop to grow!<br> [Irrigate now to grow you crops faster.]");
		}else if (Game_Profile.getFarmer_fertilizer() == 0) {
			Dialog.setText("<html>You need to find manure from somewhere, maybe ur own feces?<br>[Fertilizer = 0]");					// No fertilizer
			
		}else if (Game_Profile.isFertilizing() == false) {
			Dialog.setText("<html>Over - fertilization can hurt benefica soil microorganisms!<br> [You already ferilized your crops today]");	//Crops is fertilized
		}
		
		UpdateAll();
	}
	public void eatBurger() {																	// Eat burger actions
		if ((Game_Profile.getEat_burger() <= 1) && (Game_Profile.getFarmer_burger() >= 1)){		// Check not allow to eat 3rd time a day
			Game_Profile.setEat_burger(Game_Profile.getEat_burger() + 1);						// Update daily eat frequent
			Game_Profile.setFarmer_burger(Game_Profile.getFarmer_burger() - 1);					//Update burger amount
			Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() + 1);					//Update Energy
			Dialog.setText("<html>Yummy, bacon egg mayo is love! I feel stronger!!"				//Display effect tp user
					+ "<br> [Energy + 1]");	
			UpdateInventory();																	// Update Inventory
			UpdateEnergy();																		//Update Energy lv
		} else {
			Dialog.setText("I'm too full to eat again.");
		}
	}
	public void relicChair() {												//relic chair actions
		//After 3days archeology came and rent your chair to show in museum , get paid 1000G

		if ((Game_Profile.getFarmer_relic_chair() >= 1) &&(Game_Profile.isRest())) {
			Game_Profile.setRelic_aura(Game_Profile.getRelic_aura() + 1);	// Getting hidden charge for special event 
			Game_Profile.setRest(false);									//Set daily rest to be used
			Dialog.setText("This vintage chair is worth for the price!");
		} else if (Game_Profile.getRelic_aura() == 0) {
			Dialog.setText("It will be good if I have a chair at home.");
		}
		else if ((Game_Profile.isRest() == false) && (Game_Profile.getRelic_aura() != 3 )) {
			Dialog.setText("I don wan to sit anymore..");
		}
	}
	public void shop_information() {							// Show supermarket product info

		if (Shop_Information.isSelected()) {	
			//Switching Label colour
			Brief_In_Shop.setBackground(new Color(175, 238, 238)); // Blue
			Shop_Description.setBackground(new Color(255, 228, 225)); // Pink
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
			Brief_In_Shop.setBackground(new Color(255, 228, 225));	// Pink
			Shop_Description.setBackground(new Color(175, 238, 238)); // Blue
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
	public void purchase() {										//Purchasing in supermarket algorithm
		// Cart_Process
		Dialog.setText("");	
		int my_cart_total = Game_Profile.getCart_total();
			
		if (chckbxItem_1.isSelected()) {
			my_cart_total += Game_Profile.getPrice_tomato_seed();
		}// [1]
		if (chckbxItem_2.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_pumpkin_seed();
		}// [2]
		if (chckbxItem_3.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_pea_seed();
		}// [3]
		if (chckbxItem_4.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_lettuce_seed();
		}// [4]
		if (chckbxItem_5.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_turnip_seed();
		}// [5]
		if (chckbxItem_6.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_corn_seed();
		}// [6]
		if (chckbxItem_7.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_burger();
		}// [7]
		if (chckbxItem_8.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_fertilizer();
		}// [8]
		if (chckbxItem_9.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_relic_chair();
		}// [9]
		if (chckbxItem_10.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_water_jar();
		}// [10]
		if (chckbxItem_11.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_axe();
		}// [11]
		if (chckbxItem_12.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_mask();
		}// [12]

		// Purchase process
		int my_current_gold = Game_Profile.getFarmer_gold();
		
		if (my_current_gold >= my_cart_total) {			// Check is Gold sufficient to buy cart_items
			if (chckbxItem_1.isSelected()) {
				
				Game_Profile.setFarmer_tomato_seed(Game_Profile.getFarmer_tomato_seed() + 1);		//Update farmer tomato seed
				my_current_gold -= Game_Profile.getPrice_tomato_seed();

			}// [1]
			if (chckbxItem_2.isSelected()) {
				
				Game_Profile.setFarmer_pumpkin_seed(Game_Profile.getFarmer_pumpkin_seed() + 1);		//Update farmer pumpkin seed
				my_current_gold -= Game_Profile.getPrice_pumpkin_seed();
			}// [2]
			if (chckbxItem_3.isSelected()) {
				
				Game_Profile.setFarmer_pea_seed(Game_Profile.getFarmer_pea_seed() + 1);		//Update farmer pea seed
				my_current_gold -= Game_Profile.getPrice_pea_seed();
			}// [3]
			if (chckbxItem_4.isSelected()) {
				
				Game_Profile.setFarmer_lettuce_seed(Game_Profile.getFarmer_lettuce_seed() + 1);		//Update farmer lettuce seed
				my_current_gold -= Game_Profile.getPrice_lettuce_seed();
			}// [4]
			if (chckbxItem_5.isSelected()) {
				
				Game_Profile.setFarmer_turnip_seed(Game_Profile.getFarmer_turnip_seed() + 1);		//Update farmer turnip seed
				my_current_gold -= Game_Profile.getPrice_turnip_seed();
			}// [5]
			if (chckbxItem_6.isSelected()) {
				
				Game_Profile.setFarmer_corn_seed(Game_Profile.getFarmer_corn_seed() + 1);		//Update farmer corn seed
				my_current_gold -= Game_Profile.getPrice_corn_seed();
			}// [6]
			if (chckbxItem_7.isSelected()) {
				Game_Profile.setFarmer_burger(Game_Profile.getFarmer_burger() + 1);		//Update farmer burger 
				my_current_gold -= Game_Profile.getPrice_burger();
			}// [7]
			if (chckbxItem_8.isSelected()) {
				
				Game_Profile.setFarmer_fertilizer(Game_Profile.getFarmer_fertilizer() + 1);		//Update farmer fertilizer 
				my_current_gold -= Game_Profile.getPrice_fertilizer();
			}// [8]
			if (chckbxItem_9.isSelected()) {
				
				Game_Profile.setFarmer_relic_chair(Game_Profile.getFarmer_relic_chair() + 1);		//Update farmer relic_chair 
				my_current_gold -= Game_Profile.getPrice_relic_chair();
			}// [9]
			if (chckbxItem_10.isSelected()) {
				
				Game_Profile.setFarmer_water_jar(Game_Profile.getFarmer_water_jar() + 1);		//Update farmer water_jar 
				my_current_gold -= Game_Profile.getPrice_water_jar();
			}// [10]
			if (chckbxItem_11.isSelected()) {
				
				Game_Profile.setFarmer_axe(Game_Profile.getFarmer_axe() + 1);		//Update farmer axe 
				my_current_gold -= Game_Profile.getPrice_axe();
			}// [11]
			if (chckbxItem_12.isSelected()) {
				
				Game_Profile.setFarmer_mask(Game_Profile.getFarmer_mask() + 1);		//Update farmer mask 
				my_current_gold -= Game_Profile.getPrice_mask();
			}// [12]
			Dialog.setText("<html> Thanks ! " + Game_Profile.getFarmer_name() + ""
					+ "<br>Hanli : The purchased item will be sent to your Farm.<br> [Gold deduct = " + my_cart_total + "]") ;
			
			
			Game_Profile.setFarmer_gold(my_current_gold);						// Update Farmer_GOLD
			UpdateInventory();													//Update inventory
			Gold_IN_Shop.setText("GOLD = " + Game_Profile.getFarmer_gold());	// Update GOLD Bag in Shop
			Stats.setText("<html>" + Game_Profile.getFarm_name() + "'s Farm<br>" 	// Update GOLD in Stats
					+ Game_Profile.getFarmer_name() + "<br>"
					+ "Gold = " + Game_Profile.getFarmer_gold() + "<br>"
							+ "Day " + Game_Profile.getDay_num());
		}
		else {
			Dialog.setText("<html> ... ... [beep beep beep] <br>"
					+ "Transaction declined.<br>"
					+ "Hanli: Check your GOLD before you come into my shop!");
		}
		
	}
	public void checkCart() {								//Check card method for supermarket
		int my_cart_total = Game_Profile.getCart_total();
		
		if (chckbxItem_1.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_tomato_seed();
		}// [1]
		if (chckbxItem_2.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_pumpkin_seed();
		}// [2]
		if (chckbxItem_3.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_pea_seed();
		}// [3]
		if (chckbxItem_4.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_lettuce_seed();
		}// [4]
		if (chckbxItem_5.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_turnip_seed();
		}// [5]
		if (chckbxItem_6.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_corn_seed();
		}// [6]
		if (chckbxItem_7.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_burger();
		}// [7]
		if (chckbxItem_8.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_fertilizer();
		}// [8]
		if (chckbxItem_9.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_relic_chair();
		}// [9]
		if (chckbxItem_10.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_water_jar();
		}// [10]
		if (chckbxItem_11.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_axe();
		}// [11]
		if (chckbxItem_12.isSelected()) {
			
			my_cart_total += Game_Profile.getPrice_mask();
		}// [12]
		Dialog.setText("Your current Cart total = " + my_cart_total);
	}
	public void playInBarn() {								//Play in Barn algorithm
		if(Game_Profile.getAnimal_happiness() >= 15) {														//Reach max animal happiness
			Dialog.setText("<html>They looks Overjoyed! I should keep up the good work.<br>[Animal hapiness = 15]");
		}else if ((Game_Profile.getAnimal_cow() >= 1) || (Game_Profile.getAnimal_goat() >= 1) || (Game_Profile.getAnimal_chicken() >= 1)) {
			if (Game_Profile.getFarmer_energy() != 0) {
				Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);							// Update energy
				Game_Profile.setAnimal_happiness(Game_Profile.getAnimal_happiness() + 1);					// Update happiness
				Dialog.setText("<html>They are having lot of fun today!<br>"								// Display effect to user
						+ "[Energy - 1] [Animal happiness + 1]<br>");
			}else {
				Dialog.setText("<html>You need some rest!");												// Display effect to user
			}
			UpdateAll();
		} else {
			Dialog.setText("You dont have animal...");
		}
	}
	public void feedAnimal() {								//Feed animal algorithm
		
		//Init local vrb for Barn activites
	if ((Game_Profile.getAnimal_cow() >= 1) || (Game_Profile.getAnimal_goat() >= 1) || (Game_Profile.getAnimal_chicken() >= 1)) {

		if ((Game_Profile.getFarmer_corn_feed() >= 1) && (Game_Profile.isFeed_animal() == true)) {

			Dialog.setText("<html>There, there, you all seems to have a good mood today.<br>"	// Display effect to user
					+ "[Corn feed -1] [Animal healthiness + 1]");
			Game_Profile.setFeed_animal(false);													// Update Feed_Animal status
			Game_Profile.setFarmer_corn_feed(Game_Profile.getFarmer_corn_feed() - 1);			// Update Corn Feed amount
			Game_Profile.setAnimal_healthiness(Game_Profile.getAnimal_healthiness() + 2);								// Update healthiness
		}
		else {
			Dialog.setText("<html>You can't feed them twice a Day, or you might not have enough Corn Feed..<br>"
					+ "Corn Feed = " + Game_Profile.getFarmer_corn_feed());
		}
		UpdateAll();
	}else {
		Dialog.setText("You dont have animal...");
	}
	}
	public void INFO_MainScene() {							//Display initial message in main scene
		if (tglbtnExplain.isSelected()) {
			Main_Scene_wallpaper.setIcon(null);
			Main_Scene_wallpaper.setBackground(new Color(222, 184, 135));
			Main_Scene_wallpaper.setText("<html>[0] Chop tree stump. 		- Can sell the lumber to blacksmith. Consume 1 Energy. <br>" 
			+ "[1] Play footbal with the Animals in Barn. 	- Happiness of Animal +1.<br>" 
			+ "[2] Harvest selected Crop & sell to Trading market.- GOLD++ <br>" 
			+ "[3] Keep Farm Land tidy and well maintained.	- Crop slot +1 <br>" 
			+ "[4] Walk towards selected place.		- Able to view Plant / Animal status.<br>" 
			+ "[5] Go to the shop.				- Purchase / Trade items.<br>" 
			+ "[6] Trade Animals with another farm (Buy & Sell)- GOLD +-<br>" 
			+ "[7] Prepare Corn_Feed for Animals.	- Animals's healthiness +1"
			+ "<br><br> *** Bunch of hidden events and random scenario!");
		}
		else {
			Main_Scene_wallpaper.setBackground(new Color(240, 240, 240)); // Set background to blank/white
			Main_Scene_wallpaper.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Wiki-background_7.jpg"))); //Show image
			Main_Scene_wallpaper.setText("");	// Update String of lblExplanation back to null
		}
	}
	public void Harvesting() {										//Harvesting algorithm
		if (Game_Profile.getFarmer_energy() == 0) {
			Dialog.setText("You should take a break!");
			
		}
		else { 																			// Do the harvesting process
			

			if ((chckbxCrop_1.isSelected()) && (Game_Profile.getPlot_1_harvest_time() <= 0) && (Game_Profile.isPlot_1_available() == false)) {
				Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);
				// Checking All 6 crops thats ready to be harvested from crop port 1
				if (Game_Profile.getPlot_1_plant() == "Tomato") {
					System.out.println("AAAA");
					Game_Profile.setFarmer_tomato(Game_Profile.getFarmer_tomato() + 9); 	// Update Crops to inventory
					Game_Profile.setPlot_1_harvest_time(0); 								// Update harvest time
					Game_Profile.setPlot_1_available(true);									// Update Crop port availability
					crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
					crop_1_lbl.setText("Plant something...");								// Update Crop port label to default
					Dialog.setText("<html> Harvested 9 Tomatoes, It will get me some gold if I sell it to the Trading Market !");
					tomato_qtn.setText("" + Game_Profile.getFarmer_tomato());	
				}else if (Game_Profile.getPlot_1_plant() == "Pumpkin") {
					Game_Profile.setFarmer_pumpkin(Game_Profile.getFarmer_pumpkin() + 9); 	// Update Crops to inventory
					Game_Profile.setPlot_1_harvest_time(0); 								// Update harvest time
					Game_Profile.setPlot_1_available(true);									// Update Crop port availability
					crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
					crop_1_lbl.setText("Plant something...");								// Update Crop port label to default
					Dialog.setText("<html> Harvested 9 Pumpkin, It will get me some gold if I sell it to the Trading Market !");
					pumpkin_qtn.setText("" + Game_Profile.getFarmer_pumpkin());	
				}else if (Game_Profile.getPlot_1_plant() == "Pea") {
					Game_Profile.setFarmer_pea(Game_Profile.getFarmer_pea() + 9); 			// Update Crops to inventory
					Game_Profile.setPlot_1_harvest_time(0); 								// Update harvest time
					Game_Profile.setPlot_1_available(true);									// Update Crop port availability
					crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
					crop_1_lbl.setText("Plant something...");								// Update Crop port label to default
					Dialog.setText("<html> Harvested 9 Pea, It will get me some gold if I sell it to the Trading Market !");
					pea_qtn.setText("" + Game_Profile.getFarmer_pea());	
				}else if (Game_Profile.getPlot_1_plant() == "Lettuce") {
					Game_Profile.setFarmer_lettuce(Game_Profile.getFarmer_lettuce() + 9); 	// Update Crops to inventory
					Game_Profile.setPlot_1_harvest_time(0); 								// Update harvest time
					Game_Profile.setPlot_1_available(true);									// Update Crop port availability
					crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
					crop_1_lbl.setText("Plant something...");								// Update Crop port label to default
					Dialog.setText("<html> Harvested 9 Lettuce, It will get me some gold if I sell it to the Trading Market !");
					lettuce_qtn.setText("" + Game_Profile.getFarmer_lettuce());	
				}else if (Game_Profile.getPlot_1_plant() == "Turnip") {
					Game_Profile.setFarmer_turnip(Game_Profile.getFarmer_turnip() + 9); 	// Update Crops to inventory
					Game_Profile.setPlot_1_harvest_time(0); 								// Update harvest time
					Game_Profile.setPlot_1_available(true);									// Update Crop port availability
					crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
					crop_1_lbl.setText("Plant something...");								// Update Crop port label to default
					Dialog.setText("<html> Harvested 9 Turnip, It will get me some gold if I sell it to the Trading Market !");
					turnip_qtn.setText("" + Game_Profile.getFarmer_turnip());	
				}else if (Game_Profile.getPlot_1_plant() == "Corn") {
					Game_Profile.setFarmer_corn(Game_Profile.getFarmer_corn() + 9); 								// Update Crops to inventory
					Game_Profile.setPlot_1_harvest_time(0); 								// Update harvest time
					Game_Profile.setPlot_1_available(true);									// Update Crop port availability
					crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
					crop_1_lbl.setText("Plant something...");								// Update Crop port label to default
					Dialog.setText("<html> Harvested 9 Corn, It will get me some gold if I sell it to the Trading Market !");
					corn_qtn.setText("" + Game_Profile.getFarmer_corn());	
				}
			
		} // End of first crop port
		else if ((chckbxCrop_1.isSelected()) && ((Game_Profile.getPlot_1_harvest_time() > 0) || (Game_Profile.isPlot_1_available() == true))){
			Dialog.setText("There's nothing for you to harvest from this Crop port!");
		}
		if ((chckbxCrop_2.isSelected()) && (Game_Profile.getPlot_2_harvest_time() <= 0) && (Game_Profile.isPlot_2_available() == false)) {
			Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);
			// Checking All 6 crops thats ready to be harvested from crop port 1
			if (Game_Profile.getPlot_2_plant() == "Tomato") {
				
				Game_Profile.setFarmer_tomato(Game_Profile.getFarmer_tomato() + 9); 	// Update Crops to inventory
				Game_Profile.setPlot_2_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_2_available(true);									// Update Crop port availability
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_2_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Tomatoes, It will get me some gold if I sell it to the Trading Market !");
				tomato_qtn.setText("" + Game_Profile.getFarmer_tomato());	
			}else if (Game_Profile.getPlot_2_plant() == "Pumpkin") {
				Game_Profile.setFarmer_pumpkin(Game_Profile.getFarmer_pumpkin() + 9); 	// Update Crops to inventory
				Game_Profile.setPlot_2_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_2_available(true);									// Update Crop port availability
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_2_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Pumpkin, It will get me some gold if I sell it to the Trading Market !");
				pumpkin_qtn.setText("" + Game_Profile.getFarmer_pumpkin());	
			}else if (Game_Profile.getPlot_2_plant() == "Pea") {
				Game_Profile.setFarmer_pea(Game_Profile.getFarmer_pea() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_2_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_2_available(true);									// Update Crop port availability
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_2_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Pea, It will get me some gold if I sell it to the Trading Market !");
				pea_qtn.setText("" + Game_Profile.getFarmer_pea());	
			}else if (Game_Profile.getPlot_2_plant() == "Lettuce") {
				Game_Profile.setFarmer_lettuce(Game_Profile.getFarmer_lettuce() + 9); 	// Update Crops to inventory
				Game_Profile.setPlot_2_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_2_available(true);									// Update Crop port availability
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_2_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Lettuce, It will get me some gold if I sell it to the Trading Market !");
				lettuce_qtn.setText("" + Game_Profile.getFarmer_lettuce());	
			}else if (Game_Profile.getPlot_2_plant() == "Turnip") {
				Game_Profile.setFarmer_turnip(Game_Profile.getFarmer_turnip() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_2_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_2_available(true);									// Update Crop port availability
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_2_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Turnip, It will get me some gold if I sell it to the Trading Market !");
				turnip_qtn.setText("" + Game_Profile.getFarmer_turnip());	
			}else if (Game_Profile.getPlot_2_plant() == "Corn") {
				Game_Profile.setFarmer_corn(Game_Profile.getFarmer_corn() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_2_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_2_available(true);									// Update Crop port availability
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_2_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Corn, It will get me some gold if I sell it to the Trading Market !");
				corn_qtn.setText("" + Game_Profile.getFarmer_corn());	
			}// End of second crop port
		}else if ((chckbxCrop_2.isSelected()) && ((Game_Profile.getPlot_2_harvest_time() > 0) || (Game_Profile.isPlot_2_available() == true))){
			Dialog.setText("There's nothing for you to harvest from this Crop port!");
		}
		if ((chckbxCrop_3.isSelected()) && (Game_Profile.getPlot_3_harvest_time() <= 0) && (Game_Profile.isPlot_3_available() == false)) {
			Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);
			// Checking All 6 crops thats ready to be harvested from crop port 1
			if (Game_Profile.getPlot_3_plant() == "Tomato") {

				Game_Profile.setFarmer_tomato(Game_Profile.getFarmer_tomato() + 9); 	// Update Crops to inventory
				Game_Profile.setPlot_3_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_3_available(true);									// Update Crop port availability
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_3_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Tomatoes, It will get me some gold if I sell it to the Trading Market !");
				tomato_qtn.setText("" + Game_Profile.getFarmer_tomato());	
			}else if (Game_Profile.getPlot_3_plant() == "Pumpkin") {
				Game_Profile.setFarmer_pumpkin(Game_Profile.getFarmer_pumpkin() + 9); 	// Update Crops to inventory
				Game_Profile.setPlot_3_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_3_available(true);									// Update Crop port availability
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_3_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Pumpkin, It will get me some gold if I sell it to the Trading Market !");
				pumpkin_qtn.setText("" + Game_Profile.getFarmer_pumpkin());	
			}else if (Game_Profile.getPlot_3_plant() == "Pea") {
				Game_Profile.setFarmer_pea(Game_Profile.getFarmer_pea() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_3_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_3_available(true);									// Update Crop port availability
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_3_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Pea, It will get me some gold if I sell it to the Trading Market !");
				pea_qtn.setText("" + Game_Profile.getFarmer_pea());	
			}else if (Game_Profile.getPlot_3_plant() == "Lettuce") {
				Game_Profile.setFarmer_lettuce(Game_Profile.getFarmer_lettuce() + 9); 	// Update Crops to inventory
				Game_Profile.setPlot_3_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_3_available(true);									// Update Crop port availability
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_3_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Lettuce, It will get me some gold if I sell it to the Trading Market !");
				lettuce_qtn.setText("" + Game_Profile.getFarmer_lettuce());	
			}else if (Game_Profile.getPlot_3_plant() == "Turnip") {
				Game_Profile.setFarmer_turnip(Game_Profile.getFarmer_turnip() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_3_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_3_available(true);									// Update Crop port availability
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_3_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Turnip, It will get me some gold if I sell it to the Trading Market !");
				turnip_qtn.setText("" + Game_Profile.getFarmer_turnip());	
			}else if (Game_Profile.getPlot_3_plant() == "Corn") {
				Game_Profile.setFarmer_corn(Game_Profile.getFarmer_corn() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_3_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_3_available(true);									// Update Crop port availability
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_3_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Corn, It will get me some gold if I sell it to the Trading Market !");
				corn_qtn.setText("" + Game_Profile.getFarmer_corn());	
			}// End of third crop port
		}else if ((chckbxCrop_3.isSelected()) && ((Game_Profile.getPlot_3_harvest_time() > 0) || (Game_Profile.isPlot_3_available() == true))){
			Dialog.setText("There's nothing for you to harvest from this Crop port!");
		}

		if ((chckbxCrop_4.isSelected()) && (Game_Profile.getPlot_4_harvest_time() <= 0) && (Game_Profile.isPlot_4_available() == false)) {
		
			Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);
			// Checking All 6 crops thats ready to be harvested from crop port 1
			if (Game_Profile.getPlot_4_plant() == "Tomato") {
				Game_Profile.setFarmer_tomato(Game_Profile.getFarmer_tomato() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_4_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_4_available(true);									// Update Crop port availability
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_4_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Tomatoes, It will get me some gold if I sell it to the Trading Market !");
				tomato_qtn.setText("" + Game_Profile.getFarmer_tomato());	
			}else if (Game_Profile.getPlot_4_plant() == "Pumpkin") {
				Game_Profile.setFarmer_pumpkin(Game_Profile.getFarmer_pumpkin() + 9); 	// Update Crops to inventory
				Game_Profile.setPlot_4_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_4_available(true);									// Update Crop port availability
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_4_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Pumpkin, It will get me some gold if I sell it to the Trading Market !");
				pumpkin_qtn.setText("" + Game_Profile.getFarmer_pumpkin());	
			}else if (Game_Profile.getPlot_4_plant() == "Pea") {
				Game_Profile.setFarmer_pea(Game_Profile.getFarmer_pea() + 9); 			// Update Crops to inventory
				Game_Profile.setPlot_4_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_4_available(true);									// Update Crop port availability
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_4_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Pea, It will get me some gold if I sell it to the Trading Market !");
				pea_qtn.setText("" + Game_Profile.getFarmer_pea());	
			}else if (Game_Profile.getPlot_4_plant() == "Lettuce") {
				Game_Profile.setFarmer_lettuce(Game_Profile.getFarmer_lettuce() + 9); 	// Update Crops to inventory
				Game_Profile.setPlot_4_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_4_available(true);									// Update Crop port availability
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_4_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Lettuce, It will get me some gold if I sell it to the Trading Market !");
				lettuce_qtn.setText("" + Game_Profile.getFarmer_lettuce());	
			}else if (Game_Profile.getPlot_4_plant() == "Turnip") {
				Game_Profile.setFarmer_turnip(Game_Profile.getFarmer_turnip() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_4_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_4_available(true);									// Update Crop port availability
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_4_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Turnip, It will get me some gold if I sell it to the Trading Market !");
				turnip_qtn.setText("" + Game_Profile.getFarmer_turnip());	
			}else if (Game_Profile.getPlot_4_plant() == "Corn") {
				Game_Profile.setFarmer_corn(Game_Profile.getFarmer_corn() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_4_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_4_available(true);									// Update Crop port availability
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_4_lbl.setText("Plant something...");								// Update Crop port label to default
				Dialog.setText("<html> Harvested 9 Corn, It will get me some gold if I sell it to the Trading Market !");
				corn_qtn.setText("" + Game_Profile.getFarmer_corn());	
			}// End of fourth crop port
		}else if ((chckbxCrop_4.isSelected()) && ((Game_Profile.getPlot_4_harvest_time() > 0) || (Game_Profile.isPlot_4_available() == true))){
			Dialog.setText("There's nothing for you to harvest from this Crop port!");
		}
		
		UpdateAll();
	}// End of check Energy condition
	}
	public void Watering_Farm() {									//Watering crops algorithm
		if (Game_Profile.isWatering()) {
			// Init local vrb for harvest_time
			

			if (Game_Profile.isPlot_1_available()) {
				//Pass
			}else if ((Game_Profile.getPlot_1_harvest_time() <= 1)) {
					Game_Profile.setPlot_1_harvest_time(0);
					crop_1_lbl.setText("Crop is ready to harvest!");
				}else {	
					Game_Profile.setPlot_1_harvest_time(Game_Profile.getPlot_1_harvest_time() - 1);
					crop_1_lbl.setText("" + Game_Profile.getPlot_1_harvest_time() + "day to fully growth");
				}// End Updating Crop Plot 1
			
			if (Game_Profile.isPlot_2_available()) {
				//Pass
			}else if ((Game_Profile.getPlot_2_harvest_time() <= 1)) {
				Game_Profile.setPlot_2_harvest_time(0);
				crop_2_lbl.setText("Crop is ready to harvest!");
			}else {	
					Game_Profile.setPlot_2_harvest_time(Game_Profile.getPlot_2_harvest_time() - 1);
					crop_2_lbl.setText("" + Game_Profile.getPlot_2_harvest_time() + "day to fully growth");
				}// End Updating Crop Plot 2
			
			if (Game_Profile.isPlot_3_available()) {
				
			}else if ((Game_Profile.getPlot_3_harvest_time() <= 1)) {
				Game_Profile.setPlot_3_harvest_time(0);
				crop_3_lbl.setText("Crop is ready to harvest!");
			}else {	
					Game_Profile.setPlot_3_harvest_time(Game_Profile.getPlot_3_harvest_time() - 1);
					crop_3_lbl.setText("" + Game_Profile.getPlot_3_harvest_time() + "day to fully growth");
				}// End Updating Crop Plot 3
			
			if ((Game_Profile.isPlot_4_available() == false) && (Game_Profile.isUnlock_plot4() == true) && (Game_Profile.getPlot_4_harvest_time() <= 1)) {
				Game_Profile.setPlot_4_harvest_time(0);
				crop_4_lbl.setText("Crop is ready to harvest!");
			}else if ((Game_Profile.isPlot_4_available() == false) && (Game_Profile.isUnlock_plot4() == true)){	
					Game_Profile.setPlot_4_harvest_time(Game_Profile.getPlot_4_harvest_time() - 1);
					crop_4_lbl.setText("" + Game_Profile.getPlot_4_harvest_time() + "day to fully growth");
				}// End Updating Crop Plot 4
			
			Game_Profile.setWatering(false);				//Update watering is done for today
			Dialog.setText("<html>A good farmer will never forget to irrigate their crops!<br><br>"
					+ "[A day closer to be harvested for the growing crops...]");
		} //End of if statement
		
		else {
			Dialog.setText("It's gonna get overwhelmed if you keep on watering the crops!");
		}// Bad case Scenario
	} // End of watering
	public void Trading() {										//Sell and buy in trading market
		Game_Profile.setProfit(0);;
		
		if ((sell_1.isSelected() == true) && (Game_Profile.getFarmer_tomato() >= 1)) {
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
		if ((sell_2.isSelected() == true) && (Game_Profile.getFarmer_pumpkin() >= 1)) {
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
		if ((sell_3.isSelected() == true) && (Game_Profile.getFarmer_pea() >= 1)) {
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
		if ((sell_4.isSelected() == true) && (Game_Profile.getFarmer_lettuce() >= 1)) {
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
		if ((sell_5.isSelected() == true) && (Game_Profile.getFarmer_turnip() >= 1)) {
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
		if ((sell_6.isSelected() == true) && (Game_Profile.getFarmer_corn() >= 1)) {
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
		
		if ((sell_8.isSelected() == true) && (Game_Profile.getAnimal_cow() >= 1)) {
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 4500); 		// Update FarmerGold
			Game_Profile.setAnimal_cow(Game_Profile.getAnimal_cow() - 1);			//Update Farmer cow
			Game_Profile.setProfit(Game_Profile.getProfit() + 4500); 				// Update profit
			Cow.setIcon(new ImageIcon(GUI_body.class.getResource("")));				//Empty barn
		}else {
			sell_8.setSelected(false);
		} // End of checkBox 8
		if ((sell_9.isSelected() == true) && (Game_Profile.getAnimal_goat() >= 1)) {
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 3000); 		// Update FarmerGold
			Game_Profile.setAnimal_goat(Game_Profile.getAnimal_goat() - 1);			//Update Farmer Goat
			Game_Profile.setProfit(Game_Profile.getProfit() + 3000); 				// Update profit
			Goat.setIcon(new ImageIcon(GUI_body.class.getResource("")));				//Empty barn
		}else {
			sell_9.setSelected(false);
		} // End of checkBox 9
		if ((sell_10.isSelected() == true) && (Game_Profile.getAnimal_chicken() >= 1)) {
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 1100); 		// Update FarmerGold
			Game_Profile.setAnimal_chicken(Game_Profile.getAnimal_chicken() - 1);	//Update Farmer chicken
			Game_Profile.setProfit(Game_Profile.getProfit() + 1100); 				// Update profit
			Chicken.setIcon(new ImageIcon(GUI_body.class.getResource("")));				//Empty chicken hoop
		}else {
			sell_10.setSelected(false);
		} // End of checkBox 10
		if ((sell_11.isSelected() == true) && (Game_Profile.getFarmer_mask() >= 1)) {
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 5); 		// Update FarmerGold
			Game_Profile.setFarmer_mask(Game_Profile.getFarmer_mask() - 1);			//Update Farmer mask
			Game_Profile.setProfit(Game_Profile.getProfit() + 5); 					// Update profit
		}else {
			sell_11.setSelected(false);
		} // End of checkBox 11
		
		if (Game_Profile.getProfit() >= 400 ) {
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 100);
			Dialog.setText("<html>Good Work! " + Game_Profile.getFarmer_name() + "<br>"
					+ "Heres another 100G for your bonus! [Receive bonus from KANG.] <br>"
					+ "Profit of this crate = " + (Game_Profile.getProfit() + 100));
		}else if (Game_Profile.getProfit() == 0) {
			Dialog.setText("The Crate is EMPTY!");
		}
		else {
		
			Dialog.setText("Profit of this crate = " + Game_Profile.getProfit());
		}	// End of Sell Process
			
		Game_Profile.setProfit(0);													// Clear Profit after using it														
		UpdateInventory();															// Update Inventory
 //End of selling action - 

	 Stats.setText("<html>" + Game_Profile.getFarm_name() + "'s Farm<br>" 			// Update GOLD in Stats
	+ Game_Profile.getFarmer_name() + "<br>"
	+ "Gold = " + Game_Profile.getFarmer_gold() + "<br>"
			+ "Day " + Game_Profile.getDay_num());
		
	}
	public void CropSelection() {									//Seed choosing algorithm

		//checkBox_1 action
		chckbxCrop_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			// Prompt user to select 1 crop plot at a time
				chckbxCrop_2.setSelected(false);
				chckbxCrop_3.setSelected(false);
				chckbxCrop_4.setSelected(false);
			}
		});//checkBox_1 action End
	
		//checkBox_2 action
		chckbxCrop_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		// Prompt user to select 1 crop plot at a time
				chckbxCrop_1.setSelected(false);
				chckbxCrop_3.setSelected(false);
				chckbxCrop_4.setSelected(false);
			}
		});//checkBox_2 action End
		
		//checkBox_3 action
		chckbxCrop_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		// Prompt user to select 1 crop plot at a time
				chckbxCrop_1.setSelected(false);
				chckbxCrop_2.setSelected(false);
				chckbxCrop_4.setSelected(false);
			}
		});//checkBox_3 action End
		//checkBox_4 action
		chckbxCrop_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		// Prompt user to select 1 crop plot at a time
				chckbxCrop_1.setSelected(false);
				chckbxCrop_2.setSelected(false);
				chckbxCrop_3.setSelected(false);
			}
		});//checkBox_4 action End
	}
 	// Getter and Setter for GUI_body_frame
	public JFrame getFrame() { 
		return frmBackToNature;
	}
	public void SeedingAction() {								//seeding process algorithm
		String seed = (String)Seed_selection.getSelectedItem();
		
		if (seed == "Tomato" ) {
			//Selection = 1
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_tomato_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 1.");
				crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_tomato_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_1_plant(seed);
				Game_Profile.setPlot_1_harvest_time(2);
				crop_1_lbl.setText("" + Game_Profile.getPlot_1_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_1_available(false);
				int tomato = Game_Profile.getFarmer_tomato_seed();															// Update seed amount
				Game_Profile.setFarmer_tomato_seed(tomato -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available() == false)) {
				Dialog.setText("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_tomato_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 2.");
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_tomato_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_2_plant(seed);
				Game_Profile.setPlot_2_harvest_time(2);
				crop_2_lbl.setText("" + Game_Profile.getPlot_2_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_2_available(false);
				int tomato = Game_Profile.getFarmer_tomato_seed();	// Update seed amount
				Game_Profile.setFarmer_tomato_seed(tomato -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available() == false)) {
				Dialog.setText("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_tomato_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 3.");
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_tomato_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_3_plant(seed);
				Game_Profile.setPlot_3_harvest_time(2);
				crop_3_lbl.setText("" + Game_Profile.getPlot_3_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_3_available(false);
				int tomato = Game_Profile.getFarmer_tomato_seed();															// Update seed amount
				Game_Profile.setFarmer_tomato_seed(tomato -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available() == false)) {
				Dialog.setText("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available()) && (Game_Profile.isUnlock_plot4())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_tomato_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 4.");
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_tomato_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_4_plant(seed);
				Game_Profile.setPlot_4_harvest_time(2);
				crop_4_lbl.setText("" + Game_Profile.getPlot_4_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_4_available(false);
				int tomato = Game_Profile.getFarmer_tomato_seed();															// Update seed amount
				Game_Profile.setFarmer_tomato_seed(tomato -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");					// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available() == false)) {
				Dialog.setText("<html> Crop Plot 4 is currently not available.");		// Crop Plot not available
			} 
			if(Game_Profile.isUnlock_plot4() == false) {																	//Crop plot 4 is LOCKED
				Dialog.setText("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}	// End of fourth checkbox
		
			
		}// End of Tomato
		else if (seed == "Pumpkin" ) {
			//Selection = 2
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pumpkin_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 1.");
				crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_pumpkin_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_1_plant(seed);
				Game_Profile.setPlot_1_harvest_time(3);
				crop_1_lbl.setText("" + Game_Profile.getPlot_1_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_1_available(false);
				int pumpkin = Game_Profile.getFarmer_pumpkin_seed();														// Update seed amount
				Game_Profile.setFarmer_pumpkin_seed(pumpkin -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available() == false)) {
				Dialog.setText("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pumpkin_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 2.");
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_pumpkin_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_2_plant(seed);
				Game_Profile.setPlot_2_harvest_time(3);
				crop_2_lbl.setText("" + Game_Profile.getPlot_2_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_2_available(false);
				int pumpkin = Game_Profile.getFarmer_pumpkin_seed();														// Update seed amount
				Game_Profile.setFarmer_pumpkin_seed(pumpkin -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available() == false)) {
				Dialog.setText("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pumpkin_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 3.");
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_pumpkin_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_3_plant(seed);
				Game_Profile.setPlot_3_harvest_time(3);
				crop_3_lbl.setText("" + Game_Profile.getPlot_3_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_3_available(false);
				int pumpkin = Game_Profile.getFarmer_pumpkin_seed();														// Update seed amount
				Game_Profile.setFarmer_pumpkin_seed(pumpkin -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available() == false)) {
				Dialog.setText("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available()) && (Game_Profile.isUnlock_plot4())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_pumpkin_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 4.");
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_pumpkin_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_4_plant(seed);
				Game_Profile.setPlot_4_harvest_time(3);
				crop_4_lbl.setText("" + Game_Profile.getPlot_4_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_4_available(false);
				int pumpkin = Game_Profile.getFarmer_pumpkin_seed();														// Update seed amount
				Game_Profile.setFarmer_pumpkin_seed(pumpkin -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available() == false)) {
				Dialog.setText("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			if(Game_Profile.isUnlock_plot4() == false) {																	//Crop plot 4 is LOCKED
				Dialog.setText("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			} // End of fourth checkbox
		
		
			
		}// End of Pumpkin
		else if (seed == "Pea" ) {
			//Selection = 3
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pea_seed() >= 1) {																//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 1.");
				crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_pea_Large.jpg")));			// Set Icon to show growing crop
				Game_Profile.setPlot_1_plant(seed);
				Game_Profile.setPlot_1_harvest_time(2);
				crop_1_lbl.setText("" + Game_Profile.getPlot_1_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_1_available(false);
				int pea = Game_Profile.getFarmer_pea_seed();																// Update seed amount
				Game_Profile.setFarmer_pea_seed(pea -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available() == false)) {
				Dialog.setText("<html> Crop Plot 1 is currently not available.");		// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pea_seed() >= 1) {																//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 2.");
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_pea_Large.jpg")));			// Set Icon to show growing crop
				Game_Profile.setPlot_2_plant(seed);
				Game_Profile.setPlot_2_harvest_time(2);
				crop_2_lbl.setText("" + Game_Profile.getPlot_2_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_2_available(false);
				int pea = Game_Profile.getFarmer_pea_seed();																// Update seed amount
				Game_Profile.setFarmer_pea_seed(pea -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available() == false)) {
				Dialog.setText("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pea_seed() >= 1) {																//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 3.");
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_pea_Large.jpg")));			// Set Icon to show growing crop
				Game_Profile.setPlot_3_plant(seed);
				Game_Profile.setPlot_3_harvest_time(2);
				crop_3_lbl.setText("" + Game_Profile.getPlot_3_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_3_available(false);
				int pea = Game_Profile.getFarmer_pea_seed();																// Update seed amount
				Game_Profile.setFarmer_pea_seed(pea -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available()) && (Game_Profile.isUnlock_plot4())) {
				Dialog.setText("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available()) && (Game_Profile.isUnlock_plot4())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_pea_seed() >= 1) {																//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 4.");
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_pea_Large.jpg")));			// Set Icon to show growing crop
				Game_Profile.setPlot_4_plant(seed);
				Game_Profile.setPlot_4_harvest_time(2);
				crop_4_lbl.setText("" + Game_Profile.getPlot_4_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_4_available(false);
				int pea = Game_Profile.getFarmer_pea_seed();																// Update seed amount
				Game_Profile.setFarmer_pea_seed(pea -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available() == false)) {
				Dialog.setText("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			if(Game_Profile.isUnlock_plot4() == false) {																	//Crop plot 4 is LOCKED
				Dialog.setText("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}// End of fourth checkbox
		
		
			
		}// End of Pea
		
		else if (seed == "Lettuce" ) {
			//Selection = 4
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_lettuce_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 1.");
				crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_lettuce_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_1_plant(seed);
				Game_Profile.setPlot_1_harvest_time(1);
				crop_1_lbl.setText("" + Game_Profile.getPlot_1_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_1_available(false);
				int Lettuce = Game_Profile.getFarmer_lettuce_seed();														// Update seed amount
				Game_Profile.setFarmer_lettuce_seed(Lettuce -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available() == false)) {
				Dialog.setText("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_lettuce_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 2.");
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_lettuce_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_2_plant(seed);
				Game_Profile.setPlot_2_harvest_time(1);
				crop_2_lbl.setText("" + Game_Profile.getPlot_2_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_2_available(false);
				int Lettuce = Game_Profile.getFarmer_lettuce_seed();														// Update seed amount
				Game_Profile.setFarmer_lettuce_seed(Lettuce -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available() == false)) {
				Dialog.setText("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_lettuce_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 3.");
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_lettuce_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_3_plant(seed);
				Game_Profile.setPlot_3_harvest_time(1);
				crop_3_lbl.setText("" + Game_Profile.getPlot_3_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_3_available(false);
				int Lettuce = Game_Profile.getFarmer_lettuce_seed();														// Update seed amount
				Game_Profile.setFarmer_lettuce_seed(Lettuce -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available() == false)) {
				Dialog.setText("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available()) && (Game_Profile.isUnlock_plot4())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_lettuce_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 4.");
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_lettuce_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_4_plant(seed);
				Game_Profile.setPlot_4_harvest_time(1);
				crop_4_lbl.setText("" + Game_Profile.getPlot_4_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_4_available(false);
				int Lettuce = Game_Profile.getFarmer_lettuce_seed();														// Update seed amount
				Game_Profile.setFarmer_lettuce_seed(Lettuce -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available() == false)) {
				Dialog.setText("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			if(Game_Profile.isUnlock_plot4() == false) {																	//Crop plot 4 is LOCKED
				Dialog.setText("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}// End of fourth checkbox
		
			
		}// End of Lettuce
		
		else if (seed == "Turnip" ) {
			//Selection = 5
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_turnip_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 1.");
				crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_turnip_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_1_plant(seed);
				Game_Profile.setPlot_1_harvest_time(3);
				crop_1_lbl.setText("" + Game_Profile.getPlot_1_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_1_available(false);
				int Turnip = Game_Profile.getFarmer_turnip_seed();															// Update seed amount
				Game_Profile.setFarmer_turnip_seed(Turnip -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available() == false)) {
				Dialog.setText("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_turnip_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 2.");
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_turnip_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_2_plant(seed);
				Game_Profile.setPlot_2_harvest_time(3);
				crop_2_lbl.setText("" + Game_Profile.getPlot_2_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_2_available(false);
				int Turnip = Game_Profile.getFarmer_turnip_seed();															// Update seed amount
				Game_Profile.setFarmer_turnip_seed(Turnip -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available() == false)) {
				Dialog.setText("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_turnip_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 3.");
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_turnip_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_3_plant(seed);
				Game_Profile.setPlot_3_harvest_time(3);
				crop_3_lbl.setText("" + Game_Profile.getPlot_3_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_3_available(false);
				int Turnip = Game_Profile.getFarmer_turnip_seed();															// Update seed amount
				Game_Profile.setFarmer_turnip_seed(Turnip -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available() == false)) {
				Dialog.setText("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available()) && (Game_Profile.isUnlock_plot4())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_turnip_seed() >= 1) {															//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 4.");
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_turnip_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_4_plant(seed);
				Game_Profile.setPlot_4_harvest_time(3);
				crop_4_lbl.setText("" + Game_Profile.getPlot_4_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_4_available(false);
				int Turnip = Game_Profile.getFarmer_turnip_seed();															// Update seed amount
				Game_Profile.setFarmer_turnip_seed(Turnip -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available() == false)) {
				Dialog.setText("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			if(Game_Profile.isUnlock_plot4() == false) {																	//Crop plot 4 is LOCKED
				Dialog.setText("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}// End of fourth checkbox
		
		
			
		}// End of Turnip
		
		else if (seed == "Corn" ) {
			//Selection = 5
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_corn_seed() >= 1) {																//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 1.");	
				crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_corn_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_1_plant(seed);
				Game_Profile.setPlot_1_harvest_time(2);
				crop_1_lbl.setText("" + Game_Profile.getPlot_1_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_1_available(false);
				int Corn = Game_Profile.getFarmer_corn_seed();																// Update seed amount
				Game_Profile.setFarmer_corn_seed(Corn -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available() == false)) {
				Dialog.setText("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox	
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_corn_seed() >= 1) {																//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 2.");
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_corn_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_2_plant(seed);
				Game_Profile.setPlot_2_harvest_time(2);
				crop_2_lbl.setText("" + Game_Profile.getPlot_2_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_2_available(false);
				int Corn = Game_Profile.getFarmer_corn_seed();																// Update seed amount
				Game_Profile.setFarmer_corn_seed(Corn -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available() == false)) {
				Dialog.setText("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_corn_seed() >= 1) {																//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 3.");
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_corn_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_3_plant(seed);
				Game_Profile.setPlot_3_harvest_time(2);
				crop_3_lbl.setText("" + Game_Profile.getPlot_3_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_3_available(false);
				int Corn = Game_Profile.getFarmer_corn_seed();																// Update seed amount
				Game_Profile.setFarmer_corn_seed(Corn -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available() == false)) {
				Dialog.setText("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available()) && (Game_Profile.isUnlock_plot4())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_corn_seed() >= 1) {																//Check seed availability
				Dialog.setText("<html> Seeding " + seed + "into Crop Plot 4.");
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/crop_corn_Large.jpg")));		// Set Icon to show growing crop
				Game_Profile.setPlot_4_plant(seed);
				Game_Profile.setPlot_4_harvest_time(2);
				crop_4_lbl.setText("" + Game_Profile.getPlot_4_harvest_time() + "day to fully growth");
				Game_Profile.setPlot_4_available(false);
				int Corn = Game_Profile.getFarmer_corn_seed();																// Update seed amount
				Game_Profile.setFarmer_corn_seed(Corn -= 1);
				}// End of seed check
				else {	
					Dialog.setText("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available() == false)) {
				Dialog.setText("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			if(Game_Profile.isUnlock_plot4() == false) {																	//Crop plot 4 is LOCKED
				Dialog.setText("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}// End of fourth checkbox
		
		
			
		}// End of Corn
		UpdateAll();

	}
	public void setFrame(JFrame frame) {
		this.frmBackToNature = frame;
		frmBackToNature.setTitle("Back to nature");
	}
	public GUI_setup getGUI_setup() {
		return this.GUI_setup;
	}
}



