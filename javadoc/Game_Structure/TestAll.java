package Game_Structure;

import static org.junit.Assert.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.junit.Test;
/**
 * TestAll Class is implemented as a JUnit test class
 * it run test throughout all method in this package to check various status or variable
 * @author Edward Wong - University of Canterbury SENG_201 
 * 24/05/2020
 */
public class TestAll {
	/**
	 * There is at least one tested status of each method to ensure the algorithm works
	 * I know it should be testing more/all variable to achieve good quality software
	 * This JUnit test was suppose to be done by my partner, but I only receive it at the night before due
	 * And the unit test he did is just with local variable as he didnt take part in developing other class (he don know how to access data from model class)
	 * My case was reported to Professor Miguel long ago, I will include the test that he did in the submission as well(stored in a specific folder)
	 */
	// Init to get access of another class
	private Game_Profile Game_Profile;
	private Controller controller;
	private TurningDay TurningDay;
	private Inventory Inventory;
	private Barn Barn;
	private Base_Component Base_Component;
	private SuperMarket SuperMarket;
	private TradingMarket TradingMarket;
	private Farm Farm;
	
	public static void main(String[] args) {
	
		
		TestAll Test = new TestAll();
		Test.testPlayInBarn();
		
		
	}
	/**
	 * Create object to access other classes
	 */
	public TestAll() {
		super();
		Game_Profile = new Game_Profile();
		
		Base_Component 	= new Base_Component(new JFrame(), Game_Profile);
		controller 		= new Controller(Game_Profile, Base_Component);
		Inventory		= new Inventory(new JPanel(), Game_Profile);
		Barn			= new Barn(new JPanel(), Game_Profile, controller, Base_Component, Inventory);
		SuperMarket		= new SuperMarket(new JPanel(), Game_Profile, Base_Component, Inventory);
		TradingMarket	= new TradingMarket(new JPanel(), Game_Profile, Base_Component, Inventory, Barn);
		TurningDay		= new TurningDay(Game_Profile, Base_Component, Barn, controller, Inventory);
		Farm			= new Farm(Game_Profile, Inventory, Base_Component, new JPanel());
	}


	@Test
	/**Barn
	 * Testing method for PlayInBarn method
	 */
	public void testPlayInBarn() {
		Game_Profile.setAnimal_cow(1);												//preset farmer cow quantity to meet condition
		int energy = Game_Profile.getFarmer_energy();								// clone farmer energy
		Barn.playInBarn();															//Performe action play in barn
		assertEquals(energy - 1, Game_Profile.getFarmer_energy());					//Test farmer energy after play in barn
		Game_Profile.setAnimal_cow(0);												//Update cow quantity back to previous state										
		Game_Profile.setFarmer_energy(energy);										// update energy to previous state
		
	}
	@Test
	/**Farm
	 * Testing method for Seeding method, check effect of crop plot 1
	 */
	public void testSeeding() {
		int seed = 1;   															// 	Tomato index
		int seed_num = Game_Profile.getFarmer_tomato_seed();						//	clone seed count
		Farm.Seed_selection.setSelectedIndex(seed);									// 	preset seed selection instead getting from user
		Farm.chckbxCrop_1.setSelected(true);										//	Preset crop plot 1 is selected						
		Farm.SeedingAction();														// Perform seeding action	
		assertEquals(seed_num - 1, Game_Profile.getFarmer_tomato_seed());			// test seed num
		assertEquals(2, Game_Profile.getCrop_Plot(1).getPlot_harvest_time());		//	test harvest time
		assertEquals("Tomato", Game_Profile.getCrop_Plot(1).getPlot_plant());		// test type of seeded crop
		assertEquals(false, Game_Profile.getCrop_Plot(1).isPlot_available());		// test crop plot availability
		
		//UPDATE STATUS
		Game_Profile.setFarmer_tomato_seed(seed_num);								// update seed quantity to previous state
		Farm.Seed_selection.setSelectedIndex(0);									// Update seed selection to precious state
		Game_Profile.getCrop_Plot(1).setPlot_available(true);						// Update availabilty of crop plot1
		Farm.chckbxCrop_1.setSelected(false);										//	Preset crop plot 1 is unselected	
	}
	@Test

	/**Farm
	 * Testing method for Watering method , check effect of crop plot1
	 */
	public void testWatering_Farm() {
		Game_Profile.getCrop_Plot(1).setPlot_harvest_time(1);						//Preset harvest time of plot 1 = 1
		Game_Profile.setWatering(true);												//Enable watering
		Game_Profile.getCrop_Plot(1).setPlot_available(false);						//Preset crop plot1 to be occupied
		Farm.Watering_Farm();														//Perform watering
		assertEquals(0, Game_Profile.getCrop_Plot(1).getPlot_harvest_time());		// Test the harvest time after watering	
		
		//UPDATE STATUS
		Game_Profile.setWatering(true);												//Enable watering
		Game_Profile.getCrop_Plot(1).setPlot_available(true);						//Update crop plot1 to be ready for planting
	}
	@Test
	/**Farm
	 * Testing method for Harvesting method, check effect of crop plot 1
	 */
	public void testHarvesting() {
		Game_Profile.getCrop_Plot(1).setPlot_harvest_time(0);						//Preset harvest time of plot 1 = 1
		Game_Profile.getCrop_Plot(1).setPlot_available(false);						//Update crop plot1 to occupied
		Farm.chckbxCrop_1.setSelected(true);										//	Preset crop plot 1 is selected		
		int energy = Game_Profile.getFarmer_energy();								//Clone farmer energy
		Farm.Harvesting();															//Perform harvesting
		assertEquals(energy - 1, Game_Profile.getFarmer_energy());					//Test farmer energy after harvesting
		//UPDATE STATUS
		Game_Profile.getCrop_Plot(1).setPlot_available(true);						//Update crop plot1 to be ready for planting
		Farm.chckbxCrop_1.setSelected(false);										//	Preset crop plot 1 is not selected	
		Game_Profile.setFarmer_energy(energy);										// update energy to previous state
	}
	
	@Test
	/**Controller
	 * Testing method for chopTree method
	 */
	public void testchopTree() {
		int gold = Game_Profile.getFarmer_gold();									//clone farmer gold
		int energy = Game_Profile.getFarmer_energy();								//clone farmer energy
		int axe = Game_Profile.getFarmer_axe();										//clone axe amount
		int axe_durability = Game_Profile.getAxe_durability();						//clone durability
		Game_Profile.setFarmer_axe(1);												//Preset farmer have axe
		Game_Profile.setAxe_durability(5);											//Preset farmer axe durability to max
		controller.chopTree();														//Perform chop tree action
		assertEquals(energy - 1, Game_Profile.getFarmer_energy());					//Test farmer energy after chopping tree
		assertEquals(gold +  330, Game_Profile.getFarmer_gold());					//Test farmer gold after chopping tree
		assertEquals(4, Game_Profile.getAxe_durability());							//Test axe durability after chopping tree
		//UPDATE STATUS
		Game_Profile.setFarmer_energy(energy);										//Set gold to previous state
		Game_Profile.setFarmer_gold(gold);											//Set gold to previous state
		Game_Profile.setFarmer_axe(axe);											//Set gold to previous state
		Game_Profile.setAxe_durability(axe_durability);								//Set gold to previous state
		
	}
	@Test
	/**Controller
	 * Testing method for feedAnimal method
	 */
	public void testfeedAnimal() {
		int healthiness = Game_Profile.getAnimal_healthiness();						//clone animal healthiness
		int corn_feed = Game_Profile.getFarmer_corn_feed();							//clone corn feed
		int cow = Game_Profile.getAnimal_cow();										// clone num of cow
		boolean feed = Game_Profile.isFeed_animal();								//clone feed status
		Game_Profile.setFeed_animal(true);											//preset feeding status
		Game_Profile.setAnimal_cow(1);												//preset num of cow
		Game_Profile.setFarmer_corn_feed(1);										//preset num of corn_feed
		Game_Profile.setAnimal_healthiness(5);										//clone animal healthiness
		controller.feedAnimal();													//perform feed animal action
		assertEquals(7, Game_Profile.getAnimal_healthiness());						//test animal healthiness after feeding
		//UPDATE STATUS
		Game_Profile.setAnimal_healthiness(healthiness);							// Set healthiness to previous state
		Game_Profile.setFarmer_corn_feed(corn_feed);								// reset corn_feed
		Game_Profile.setAnimal_cow(cow);											//reset cow qtn
		Game_Profile.setFeed_animal(feed); 											//reset feeding status
	}
	@Test
	/**Controller
	 * Testing Animal allowance
	 */
	public void testAnimalAllowance() { 
		int cow = Game_Profile.getAnimal_cow();										// clone num of cow
		int gold  = Game_Profile.getFarmer_gold();									//clone gold
		int happiness = Game_Profile.getAnimal_happiness();							//clone happiness
		Game_Profile.setAnimal_happiness(5);
		Game_Profile.setAnimal_cow(1);												//preset cow = 1
		controller.AnimalAllowance();												//perform action
		assertEquals(gold + 750, Game_Profile.getFarmer_gold());					//Test farmer gold after action
		Game_Profile.setAnimal_happiness(happiness);								//reset happiness
		Game_Profile.setAnimal_cow(cow);											//preset cow = 1
		Game_Profile.setFarmer_gold(gold);											//reset farmer gold
		
	}
	@Test
	/**Controller
	 * Testing FarmerType_advantage
	 */
	public void testFarmerType_advantage() {								
		int type = Game_Profile.getFarmer_type();									//clone farmer type
		int energy = Game_Profile.getFarmer_energy();								//clone energy
		Game_Profile.setFarmer_type(0);												//preset farmer type
		controller.FarmerType_advantage();											//perform action
		assertEquals(energy + 1, Game_Profile.getFarmer_energy());					//test farmer energy after action
		Game_Profile.setFarmer_energy(energy);										//reset energy
		Game_Profile.setFarmer_type(type);											//reset farmer type
		

		
	}
	@Test
	/**Controller
	 * Testing relic_chair
	 */
	public void testrelicChair() {
		int chair = Game_Profile.getFarmer_relic_chair();							//clone chair
		int aura = Game_Profile.getRelic_aura();									//clone aura
		boolean rest = Game_Profile.isRest();										//clone rest status
		Game_Profile.setRelic_aura(0);												//preset auro = 0
		Game_Profile.setFarmer_relic_chair(1);										//preset chair qty
		Game_Profile.setRest(true);													//allow rest
		controller.relicChair();													//perform action
		assertEquals(1, Game_Profile.getRelic_aura());								//test relic aura
		Game_Profile.setRelic_aura(aura);											//reset auro = 0
		Game_Profile.setFarmer_relic_chair(chair);									//reset chair qty
		Game_Profile.setRest(rest);													//reset rest status
	}
	
	@Test
	/**Controller
	 * Testing relic_chair
	 */
	public void testfertilizer() {
		boolean water = Game_Profile.isWatering();									//clone watering status
		int item = Game_Profile.getFarmer_fertilizer();								//clone fertilizer
		boolean fertilize = Game_Profile.isFertilizing();							//clone fertilize status
		Game_Profile.setWatering(true);												//preset watering status
		Game_Profile.setFarmer_fertilizer(1);										//preset fertilize qty
		Game_Profile.setFertilizing(true);											//preset fertilize status
		controller.fertilizer();													//perform action
		Game_Profile.setWatering(true);												//reset watering status
		Game_Profile.setFarmer_fertilizer(1);										//reset fertilize qty
		Game_Profile.setFertilizing(true);											//reset fertilize status
		
	}
	@Test
	/**SuperMarket
	 * Test purchasing algorithm
	 */
	public void testspurchase() {
		SuperMarket.chckbxItem_2.setSelected(true);														//preset selected box condition
		int gold = Game_Profile.getFarmer_gold();														// clone farmer gold
		SuperMarket.purchase();																			//perform action purchase
		assertEquals(gold -  Game_Profile.getPrice_pumpkin_seed(), Game_Profile.getFarmer_gold());		//test gold after purchase
		SuperMarket.chckbxItem_2.setSelected(false);													//reset selected box condition
		Game_Profile.setFarmer_gold(gold);																//reset gold
	}
	@Test
	/**SuperMarket
	 * Test check cart algorithm
	 */
	public void testscheckCart() {
		SuperMarket.chckbxItem_2.setSelected(true);									//preset selected box condition
		SuperMarket.purchase();														//perform action purchase
		SuperMarket.checkCart();													//perform check cart action
		assertEquals(30 , SuperMarket.checkCart());									//test cart total = sell price
		SuperMarket.chckbxItem_2.setSelected(false);								//reset selected box condition
		Game_Profile.setCart_total(0);												//reset cart
	}
	@Test
	/**SuperMarket
	 * Test cart clear method
	 */
	public void testcartClear() {
		SuperMarket.chckbxItem_2.setSelected(true);									//preset selected box condition
		SuperMarket.cartClear();													// Perform cartClear action
		assertEquals(false, SuperMarket.chckbxItem_2.isSelected());					// test select status after cartClear
	}
	@Test
	/**TradingMarket
	 * Test trading algorithm
	 */
	public void testTrading() {
		int tomato = Game_Profile.getFarmer_tomato();	
		int gold = Game_Profile.getFarmer_gold();									//clone gold
		TradingMarket.sell_1.setSelected(true);										//preset box to be selected 
		Game_Profile.setFarmer_tomato(1);											//preset qty of tomato
		TradingMarket.Trading();													//perform trading action
		assertEquals(gold + 90, Game_Profile.getFarmer_gold());						//test gold amount after trading
		TradingMarket.sell_1.setSelected(false);									//preset box to be selected 
		Game_Profile.setFarmer_tomato(tomato);										//preset qty of tomato
		Game_Profile.setFarmer_gold(gold);
		
	}
	@Test
	/**TurningDay
	 * Testing the effect of after turning nextday, check status
	 */
	public void testNextDay() {
		int gold = Game_Profile.getFarmer_gold();									//clone gold
		TurningDay.NextDay();														//perform nextday function
		assertEquals(gold + 1000, Game_Profile.getFarmer_gold());					// test farmer gold asfter nextday algorithm
		Game_Profile.setFarmer_gold(gold);											//reset farmer gold
	}
	@Test
	/**TurningDay
	 * Testing the algorithm of randomEvent, check status
	 */
	public void testrandomEvent() {
		int end = Game_Profile.getEnd_day();										//clone end day
		int energy = Game_Profile.getFarmer_energy();								//clone energy
		Game_Profile.setEnd_day(2);													//set end day to meet condition
		Game_Profile.setFarmer_energy(2);											//preset energy
		TurningDay.randomEvent(2);													//set random case 3 to occur
		assertEquals(5, Game_Profile.getFarmer_energy());							// test energy after random event occur
		Game_Profile.setEnd_day(end);												//reset set end day
		Game_Profile.setFarmer_energy(energy);										//reset energy
	}
	@Test
	/**TurningDay
	 * Testing the algorithm of Hidden Event, check status							
	 */
	public void testHiddenEvent() {
		int gold = Game_Profile.getFarmer_gold();									//clone gold
		int aura = Game_Profile.getRelic_aura();									// clone relic aura
		int end  = Game_Profile.getEnd_day();										//clone end day
		Game_Profile.setRelic_aura(3);												//preset hidden event condition
		Game_Profile.setEnd_day(5);													//preset endday to meet condition
		TurningDay.HiddenEvent();													//hidden event occur
		assertEquals(gold + 2000, Game_Profile.getFarmer_gold());					//test gold after event
		Game_Profile.setRelic_aura(aura);											//reset hidden event condition
		Game_Profile.setEnd_day(end);												//reset endday 
		Game_Profile.setFarmer_gold(gold);											//reset gold
	}
	@Test
	/**TurningDay
	 * Testing the algorithm of Hidden Event, check status, only getter or setter to test in this method							
	 */
	public void testrefreshDaily() {
		TurningDay.refreshDaily();													//refresh daily occur
		assertEquals(3, Game_Profile.getFarmer_energy());							// test daily recovered energy
	}
	@Test
	/**TurningDay
	 * Testing the algorithm of endDay
	 */
	public void testendDay() {
		int gold = Game_Profile.getFarmer_gold();									//clone gold
		int mask = Game_Profile.getAnimal_cow();									//clone cow qty
		int cow  = Game_Profile.getFarmer_mask();									//clone mask qty
		Game_Profile.setAnimal_cow(1);												//preset cow qty to meet condition
		Game_Profile.setFarmer_mask(0);												//preset mask qty to meet condition
		TurningDay.endDay();														//endday happened
		assertEquals(gold + 13500, Game_Profile.getFarmer_gold());					//test gold after algorithm was run
		Game_Profile.setAnimal_cow(cow);											//reset cow qty 
		Game_Profile.setFarmer_mask(mask);											//reset mask qty
		Game_Profile.setFarmer_gold(gold);											//reset gold

	}
	@Test
	/**TurningDay
	 * Test the status after eating burger
	 */
	public void testeatBurger() {
		int eat 	= Game_Profile.getEat_burger();									//clone eat burger count
		int burger  = Game_Profile.getFarmer_burger();								//clone burger qty
		Game_Profile.setEat_burger(0);												//preset condition
		Game_Profile.setFarmer_burger(1);											//preset condition
		TurningDay.eatBurger();														//eat burger action performed
		assertEquals(0, Game_Profile.getFarmer_burger());							//burger qty deducted
	}
}	