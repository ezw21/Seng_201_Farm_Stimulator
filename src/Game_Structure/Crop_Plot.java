package Game_Structure;

/**
 * Crop Plot Class is implemented as a Model-class (Project is trying to approach to Model-view-controller design pattern)
 * This class specifically implemented for data storing for action in crop panel in Crop panel (Unrelated to GUI design)
 * this data class is implemented as crop Panel have Seeding, Watering and Harvesting which require multiple variable and a complicated algorithm
 * @author Edward Wong - University of Canterbury SENG_201 
 * 19/05/2020
 */
public class Crop_Plot {
	// Init for Farm
	boolean plot_available;
	boolean unlock;
	int plot_harvest_time;

	String plot_plant;
	/**
	 * 
	 * @param plot_available		Abailability of individual crop plot for seeding/planting (false when occupied)
	 * @param unlock				Crop plot 4 is unlock status
	 * @param plot_harvest_time		Crop time to be ready for harvest in individual crop plot
	 * @param plot_plant			Type of plant thats seed/planted in every crop plot
	 */
	public Crop_Plot(boolean plot_available, boolean unlock, int plot_harvest_time, String plot_plant) {
		super();
		this.plot_available = plot_available;
		this.unlock = unlock;
		this.plot_harvest_time = plot_harvest_time;
		this.plot_plant = plot_plant;
	}

	public boolean isPlot_available() {
		return plot_available;
	}

	public void setPlot_available(boolean plot_available) {
		this.plot_available = plot_available;
	}

	public boolean isUnlock() {
		return unlock;
	}

	public void setUnlock(boolean unlock) {
		this.unlock = unlock;
	}

	public int getPlot_harvest_time() {
		return plot_harvest_time;
	}

	public void setPlot_harvest_time(int plot_harvest_time) {
		this.plot_harvest_time = plot_harvest_time;
	}

	public String getPlot_plant() {
		return plot_plant;
	}

	public void setPlot_plant(String plot_plant) {
		this.plot_plant = plot_plant;
	}

}
