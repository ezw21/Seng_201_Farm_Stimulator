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
/**
 *  GUI_body Class is implemented as a View class (Project is trying to approach to Model-view-controller design pattern)
 * This class implemented to display content to the user and relays user command/action to the Controller. 
 * It initialize the frame and add panel to the frame which result in a complete Frame  with the MenuItem that have trigger action
 * @author Edward Wong - University of Canterbury SENG_201 
 * 15/05/2020
 */
public class GUI_body {
	

	// Init to get access of another class
	private Game_Profile Game_Profile;
	private Controller controller;
	private TurningDay TurningDay;
	private GUI_setup GUI_setup;
	private Inventory Inventory;
	private Barn Barn;
	private MainScene Main_Scene;
	private Base_Component Base_Component;
	private SuperMarket SuperMarket;
	private TradingMarket TradingMarket;
	private Farm Farm;

	// Init frame & Panel
	JFrame frmBackToNature;
	JLayeredPane layeredPane = new JLayeredPane();

	// Init panel
	JPanel Main_Scene_JPanel = new JPanel();
	JPanel Inventory_JPanel = new JPanel();
	JPanel Barn_JPanel = new JPanel();
	JPanel SuperMarket_JPanel = new JPanel();
	JPanel TradingMarket_JPanel = new JPanel();
	JPanel Farm_JPanel = new JPanel();

	// Init vrb to process Button A & B (Continue from GUI_setup
	int game_state = 2;
	int condition = 0;

	public static void main(String[] args) { // init frame body
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_body window_GUI_Body = new GUI_body();
					window_GUI_Body.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();}}});
	}// End of main

	/**
	 * Create the application.
	 */
	public GUI_body() { 
		Game_Profile = new Game_Profile(1, "Little shit", "Bull shit", 10, 5, 10);// Set default stats, Testing 
		// Start game in game body dosent do much if game is started from GUI_setup
		
		
		initialize_body();				//Add component into frame - panel
		Barn.updateAll();				//Update inventory, stats, energy abr

	}


	/**
	 * 
	 * @param game_Profile Access the data (model class) from Game_Profile
	 */
	public GUI_body(Game_Structure.Game_Profile game_Profile) { // Constructor to get variable from Game_Profile
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
		// The building/ constructing of Frame!

		setFrame(new JFrame());
		initFrame();
		initPanel();
		initTGLBtn_Box();

		// initTradingMarket();
		controller.FarmerType_advantage(); // Please refer to the comment in mmethod, however most method literally
											// means what it means...
		Barn.updateAll();
		// Init Frame & Menu bar

		getFrame().setBounds(500, 250, 750, 520);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		getFrame().getContentPane().add(layeredPane);

		// Init panel
		layeredPane.add(Main_Scene_JPanel, "name_199216101866600");
		layeredPane.add(Inventory_JPanel, "name_324997804399200");
		layeredPane.add(TradingMarket_JPanel, "name_458198648692800");
		layeredPane.add(Farm_JPanel, "name_194781174265600");
		layeredPane.add(Barn_JPanel, "name_194785506405200");
		layeredPane.add(SuperMarket_JPanel, "name_194790290626100");
		Barn_JPanel.setLayout(null);

	}
	/**
	 * switchPanels Allow the action of switching panel withn layeredPane
	 * Card Layout is used in this whole project and will be able to show 1 Card at a time
	 * Only able to switch between panel to panel
	 * @param panel	Name of the switching Panel
	 */
	public void switchPanels(JPanel panel) { // Switch panel method
		layeredPane.removeAll();	//remove all component from the layer
		layeredPane.add(panel);		// add selected panel
		layeredPane.getIgnoreRepaint();	//repaint component after all events is performed
		layeredPane.revalidate();	//reset based on the new component list

	}
	/**
	 * initFrame set Bounds, Layout, Opaque of the panel that added into frame
	 */
	public void initFrame() { // init component in frame and panel
		layeredPane.setBounds(10, 81, 714, 291);
		layeredPane.setLayout(new CardLayout(0, 0));
		Main_Scene_JPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Main_Scene_JPanel.setLayout(null);
		Inventory_JPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Inventory_JPanel.setLayout(null);
		Inventory_JPanel.setOpaque(true);
		TradingMarket_JPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		TradingMarket_JPanel.setLayout(null);
		Farm_JPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Farm_JPanel.setLayout(null);

	}
	/**
	 * initTGLBtn_Box contain all trigger button that dosent belong to panel
	 * Switching panel and MenuItem button
	 */
	public void initTGLBtn_Box() { // Init all toggle button, specific function in different method
		// Action & algorithm with more than a if else statement will be implemented in
		// external method and get called to perform button action

		Base_Component.getGo_Home().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 									// Switch panel to MainScene
				switchPanels(Main_Scene_JPanel);										
			}}); // card layout siwtching card/panel
		Base_Component.getOpen_Inventory().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 										// Switch panel to Inventory
				switchPanels(Inventory_JPanel);
			}}); // card layout siwtching card/panel
		Base_Component.getTrade_Items().addActionListener(new ActionListener() {  				// Switch panel to SuperMarket
			public void actionPerformed(ActionEvent e) {
				switchPanels(SuperMarket_JPanel);}});
		Base_Component.getTrading_market().addActionListener(new ActionListener() {  			// Switch panel to TradingMarket
			public void actionPerformed(ActionEvent e) {
				switchPanels(TradingMarket_JPanel);}});
		Base_Component.getGo_To_Animal().addActionListener(new ActionListener() { 				// Switch panel to barn
			public void actionPerformed(ActionEvent e) {
				switchPanels(Barn_JPanel);}});
		Base_Component.getGo_to_farm().addActionListener(new ActionListener() {				 	// Switch panel to farm
			public void actionPerformed(ActionEvent e) {
				if ((Game_Profile.getCrop_Plot(4).isUnlock()) && (Game_Profile.getCrop_Plot(4).isPlot_available() == true) ) {
					Farm.crop_icon_4.setText("Crop Plot 4 is available");
				}
				switchPanels(Farm_JPanel);}});
		
		// MenuItem button triigered action
		Base_Component.getRelic_chair().addActionListener(new ActionListener() { 				// Relic chair action
			public void actionPerformed(ActionEvent e) {
				controller.relicChair();
			}}); // End of relic chair
		Base_Component.getEat_burger().addActionListener(new ActionListener() { 				// Eat burger action
			public void actionPerformed(ActionEvent e) {
				TurningDay.eatBurger();
			}}); // End of eating burger
		Base_Component.getEnd_day().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 										// Go next day
				TurningDay.NextDay();
				if (Game_Profile.getEnd_day() == 1) { 			// End of game contract
					switchPanels(Inventory_JPanel); 			// Show player result in inventory panel
					TurningDay.endDay();}}}); 					// Update stats, for player to check final score(GOLD)
		Base_Component.getChop_tree_strumps().addActionListener(new ActionListener() { 			// Chop tree action
			public void actionPerformed(ActionEvent e) {
				getController().chopTree();
				Barn.updateAll();}});

		Base_Component.getFertilizing().addActionListener(new ActionListener() { 				// Fertilizing action
			public void actionPerformed(ActionEvent e) {
				controller.fertilizer();}});
}
	/**
	 * initPanel Object of other panel after init individually in specific class
	 */
	public void initPanel() {
		Base_Component = new Base_Component(frmBackToNature, Game_Profile);
		controller = new Controller(Game_Profile, Base_Component);
		Inventory = new Inventory(Inventory_JPanel, Game_Profile);
		Main_Scene = new MainScene(Main_Scene_JPanel);
		Barn = new Barn(Barn_JPanel, Game_Profile, controller, Base_Component, Inventory);
		SuperMarket = new SuperMarket(SuperMarket_JPanel, Game_Profile, Base_Component, Inventory);
		TradingMarket = new TradingMarket(TradingMarket_JPanel, Game_Profile, Base_Component, Inventory, Barn);
		TurningDay = new TurningDay(Game_Profile, Base_Component, Barn, controller, Inventory);
		Farm = new Farm(Game_Profile, Inventory, Base_Component, Farm_JPanel);
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
	// Getter and Setter for GUI_body_frame
	public JFrame getFrame() {
		return frmBackToNature;
	}
}
