package Game_Structure;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;


public class MainScene {
	
	private JPanel JPanel;
	
	//Init main screen label
	JLabel Action_with_requirements = new JLabel("Action_with_requirement {E} / {$}") ;
	JLabel Action_Set_Rqrm;
	JLabel Action_no_requirement;
	JLabel Action_Set_Free;
	JLabel Main_Scene_wallpaper = new JLabel("");
	
	final JToggleButton tglbtnExplain = new JToggleButton("INFO");
	
	
	public MainScene(JPanel jPanel) {
		super();
		JPanel = jPanel;
		
		initMainScene();
		init();
	}
	
	private void init() {
		//Add all label in Main_Scene panel
		JPanel.add(Main_Scene_wallpaper);
		JPanel.add(tglbtnExplain);
		JPanel.add(Action_with_requirements);
		JPanel.add(Action_Set_Rqrm);
		JPanel.add(Action_no_requirement);
		JPanel.add(Action_Set_Free);
	}
	public void initMainScene() {							//Init component in MainScene
		tglbtnExplain.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		tglbtnExplain.setBounds(175, 230, 75, 25);			// End of button -INFO (MainScene)
		//INFO (MainScene)
		tglbtnExplain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				INFO_MainScene();}});	
		
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
	
	
}
