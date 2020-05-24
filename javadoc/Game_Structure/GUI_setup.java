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


/**
 * This Class is implemented as a View and Controller class (Project is trying to approach to Model-view-controller design pattern)
 * It create the First frame for game setup with all init of GUI and the setup frame
 * (I learnt how to use card layout and switch between panel but I decided to keep this frame setup as it shows a progress of learning
 * and I belive seperating Game Setup and Game body does make the game "cleaner" in some aspect)
 * @author Edward Wong - University of Canterbury SENG_201 
 * 13/05/2020
 */
@SuppressWarnings("restriction")
public class GUI_setup {
	
	
	// Init variables of game Structure
	JFrame frmScene;
	// Variables to run game structure.
	static int game_state = 0; // game_state of the setup progress
	static int condition = 0;	// condition in each state (Select/ Cancel)
	
	private Game_Profile Game_Profile; 	//Access data from the Model Class - Game_Profile

	
	// temp vrb to hold string from textfield
	private String temp_str; 
	private String farm_type;			//User input as string and will be parsed in FarmerType_check Method	
	
	//Frame component init
	private JTextField Text_field = new JTextField();
	JLabel Menu_Title = new JLabel("SENG_201 - Farm Stimulator_2020");
	JLabel Wallpaper = new JLabel("");
	final JLabel Dialog = new JLabel("<html>Heres some instruction before you start the Game.");
	JButton btnX = new JButton("A");
	JButton btnO = new JButton("B");
	
	

	/**
	 * Launch the application.
	 * @param args Terminal arguments(unused)
	 */
	public static void main(String[] args) {
		//Layout_1
		GUI_setup window_0 = new GUI_setup();
		window_0.frmScene.setVisible(true);		//show the frame

	}
	/**
	 * Create the application.
	 */
	public GUI_setup() {
		this.Game_Profile = new Game_Profile();
		initialize();
	}	
	/**
	 * Construct the Setup with a Player profile
	 * @param game_Profile	The model class of the project which contain all variable - Player's Profile
	 */
	public GUI_setup(Game_Structure.Game_Profile game_Profile) {						//Constructor
		super();
		this.Game_Profile = game_Profile;
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 * then add the component
	 */
	private void initialize() {			
		initAll();												//Init of all component
	    frmScene = new JFrame();
		frmScene.setBackground(Color.WHITE);					//Init  frame and add component
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
	
	/**
	 * Give player a Game Profile which include the input info that previously recorded 
	 * Set the value in the game( item sell price, starting GOLD, various status such as: is plot 4 unlocked)
	 */
	public void Setup() {		
		

					
		GUI_body window_GUI_Body = new GUI_body(Game_Profile); 		//Moving into Main_game in new window
	 	window_GUI_Body.getFrame().setVisible(true);
	 	condition = 10; 											//update vrb condition to avoid meeting previous if statement condition

	}
	/**
	 * Algorithm of Button B state, perform cancel/return function
	 */
	public void btnCancel() {											
		if ((game_state == 1) && (condition == 3)) { 					//Act as clear button in this stage
			Text_field.setText("");
			Dialog.setText("<html>Hmm.. What is your name? <br><br><br>"
					+ "Type in the input slot... ");
			condition = 2;											//Update veb condtion to meet next if statement condition
		} //[1][1]

		else if ((game_state == 1) && (condition == 6)) { 				//Cancel and return to previous stage
			Dialog.setText("<html>Return the selected farm typewith 1 DIGIT.<br>"		// Display system message to user
					+ "return 0 - Blacksmith  (Extra Energy/days)<br>"
					+ "return 1 - Traveller (Animal happiness + 1 /day)<br>"
					+ "return 2 - Agricultural Engineering (Extra 30G on every crops sold)<br>"
					+ "return 3 - I am useless (Challenge mode) (YOLO!!)");
	         Text_field.setText("");								//Clear textfield to avoid confusion
	         condition = 5;											//Update veb condtion to meet next if statement condition
	         
		} //[1][6]
		else if ((game_state == 1) && (condition == 8)) { 				//Cancel and go back previous stage
			Text_field.setText("");									//Clear textfield to avoid confusion
			Dialog.setText("<html>So what will be the name of the Farm? <br><br><br>" + // Display system message to user
					"							Type in the input slot... ");
		 	condition = 7; // 															//Update veb condtion to meet next if statement condition
		} //[1][8]
		else if ((game_state == 1) && (condition == 9)) { 				//Cancel and go back previous stage
			
			Game_Profile.setEnd_day(10);								// Set end day
			Dialog.setText("<html> Nicely done " + Game_Profile.getFarmer_name() + ".<br>"						 // Display system message to user
					+ "Now lets get back to your grandpa Farm and began your new episode.<br>"
					+ "Cant wait to see your result at the end of your contract time!");
		 	condition = 10; 											//update vrb condition to avoid meeting previous if statement condition
		} //[1][10] 
		
	}
	/**
	 * Alorithm of proceeding the game, Select / accept
	 */
	public void btnProceed() {				
		if ((game_state == 0) && (condition == 0)) { 					//Introduction on key
			
			Dialog.setText("Select/Remove by using button (A | B)");	// Display system message to user
			condition = 1;												//update vrb condition to avoid meeting previous if statement condition
		} //[0][0]
		else if ((game_state == 0) && (condition == 1)) {
			Dialog.setText("You can also use the blank space to type if it's necessary."); //Introduction in key
			condition = 2;												//update vrb condition to avoid meeting previous if statement condition
		} //[0][1]
		else if ((game_state == 0) && (condition == 2)) {
			Dialog.setText("Now, Press A to start the game..."); 	//Move to Setup & Display system message to user
			game_state = 1; condition = 0;								//update vrb game_state & condition to avoid meeting previous if statement condition

		} //[0][2]
		else if ((game_state == 1) && (condition == 0)) { //Setup on Game
			Dialog.setText("<html>Welcome to Canterbury Town.<br>I am going to ask you a number of question.\n\n So please answer them.");	// Display system message to user
		 	condition = 1;
		} //[1][0]
		else if ((game_state == 1) && (condition == 1)) { //Setup on Game - Farmer_name
			Dialog.setText("<html>What is your name? <br><br><br>"												// Display system message to user
					+ "Type in the input slot... ");
		 	condition = 2;												//update vrb condition to avoid meeting previous if statement condition
		} //[1][1]
		else if ((game_state == 1) && (condition == 2)) { //Setup on Game
			
			temp_str = Text_field.getText();
		      	
		      String pattern = "^([a-zA-Z]+\\s)*[a-zA-Z]+$";					//Check if name meet condition 3-15 string, no digit or $
		      Pattern r = Pattern.compile(pattern);

		      Matcher m = r.matcher(temp_str);
		      if (m.find( ) && (temp_str.length() <= 15) && (temp_str.length() >= 3)) {				// length of name is within 3-15 string
		         Dialog.setText("Is this name OK?");															// Display system message to user
				 condition = 3;
		      }else {																				// input didnt meet condition , show guidance and return to previous stage
		         Dialog.setText("<html>Please use 3 - 15 alphabet only!<br> NO SYMBOL, NOR DIGIT!<br>"			// Display system message to user
		         		+ "What is your name?<br><br>Type in the input slot...");
		         Text_field.setText("");
		         condition = 2;														//update vrb condition to avoid meeting previous if statement condition
		      }
			
		} //[1][2]
		else if ((game_state == 1) && (condition == 3)) { //Setup on Game
			Game_Profile.setFarmer_name(temp_str);

			Dialog.setText("Hi " + Game_Profile.getFarmer_name());										// Display system message to user
			Text_field.setText("");
		 	condition = 4;															//update vrb condition to avoid meeting previous if statement condition
		} //[1][3]
		else if ((game_state == 1) && (condition == 4)) { 			//Introduction on Game
			Dialog.setText("<html>Where had you been in the last 3 years? <br>"
					+ "return 0 - Blacksmith  (Extra Energy/days)<br>"
					+ "return 1 - Traveller (Animal happiness + 1 /day)<br>"
					+ "return 2 - Agricultural Engineering (Extra 30G on every crops sold)<br>"
					+ "return 3 - I am useless (Challenge mode) (YOLO!!)");
		 	condition = 5;															//update vrb condition to avoid meeting previous if statement condition
		} //[1][4]
		else if ((game_state == 1) && (condition == 5)) { 			//Setup on Game - Farmer type
			farm_type = Text_field.getText();
			String pattern = "\\d+";
			
		      Pattern r = Pattern.compile(pattern);
	
		      Matcher m = r.matcher(farm_type);
		      String arr[] = { "0", "1", "2", "3"};											// allowed input num
		      if (m.find( ) && (farm_type.length() == 1) && (Arrays.asList(arr).contains(farm_type) )){					//Only allows one digit input [0 - 3]
		    	  Dialog.setText("<html>" + farmerType_check(farm_type) + "<br>"				// Display system message to user
							+ "So this is your stength? ");
				 condition = 6;															//update vrb condition to avoid meeting previous if statement condition
		      }else {
		         Dialog.setText("<html>Return the selected farm typewith 1 DIGIT.<br>"			//didnt meet condition, show instruction and return to previous state
		        		 + "return 0 - Blacksmith  (Extra Energy/days)<br>"
							+ "return 1 - Traveller (Animal happiness + 1 /day)<br>"
							+ "return 2 - Agricultural Engineering (Extra 30G on every crops sold)<br>"
							+ "return 3 - I am useless (Challenge mode) (YOLO!!)");
		         Text_field.setText("");
		         condition = 5;															//update vrb condition to meet previous if statement condition
		      }
			
		} //[1][5]
		else if ((game_state == 1) && (condition == 6)) { //Setup on Game - Farm name
			Text_field.setText("");
			Dialog.setText("<html>Nice, so what will be the name of the Farm? <br><br><br>" + 		// Display system message to user
					"							Type in the input slot... ");
		 	condition = 7; // 13/05 STOP HERE										//update vrb condition to avoid meeting previous if statement condition
		} //[1][6] NICE! Lets get back to your grandpa Farm and began your adventure.
		else if ((game_state == 1) && (condition == 7)) { 			//Any input for farm name
			temp_str = Text_field.getText();
			
			Dialog.setText( temp_str + " Farm. Is this name ok?");						// Display system message to user
		 	condition = 8; 															//update vrb condition to avoid meeting previous if statement condition
		} //[1][7]
		else if ((game_state == 1) && (condition == 8)) { 					//Setup on Game
			Game_Profile.setFarm_name(temp_str);
			Dialog.setText("<html>How many Day do you wan to run your farm?<br>"
					+ "Day = Year in real world.,<br>"
					+ "Press A for [5 Days], Press B for [10 Days]<br>"
					+ "Pick Wisely! Theres no regretting after commitment!");
				condition = 9;														//update vrb condition to avoid meeting previous if statement condition
		} //[1][8] 
		else if ((game_state == 1) && (condition == 9)) { //Setup on Game
			Game_Profile.setEnd_day(5);										//set end day = 5, end day = 10 if B button is selected
			Dialog.setText("<html> Nicely done " + Game_Profile.getFarmer_name() + ".<br>"
					+ "Now lets get back to your grandpa Farm and began your new episode.<br>"
					+ "Cant wait to see your result at the end of your contract time!<br>"
					+ "You will start with 3 energy on your 1st day.<br>"
					+ "[Sleeping will recover 3energy for the next day!.]");
		 	condition = 10; 														//update vrb condition to avoid meeting previous if statement condition
		} //[1][9]
		else if ((game_state == 1) && (condition == 10)) { //Setup on Game
			frmScene.dispose();							//Dispose setup_frame
			Setup();									//Go into next frame - The game body
		 	
		 	
		} //[1][10]
	}
	public Game_Profile getGame_Profile() {
		return Game_Profile;
	}
	/**
	 * initAll including set fond, background, bounds, layout, Opaque, button, allignment
	 * Init component in frame
	 */
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
	/**
	 * 
	 * @param input_name take string input from user	
	 * @return	farmerType_response A string that contain message to display to user base on different farmertype
	 * Parse input_name into int and check condition then set farmerType selected message for the type
	 */
	public String farmerType_check(String input_name) {
		
		String farmerType_response = "";
		int farm_type = Integer.parseInt(input_name);
		Integer farmer_type = 0 ;
		Game_Profile.setFarmer_energy(3);							// Set starting energy = 3
		// Check farmer type
		if (farm_type == 0) {											//check if farmer = type 0
			farmer_type = 0;
			//extra energy for blacksmith implemented in farmerType allowance
			farmerType_response = "Blacksmith have enormous strength! ";	
			Game_Profile.setFarmer_type(farmer_type);
			return farmerType_response;								//return message string to be set in dialog
		} else if (farm_type == 1) {									//check if farmer = type 1
			farmer_type = 1;
			farmerType_response = "You must be good in taking care of Animals! ";
			Game_Profile.setFarmer_type(farmer_type);			
			return farmerType_response;								//return message string to be set in dialog
		} else if (farm_type == 2) {									//check if farmer = type 2
			farmer_type = 2;
			farmerType_response = "So we have a Engineer in town!";
			Game_Profile.setFarmer_type(farmer_type);
			return farmerType_response;								//return message string to be set in dialog
		} else if (farm_type == 3 ) {									//check if farmer = type 3
			farmer_type = 3;
			farmerType_response = "What?? You love eating pizza and nothing else?";
			Game_Profile.setFarmer_type(farmer_type);
			return farmerType_response;								//return message string to be set in dialog
		}		
		
		return farmerType_response;
	}
}
