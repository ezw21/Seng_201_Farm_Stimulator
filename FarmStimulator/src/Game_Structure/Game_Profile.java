package Game_Structure;
/**
 * Game_Profile Class is implemented as a Model class (Project is trying to approach to Model-view-controller design pattern)
 * This class implemented as a data base for all View and Controller class. 
 * @author Edward Wong - University of Canterbury SENG_201 
 * 15/05/2020
 */
public class Game_Profile {
	

	
	// All variable that will be used in the project
	//Init Farmer - Stats
	private int farmer_type;
	private int farmer_gold;
	private int day_num;
	private int end_day;
	private int farmer_energy;
	private int age;
	private String farmer_name;
	private String farm_name;
	
	
	// Init temp to store data
	private String temp_str; 
	
	
	//Init Shop - Products
	private int price_tomato_seed;
	private int price_pumpkin_seed;
	private int price_pea_seed;
	private int price_lettuce_seed;
	private int price_turnip_seed;
	private int price_corn_seed;
	private int price_burger;
	private int price_fertilizer;
	private int price_relic_chair;
	private int price_water_jar;
	private int price_axe;
	private int price_mask;
	private int cart_total;
	private int profit;
	
	
	//Init Inventory - Crops & Seed
	private int farmer_tomato;
	private int farmer_pumpkin;
	private int farmer_pea;
	private int farmer_lettuce;
	private int farmer_turnip;
	private int farmer_corn;
	
	private int farmer_tomato_seed;
	private int farmer_pumpkin_seed;
	private int farmer_pea_seed;
	private int farmer_lettuce_seed;
	private int farmer_turnip_seed;
	private int farmer_corn_seed;
	
	// Init Inventory - Item & Tools 
	private int farmer_burger;
	private int farmer_fertilizer;
	private int farmer_relic_chair;
	private int farmer_water_jar;
	private int farmer_axe;
	private int farmer_mask;
	private int farmer_corn_feed;
	private int relic_aura;
	private int eat_burger;
	private int axe_durability;
	private boolean rest; 

	
	//Init Animal - Stats
	private int animal_happiness;
	private int animal_healthiness;
	private boolean feed_animal;
	private int animal_cow;
	private int animal_goat;
	private int animal_chicken;
	
	boolean watering;
	boolean fertilizing;
	
	private Crop_Plot Crop_Plot_1;
	private Crop_Plot Crop_Plot_2;
	private Crop_Plot Crop_Plot_3;
	private Crop_Plot Crop_Plot_4;
	
	/**
	 * 	Construct a new game_Profile setup in GUI_Setup - Default value constructor
	 */
	public Game_Profile() {
		super();
		initConfiguration();
	}
	/**
	 * Constructor of dependent variable
	 * Construct with farmer type, farmer name, farm_name, farmer_energy, end_day after getting input from GUI_Setup
	 * @param farmer_type	The type of farm in the range of 0 - 3
	 * @param farmer_name	Farmer name of player
	 * @param farm_name		Farm name selected by user 
	 * @param farmer_energy	Farmer energy to perform action
	 * @param end_day		Farmer conntract end day (end game)
	 */
	public Game_Profile(int farmer_type, String farmer_name, String farm_name, int farmer_energy, int end_day, int age) {

		
		initConfiguration();
		this.farmer_type 	= farmer_type;

		
		this.farmer_name 	= farmer_name;
		this.farm_name 		= farm_name;
		this.farmer_energy 	= farmer_energy;
		this.end_day 		= end_day;
		this.age 			= age;
		
	}

	/**
	 * initConfiguration Set the default value of all variable for the defaut value constructor
	 */
	private void initConfiguration() {
		// Set the default value
		//Stats
		this.farmer_type 	= 0;
		this.farmer_name 	= "Little Shit";
		this.farm_name 		= "Bull shit";
		this.farmer_energy 	= 3;
		this.end_day 		= 5;
		this.farmer_gold 	= 450;
		this.day_num 		= 1;
		
		// Shop_Products
		this.price_tomato_seed 	= 30;
		this.price_pumpkin_seed = 30;
		this.price_pea_seed 	= 60;
		this.price_lettuce_seed = 60;
		this.price_turnip_seed 	= 90;
		this.price_corn_seed 	= 90;
		
		this.price_burger 		= 60;
		this.price_fertilizer 	= 100;
		this.price_relic_chair 	= 210;
		this.price_water_jar 	= 150;
		this.price_axe 			= 600;
		this.price_mask 		= 15;
		this.cart_total 		= 0;		
		this.profit 			= 0;
		
		// Inventory
		this.farmer_tomato 	= 0;
		this.farmer_pumpkin = 0;
		this.farmer_pea 	= 0;
		this.farmer_lettuce = 0;
		this.farmer_turnip 	= 0;
		this.farmer_corn 	= 0;
		
		this.farmer_tomato_seed  = 2;
		this.farmer_pumpkin_seed = 2;
		this.farmer_pea_seed 	 = 2;
		this.farmer_lettuce_seed = 2;
		this.farmer_turnip_seed  = 2;
		this.farmer_corn_seed 	 = 2;
		// Items & tool
		this.farmer_burger 		= 3;
		this.farmer_fertilizer	= 0;
		this.farmer_relic_chair = 0;
		this.farmer_water_jar	= 0;
		this.farmer_axe 		= 1;
		this.farmer_mask 		= 2;
		this.farmer_corn_feed 	= 3;
		this.relic_aura 		= 0;
		this.eat_burger 		= 0;
		this.axe_durability 	= 5;
		
		// Animal
		this.animal_happiness 	= 3;
		this.feed_animal 		= true;
		this.animal_healthiness = 5;
		this.animal_cow 		= 0;
		this.animal_goat 		= 0;
		this.animal_chicken 	= 0;
		
		this.Crop_Plot_1 = new Crop_Plot(true, true , 0, "" );
		this.Crop_Plot_2 = new Crop_Plot(true, true , 0, "" );
		this.Crop_Plot_3 = new Crop_Plot(true, true , 0, "" );
		this.Crop_Plot_4 = new Crop_Plot(true, false, 0, "" );
		
		this.rest 		 = true;
		this.fertilizing = true;
		this.watering 	 = true;
	}
	/**
	 * getCrop_Plot
	 * @param index index of crop plot
	 * @return	selected crop plot with index
	 */
	public Crop_Plot getCrop_Plot(int index) {
		if(index == 1) {
			return this.Crop_Plot_1;
		}
		else if(index == 2) {
			return this.Crop_Plot_2;
		}
		else if(index == 3) {
			return this.Crop_Plot_3;
		}
		else if(index == 4) {
			return this.Crop_Plot_4;
		}else {
			return null;
		}
	}
	

	// G & S of Farmer - Stats 
	public int getFarmer_gold() {
		return farmer_gold;
	}
	public void setFarmer_gold(int farmer_gold) {
		this.farmer_gold = farmer_gold;
	}
	public int getFarmer_type() {
		return farmer_type;
	}
	public void setFarmer_type(int farmer_type) {
		this.farmer_type = farmer_type;
	}
	public String getFarmer_name() {
		return farmer_name;
	}
	public void setFarmer_name(String farmer_name) {
		this.farmer_name = farmer_name;
	}
	public String getFarm_name() {
		return farm_name;
	}
	public void setFarm_name(String farm_name) {
		this.farm_name = farm_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEnd_day() {
		return end_day;
	}
	public void setEnd_day(int end_day) {
		this.end_day = end_day;
	}
	public String getTemp_str() {
		return temp_str;
	}
	public void setTemp_str(String temp_str) {
		this.temp_str = temp_str;
	}
	public int getDay_num() {
		return day_num;
	}
	public void setDay_num(int day_num) {
		this.day_num = day_num;
	}	
	public int getFarmer_energy() {
		return farmer_energy;
	}
	public void setFarmer_energy(int farmer_energy) {
		this.farmer_energy = farmer_energy;
	}
	
	// G & S Shop - Products
	public int getPrice_tomato_seed() {
		return price_tomato_seed;
	}
	public void setPrice_tomato_seed(int price_tomato_seed) {
		this.price_tomato_seed = price_tomato_seed;
	}
	public int getPrice_pumpkin_seed() {
		return price_pumpkin_seed;
	}
	public void setPrice_pumpkin_seed(int price_pumpkin_seed) {
		this.price_pumpkin_seed = price_pumpkin_seed;
	}
	public int getPrice_pea_seed() {
		return price_pea_seed;
	}
	public void setPrice_pea_seed(int price_pea_seed) {
		this.price_pea_seed = price_pea_seed;
	}
	public int getPrice_lettuce_seed() {
		return price_lettuce_seed;
	}
	public void setPrice_lettuce_seed(int price_lettuce_seed) {
		this.price_lettuce_seed = price_lettuce_seed;
	}
	public int getPrice_turnip_seed() {
		return price_turnip_seed;
	}
	public void setPrice_turnip_seed(int price_turnip_seed) {
		this.price_turnip_seed = price_turnip_seed;
	}
	public int getPrice_corn_seed() {
		return price_corn_seed;
	}
	public void setPrice_corn_seed(int price_corn_seed) {
		this.price_corn_seed = price_corn_seed;
	}
	public int getPrice_burger() {
		return price_burger;
	}
	public void setPrice_burger(int price_burger) {
		this.price_burger = price_burger;
	}
	public int getPrice_fertilizer() {
		return price_fertilizer;
	}
	public void setPrice_fertilizer(int price_fertilizer) {
		this.price_fertilizer = price_fertilizer;
	}
	public int getPrice_relic_chair() {
		return price_relic_chair;
	}
	public void setPrice_relic_chair(int price_relic_chair) {
		this.price_relic_chair = price_relic_chair;
	}
	public int getPrice_water_jar() {
		return price_water_jar;
	}
	public void setPrice_water_jar(int price_water_jar) {
		this.price_water_jar = price_water_jar;
	}
	public int getPrice_axe() {
		return price_axe;
	}
	public void setPrice_axe(int price_axe) {
		this.price_axe = price_axe;
	}
	public int getPrice_mask() {
		return price_mask;
	}
	public void setPrice_mask(int price_mask) {
		this.price_mask = price_mask;
	}
	public int getCart_total() {
		return cart_total;
	}
	public void setCart_total(int cart_total) {
		this.cart_total = cart_total;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}	
	public int getRelic_aura() {
		return relic_aura;
	}
	public void setRelic_aura(int relic_aura) {
		this.relic_aura = relic_aura;
	}
	public boolean isRest() {
		return rest;
	}
	public void setRest(boolean rest) {
		this.rest = rest;
	}
	public int getEat_burger() {
		return eat_burger;
	}
	public void setEat_burger(int eat_burger) {
		this.eat_burger = eat_burger;
	}
	public int getAxe_durability() {
		return axe_durability;
	}
	public void setAxe_durability(int axe_durability) {
		this.axe_durability = axe_durability;
	}
	
	// G & S Inventory - Crops & Seeds
	public int getFarmer_tomato() {
		return farmer_tomato;
	}
	public void setFarmer_tomato(int farmer_tomato) {
		this.farmer_tomato = farmer_tomato;
	}
	public int getFarmer_pumpkin() {
		return farmer_pumpkin;
	}
	public void setFarmer_pumpkin(int farmer_pumpkin) {
		this.farmer_pumpkin = farmer_pumpkin;
	}
	public int getFarmer_pea() {
		return farmer_pea;
	}
	public void setFarmer_pea(int farmer_pea) {
		this.farmer_pea = farmer_pea;
	}
	public int getFarmer_lettuce() {
		return farmer_lettuce;
	}
	public void setFarmer_lettuce(int farmer_lettuce) {
		this.farmer_lettuce = farmer_lettuce;
	}
	public int getFarmer_turnip() {
		return farmer_turnip;
	}
	public void setFarmer_turnip(int farmer_turnip) {
		this.farmer_turnip = farmer_turnip;
	}
	public int getFarmer_corn() {
		return farmer_corn;
	}
	public void setFarmer_corn(int farmer_corn) {
		this.farmer_corn = farmer_corn;
	}
	public int getFarmer_tomato_seed() {
		return farmer_tomato_seed;
	}
	public void setFarmer_tomato_seed(int farmer_tomato_seed) {
		this.farmer_tomato_seed = farmer_tomato_seed;
	}
	public int getFarmer_pumpkin_seed() {
		return farmer_pumpkin_seed;
	}
	public void setFarmer_pumpkin_seed(int farmer_pumpkin_seed) {
		this.farmer_pumpkin_seed = farmer_pumpkin_seed;
	}
	public int getFarmer_pea_seed() {
		return farmer_pea_seed;
	}
	public void setFarmer_pea_seed(int farmer_pea_seed) {
		this.farmer_pea_seed = farmer_pea_seed;
	}
	public int getFarmer_lettuce_seed() {
		return farmer_lettuce_seed;
	}
	public void setFarmer_lettuce_seed(int farmer_lettuce_seed) {
		this.farmer_lettuce_seed = farmer_lettuce_seed;
	}
	public int getFarmer_turnip_seed() {
		return farmer_turnip_seed;
	}
	public void setFarmer_turnip_seed(int farmer_turnip_seed) {
		this.farmer_turnip_seed = farmer_turnip_seed;
	}
	public int getFarmer_corn_seed() {
		return farmer_corn_seed;
	}
	public void setFarmer_corn_seed(int farmer_corn_seed) {
		this.farmer_corn_seed = farmer_corn_seed;
	}
	public boolean isFertilizing() {
		return fertilizing;
	}
	public void setFertilizing(boolean fertilizing) {
		this.fertilizing = fertilizing;
	}
	
	// G & S Inventory - Items & Tools
	public int getFarmer_burger() {
		return farmer_burger;
	}
	public void setFarmer_burger(int farmer_burger) {
		this.farmer_burger = farmer_burger;
	}
	public int getFarmer_fertilizer() {
		return farmer_fertilizer;
	}
	public void setFarmer_fertilizer(int farmer_fertilizer) {
		this.farmer_fertilizer = farmer_fertilizer;
	}
	public int getFarmer_relic_chair() {
		return farmer_relic_chair;
	}

	public void setFarmer_relic_chair(int farmer_relic_chair) {
		this.farmer_relic_chair = farmer_relic_chair;
	}
	public int getFarmer_water_jar() {
		return farmer_water_jar;
	}
	public void setFarmer_water_jar(int farmer_water_jar) {
		this.farmer_water_jar = farmer_water_jar;
	}
	public int getFarmer_axe() {
		return farmer_axe;
	}
	public void setFarmer_axe(int farmer_axe) {
		this.farmer_axe = farmer_axe;
	}
	public int getFarmer_mask() {
		return farmer_mask;
	}
	public void setFarmer_mask(int farmer_mask) {
		this.farmer_mask = farmer_mask;
	}
	public int getFarmer_corn_feed() {
		return farmer_corn_feed;
	}
	public void setFarmer_corn_feed(int farmer_corn_feed) {
		this.farmer_corn_feed = farmer_corn_feed;
	}
	
	// G & S Animal - Stats
	public int getAnimal_happiness() {
		return animal_happiness;
	}
	public void setAnimal_happiness(int animal_happiness) {
		this.animal_happiness = animal_happiness;
	}
	public boolean isFeed_animal() {
		return feed_animal;
	}
	public void setFeed_animal(boolean feed_animal) {
		this.feed_animal = feed_animal;
	}
	public int getAnimal_healthiness() {
		return animal_healthiness;
	}
	public void setAnimal_healthiness(int animal_healthiness) {
		this.animal_healthiness = animal_healthiness;
	}
	public int getAnimal_cow() {
		return animal_cow;
	}
	public void setAnimal_cow(int animal_cow) {
		this.animal_cow = animal_cow;
	}
	public int getAnimal_goat() {
		return animal_goat;
	}
	public void setAnimal_goat(int animal_goat) {
		this.animal_goat = animal_goat;
	}
	public int getAnimal_chicken() {
		return animal_chicken;
	}
	public void setAnimal_chicken(int animal_chicken) {
		this.animal_chicken = animal_chicken;
	}
	public boolean isWatering() {
		return watering;
	}
	public void setWatering(boolean watering) {
		this.watering = watering;
	}

}
