package Game_Structure;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("restriction")
public class GUI_setup {
	
	
	// Init variables of game Structure
	JFrame frmScene;
	// Variables to run game structure.
	static int game_state = 0; // Modify to go in window 2 quicker
	static int condition = 0;	// Modify to go in window 2 quicker
	
	private Game_Profile Game_Profile; 
	private String farmer_name;
	@SuppressWarnings("unused")
	private int choose_end_day;
	
	// temp vrb to hold string from textfield
	private String temp_str; 
	private String farm_type;
	
	//Frame component init
	private JTextField Text_field = new JTextField();
	JLabel Menu_Title = new JLabel("SENG_201 - Farm Stimulator_2020");
	JLabel Wallpaper = new JLabel("");
	final JLabel Dialog = new JLabel("<html>Heres some instruction before you start the Game.");
	JButton btnX = new JButton("A");
	JButton btnO = new JButton("B");
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Layout_1
		GUI_setup window_0 = new GUI_setup();
		window_0.frmScene.setVisible(true);
		GUI_body bla = new GUI_body();

	}
	/**
	 * Create the application.
	 */
	public GUI_setup() {
		this.Game_Profile = new Game_Profile();
		initialize();
	}	
	public GUI_setup(Game_Structure.Game_Profile game_Profile) {						//Constructor
		super();
		this.Game_Profile = game_Profile;
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {			//Init  frame and add component
		initAll();
		frmScene = new JFrame();
		frmScene.setBackground(Color.WHITE);
		frmScene.setTitle("Back to Nature");
		frmScene.setBounds(500, 250, 750, 520);
		frmScene.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScene.getContentPane().setLayout(null);
		
		//Add component to frame
		frmScene.getContentPane().add(Menu_Title);
		frmScene.getContentPane().add(Wallpaper);
		frmScene.getContentPane().add(Dialog);
		frmScene.getContentPane().add(btnO);
		frmScene.getContentPane().add(btnX);
		frmScene.getContentPane().add(Text_field);
		
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnCancel();}});		
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnProceed();
				
			}// Action Performed End here
			
		} // Action Listener
		);} // End of button A
	public void Setup() {
		
		Game_Profile = new Game_Profile(Game_Profile.getFarmer_type(), 450, 1, farmer_name,temp_str	//int farmer_type, int farmer_gold, int day_num, String farmer_name, String farm_name
				,0, 30, 30, 60, 60							//int farm_type, int price_tomato_seed, int price_pumpkin_seed, int price_pea_seed, int price_lettuce_seed
				, 90, 90, 60, 100, 210						//int price_turnip_seed, int price_corn_seed, int price_burger, int price_fertilizer, int price_relic_chair
				, 150, 600, 15, 0, 0						//int price_water_jar, int price_axe, int price_mask, int cart_total, int farmer_tomato
				, 0, 0, 0, 0, 0								//int farmer_pumpkin, int farmer_pea, int farmer_lettuce, int farmer_turnip, int farmer_corn
				, 2, 2, 2, 2, 2 							//int farmer_tomato_seed, int farmer_pumpkin_seed, int farmer_pea_seed, int farmer_lettuce_seed, int farmer_turnip_seed
				, 2, 3, 0, 0, 0								//int farmer_corn_seed, int farmer_burger, int farmer_fertilizer, int farmer_relic_chair, int farmer_water_jar
				, 1, 2, 3, 3, true 							//int farmer_axe, int farmer_mask, int farmer_corn_feed, int animal_happiness, boolean feed_animal
				, 4, 5, 0, 0, 0								//int farmer_energy, int animal_healthiness, int animal_cow, int animal_goat, int animal_chicken
				, true, true, true, true, 0					//boolean plot_1_available, boolean plot_2_available, boolean plot_3_available, boolean plot_4_available int plot_1_harvest_time
				, 0, 0, 0, true, false						//int plot_2_harvest_time, int plot_3_harvest_time, int plot_4_harvest_time	, boolean watering, boolean unlock_plot_4
				, "", "", "", "", 0							//String plot_1_plant, String plot_2_plant, String plot_3_plant, String plot_4_plant, int profit, 											
				, 0, true, 0, 5, true, Game_Profile.getEnd_day());//boolean harvest,int harvested_crops, int relic_aura, boolean rest, boolean eat_burger, int axe_durability, boolean fertilizing
					
		GUI_body window_GUI_Body = new GUI_body(Game_Profile); 		//Moving into Main_game in new window
	 	window_GUI_Body.getFrame().setVisible(true);
	 	condition = 10; 

	}
	public void btnCancel() {				//Algorithm of Button B state
		if ((game_state == 1) && (condition == 3)) { 					//Act as clear button in this stage
			Text_field.setText("");
			Dialog.setText("<html>Hmm.. What is your name? <br><br><br>"
					+ "Type in the input slot... ");
			condition = 2;
		} //[1][1]

		else if ((game_state == 1) && (condition == 6)) { 				//Cancel and go back previous stage
			//farm_type = Integer.parseInt(Text_field.getText());
			Dialog.setText("<html>Return the selected farm typewith 1 DIGIT.<br>"
					+ "return 0 - Blacksmith  (Extra Energy/days)<br>"
					+ "return 1 - Traveller (Animal happiness + 1 /day)<br>"
					+ "return 2 - Agricultural Engineering (Extra 30G on every crops sold)<br>"
					+ "return 3 - I am useless (Challenge mode) (YOLO!!)");
	         Text_field.setText("");
	         condition = 5;
	         
		} //[1][6]
		else if ((game_state == 1) && (condition == 8)) { 				//Cancel and go back previous stage
			//farm_type = Integer.parseInt(Text_field.getText());
			Text_field.setText("");
			Dialog.setText("<html>So what will be the name of the Farm? <br><br><br>" + 
					"							Type in the input slot... ");
		 	condition = 7; // 
		} //[1][8]
		else if ((game_state == 1) && (condition == 9)) { 				//Cancel and go back previous stage
			
			Game_Profile.setEnd_day(10);								// Set end day
			Dialog.setText("<html> Nicely done " + farmer_name + ".<br>"
					+ "Now lets get back to your grandpa Farm and began your new episode.<br>"
					+ "Cant wait to see your result at the end of your contract time!");
		 	condition = 10; // 
		} //[1][6] 
		
	}
	public void btnProceed() {				//Alorithm of proceeding the game
		if ((game_state == 0) && (condition == 0)) { //Introduction on key
			
			Dialog.setText("Select/Remove by using button (A | B)");	
			condition = 1;
		} //[0][0]
		else if ((game_state == 0) && (condition == 1)) {
			Dialog.setText("You can also use the blank space to type if it's necessary."); //Introduction in key
			condition = 2;
		} //[0][1]
		else if ((game_state == 0) && (condition == 2)) {
			Dialog.setText("Now, Press A to start the game..."); //Move to Setup
			game_state = 1; condition = 0;

		} //[0][2]
		else if ((game_state == 1) && (condition == 0)) { //Setup on Game
			Dialog.setText("<html>Welcome to Canterbury Town.<br>I am going to ask you a number of question.\n\n So please answer them.");
		 	condition = 1;
		} //[1][0]
		else if ((game_state == 1) && (condition == 1)) { //Setup on Game - Farmer_name
			Dialog.setText("<html>What is your name? <br><br><br>"
					+ "Type in the input slot... ");
		 	condition = 2;
		} //[1][1]
		else if ((game_state == 1) && (condition == 2)) { //Setup on Game
			
			temp_str = Text_field.getText();
		      	
		      String pattern = "^([a-zA-Z]+\\s)*[a-zA-Z]+$";					//Check if name meet condition 3-15 char, no digit or $
		      Pattern r = Pattern.compile(pattern);

		      Matcher m = r.matcher(temp_str);
		      if (m.find( ) && (temp_str.length() <= 15) && (temp_str.length() >= 3)) {
		         Dialog.setText("Is this name OK?");
				 condition = 3;
		      }else {
		         Dialog.setText("<html>Please use 3 - 15 alphabet only!<br> NO SYMBOL, NOR DIGIT!<br>"
		         		+ "What is your name?<br><br>Type in the input slot...");
		         Text_field.setText("");
		         condition = 2;
		      }
			
		} //[1][2]
		else if ((game_state == 1) && (condition == 3)) { //Setup on Game
			farmer_name = temp_str;

			Dialog.setText("Hi " + farmer_name);
			Text_field.setText("");
		 	condition = 4;
		} //[1][3]
		else if ((game_state == 1) && (condition == 4)) { //Introduction on Game
			Dialog.setText("<html>Where had you been in the last 3 years? <br>"
					+ "return 0 - Blacksmith  (Extra Energy/days)<br>"
					+ "return 1 - Traveller (Animal happiness + 1 /day)<br>"
					+ "return 2 - Agricultural Engineering (Extra 30G on every crops sold)<br>"
					+ "return 3 - I am useless (Challenge mode) (YOLO!!)");
		 	condition = 5;
		} //[1][4]
		else if ((game_state == 1) && (condition == 5)) { 			//Setup on Game - Farmer type
			farm_type = Text_field.getText();
			String pattern = "\\d+";
			
		      Pattern r = Pattern.compile(pattern);
	
		      Matcher m = r.matcher(farm_type);
		      String arr[] = { "0", "1", "2", "3"};
		      if (m.find( ) && (farm_type.length() == 1) && (Arrays.asList(arr).contains(farm_type) )){					//Only allows one digit input [0 - 3]
		    	  Dialog.setText("<html>" + farmerType_check(farm_type) + "<br>"
							+ "So this is your stength? ");
				 condition = 6;
		      }else {
		         Dialog.setText("<html>Return the selected farm typewith 1 DIGIT.<br>"
		        		 + "return 0 - Blacksmith  (Extra Energy/days)<br>"
							+ "return 1 - Traveller (Animal happiness + 1 /day)<br>"
							+ "return 2 - Agricultural Engineering (Extra 30G on every crops sold)<br>"
							+ "return 3 - I am useless (Challenge mode) (YOLO!!)");
		         Text_field.setText("");
		         condition = 5;
		      }
			
		} //[1][5]
		else if ((game_state == 1) && (condition == 6)) { //Setup on Game - Farm name
			Text_field.setText("");
			Dialog.setText("<html>Nice, so what will be the name of the Farm? <br><br><br>" + 
					"							Type in the input slot... ");
		 	condition = 7; // 13/05 STOP HERE
		} //[1][6] NICE! Lets get back to your grandpa Farm and began your adventure.
		else if ((game_state == 1) && (condition == 7)) { 			//Any input
			temp_str = Text_field.getText();
			
			Dialog.setText( temp_str + " Farm. Is this name ok?");
		 	condition = 8; 
		} //[1][7]
		else if ((game_state == 1) && (condition == 8)) { //Setup on Game
			Dialog.setText("<html>How many Day do you wan to run your farm?<br>"
					+ "Day = Year in real world.,<br>"
					+ "Press A for [5 Days], Press B for [10 Days]<br>"
					+ "Pick Wisely! Theres no regretting after commitment!");
				condition = 9;
		} //[1][8] 
		else if ((game_state == 1) && (condition == 9)) { //Setup on Game
			Game_Profile.setEnd_day(5);										//set end day
			Dialog.setText("<html> Nicely done " + farmer_name + ".<br>"
					+ "Now lets get back to your grandpa Farm and began your new episode.<br>"
					+ "Cant wait to see your result at the end of your contract time!<br>"
					+ "You will start with an extra energy on Day_1 (Default = 3 + 1)<br>"
					+ "[Sleeping will recover 3energy for the next day!.]");
		 	condition = 10; 
		} //[1][9]
		else if ((game_state == 1) && (condition == 10)) { //Setup on Game
			frmScene.dispose();							//Dispose setup_frame
			Setup();									//Go into next frame - The game body
		 	
		 	
		} //[1][10]
	}
	public Game_Profile getGame_Profile() {
		return Game_Profile;
	}
	public void initAll() {
		Menu_Title.setHorizontalAlignment(SwingConstants.CENTER);
		Menu_Title.setForeground(new Color(105, 105, 105));
		Menu_Title.setFont(new Font("Tahoma", Font.BOLD, 30));
		Menu_Title.setBounds(74, 11, 578, 114);
		Wallpaper.setIcon(new ImageIcon(GUI_setup.class.getResource("/game_Use/img/Wallpaper.jpg")));
		Wallpaper.setBounds(229, 117, 249, 262);
		Dialog.setBackground(new Color(250, 250, 210));
		Dialog.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		Dialog.setBounds(10, 358, 495, 114);
		Dialog.setOpaque(true);
		btnO.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnO.setBounds(618, 378, 55, 55);
		Text_field.setHorizontalAlignment(SwingConstants.CENTER);
		Text_field.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		Text_field.setBounds(543, 442, 165, 30);
		Text_field.setColumns(10);
		btnX.setBounds(543, 378, 55, 55);
		btnX.setFont(new Font("Tahoma", Font.BOLD, 15));
		
	}

	public String farmerType_check(String vrb) {
		String farmerType_response = "";
		//Integer farm_type = Game_Profile.getFarm_type();
		int farm_type = Integer.parseInt(vrb);
		Integer farmer_type = 0 ;
		
		if (farm_type == 0) {
			farmer_type = 0;
			farmerType_response = "Blacksmith have enormous strength! ";	
			Game_Profile.setFarmer_type(farmer_type);
			return farmerType_response;
		} else if (farm_type == 1) {
			farmer_type = 1;
			farmerType_response = "You must be good in taking care of Animals! ";
			Game_Profile.setFarmer_type(farmer_type);
			return farmerType_response;
		} else if (farm_type == 2) {
			farmer_type = 2;
			farmerType_response = "So we have a Engineer in town!";
			Game_Profile.setFarmer_type(farmer_type);
			return farmerType_response;
		} else if (farm_type == 3 ) {
			farmer_type = 3;
			farmerType_response = "What?? You love eating pizza and nothing else?";
			Game_Profile.setFarmer_type(farmer_type);
			return farmerType_response;
		}
		
		return farmerType_response;
	}
}
