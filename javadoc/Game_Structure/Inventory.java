package Game_Structure;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
/**
 * Inventory Class is implemented as a View class (Project is trying to approach to Model-view-controller design pattern)
 * This class implemented to display content to the user 
 * Contain all label in Inventory for displaying certain value / quantity
 * @author Edward Wong - University of Canterbury SENG_201 
 * 17/05/2020
 */
public class Inventory {
	//init all component
	private JPanel JPanel;
	private Game_Profile Game_Profile;
	
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
	

	/**
	 * Construct game profile and upadte with access of other classes
	 * @param jPanel			Inventory Panel
	 * @param game_Profile		Access the data (model class) from Game_Profile
	 */
	public Inventory(JPanel jPanel, Game_Structure.Game_Profile game_Profile) {
		super();
		JPanel = jPanel;
		Game_Profile = game_Profile;
		
		initInventory();		//init of all component
		UpdateInventory();		// Set certain value with default quantity/ value
		init();					//add component into panel
		
	}


	/**
	 * Add component into Inventory panel
	 */
	private void init() {
		// Add all label for JPanel panel
		JPanel.add(lblNewLabel_2);
		JPanel.add(Tomato_seed);
		JPanel.add(Pumpkin_Seed);
		JPanel.add(Pea_Seed);
		JPanel.add(Lettuce_Seed);
		JPanel.add(Turnip_Seed);
		JPanel.add(Corn_Seed);
		JPanel.add(corn_feed);
		JPanel.add(tomato_seed_lbl);
		JPanel.add(pumpkin_seed_lbl);
		JPanel.add(pea_seed_lbl);
		JPanel.add(lettuce_seed_lbl);
		JPanel.add(turnip_seed_lbl);
		JPanel.add(corn_seed_lbl);
		JPanel.add(corn_feed_lbl);
		JPanel.add(tomato_seed_qtn);
		JPanel.add(pumpkin_seed_qtn);
		JPanel.add(pea_seed_qtn);
		JPanel.add(lettuce_seed_qtn);
		JPanel.add(turnip_seed_qtn);
		JPanel.add(corn_seed_qtn);
		JPanel.add(corn_feed_qtn);
		JPanel.add(Tomato);
		JPanel.add(Pumpkin); 
		JPanel.add(Pea);
		JPanel.add(Lettuce);
		JPanel.add(Turnip);
		JPanel.add(Corn);
		JPanel.add(Unknown);
		JPanel.add(tomato_lbl);
		JPanel.add(pumpkin_lbl);
		JPanel.add(pea_lbl);
		JPanel.add(lettuce_lbl);
		JPanel.add(turnip_lbl);
		JPanel.add(corn_lbl);
		JPanel.add(unknown_lbl);
		JPanel.add(tomato_qtn);
		JPanel.add(pumpkin_qtn);
		JPanel.add(pea_qtn);
		JPanel.add(lettuce_qtn);
		JPanel.add(turnip_qtn);
		JPanel.add(corn_qtn);
		JPanel.add(unknown__qtn);
		JPanel.add(axe_qtn);
		JPanel.add(fertilizer_qtn);
		JPanel.add(burger_qtn);
		JPanel.add(relic_chair_qtn);
		JPanel.add(water_jar_qtn);
		JPanel.add(mask_qtn);
		JPanel.add(Axe_lbl);
		JPanel.add(burger_lbl);
		JPanel.add(water_jar_lbl);
		JPanel.add(relic_chair_lbl);
		JPanel.add(fertilizer_lbl);
		JPanel.add(Mask);
		JPanel.add(Axe);
		JPanel.add(Burger);
		JPanel.add(Mask_lbl);
		JPanel.add(Fertilizer);
		JPanel.add(Relic_Chair);
		JPanel.add(Water_Jar);
		JPanel.add(cow);
		JPanel.add(goat);
		JPanel.add(chicken);
		JPanel.add(cow_lbl);
		JPanel.add(goat_lbl);
		JPanel.add(chicken_lbl);
		JPanel.add(cow_qtn);
		JPanel.add(goat_qtn);
		JPanel.add(chicken_qtn);
		
	}
	/**
	 * initInventory including set fond, background, bounds, layout, Opaque, button, allignment
	 * Init component in Inventory panel design
	 */
	public void initInventory() {							//Init component in Inventory panel
		
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
	/**
	 * updateInventory set label with default quantity and link to specific item_quantity
	 */
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
	
	

}
