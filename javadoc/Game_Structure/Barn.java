package Game_Structure;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.junit.Test;

/**
 * Barn Class is implemented as a View class (Project is trying to approach to Model-view-controller design pattern)
 * This class contain the View design and button action of this Panel - Barn
 * @author Edward Wong - University of Canterbury SENG_201 
 * 18/05/2020
 */
public class Barn {
	//Init of all component in Barn & Object
	private JPanel JPanel;
	private Game_Profile Game_Profile;
	private Controller controller;
	private Base_Component Base_Component;
	private Inventory Inventory;
	
	JButton Animal_Info = new JButton();
	JLabel happiness = new JLabel("New label");
	JLabel healthiness = new JLabel("New label");
	JLabel Cow = new JLabel("Barn is empty...");
	JLabel Goat = new JLabel("Barn is empty...");
	JLabel Chicken = new JLabel("Chicken Hoop is empty...");
	
	final JLabel happiness_qtn = new JLabel("0");
	final JLabel healthiness_qtn = new JLabel("0");
	JButton Feeding_Chicken = new JButton("FEED ANIMAL ");
	JButton Blank = new JButton("Brush?");
	JButton Play_In_Barn = new JButton("PLAY FOOTBALL IN BARN ");
	
	
	/**
	 * construct Game_Profile, Barn panel and other classes/panel that will be updated in this class
	 * @param jPanel 			Barn panel
	 * @param game_Profile		Access the data (model class) from Game_Profile
	 * @param Controller		Access the action (controller class) from Controller
	 * @param base_Component 	Access to update stats ,energy ,inventory
	 * @param inventory			Access Inventory panel for updating	
	 */
	public Barn(javax.swing.JPanel jPanel, Game_Structure.Game_Profile game_Profile, Controller Controller, Base_Component base_Component,Inventory inventory ) {
		super();
		JPanel = jPanel;
		Game_Profile = game_Profile;
		Base_Component = base_Component;
		controller = Controller;
		Inventory = inventory;
		
		initBarn();		// init of all component
		init();			// add all component
		
	}
	/**
	 * //Add component to Barn panel
	 */
	private void init() {
		// Barn Panel
		JPanel.add(Cow);
		JPanel.add(Goat);
		JPanel.add(Chicken);
		JPanel.add(Feeding_Chicken);
		JPanel.add(Blank);
		JPanel.add(Play_In_Barn);
		
		JPanel.add(Animal_Info);
		JPanel.add(happiness_qtn);
		JPanel.add(happiness);
		JPanel.add(healthiness);
		JPanel.add(healthiness_qtn);
	}
	
	/**
	 * initBarn including set fond, background, bounds, layout, Opaque, button, allignment
	 * Init component in Barn panel design
	 */
	public void initBarn() {								
		
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
		
		Animal_Info.setText("INFO");
		
		
		//Button action in Barn Panel 
		//PLAY IN BARN (Barn)
		Play_In_Barn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			playInBarn();}});								// End of Play (Barn)
		
		// Feeding (Farm)
		Feeding_Chicken.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			controller.feedAnimal();
			updateAll();
		}}); 											// End of Animal feeding
		
		//INFO (Barn)
		Animal_Info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					setDialog("<html>[Feed Chicken] - Place Corn feed into feeding box. (Animal healthiness + 1, once a day.)<br>"
							+ "[Play football in barn ] - Consume one energy, Animals get happier."
							+ "[Animal healthiness drop by 1/day, if you dont feed them they will get sick!<br>"
							+ "[Animal happiness] Happy animal bring more profit for you[Allowance * Animal happiness]");}});	//End of -INFO (Barn)
		// BRUSH (Barn)
		Blank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDialog("Brush your Lanjiao");		//End of Brush (Barn)
			}});

	}
	/**
	 * UpdateBarn check the quantity of animal and display icon in barn (to show/remove existence of animal)
	 * Display healthiness and happiness of Animal
	 */
	public void UpdateBarn() {				//Update happiness & healthiness
		healthiness_qtn.setText("" + Game_Profile.getAnimal_healthiness());
		happiness_qtn.setText("" + Game_Profile.getAnimal_happiness());
		
		
		if (Game_Profile.getAnimal_cow() >= 1) {
			Cow.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Cow_1.jpg")));
		} else {
			Cow.setIcon(new ImageIcon(GUI_body.class.getResource("")));
		}
		
		if (Game_Profile.getAnimal_goat() >= 1) {
			Goat.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Sheep_2.jpg")));
		} else {
			Goat.setIcon(new ImageIcon(GUI_body.class.getResource("")));
		}
		
		if (Game_Profile.getAnimal_chicken() >= 1) {
			Chicken.setIcon(new ImageIcon(GUI_body.class.getResource("/game_Use/img/Chicken_1.jpg")));
		} else {
			Chicken.setIcon(new ImageIcon(GUI_body.class.getResource("")));
		}
		
	}
	/**
	 * PlayInBarn allow user to play with animal in barn if happiness not in amx level and theres animal in barn and chicken hoop
	 */
	public void playInBarn() {								//Play in Barn algorithm
		if(Game_Profile.getAnimal_happiness() >= 15) {														//Reach max animal happiness
			setDialog("<html>They looks Overjoyed! I should keep up the good work.<br>[Animal hapiness = 15]");
		}else if ((Game_Profile.getAnimal_cow() >= 1) || (Game_Profile.getAnimal_goat() >= 1) || (Game_Profile.getAnimal_chicken() >= 1)) { //check existence of animal in barn
			if (Game_Profile.getFarmer_energy() != 0) {
				Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);							// Update energy
				Game_Profile.setAnimal_happiness(Game_Profile.getAnimal_happiness() + 1);					// Update happiness
				setDialog("<html>They are having lot of fun today!<br>"								// Display effect to user
						+ "[Energy - 1] [Animal happiness + 1]<br>");
			}else {
				setDialog("<html>You need some rest!");												// Display effect to user
			}
		} else {
			setDialog("You dont have animal...");
		}
		updateAll();				//Update all section that need to be updated
	}
	/**
	 * Update Energy, stats , barn status and inventory after any action or change performed in Barn Panel 
	 */
	public void updateAll() {
		Base_Component.UpdateEnergy();
		Base_Component.UpdateStats();
		Inventory.UpdateInventory();
		UpdateBarn();
	}
	public void setDialog(String text) {
		Base_Component.setDialog(text);
	}
	public JPanel getJPanel() {
		return JPanel;
	}
	public JButton getFeeding_Chicken() {
		return Feeding_Chicken;
	}

	public JButton getPlay_In_Barn() {
		return Play_In_Barn;
	}

}
