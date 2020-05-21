package Game_Structure;

public class Game_Profile {
	
	//Init Farmer - Stats
	private int farmer_type;
	private int farmer_gold;
	private int day_num;
	private int end_day;
	private int farmer_energy;
	private String farmer_name;
	private String farm_name;
	
	
	// Init temp to store data
	private String temp_str; 
	private int farm_type;
	
	
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
	
	//Init for Farm
	 boolean plot_1_available;
	 boolean plot_2_available;
	 boolean plot_3_available;
	 boolean plot_4_available;
	 boolean watering;
	 boolean unlock_plot4;
	 boolean fertilizing;
	 int plot_1_harvest_time;
	 int plot_2_harvest_time;
	 int plot_3_harvest_time;
	 int plot_4_harvest_time;
	 String plot_1_plant;
	 String plot_2_plant;
	 String plot_3_plant;
	 String plot_4_plant;
	
	
	public Game_Profile() {
		super();
	}
	
	public Game_Profile(int farmer_type, int farmer_gold, int day_num, String farmer_name, String farm_name, int farm_type, int price_tomato_seed, int price_pumpkin_seed
			, int price_pea_seed, int price_lettuce_seed, int price_turnip_seed, int price_corn_seed, int price_burger, int price_fertilizer, int price_relic_chair
			, int price_water_jar, int price_axe, int price_mask, int cart_total, int farmer_tomato, int farmer_pumpkin, int farmer_pea, int farmer_lettuce, int farmer_turnip, int farmer_corn
			, int farmer_tomato_seed, int farmer_pumpkin_seed, int farmer_pea_seed, int farmer_lettuce_seed, int farmer_turnip_seed, int farmer_corn_seed, int farmer_burger, int farmer_fertilizer
			, int farmer_relic_chair, int farmer_water_jar, int farmer_axe, int farmer_mask, int farmer_corn_feed, int animal_happiness, boolean feed_animal, int farmer_energy
			, int animal_healthiness, int animal_cow, int animal_goat, int animal_chicken, boolean plot_1_available, boolean plot_2_available, boolean plot_3_available, boolean plot_4_available
			, int plot_1_harvest_time, int plot_2_harvest_time, int plot_3_harvest_time, int plot_4_harvest_time, boolean watering, boolean unlock_plot4, String plot_1_plant, String plot_2_plant,  String plot_3_plant
			, String plot_4_plant, int profit, int relic_aura, boolean rest, int eat_burger, int axe_durability,  boolean fertilizing, int end_day) {
		
		// Farmer Stats
		this.farmer_type = farmer_type;
		this.farmer_gold = farmer_gold;
		this.setDay_num(day_num);
		this.farmer_name = farmer_name;
		this.farm_name = farm_name;
		this.farm_type = farm_type;
		this.farmer_energy = farmer_energy;
		this.end_day = end_day;
		
		// Shop_Products
		this.price_tomato_seed = price_tomato_seed;
		this.price_pumpkin_seed = price_pumpkin_seed;
		this.price_pea_seed = price_pea_seed;
		this.price_lettuce_seed = price_lettuce_seed;
		this.price_turnip_seed = price_turnip_seed;
		this.price_corn_seed = price_corn_seed;
		
		this.price_burger = price_burger;
		this.price_fertilizer = price_fertilizer;
		this.price_relic_chair = price_relic_chair;
		this.price_water_jar = price_water_jar;
		this.price_axe = price_axe;
		this.price_mask = price_mask;
		this.cart_total = cart_total;		
		this.profit = profit;
		
		// Inventory
		this.farmer_tomato = farmer_tomato;
		this.farmer_pumpkin = farmer_pumpkin;
		this.farmer_pea = farmer_pea;
		this.farmer_lettuce = farmer_lettuce;
		this.farmer_turnip = farmer_turnip;
		this.farmer_corn = farmer_corn;
		
		this.farmer_tomato_seed = farmer_tomato_seed;
		this.farmer_pumpkin_seed = farmer_pumpkin_seed;
		this.farmer_pea_seed = farmer_pea_seed;
		this.farmer_lettuce_seed = farmer_lettuce_seed;
		this.farmer_turnip_seed = farmer_turnip_seed;
		this.farmer_corn_seed = farmer_corn_seed;
		// Items & tool
		this.farmer_burger = farmer_burger;
		this.farmer_fertilizer = farmer_fertilizer;
		this.farmer_relic_chair = farmer_relic_chair;
		this.farmer_water_jar = farmer_water_jar;
		this.farmer_axe = farmer_axe;
		this.farmer_mask = farmer_mask;
		this.farmer_corn_feed = farmer_corn_feed;
		this.relic_aura = relic_aura;
		this.eat_burger = eat_burger;
		this.axe_durability = axe_durability;
		
		// Animal
		this.animal_happiness = animal_happiness;
		this.feed_animal = feed_animal;
		this.animal_healthiness = animal_healthiness;
		this.animal_cow = animal_cow;
		this.animal_goat = animal_goat;
		this.animal_chicken = animal_chicken;
		
		// Farm
		this.plot_1_available = plot_1_available;
		this.plot_2_available = plot_2_available;
		this.plot_3_available = plot_3_available;
		this.plot_4_available = plot_4_available;

		this.plot_1_harvest_time = plot_1_harvest_time;
		this.plot_2_harvest_time = plot_2_harvest_time;
		this.plot_3_harvest_time = plot_3_harvest_time;
		this.plot_4_harvest_time = plot_4_harvest_time;
		this.watering = watering;

		this.unlock_plot4 = unlock_plot4;
		this.plot_1_plant = plot_1_plant;
		this.plot_2_plant = plot_2_plant;
		this.plot_3_plant = plot_3_plant;
		this.plot_4_plant = plot_4_plant;
		this.rest = rest;
		this.fertilizing = fertilizing;
		
		
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
	public int getFarm_type() {
		return farm_type;
	}
	public void setFarm_type(int farm_type) {
		this.farm_type = farm_type;
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
	//G & S for Farm
	public boolean isPlot_1_available() {
		return plot_1_available;
	}
	public void setPlot_1_available(boolean plot_1_available) {
		this.plot_1_available = plot_1_available;
	}
	public boolean isPlot_2_available() {
		return plot_2_available;
	}
	public void setPlot_2_available(boolean plot_2_available) {
		this.plot_2_available = plot_2_available;
	}
	public boolean isPlot_3_available() {
		return plot_3_available;
	}
	public void setPlot_3_available(boolean plot_3_available) {
		this.plot_3_available = plot_3_available;
	}
	public boolean isPlot_4_available() {
		return plot_4_available;
	}
	public void setPlot_4_available(boolean plot_4_available) {
		this.plot_4_available = plot_4_available;
	}
	public int getPlot_1_harvest_time() {
		return plot_1_harvest_time;
	}
	public void setPlot_1_harvest_time(int plot_1_harvest_time) {
		this.plot_1_harvest_time = plot_1_harvest_time;
	}
	public int getPlot_2_harvest_time() {
		return plot_2_harvest_time;
	}
	public void setPlot_2_harvest_time(int plot_2_harvest_time) {
		this.plot_2_harvest_time = plot_2_harvest_time;
	}
	public int getPlot_3_harvest_time() {
		return plot_3_harvest_time;
	}
	public void setPlot_3_harvest_time(int plot_3_harvest_time) {
		this.plot_3_harvest_time = plot_3_harvest_time;
	}
	public int getPlot_4_harvest_time() {
		return plot_4_harvest_time;
	}
	public void setPlot_4_harvest_time(int plot_4_harvest_time) {
		this.plot_4_harvest_time = plot_4_harvest_time;
	}
	public boolean isWatering() {
		return watering;
	}
	public void setWatering(boolean watering) {
		this.watering = watering;
	}

	public boolean isUnlock_plot4() {
		return unlock_plot4;
	}
	public void setUnlock_plot4(boolean unlock_plot4) {
		this.unlock_plot4 = unlock_plot4;
	}
	public String getPlot_1_plant() {
		return plot_1_plant;
	}
	public void setPlot_1_plant(String plot_1_plant) {
		this.plot_1_plant = plot_1_plant;
	}
	public String getPlot_2_plant() {
		return plot_2_plant;
	}
	public void setPlot_2_plant(String plot_2_plant) {
		this.plot_2_plant = plot_2_plant;
	}
	public String getPlot_3_plant() {
		return plot_3_plant;
	}
	public void setPlot_3_plant(String plot_3_plant) {
		this.plot_3_plant = plot_3_plant;
	}
	public String getPlot_4_plant() {
		return plot_4_plant;
	}
	public void setPlot_4_plant(String plot_4_plant) {
		this.plot_4_plant = plot_4_plant;
	}

	
}
