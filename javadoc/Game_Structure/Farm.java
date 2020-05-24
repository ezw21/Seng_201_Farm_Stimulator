package Game_Structure;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
/**
 *  Crop Plot Class is implemented as a View class (Project is trying to approach to Model-view-controller design pattern)
 * This class specifically implemented for panel design and button in farm panel 
 * Farm Panel have Seeding, Watering and Harvesting which require multiple variable and a complicated algorithm to perform action
 * @author Edward Wong - University of Canterbury SENG_201 
 * 17/05/2020
 */
public class Farm {
	//Init Object & component in Farm Panel
	private JPanel JPanel;
	private Game_Profile Game_Profile;
	private Inventory Inventory;
	private Base_Component Base_Component;
	

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
	
	//Button
	JButton farm_Info = new JButton("INFO");
	
	JButton btnSeeding = new JButton("SEEDING");
	JButton btnHarvesting = new JButton("HARVESTING");
	final JButton btnWatering = new JButton("WATERING");
	
	/**
	 * Construct game profile and upadte with access of other classes
	 * @param game_Profile		Access the data (model class) from Game_Profile
	 * @param inventory			Access Inventory panel for updating
	 * @param base_Component	Access to update stats ,energy ,inventory
	 * @param jPanel			Farm Panel
	 */
	public Farm(Game_Structure.Game_Profile game_Profile, Game_Structure.Inventory inventory,
			Game_Structure.Base_Component base_Component, JPanel jPanel) {
		super();
		Game_Profile = game_Profile;
		Inventory = inventory;
		Base_Component = base_Component;
		JPanel = jPanel;
		
		initFarm();			//init of all component
		init();				// add all component

	
	}
	/**
	 * Add component into farm panel
	 */
	private void init() {
		//Add all label in Farm Panel
		JPanel.add(crop_1_lbl);
		JPanel.add(crop_2_lbl);
		JPanel.add(crop_3_lbl);
		JPanel.add(crop_4_lbl);
		JPanel.add(crop_icon_1);	
		JPanel.add(crop_icon_2);		
		JPanel.add(crop_icon_3);				
		JPanel.add(crop_icon_4);
		//4 crop plot selection 
		JPanel.add(chckbxCrop_1);
		JPanel.add(chckbxCrop_2);
		JPanel.add(chckbxCrop_3);
		JPanel.add(chckbxCrop_4);

		// Add all toggle button
		
		JPanel.add(btnWatering);
		JPanel.add(farm_Info);
		JPanel.add(Seed_selection);
		JPanel.add(btnSeeding);

		JPanel.add(btnHarvesting);
	}
	/**
	 * initFarm including set fond, background, bounds, layout, Opaque, button, allignment
	 * Init component in farm panel design
	 */
	private void initFarm() {								//Init all component in farm panel
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
		
		btnHarvesting.addActionListener(new ActionListener() {		//Algorithm of harvesting
			public void actionPerformed(ActionEvent arg0) {
				Harvesting();}});
		
}	
	/**
	 * Harvesting A algorithm that check the crop plot selected to be harvest, harvest time, energy of farmer
	 * Then perform harvest action and update several data - energy, dialog, inventory
	 */
	public void Harvesting() {										//Harvesting algorithm
		
		if (Game_Profile.getFarmer_energy() == 0) {																																//Farmer have no energy
			setDialog("You should take a break!");																																//Display message
		}
		else { 																																									// Do the harvesting process

			
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.getCrop_Plot(1).getPlot_harvest_time() <= 0) && (Game_Profile.getCrop_Plot(1).isPlot_available() == false)) {		//Condtion plot1 selected time = 0, is occupied
				Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);																								// Energy consumed after harvest
				updatePlotHarvest(Game_Profile.getCrop_Plot(1));																												//Update several status of plot1
				
			}else if ((chckbxCrop_2.isSelected()) && (Game_Profile.getCrop_Plot(2).getPlot_harvest_time() <= 0) && (Game_Profile.getCrop_Plot(2).isPlot_available() == false)) {//Condtion plot2 selected time = 0, is occupied
				Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);																								// Energy consumed after harvest
				updatePlotHarvest(Game_Profile.getCrop_Plot(2));																												//Update several status of plot2
				
			}else if ((chckbxCrop_3.isSelected()) && (Game_Profile.getCrop_Plot(3).getPlot_harvest_time() <= 0) && (Game_Profile.getCrop_Plot(3).isPlot_available() == false)) {//Condtion plot3 selected time = 0, is occupied
				Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);																								// Energy consumed after harvest
				updatePlotHarvest(Game_Profile.getCrop_Plot(3));																												//Update several status of plot3
				
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.getCrop_Plot(4).getPlot_harvest_time() <= 0) && (Game_Profile.getCrop_Plot(4).isPlot_available() == false)) {//Condtion plot4 selected time = 0, is occupied
				Game_Profile.setFarmer_energy(Game_Profile.getFarmer_energy() - 1);																								// Energy consumed after harvest
				updatePlotHarvest(Game_Profile.getCrop_Plot(4));																												//Update several status of plot4
				
			}else {
				setDialog("There's nothing for you to harvest from this Crop port!");																							// Nothing / not readt to harvest
			}
		updateAllCrop();																																						//Update display of Plot icon, label
		updateAll();																																							//update inventory,energy bar, 	
		}
	}
	/**
	 * Watering farm is the algorithm of watering button, can only be perform once a day to reduce harvest time of all crop by 1
	 * Fertilizing will allows watering status become true( extra chance for watering )
	 */
	public void Watering_Farm() {																			//Watering crops algorithm
		
		if (Game_Profile.isWatering()) {																							//Check watering status is true
			// Init local vrb for harvest_time
	

			if (Game_Profile.getCrop_Plot(1).isPlot_available()) {																	//Crop plot is not occupied										
				//Pass
			}else if ((Game_Profile.getCrop_Plot(1).getPlot_harvest_time() <= 1)) {													// Crop in plot is ready to be harvest
					Game_Profile.getCrop_Plot(1).setPlot_harvest_time(0);															//reset harvest time to 0
					crop_1_lbl.setText("Crop is ready to harvest!");																//Update crop status label
				}else {	
					Game_Profile.getCrop_Plot(1).setPlot_harvest_time(Game_Profile.getCrop_Plot(1).getPlot_harvest_time() - 1);		//harvest time - 1
					crop_1_lbl.setText("" + Game_Profile.getCrop_Plot(1).getPlot_harvest_time() + "day to fully growth");			//Display status in crop label
				}// End Updating Crop Plot 1
			
			if (Game_Profile.getCrop_Plot(2).isPlot_available()) {																	//Crop plot is not occupied		
				//Pass
			}else if ((Game_Profile.getCrop_Plot(2).getPlot_harvest_time() <= 1)) {													// Crop in plot is ready to be harvest
				Game_Profile.getCrop_Plot(2).setPlot_harvest_time(0);																//reset harvest time to 0
				crop_2_lbl.setText("Crop is ready to harvest!");																	//Update crop status label
			}else {	
					Game_Profile.getCrop_Plot(2).setPlot_harvest_time(Game_Profile.getCrop_Plot(2).getPlot_harvest_time() - 1);		//harvest time - 1
					crop_2_lbl.setText("" + Game_Profile.getCrop_Plot(2).getPlot_harvest_time() + "day to fully growth");			//Display status in crop label
				}// End Updating Crop Plot 2
			
			if (Game_Profile.getCrop_Plot(3).isPlot_available()) {																	//Crop plot is not occupied		
				
			}else if ((Game_Profile.getCrop_Plot(3).getPlot_harvest_time() <= 1)) {													// Crop in plot is ready to be harvest
				Game_Profile.getCrop_Plot(3).setPlot_harvest_time(0);																//reset harvest time to 0
				crop_3_lbl.setText("Crop is ready to harvest!");																	//Update crop status label
			}else {	
					Game_Profile.getCrop_Plot(3).setPlot_harvest_time(Game_Profile.getCrop_Plot(3).getPlot_harvest_time() - 1);		//harvest time - 1
					crop_3_lbl.setText("" + Game_Profile.getCrop_Plot(3).getPlot_harvest_time() + "day to fully growth");			//Display status in crop label
				}// End Updating Crop Plot 3
			
			if ((Game_Profile.getCrop_Plot(4).isPlot_available() == false) && (Game_Profile.getCrop_Plot(4).isUnlock() == true) && (Game_Profile.getCrop_Plot(4).getPlot_harvest_time() <= 1)) {// Crop in plot is ready to be harvest
				Game_Profile.getCrop_Plot(4).setPlot_harvest_time(0);																//reset harvest time to 0
				crop_4_lbl.setText("Crop is ready to harvest!");																	//Update crop status label
			}else if ((Game_Profile.getCrop_Plot(4).isPlot_available() == false) && (Game_Profile.getCrop_Plot(4).isUnlock() == true)){	
					Game_Profile.getCrop_Plot(4).setPlot_harvest_time(Game_Profile.getCrop_Plot(4).getPlot_harvest_time() - 1);		//harvest time - 1
					crop_4_lbl.setText("" + Game_Profile.getCrop_Plot(4).getPlot_harvest_time() + "day to fully growth");			//Display status in crop label
				}// End Updating Crop Plot 4
			
			Game_Profile.setWatering(false);				//Update watering is done for today
			setDialog("<html>A good farmer will never forget to irrigate their crops!<br><br>"
					+ "[A day closer to be harvested for the growing crops...]");
		} //End of if statement
		
		else {
			setDialog("It's gonna get overwhelmed if you keep on watering the crops!");
		}// Bad case Scenario
	} // End of watering
	/**
	 * CropSelection	Algorithm for crop plot selection - used for harvesting and seeding
	 * Once a crop plot is selected, diselect the other crop plot(only 1 plot to be selected at once)
	 */
	public void CropSelection() {									//Seed choosing algorithm

		//checkBox_1 action
		chckbxCrop_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			// Allow user to select 1 crop plot at a time
				chckbxCrop_2.setSelected(false);
				chckbxCrop_3.setSelected(false);
				chckbxCrop_4.setSelected(false);
			}
		});//checkBox_1 action End
	
		//checkBox_2 action
		chckbxCrop_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		// Allow user to select 1 crop plot at a time
				chckbxCrop_1.setSelected(false);
				chckbxCrop_3.setSelected(false);
				chckbxCrop_4.setSelected(false);
			}
		});//checkBox_2 action End
		
		//checkBox_3 action
		chckbxCrop_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		// Allow user to select 1 crop plot at a time
				chckbxCrop_1.setSelected(false);
				chckbxCrop_2.setSelected(false);
				chckbxCrop_4.setSelected(false);
			}
		});//checkBox_3 action End
		//checkBox_4 action
		chckbxCrop_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		// Allow user to select 1 crop plot at a time
				chckbxCrop_1.setSelected(false);
				chckbxCrop_2.setSelected(false);
				chckbxCrop_3.setSelected(false);
			}
		});//checkBox_4 action End
	}



	
	/**
	 * SeedingAction	User select a seed from drop down selection box, then select crop plot and perform seed button
	 * 6 seed and 4 crop plot of options and combination
	 */
	public void SeedingAction() {																							//seeding process algorithm
		String seed = (String)Seed_selection.getSelectedItem();
		
		if (seed == "Tomato" ) {																							//Seed checking
			//Selection = 1
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.getCrop_Plot(1).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_tomato_seed() >= 1) {															//Check seed availability
				updatePlotSeeding(Game_Profile.getCrop_Plot(1), seed ,2);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_1.isSelected()) && (Game_Profile.getCrop_Plot(1).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.getCrop_Plot(2).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_tomato_seed() >= 1) {															//Check seed availability
				updatePlotSeeding(Game_Profile.getCrop_Plot(2), seed ,2);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.getCrop_Plot(2).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.getCrop_Plot(3).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_tomato_seed() >= 1) {															//Check seed availability
				updatePlotSeeding(Game_Profile.getCrop_Plot(3), seed ,2);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.getCrop_Plot(3).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.getCrop_Plot(4).isPlot_available()) && (Game_Profile.getCrop_Plot(4).isUnlock())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_tomato_seed() >= 1) {															//Check seed availability
				updatePlotSeeding(Game_Profile.getCrop_Plot(4), seed ,2);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");					// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.getCrop_Plot(4).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 4 is currently not available.");		// Crop Plot not available
			} 
			else if(Game_Profile.getCrop_Plot(4).isUnlock() == false && (chckbxCrop_4.isSelected())) {																	//Crop plot 4 is LOCKED
				setDialog("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}	// End of fourth checkbox
		
			
		}// End of Tomato
		else if (seed == "Pumpkin" ) {																						//Seed checking
			//Selection = 2
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.getCrop_Plot(1).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pumpkin_seed() >= 1) {															//Check seed availability
				updatePlotSeeding(Game_Profile.getCrop_Plot(1), seed ,3);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.getCrop_Plot(1).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.getCrop_Plot(2).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pumpkin_seed() >= 1) {															//Check seed availability
				updatePlotSeeding(Game_Profile.getCrop_Plot(2), seed ,3);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.getCrop_Plot(2).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.getCrop_Plot(3).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pumpkin_seed() >= 1) {															//Check seed availability
				updatePlotSeeding(Game_Profile.getCrop_Plot(3), seed ,3);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.getCrop_Plot(3).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.getCrop_Plot(4).isPlot_available()) && (Game_Profile.getCrop_Plot(4).isUnlock())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_pumpkin_seed() >= 1) {															//Check seed availability
				updatePlotSeeding(Game_Profile.getCrop_Plot(4), seed ,3);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.getCrop_Plot(4).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			else if(Game_Profile.getCrop_Plot(4).isUnlock() == false && (chckbxCrop_4.isSelected())) {																	//Crop plot 4 is LOCKED
				setDialog("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			} // End of fourth checkbox
		
		
			
		}// End of Pumpkin
		else if (seed == "Pea" ) {																							//Seed checking
			//Selection = 3
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.getCrop_Plot(1).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pea_seed() >= 1) {																//Check seed availability
				updatePlotSeeding(Game_Profile.getCrop_Plot(1), seed ,2);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.getCrop_Plot(1).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 1 is currently not available.");		// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.getCrop_Plot(2).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pea_seed() >= 1) {																//Check seed availability
				updatePlotSeeding(Game_Profile.getCrop_Plot(2), seed ,2);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.getCrop_Plot(2).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.getCrop_Plot(3).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_pea_seed() >= 1) {																//Check seed availability
				updatePlotSeeding(Game_Profile.getCrop_Plot(3), seed ,2);

				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_4.isSelected()) && (Game_Profile.getCrop_Plot(4).isPlot_available()) && (Game_Profile.getCrop_Plot(4).isUnlock())) {
				setDialog("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.getCrop_Plot(4).isPlot_available()) && (Game_Profile.getCrop_Plot(4).isUnlock())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_pea_seed() >= 1) {																//Check seed availability
				updatePlotSeeding(Game_Profile.getCrop_Plot(4), seed ,2);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.getCrop_Plot(4).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			else if(Game_Profile.getCrop_Plot(4).isUnlock() == false && (chckbxCrop_4.isSelected())) {																	//Crop plot 4 is LOCKED
				setDialog("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}// End of fourth checkbox
		
		
			
		}// End of Pea
		
		else if (seed == "Lettuce" ) {																					//Seed checking
			//Selection = 4
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.getCrop_Plot(1).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_lettuce_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + " into Crop Plot 1.");
				updatePlotSeeding(Game_Profile.getCrop_Plot(1), seed ,1);

				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.getCrop_Plot(1).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.getCrop_Plot(2).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_lettuce_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + " into Crop Plot 2.");
				updatePlotSeeding(Game_Profile.getCrop_Plot(2), seed ,1);

				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.getCrop_Plot(2).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.getCrop_Plot(3).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_lettuce_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + " into Crop Plot 3.");
				updatePlotSeeding(Game_Profile.getCrop_Plot(3), seed ,1);

				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.getCrop_Plot(3).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.getCrop_Plot(4).isPlot_available()) && (Game_Profile.getCrop_Plot(4).isUnlock())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_lettuce_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + " into Crop Plot 4.");
				updatePlotSeeding(Game_Profile.getCrop_Plot(4), seed ,1);

				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.getCrop_Plot(4).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			else if(Game_Profile.getCrop_Plot(4).isUnlock() == false && (chckbxCrop_4.isSelected())) {																	//Crop plot 4 is LOCKED
				setDialog("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}// End of fourth checkbox
		
			
		}// End of Lettuce
		
		else if (seed == "Turnip" ) {																					//Seed checking
			//Selection = 5
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.getCrop_Plot(1).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_turnip_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + " into Crop Plot 1.");
				updatePlotSeeding(Game_Profile.getCrop_Plot(1), seed ,3);

				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.getCrop_Plot(1).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.getCrop_Plot(2).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_turnip_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + " into Crop Plot 2.");
				updatePlotSeeding(Game_Profile.getCrop_Plot(2), seed ,3);

				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.getCrop_Plot(2).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.getCrop_Plot(3).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_turnip_seed() >= 1) {															//Check seed availability
				setDialog("<html> Seeding " + seed + " into Crop Plot 3.");
				updatePlotSeeding(Game_Profile.getCrop_Plot(3), seed ,3);

				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.getCrop_Plot(3).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.getCrop_Plot(4).isPlot_available()) && (Game_Profile.getCrop_Plot(4).isUnlock())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_turnip_seed() >= 1) {															//Check seed availability
					setDialog("<html> Seeding " + seed + " into Crop Plot 4.");
					updatePlotSeeding(Game_Profile.getCrop_Plot(4), seed ,3);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.getCrop_Plot(4).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			else if(Game_Profile.getCrop_Plot(4).isUnlock() == false && (chckbxCrop_4.isSelected())) {																	//Crop plot 4 is LOCKED
				setDialog("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}// End of fourth checkbox
		
		
			
		}// End of Turnip
			
		else if (seed == "Corn" ) {																							//Seed checking
			//Selection = 5
			if ((chckbxCrop_1.isSelected()) && (Game_Profile.getCrop_Plot(1).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_corn_seed() >= 1) {																//Check seed availability
					setDialog("<html> Seeding " + seed + " into Crop Plot 1.");	
					updatePlotSeeding(Game_Profile.getCrop_Plot(1), seed ,2);
				
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_1.isSelected()) && (Game_Profile.getCrop_Plot(1).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 1 is currently not available.");											// Crop Plot not available
			} // End of first checkbox	
			
			
			if ((chckbxCrop_2.isSelected()) && (Game_Profile.getCrop_Plot(2).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_corn_seed() >= 1) {																//Check seed availability
					setDialog("<html> Seeding " + seed + " into Crop Plot 2.");
					updatePlotSeeding(Game_Profile.getCrop_Plot(2), seed ,2);
			
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_2.isSelected()) && (Game_Profile.getCrop_Plot(2).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 2 is currently not available.");											// Crop Plot not available
			} // End of second checkbox
			
			if ((chckbxCrop_3.isSelected()) && (Game_Profile.getCrop_Plot(3).isPlot_available())) {										// Check Crop Plot availability
				if (Game_Profile.getFarmer_corn_seed() >= 1) {				
					//Check seed availability
					setDialog("<html> Seeding " + seed + " into Crop Plot 3.");
					updatePlotSeeding(Game_Profile.getCrop_Plot(3), seed ,2);
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}
			else if ((chckbxCrop_3.isSelected()) && (Game_Profile.getCrop_Plot(3).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 3 is currently not available.");											// Crop Plot not available
			} // End of third checkbox
			
			if ((chckbxCrop_4.isSelected()) && (Game_Profile.getCrop_Plot(4).isPlot_available()) && (Game_Profile.getCrop_Plot(4).isUnlock())) {	// Check Crop Plot availability
				if (Game_Profile.getFarmer_corn_seed() >= 1) {																//Check seed availability
					setDialog("<html> Seeding " + seed + " into Crop Plot 4.");
					updatePlotSeeding(Game_Profile.getCrop_Plot(4), seed ,2);
				
				}// End of seed check
				else {	
					setDialog("<html> You dont have this seed.");														// Not enough seed
				}
			}else if ((chckbxCrop_4.isSelected()) && (Game_Profile.getCrop_Plot(4).isPlot_available() == false)) {
				setDialog("<html> Crop Plot 4 is currently not available.");											// Crop Plot not available
			}
			else if(Game_Profile.getCrop_Plot(4).isUnlock() == false && (chckbxCrop_4.isSelected())) {																	//Crop plot 4 is LOCKED
				setDialog("<html> This is not an Ideal arable land.<br> Choose somewhere else!");
			}// End of fourth checkbox
		
		}// End of Corn
		updateAllCrop();									//Update 4 crop plot icon and label
		updateAll();										//Update inventory, stats

	}
	/**
	 * getCropURL determine the icon to be display on crop plot
	 * @param crop_name	selection of seed
	 * @return	URL of icon to be displayed
	 */
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
	/**
	 * updateCrop	update icon, status in the number of crop plot 
	 * @param crop_icon icon to display in plot
	 * @param crop_lbl  status/message to display
	 * @param Crop_Plot	number of action performing crop plot
	 */
	public void updateCrop(JLabel crop_icon, JLabel crop_lbl, Crop_Plot Crop_Plot) {

		if(Crop_Plot.isPlot_available()) {														// Not planted/seed
			crop_icon.setIcon(new ImageIcon(GUI_body.class.getResource("")));					// Set Icon to show growing crop
			crop_lbl.setText("Plant something");												//Update status
		}
		else {
			String crop_url = getCropURL(Crop_Plot.getPlot_plant());							// Get url of seeded crop
			crop_icon.setIcon(new ImageIcon(GUI_body.class.getResource(crop_url)));				// Set Icon to show growing crop
			crop_lbl.setText("" + Crop_Plot.getPlot_harvest_time() + "day to fully growth");	//Update status in crop label
		}
		
	
	}
	/**
	 * updateAllCrop label and icon of all 4 crop plot at once
	 */
	public void updateAllCrop() {
		
		updateCrop(crop_icon_1 ,crop_1_lbl, Game_Profile.getCrop_Plot(1));
		updateCrop(crop_icon_2 ,crop_2_lbl, Game_Profile.getCrop_Plot(2));
		updateCrop(crop_icon_3 ,crop_3_lbl, Game_Profile.getCrop_Plot(3));
		updateCrop(crop_icon_4 ,crop_4_lbl, Game_Profile.getCrop_Plot(4));

		
	}
	/**
	 * updatePlotHarvest update all of the status of selected crop plot after harvesting
	 * @param Crop_Plot selected Crop plot 
	 */
	public void updatePlotHarvest(Crop_Plot Crop_Plot) {

		updateHarvest(Crop_Plot.getPlot_plant());		// Harvest action on selected plant
		Crop_Plot.setPlot_harvest_time(0);				//reset harvest time
		Crop_Plot.setPlot_available(true);				// ready/ able to plant
		Crop_Plot.setPlot_plant("");					// reset seeded crop to none
		
		
	}
	/**
	 * updateharvest Update inventory base on type of harvested crop
	 * @param crop_name type of seeded crop
	 */
	public void updateHarvest(String crop_name) {
	
		if(crop_name == "Tomato") {
			Game_Profile.setFarmer_tomato(Game_Profile.getFarmer_tomato() + 9); 	// Update Crops to inventory
			
		} else if(crop_name == "Pumpkin") {
			Game_Profile.setFarmer_pumpkin(Game_Profile.getFarmer_pumpkin() + 9); 	// Update Crops to inventory
		} 
		else if(crop_name == "Pea") {
			Game_Profile.setFarmer_pea(Game_Profile.getFarmer_pea() + 9); 	// Update Crops to inventory
		} 
		else if(crop_name == "Lettuce") {

			Game_Profile.setFarmer_lettuce(Game_Profile.getFarmer_lettuce() + 9); 	// Update Crops to inventory
		}
		else if(crop_name == "Turnip") {
			Game_Profile.setFarmer_turnip(Game_Profile.getFarmer_turnip() + 9); 	// Update Crops to inventory
		} 
		else if(crop_name == "Corn") {
			Game_Profile.setFarmer_corn(Game_Profile.getFarmer_corn() + 9); 	// Update Crops to inventory
		}
		setDialog("<html> Harvested 9 " + crop_name + ", It will get me some gold if I sell it to the Trading Market !");
		//blasdsa
	
	}
	/**
	 * updatePlotSeeding set status of crop plot base on selected seeded crop
	 * @param Crop_Plot				Crop plot that is selected
	 * @param seed					Type of seed/crop planted
	 * @param plot_harvest_time		time to be ready for harvest
	 */
	public void updatePlotSeeding(Crop_Plot Crop_Plot, String seed ,int plot_harvest_time) {
		
		Crop_Plot.setPlot_plant(seed);							//Selected seed
		Crop_Plot.setPlot_harvest_time(plot_harvest_time);		//Add to be harvested time to crop plot status
		Crop_Plot.setPlot_available(false);						//Update crop plot to not ready to be seeded(occupied)
		updateSeed(seed);										//Update inventory of seed quantity
		
	}
	/**
	 * updateSeed Update inventory of seed quantity
	 * @param crop_name	planted seed
	 */
	public void updateSeed(String crop_name) {
		
		if(crop_name == "Tomato") {																//Seed planted check
			Game_Profile.setFarmer_tomato_seed(Game_Profile.getFarmer_tomato_seed() - 1); 		// Update Crops to inventory
		} 
		else if(crop_name == "Pumpkin") {														//Seed planted check
			Game_Profile.setFarmer_pumpkin_seed(Game_Profile.getFarmer_pumpkin_seed() - 1); 	// Update Crops to inventory
		}
		else if(crop_name == "Pea") {															//Seed planted check
			Game_Profile.setFarmer_pea_seed(Game_Profile.getFarmer_pea_seed() - 1); 			// Update Crops to inventory
		}
		else if(crop_name == "Lettuce") {														//Seed planted check
			Game_Profile.setFarmer_lettuce_seed(Game_Profile.getFarmer_lettuce_seed() - 1); 	// Update Crops to inventory
		}
		else if(crop_name == "Turnip") {															//Seed planted check
			Game_Profile.setFarmer_turnip_seed(Game_Profile.getFarmer_turnip_seed() - 1); 		// Update Crops to inventory
		}
		else if(crop_name == "Corn") {															//Seed planted check
			Game_Profile.setFarmer_corn_seed(Game_Profile.getFarmer_corn_seed() - 1); 			// Update Crops to inventory
		}
		setDialog("<html> Seeding " + crop_name + " seed into Crop Plot.");
	}
	/**
	 * Update Energy, stats , barn status and inventory after any action or change performed in Barn Panel 
	 */
	public void updateAll() {
		Base_Component.UpdateEnergy();
		Base_Component.UpdateStats();
		Inventory.UpdateInventory();
	}
	public void setDialog(String text) {
		Base_Component.setDialog(text);
	}
}
