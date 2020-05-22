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



public class GUI_body {
	

	//Init Game_Profile to get vrb from another class 
	private Game_Profile Game_Profile;
	private Controller controller;
	private GUI_setup GUI_setup;
	private Inventory Inventory;
	private Barn Barn;
	private MainScene Main_Scene;
	private Base_Component Base_Component;
	private SuperMarket SuperMarket;
	private TradingMarket TradingMarket;

	//Init frame & Panel
	JFrame frmBackToNature;
	JPanel Farm_Panel = new JPanel();
	JLayeredPane layeredPane = new JLayeredPane();
	
	//Init panel
	JPanel Main_Scene_JPanel = new JPanel();
	JPanel Inventory_JPanel = new JPanel();
	JPanel Barn_JPanel = new JPanel();
	JPanel SuperMarket_JPanel = new JPanel();
	JPanel TradingMarket_JPanel = new JPanel();
 
	
	//Init vrb to process Button A & B
	int game_state = 2;
	int condition = 0;
	



	
	
	//Init button
	
	final JButton btnWatering = new JButton("WATERING");
	JButton farm_Info = new JButton("INFO");
	JButton btnSeeding = new JButton("SEEDING");
	JButton btnHarvesting = new JButton("HARVESTING");
	
	



	
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
	


//	private final JLabel lblNewLabel = new JLabel("New label");
//	private final JLabel lblNewLabel_1 = new JLabel("New label");
//	private final JLabel lblNewLabel_2 = new JLabel("New label");
	

	
	
	
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
		Game_Profile = new Game_Profile(1, 450, 1, "Little Shit","Bullshit"	//int farmer_type, int farmer_gold, int day_num, String farmer_name, String farm_name
				,0, 30, 30, 60, 60							//int farm_type, int price_tomato_seed, int price_pumpkin_seed, int price_pea_seed, int price_lettuce_seed
				, 90, 90, 60, 100, 210						//int price_turnip_seed, int price_corn_seed, int price_burger, int price_fertilizer, int price_relic_chair
				, 150, 600, 15, 0, 5						//int price_water_jar, int price_axe, int price_mask, int cart_total, int farmer_tomato
				, 5, 5, 5, 5, 5								//int farmer_pumpkin, int farmer_pea, int farmer_lettuce, int farmer_turnip, int farmer_corn
				, 5, 5, 5, 5, 5 							//int farmer_tomato_seed, int farmer_pumpkin_seed, int farmer_pea_seed, int farmer_lettuce_seed, int farmer_turnip_seed
				, 5, 3, 0, 0, 0								//int farmer_corn_seed, int farmer_burger, int farmer_fertilizer, int farmer_relic_chair, int farmer_water_jar
				, 2, 10, 3, 3, true 						//int farmer_axe, int farmer_mask, int farmer_corn_feed, int animal_happiness, boolean feed_animal
				, 4, 5, 0, 0, 0								//int farmer_energy, int animal_healthiness, int animal_cow, int animal_goat, int animal_chicken
				, true, true, true, true, 0					//boolean plot_1_available, boolean plot_2_available, boolean plot_3_available, boolean plot_4_available int plot_1_harvest_time
				, 0, 0, 0, true, false						//int plot_2_harvest_time, int plot_3_harvest_time, int plot_4_harvest_time	, boolean watering, boolean unlock_plot_4
				, "", "", "", "", 0							//String plot_1_plant, String plot_2_plant, String plot_3_plant, String plot_4_plant, int profit, 											
				, 0, true, 0, 5, true, 5);				//boolean harvest,int harvested_crops, int relic_aura, boolean rest, boolean eat_burger, int axe_durability, boolean fertilizing, end day =5
//				
		initialize_body();
		
		Barn.updateAll();

	}

	
	
	
	public GUI_body(Game_Structure.Game_Profile game_Profile) {			//Constructor to get variable from Game_Profile
		super();
		Game_Profile = game_Profile;	
//		
		initialize_body();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize_body() {
		// Set new frame and add all component into it
		//The building/ constructing of Frame!
		
		setFrame(new JFrame());
		initFrame();
		
		Base_Component = new Base_Component(frmBackToNature,Game_Profile);
		controller = new Controller(Game_Profile, Base_Component);	
		Inventory = new Inventory(Inventory_JPanel, Game_Profile);
		Main_Scene = new MainScene(Main_Scene_JPanel);
		Barn = new Barn(Barn_JPanel, Game_Profile, controller, Base_Component,Inventory);
		SuperMarket = new SuperMarket(SuperMarket_JPanel, Game_Profile, Base_Component,Inventory );
		TradingMarket = new TradingMarket(TradingMarket_JPanel, Game_Profile, Base_Component,Inventory, Barn );
		
		initTGLBtn_Box();
		initFarm();
		
		//initTradingMarket();
		controller.FarmerType_advantage();		// Please refer to the comment in mmethod, however most method literally means what it means...
		Barn.updateAll();
		//Init Frame & Menu bar
		
		getFrame().setBounds(500, 250, 750, 520);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		getFrame().getContentPane().add(layeredPane);
		
		
		//Init panel
		layeredPane.add(Main_Scene_JPanel, "name_199216101866600");
		layeredPane.add(Inventory_JPanel, "name_324997804399200");
		layeredPane.add(TradingMarket_JPanel, "name_458198648692800");
		layeredPane.add(Farm_Panel, "name_194781174265600");
		layeredPane.add(Barn_JPanel, "name_194785506405200");
		layeredPane.add(SuperMarket_JPanel, "name_194790290626100");
		Barn_JPanel.setLayout(null);

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

		// Add all toggle button
		
		Farm_Panel.add(btnWatering);
		Farm_Panel.add(farm_Info);
		Farm_Panel.add(Seed_selection);
		Farm_Panel.add(btnSeeding);

		Farm_Panel.add(btnHarvesting);

		
		
		

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
			controller.FarmerType_advantage();																		//Provide advantage to farmer base on farmer_type
			controller.AnimalAllowance();																						//daily bonus from animal cocunt * happiness
			MorningMessage();
			HiddenEvent();
			Barn.updateAll();
		} else if (Game_Profile.getEnd_day() == 1){														//End of game contract
			Game_Profile.setEnd_day(Game_Profile.getEnd_day() - 1);													// Game contract is ended
			switchPanels(Inventory_JPanel);
			if (Game_Profile.getFarmer_mask() > 20) {							//Limit of mask bonus = 20
				Game_Profile.setFarmer_mask(20);
			}
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + (Game_Profile.getAnimal_cow() * 13500) + (Game_Profile.getAnimal_goat() * 9000)
					+ (Game_Profile.getAnimal_chicken() * 3300) + (Game_Profile.getFarmer_mask() * 45));					//Calculate final sumup with bonus (mask hidden event) 
			
			
			setDialog("<html>Well done " + Game_Profile.getFarmer_name() +" Your farm looks GREAT!<br>"							//Greet
					
					+ "So you have: " + Game_Profile.getAnimal_cow() + " Cow, " + Game_Profile.getAnimal_goat() + " Goat, "				//Show counting bonus to player
							+ "" + Game_Profile.getAnimal_chicken() + " Chicken, " + Game_Profile.getFarmer_mask() + " Mask. "
							
							+ "That will brings you " + (Game_Profile.getAnimal_cow() * 13500) + "G " 								//Show user the amount of bonus
									+ (Game_Profile.getAnimal_goat() * 9000) + "G " + (Game_Profile.getAnimal_chicken() * 3300) + "G " + (Game_Profile.getFarmer_mask() * 300) + " G. <br>"
											
									+ "And your total GOLD will now become " + Game_Profile.getFarmer_gold() + "<br>"					//Show Actual gold amount
									
													+ "Thanks for playing! You can now call yourself a Real FARMER!!! [End Game]");				//Thanks & let user know game is end
			Barn.updateAll();																													//Update stats, for player to check gold
		}
	}


	public void MorningMessage() {							//Print message every new day
		if (Game_Profile.getAnimal_healthiness() <= 3) {
			setDialog("Your animals seems to be in a sour mood, take care of them before they get sick.");
		}else {
		setDialog("<html>My farm is getting bigger.. Let's work harder!<br>"
				+ "Day = " + Game_Profile.getDay_num());
		}
	}
	public void HiddenEvent() {								//Hidden event in game
		if (Game_Profile.getRelic_aura() == 3 ) {
			setDialog("<html>We heard that you have a vintage relic chair, can we rent it for a museum exihbition?<br>"
					+ "...<br>Yes?? Good to hear that! We will pay you 2000G in return.<br> [+2000G]");
			Game_Profile.setFarmer_gold(Game_Profile.getFarmer_gold() + 2000);				//Update farmer gold
			Game_Profile.setRest(false);													//Cant rest for the day
			Base_Component.UpdateStats();
		}
	}

	public void switchPanels(JPanel panel) { 				//Switch panel method
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.getIgnoreRepaint();
		layeredPane.revalidate();
		
	}

	public void initFrame() {								//init component in frame and panel
		layeredPane.setBounds(10, 81, 714, 291);
		layeredPane.setLayout(new CardLayout(0, 0));
		Main_Scene_JPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Main_Scene_JPanel.setLayout(null);
		Inventory_JPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Inventory_JPanel.setLayout(null);
		Inventory_JPanel.setOpaque(true);
		TradingMarket_JPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));	
		TradingMarket_JPanel.setLayout(null);
		Farm_Panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Farm_Panel.setLayout(null);
		

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



	
		

	public void initTGLBtn_Box() {							//Init all toggle button, specific function in different method	   
		//Action & algorithm with more than a if else statement will be implemented in external method and get called to perform button action
		
							

		//WATERING (Farm)
		btnWatering.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Watering_Farm();}});//End of Action Performed // End of button -WATERING (Farm) 

		//INFO (Farm)
		farm_Info.addActionListener(new ActionListener() {		//Farm -INFO (Button)
			public void actionPerformed(ActionEvent e) {
				setDialog("<html>[SEEDING] - Select Seed & Crop plot, then seed it into soil. <br>"
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
												

			
		Base_Component.getGo_Home().addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent arg0) {  					//Switch panel to main Scene
				switchPanels(Main_Scene_JPanel);}});									//card layout siwtching card/panel
		Base_Component.getOpen_Inventory().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Inventory_JPanel);}});									//card layout siwtching card/panel
		Base_Component.getRelic_chair().addActionListener(new ActionListener() {	//relic chair algorithm
			public void actionPerformed(ActionEvent e) {
				relicChair();
				}});											//End of relic chair
		Base_Component.getEat_burger().addActionListener(new ActionListener() {		//eat burger action
			public void actionPerformed(ActionEvent e) {
				eatBurger();}});												//End of eating burger
		Base_Component.getEnd_day().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		//menu button go next day
				NextDay();}});
		Base_Component.getGo_To_Animal().addActionListener(new ActionListener() {		// menu button go to barn
			public void actionPerformed(ActionEvent e) {
				switchPanels(Barn_JPanel);}});
		Base_Component.getGo_to_farm().addActionListener(new ActionListener() {			//menu button go to farm
			public void actionPerformed(ActionEvent e) {
				switchPanels(Farm_Panel);}});
		Base_Component.getChop_tree_strumps().addActionListener(new ActionListener() {	//chop tree action
			public void actionPerformed(ActionEvent e) {
				getController().chopTree();
				Barn.updateAll();}});
		
		Base_Component.getFertilizing().addActionListener(new ActionListener() {		//fertilizing action
			public void actionPerformed(ActionEvent e) {
				fertilize();}});
		Base_Component.getTrade_Items().addActionListener(new ActionListener() { 		// menu button go to supermarket
			public void actionPerformed(ActionEvent e) { 
				switchPanels(SuperMarket_JPanel);}});
		Base_Component.getTrading_market().addActionListener(new ActionListener()  {	//menu button go to trading market
			public void actionPerformed(ActionEvent e) { 
				switchPanels(TradingMarket_JPanel);}});
		btnHarvesting.addActionListener(new ActionListener() {		//Algorithm of harvesting
			public void actionPerformed(ActionEvent arg0) {
				Harvesting();}});
}
	
	public void fertilize() {																	//fertilizing algorithm
		if ( Game_Profile.getFarmer_energy() == 0) {
			setDialog("<html>Nobody can help you to fertilize your Crops!<br>[No ENERGY to perform fertilizing.]");
		}else if ((Game_Profile.getFarmer_fertilizer()) >= 1 && (Game_Profile.isFertilizing())) {
			Game_Profile.setFarmer_fertilizer(Game_Profile.getFarmer_fertilizer() - 1);						//Update fertilizer amount
			Game_Profile.setFertilizing(false);																//Update fertilize status, once a day
			Game_Profile.setWatering(true);																	//Update watering status = true
			setDialog("<html>Manure helps crop to grow!<br> [Irrigate now to grow you crops faster.]");
		}else if (Game_Profile.getFarmer_fertilizer() == 0) {
			setDialog("<html>You need to find manure from somewhere, maybe ur own feces?<br>[Fertilizer = 0]");					// No fertilizer
			
		}else if (Game_Profile.isFertilizing() == false) {
			setDialog("<html>Over - fertilization can hurt benefica soil microorganisms!<br> [You already ferilized your crops today]");	//Crops is fertilized
		}
		
		Barn.updateAll();
	}
	public void eatBurger() {																	// Eat burger actions
		if ((Game_Profile.getEat_burger() <= 1) && (Game_Profile.getFarmer_burger() >= 1)){		// Check not allow to eat 3rd time a day
			Game_Profile.setEat_burger(Game_Profile.getEat_burger() + 1);						// Update daily eat frequent
			Game_Profile.setFarmer_burger(Game_Profile.getFarmer_burger() - 1);					//Update burger amount
			Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() + 1);					//Update Energy
			setDialog("<html>Yummy, bacon egg mayo is love! I feel stronger!!"				//Display effect tp user
					+ "<br> [Energy + 1]");	
			Inventory.UpdateInventory();																	// Update Inventory
			Base_Component.UpdateEnergy();																		//Update Energy lv
		} else {
			setDialog("I'm too full to eat again.");
		}
	}
	public void relicChair() {												//relic chair actions
		//After 3days archeology came and rent your chair to show in museum , get paid 1000G

		if ((Game_Profile.getFarmer_relic_chair() >= 1) &&(Game_Profile.isRest())) {
			Game_Profile.setRelic_aura(Game_Profile.getRelic_aura() + 1);	// Getting hidden charge for special event 
			Game_Profile.setRest(false);									//Set daily rest to be used
			setDialog("This vintage chair is worth for the price!");
		} else if (Game_Profile.getRelic_aura() == 0) {
			setDialog("It will be good if I have a chair at home.");
		}
		else if ((Game_Profile.isRest() == false) && (Game_Profile.getRelic_aura() != 3 )) {
			setDialog("I don wan to sit anymore..");
		}
	}


	public void Harvesting() {										//Harvesting algorithm
		
		if (Game_Profile.getFarmer_energy() == 0) {
			setDialog("You should take a break!");
			
		}
		else { 																			// Do the harvesting process
			

			if ((chckbxCrop_1.isSelected()) && (Game_Profile.getPlot_1_harvest_time() <= 0) && (Game_Profile.isPlot_1_available() == false)) {
				Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);
				// Checking All 6 crops thats ready to be harvested from crop port 1
				if (Game_Profile.getPlot_1_plant() == "Tomato") {
					Game_Profile.setFarmer_tomato(Game_Profile.getFarmer_tomato() + 9); 	// Update Crops to inventory
					Game_Profile.setPlot_1_harvest_time(0); 								// Update harvest time
					Game_Profile.setPlot_1_available(true);									// Update Crop port availability
					crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
					crop_1_lbl.setText("Plant something...");								// Update Crop port label to default
					setDialog("<html> Harvested 9 Tomatoes, It will get me some gold if I sell it to the Trading Market !");
					
				}else if (Game_Profile.getPlot_1_plant() == "Pumpkin") {
					Game_Profile.setFarmer_pumpkin(Game_Profile.getFarmer_pumpkin() + 9); 	// Update Crops to inventory
					Game_Profile.setPlot_1_harvest_time(0); 								// Update harvest time
					Game_Profile.setPlot_1_available(true);									// Update Crop port availability
					crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
					crop_1_lbl.setText("Plant something...");								// Update Crop port label to default
					setDialog("<html> Harvested 9 Pumpkin, It will get me some gold if I sell it to the Trading Market !");
						
				}else if (Game_Profile.getPlot_1_plant() == "Pea") {
					Game_Profile.setFarmer_pea(Game_Profile.getFarmer_pea() + 9); 			// Update Crops to inventory
					Game_Profile.setPlot_1_harvest_time(0); 								// Update harvest time
					Game_Profile.setPlot_1_available(true);									// Update Crop port availability
					crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
					crop_1_lbl.setText("Plant something...");								// Update Crop port label to default
					setDialog("<html> Harvested 9 Pea, It will get me some gold if I sell it to the Trading Market !");
						
				}else if (Game_Profile.getPlot_1_plant() == "Lettuce") {
					Game_Profile.setFarmer_lettuce(Game_Profile.getFarmer_lettuce() + 9); 	// Update Crops to inventory
					Game_Profile.setPlot_1_harvest_time(0); 								// Update harvest time
					Game_Profile.setPlot_1_available(true);									// Update Crop port availability
					crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
					crop_1_lbl.setText("Plant something...");								// Update Crop port label to default
					setDialog("<html> Harvested 9 Lettuce, It will get me some gold if I sell it to the Trading Market !");
					
				}else if (Game_Profile.getPlot_1_plant() == "Turnip") {
					Game_Profile.setFarmer_turnip(Game_Profile.getFarmer_turnip() + 9); 	// Update Crops to inventory
					Game_Profile.setPlot_1_harvest_time(0); 								// Update harvest time
					Game_Profile.setPlot_1_available(true);									// Update Crop port availability
					crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
					crop_1_lbl.setText("Plant something...");								// Update Crop port label to default
					setDialog("<html> Harvested 9 Turnip, It will get me some gold if I sell it to the Trading Market !");
						
				}else if (Game_Profile.getPlot_1_plant() == "Corn") {
					Game_Profile.setFarmer_corn(Game_Profile.getFarmer_corn() + 9); 								// Update Crops to inventory
					Game_Profile.setPlot_1_harvest_time(0); 								// Update harvest time
					Game_Profile.setPlot_1_available(true);									// Update Crop port availability
					crop_icon_1.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
					crop_1_lbl.setText("Plant something...");								// Update Crop port label to default
					setDialog("<html> Harvested 9 Corn, It will get me some gold if I sell it to the Trading Market !");
						
				}
			
		} // End of first crop port
		else if ((chckbxCrop_1.isSelected()) && ((Game_Profile.getPlot_1_harvest_time() > 0) || (Game_Profile.isPlot_1_available() == true))){
			setDialog("There's nothing for you to harvest from this Crop port!");
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
				setDialog("<html> Harvested 9 Tomatoes, It will get me some gold if I sell it to the Trading Market !");
				
			}else if (Game_Profile.getPlot_2_plant() == "Pumpkin") {
				Game_Profile.setFarmer_pumpkin(Game_Profile.getFarmer_pumpkin() + 9); 	// Update Crops to inventory
				Game_Profile.setPlot_2_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_2_available(true);									// Update Crop port availability
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_2_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Pumpkin, It will get me some gold if I sell it to the Trading Market !");
					
			}else if (Game_Profile.getPlot_2_plant() == "Pea") {
				Game_Profile.setFarmer_pea(Game_Profile.getFarmer_pea() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_2_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_2_available(true);									// Update Crop port availability
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_2_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Pea, It will get me some gold if I sell it to the Trading Market !");
					
			}else if (Game_Profile.getPlot_2_plant() == "Lettuce") {
				Game_Profile.setFarmer_lettuce(Game_Profile.getFarmer_lettuce() + 9); 	// Update Crops to inventory
				Game_Profile.setPlot_2_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_2_available(true);									// Update Crop port availability
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_2_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Lettuce, It will get me some gold if I sell it to the Trading Market !");
					
			}else if (Game_Profile.getPlot_2_plant() == "Turnip") {
				Game_Profile.setFarmer_turnip(Game_Profile.getFarmer_turnip() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_2_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_2_available(true);									// Update Crop port availability
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_2_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Turnip, It will get me some gold if I sell it to the Trading Market !");
					
			}else if (Game_Profile.getPlot_2_plant() == "Corn") {
				Game_Profile.setFarmer_corn(Game_Profile.getFarmer_corn() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_2_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_2_available(true);									// Update Crop port availability
				crop_icon_2.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_2_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Corn, It will get me some gold if I sell it to the Trading Market !");
					
			}// End of second crop port
		}else if ((chckbxCrop_2.isSelected()) && ((Game_Profile.getPlot_2_harvest_time() > 0) || (Game_Profile.isPlot_2_available() == true))){
			setDialog("There's nothing for you to harvest from this Crop port!");
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
				setDialog("<html> Harvested 9 Tomatoes, It will get me some gold if I sell it to the Trading Market !");
					
			}else if (Game_Profile.getPlot_3_plant() == "Pumpkin") {
				Game_Profile.setFarmer_pumpkin(Game_Profile.getFarmer_pumpkin() + 9); 	// Update Crops to inventory
				Game_Profile.setPlot_3_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_3_available(true);									// Update Crop port availability
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_3_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Pumpkin, It will get me some gold if I sell it to the Trading Market !");
	
			}else if (Game_Profile.getPlot_3_plant() == "Pea") {
				Game_Profile.setFarmer_pea(Game_Profile.getFarmer_pea() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_3_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_3_available(true);									// Update Crop port availability
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_3_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Pea, It will get me some gold if I sell it to the Trading Market !");
					
			}else if (Game_Profile.getPlot_3_plant() == "Lettuce") {
				Game_Profile.setFarmer_lettuce(Game_Profile.getFarmer_lettuce() + 9); 	// Update Crops to inventory
				Game_Profile.setPlot_3_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_3_available(true);									// Update Crop port availability
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_3_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Lettuce, It will get me some gold if I sell it to the Trading Market !");
					
			}else if (Game_Profile.getPlot_3_plant() == "Turnip") {
				Game_Profile.setFarmer_turnip(Game_Profile.getFarmer_turnip() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_3_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_3_available(true);									// Update Crop port availability
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_3_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Turnip, It will get me some gold if I sell it to the Trading Market !");
					
			}else if (Game_Profile.getPlot_3_plant() == "Corn") {
				Game_Profile.setFarmer_corn(Game_Profile.getFarmer_corn() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_3_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_3_available(true);									// Update Crop port availability
				crop_icon_3.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_3_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Corn, It will get me some gold if I sell it to the Trading Market !");
					
			}// End of third crop port
		}else if ((chckbxCrop_3.isSelected()) && ((Game_Profile.getPlot_3_harvest_time() > 0) || (Game_Profile.isPlot_3_available() == true))){
			setDialog("There's nothing for you to harvest from this Crop port!");
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
				setDialog("<html> Harvested 9 Tomatoes, It will get me some gold if I sell it to the Trading Market !");
					
			}else if (Game_Profile.getPlot_4_plant() == "Pumpkin") {
				Game_Profile.setFarmer_pumpkin(Game_Profile.getFarmer_pumpkin() + 9); 	// Update Crops to inventory
				Game_Profile.setPlot_4_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_4_available(true);									// Update Crop port availability
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_4_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Pumpkin, It will get me some gold if I sell it to the Trading Market !");
					
			}else if (Game_Profile.getPlot_4_plant() == "Pea") {
				Game_Profile.setFarmer_pea(Game_Profile.getFarmer_pea() + 9); 			// Update Crops to inventory
				Game_Profile.setPlot_4_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_4_available(true);									// Update Crop port availability
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_4_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Pea, It will get me some gold if I sell it to the Trading Market !");
					
			}else if (Game_Profile.getPlot_4_plant() == "Lettuce") {
				Game_Profile.setFarmer_lettuce(Game_Profile.getFarmer_lettuce() + 9); 	// Update Crops to inventory
				Game_Profile.setPlot_4_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_4_available(true);									// Update Crop port availability
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_4_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Lettuce, It will get me some gold if I sell it to the Trading Market !");
					
			}else if (Game_Profile.getPlot_4_plant() == "Turnip") {
				Game_Profile.setFarmer_turnip(Game_Profile.getFarmer_turnip() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_4_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_4_available(true);									// Update Crop port availability
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_4_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Turnip, It will get me some gold if I sell it to the Trading Market !");
					
			}else if (Game_Profile.getPlot_4_plant() == "Corn") {
				Game_Profile.setFarmer_corn(Game_Profile.getFarmer_corn() + 9); 								// Update Crops to inventory
				Game_Profile.setPlot_4_harvest_time(0); 								// Update harvest time
				Game_Profile.setPlot_4_available(true);									// Update Crop port availability
				crop_icon_4.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show background
				crop_4_lbl.setText("Plant something...");								// Update Crop port label to default
				setDialog("<html> Harvested 9 Corn, It will get me some gold if I sell it to the Trading Market !");
					
			}// End of fourth crop port
		}else if ((chckbxCrop_4.isSelected()) && ((Game_Profile.getPlot_4_harvest_time() > 0) || (Game_Profile.isPlot_4_available() == true))){
			setDialog("There's nothing for you to harvest from this Crop port!");
		}
		
		Barn.updateAll();
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
			setDialog("<html>A good farmer will never forget to irrigate their crops!<br><br>"
					+ "[A day closer to be harvested for the growing crops...]");
		} //End of if statement
		
		else {
			setDialog("It's gonna get overwhelmed if you keep on watering the crops!");
		}// Bad case Scenario
	} // End of watering

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
				setDialog("<html> Seeding " + seed + "into Crop Plot 1.");
				Game_Profile.setPlot_1_plant(seed);
				Game_Profile.setPlot_1_harvest_time(2);
				Game_Profile.setPlot_1_available(false);
				int tomato = Game_Profile.getFarmer_tomato_seed();															// Update seed amount
				Game_Profile.setFarmer_tomato_seed(tomato -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available() == false)) {
				setDialog("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_tomato_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 2.");
				Game_Profile.setPlot_2_plant(seed);
				Game_Profile.setPlot_2_harvest_time(2);
				Game_Profile.setPlot_2_available(false);
				int tomato = Game_Profile.getFarmer_tomato_seed();	// Update seed amount
				Game_Profile.setFarmer_tomato_seed(tomato -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available() == false)) {
				setDialog("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_tomato_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 3.");
				Game_Profile.setPlot_3_plant(seed);
				Game_Profile.setPlot_3_harvest_time(2);
				Game_Profile.setPlot_3_available(false);
				int tomato = Game_Profile.getFarmer_tomato_seed();															// Update seed amount
				Game_Profile.setFarmer_tomato_seed(tomato -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available() == false)) {
				setDialog("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available()) && (Game_Profile.isUnlock_plot4())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_tomato_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 4.");
				Game_Profile.setPlot_4_plant(seed);
				Game_Profile.setPlot_4_harvest_time(2);
				Game_Profile.setPlot_4_available(false);
				int tomato = Game_Profile.getFarmer_tomato_seed();															// Update seed amount
				Game_Profile.setFarmer_tomato_seed(tomato -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");					// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available() == false)) {
				setDialog("<html> Crop Plot 4 is currently not available.");		// Crop Plot not available
			} 
			else if(Game_Profile.isUnlock_plot4() == false && (chckbxCrop_4.isSelected())) {																	//Crop plot 4 is LOCKED
				setDialog("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}	// End of fourth checkbox
		
			
		}// End of Tomato
		else if (seed == "Pumpkin" ) {
			//Selection = 2
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pumpkin_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 1.");
				Game_Profile.setPlot_1_plant(seed);
				Game_Profile.setPlot_1_harvest_time(3);
				
				Game_Profile.setPlot_1_available(false);
				int pumpkin = Game_Profile.getFarmer_pumpkin_seed();														// Update seed amount
				Game_Profile.setFarmer_pumpkin_seed(pumpkin -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available() == false)) {
				setDialog("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pumpkin_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 2.");
				Game_Profile.setPlot_2_plant(seed);
				Game_Profile.setPlot_2_harvest_time(3);
				Game_Profile.setPlot_2_available(false);
				int pumpkin = Game_Profile.getFarmer_pumpkin_seed();														// Update seed amount
				Game_Profile.setFarmer_pumpkin_seed(pumpkin -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available() == false)) {
				setDialog("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pumpkin_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 3.");
				Game_Profile.setPlot_3_plant(seed);
				Game_Profile.setPlot_3_harvest_time(3);
				Game_Profile.setPlot_3_available(false);
				int pumpkin = Game_Profile.getFarmer_pumpkin_seed();														// Update seed amount
				Game_Profile.setFarmer_pumpkin_seed(pumpkin -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available() == false)) {
				setDialog("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available()) && (Game_Profile.isUnlock_plot4())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_pumpkin_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 4.");
				Game_Profile.setPlot_4_plant(seed);
				Game_Profile.setPlot_4_harvest_time(3);
				Game_Profile.setPlot_4_available(false);
				int pumpkin = Game_Profile.getFarmer_pumpkin_seed();														// Update seed amount
				Game_Profile.setFarmer_pumpkin_seed(pumpkin -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available() == false)) {
				setDialog("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			else if(Game_Profile.isUnlock_plot4() == false && (chckbxCrop_4.isSelected())) {																	//Crop plot 4 is LOCKED
				setDialog("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			} // End of fourth checkbox
		
		
			
		}// End of Pumpkin
		else if (seed == "Pea" ) {
			//Selection = 3
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pea_seed() >= 1) {																//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 1.");
				Game_Profile.setPlot_1_plant(seed);
				Game_Profile.setPlot_1_harvest_time(2);
				Game_Profile.setPlot_1_available(false);
				int pea = Game_Profile.getFarmer_pea_seed();																// Update seed amount
				Game_Profile.setFarmer_pea_seed(pea -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available() == false)) {
				setDialog("<html> Crop Plot 1 is currently not available.");		// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pea_seed() >= 1) {																//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 2.");
				Game_Profile.setPlot_2_plant(seed);
				Game_Profile.setPlot_2_harvest_time(2);
				Game_Profile.setPlot_2_available(false);
				int pea = Game_Profile.getFarmer_pea_seed();																// Update seed amount
				Game_Profile.setFarmer_pea_seed(pea -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available() == false)) {
				setDialog("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pea_seed() >= 1) {																//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 3.");
				Game_Profile.setPlot_3_plant(seed);
				Game_Profile.setPlot_3_harvest_time(2);
				Game_Profile.setPlot_3_available(false);
				int pea = Game_Profile.getFarmer_pea_seed();																// Update seed amount
				Game_Profile.setFarmer_pea_seed(pea -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available()) && (Game_Profile.isUnlock_plot4())) {
				setDialog("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available()) && (Game_Profile.isUnlock_plot4())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_pea_seed() >= 1) {																//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 4.");
				Game_Profile.setPlot_4_plant(seed);
				Game_Profile.setPlot_4_harvest_time(2);
				Game_Profile.setPlot_4_available(false);
				int pea = Game_Profile.getFarmer_pea_seed();																// Update seed amount
				Game_Profile.setFarmer_pea_seed(pea -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available() == false)) {
				setDialog("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			else if(Game_Profile.isUnlock_plot4() == false && (chckbxCrop_4.isSelected())) {																	//Crop plot 4 is LOCKED
				setDialog("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}// End of fourth checkbox
		
		
			
		}// End of Pea
		
		else if (seed == "Lettuce" ) {
			//Selection = 4
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_lettuce_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 1.");
				Game_Profile.setPlot_1_plant(seed);
				Game_Profile.setPlot_1_harvest_time(1);
				Game_Profile.setPlot_1_available(false);
				int Lettuce = Game_Profile.getFarmer_lettuce_seed();														// Update seed amount
				Game_Profile.setFarmer_lettuce_seed(Lettuce -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available() == false)) {
				setDialog("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_lettuce_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 2.");
				Game_Profile.setPlot_2_plant(seed);
				Game_Profile.setPlot_2_harvest_time(1);
				Game_Profile.setPlot_2_available(false);
				int Lettuce = Game_Profile.getFarmer_lettuce_seed();														// Update seed amount
				Game_Profile.setFarmer_lettuce_seed(Lettuce -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available() == false)) {
				setDialog("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_lettuce_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 3.");
				Game_Profile.setPlot_3_plant(seed);
				Game_Profile.setPlot_3_harvest_time(1);
				Game_Profile.setPlot_3_available(false);
				int Lettuce = Game_Profile.getFarmer_lettuce_seed();														// Update seed amount
				Game_Profile.setFarmer_lettuce_seed(Lettuce -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available() == false)) {
				setDialog("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available()) && (Game_Profile.isUnlock_plot4())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_lettuce_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 4.");
				Game_Profile.setPlot_4_plant(seed);
				Game_Profile.setPlot_4_harvest_time(1);
				Game_Profile.setPlot_4_available(false);
				int Lettuce = Game_Profile.getFarmer_lettuce_seed();														// Update seed amount
				Game_Profile.setFarmer_lettuce_seed(Lettuce -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available() == false)) {
				setDialog("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			else if(Game_Profile.isUnlock_plot4() == false && (chckbxCrop_4.isSelected())) {																	//Crop plot 4 is LOCKED
				setDialog("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}// End of fourth checkbox
		
			
		}// End of Lettuce
		
		else if (seed == "Turnip" ) {
			//Selection = 5
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_turnip_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 1.");
				Game_Profile.setPlot_1_plant(seed);
				Game_Profile.setPlot_1_harvest_time(3);
				Game_Profile.setPlot_1_available(false);
				int Turnip = Game_Profile.getFarmer_turnip_seed();															// Update seed amount
				Game_Profile.setFarmer_turnip_seed(Turnip -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available() == false)) {
				setDialog("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_turnip_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 2.");
				Game_Profile.setPlot_2_plant(seed);
				Game_Profile.setPlot_2_harvest_time(3);
				Game_Profile.setPlot_2_available(false);
				int Turnip = Game_Profile.getFarmer_turnip_seed();															// Update seed amount
				Game_Profile.setFarmer_turnip_seed(Turnip -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available() == false)) {
				setDialog("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_turnip_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 3.");
				Game_Profile.setPlot_3_plant(seed);
				Game_Profile.setPlot_3_harvest_time(3);
				Game_Profile.setPlot_3_available(false);
				int Turnip = Game_Profile.getFarmer_turnip_seed();															// Update seed amount
				Game_Profile.setFarmer_turnip_seed(Turnip -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available() == false)) {
				setDialog("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available()) && (Game_Profile.isUnlock_plot4())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_turnip_seed() >= 1) {															//Check seed availability
					setDialog("<html> Seeding " + seed + "into Crop Plot 4.");
					Game_Profile.setPlot_4_plant(seed);
					Game_Profile.setPlot_4_harvest_time(3);
					Game_Profile.setPlot_4_available(false);
					int Turnip = Game_Profile.getFarmer_turnip_seed();															// Update seed amount
					Game_Profile.setFarmer_turnip_seed(Turnip -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available() == false)) {
				setDialog("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			else if(Game_Profile.isUnlock_plot4() == false && (chckbxCrop_4.isSelected())) {																	//Crop plot 4 is LOCKED
				setDialog("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}// End of fourth checkbox
		
		
			
		}// End of Turnip
		
		else if (seed == "Corn" ) {
			//Selection = 5
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_corn_seed() >= 1) {																//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 1.");	
				Game_Profile.setPlot_1_plant(seed);
				Game_Profile.setPlot_1_harvest_time(2);
				Game_Profile.setPlot_1_available(false);
				int Corn = Game_Profile.getFarmer_corn_seed();																// Update seed amount
				Game_Profile.setFarmer_corn_seed(Corn -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.isPlot_1_available() == false)) {
				setDialog("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox	
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_corn_seed() >= 1) {																//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 2.");
				Game_Profile.setPlot_2_plant(seed);
				Game_Profile.setPlot_2_harvest_time(2);
				Game_Profile.setPlot_2_available(false);
				int Corn = Game_Profile.getFarmer_corn_seed();																// Update seed amount
				Game_Profile.setFarmer_corn_seed(Corn -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.isPlot_2_available() == false)) {
				setDialog("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_corn_seed() >= 1) {																//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 3.");
				Game_Profile.setPlot_3_plant(seed);
				Game_Profile.setPlot_3_harvest_time(2);
				Game_Profile.setPlot_3_available(false);
				int Corn = Game_Profile.getFarmer_corn_seed();																// Update seed amount
				Game_Profile.setFarmer_corn_seed(Corn -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.isPlot_3_available() == false)) {
				setDialog("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available()) && (Game_Profile.isUnlock_plot4())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_corn_seed() >= 1) {																//Check seed availability
				setDialog("<html> Seeding " + seed + "into Crop Plot 4.");
				Game_Profile.setPlot_4_plant(seed);
				Game_Profile.setPlot_4_harvest_time(2);
				Game_Profile.setPlot_4_available(false);
				int Corn = Game_Profile.getFarmer_corn_seed();																// Update seed amount
				Game_Profile.setFarmer_corn_seed(Corn -= 1);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.isPlot_4_available() == false)) {
				setDialog("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			else if(Game_Profile.isUnlock_plot4() == false && (chckbxCrop_4.isSelected())) {																	//Crop plot 4 is LOCKED
				setDialog("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}// End of fourth checkbox
		
		}// End of Corn
		updateAllCrop();
		Barn.updateAll();

	}
	public String getCropURL(String crop_name) {
		
		if(crop_name == "Tomato") {
			return "/game_Use/img/crop_tomato_Large.jpg";
		}
		else if(crop_name == "Pumpkin") {
			return "/game_Use/img/crop_pumpkin_Large.jpg";
		}
		else if(crop_name == "Pea") {
			return "/game_Use/img/crop_pea_Large.jpg";
		}
		else if(crop_name == "Lettuce") {
			return "/game_Use/img/crop_lettuce_Large.jpg";
		}
		else if(crop_name == "Turnip") {
			return "/game_Use/img/crop_turnip_Large.jpg";
		}
		else if(crop_name == "Corn") {
			return "/game_Use/img/crop_corn_Large.jpg";
		}
		return "";
	}
	
	public void updateCrop(JLabel crop_icon, JLabel crop_lbl,Boolean available,String crop_name,int crop_time) {
		
		
		if(available) {
			crop_icon.setIcon(new ImageIcon(GUI_body.class.getResource("")));		// Set Icon to show growing crop
			crop_lbl.setText("Plant something");
		}
		else {
			String crop_url = getCropURL(crop_name);
			crop_icon.setIcon(new ImageIcon(GUI_body.class.getResource(crop_url)));		// Set Icon to show growing crop
			crop_lbl.setText("" + crop_time + "day to fully growth");
		}
		
	
	}
	public void updateAllCrop() {
		
		updateCrop(crop_icon_1 ,crop_1_lbl, Game_Profile.isPlot_1_available(),Game_Profile.getPlot_1_plant(), Game_Profile.getPlot_1_harvest_time() );
		updateCrop(crop_icon_2 ,crop_2_lbl, Game_Profile.isPlot_2_available(),Game_Profile.getPlot_2_plant(), Game_Profile.getPlot_2_harvest_time() );
		updateCrop(crop_icon_3 ,crop_3_lbl, Game_Profile.isPlot_3_available(),Game_Profile.getPlot_3_plant(), Game_Profile.getPlot_3_harvest_time() );
		updateCrop(crop_icon_4 ,crop_4_lbl, Game_Profile.isPlot_4_available(),Game_Profile.getPlot_4_plant(), Game_Profile.getPlot_4_harvest_time() );

		
	}
	
	public void updatePlotValue() {
		Game_Profile.setFarmer_lettuce(Game_Profile.getFarmer_lettuce() + 9); 	// Update Crops to inventory
		Game_Profile.setPlot_4_harvest_time(0); 								// Update harvest time
		Game_Profile.setPlot_4_available(true);									// Update Crop port availability		
	}
	
	
	public void setFrame(JFrame frame) {
		this.frmBackToNature = frame;
		frmBackToNature.setTitle("Back to nature");
	}
	public GUI_setup getGUI_setup() {
		return this.GUI_setup;
	}
	public Controller getController() {
		return controller;
	}
	
	public void setDialog(String text) {
		Base_Component.setDialog(text);
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}
}



