
public class Crop {
	private String cropName;
	public int water;
	
	public int purchasingPrice;
	public int sellingPrice;
	public Farm money;
	
	public int daysToHarvest = 10;
	public boolean harvest = false;
    public int daysGrowth;
    
    /**
     * a constructor to instantiate a crop object.
     * @param cropName
     * @param daysGrowth
     * @param daysToHarvest
     * @param purchasingPrice
     * @param sellingPrice
     */
	public Crop(String cropName, int daysGrowth, int daysToHarvest, int purchasingPrice, int sellingPrice) {
		this.cropName = cropName;
		this.daysGrowth = daysGrowth;
		this.daysToHarvest = daysToHarvest;
		this.purchasingPrice = purchasingPrice;
		this.sellingPrice = sellingPrice;	
	}
	
	/**
	 * a method to set the crop's name. Unnecessary as the above constructor exists.
	 * @return crop's name
	 */
	public String getCropName() {
		return cropName;
	}
	
	/**
	 * a method to set the crop's name. Unnecessary as the above constructor exists.
	 * @param cropName
	 */
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
    /**
     * a method to tend the crop and increase the growth while yet to be harvested.
     * @param cropProduct
     */
    public void cropTend(int cropProduct) {
    	if (harvest = false) {
    		daysGrowth += cropProduct;
    		if(daysGrowth == 10) {
    			harvest = true;
    		}
    	}
    }
    
    /**
     * a method to water the crop and increase the growth while yet to be harvested.
     * @param water
     */
	public void cropWater(int water) {
		if (harvest = false) {
			daysGrowth += water;
			if(daysGrowth == 10) {
    			harvest = true;
    		}
		}
	}

}
