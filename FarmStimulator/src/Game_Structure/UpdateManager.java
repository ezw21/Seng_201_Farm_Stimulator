package Game_Structure;

public class UpdateManager {
	private Base_Component Base_Component ;
	private Inventory Inventory;
	private Barn Barn;
	
	public UpdateManager(Game_Structure.Base_Component base_Component, Game_Structure.Inventory inventory,
			Game_Structure.Barn barn) {
		super();
		
		Base_Component = base_Component;
		Inventory = inventory;
		Barn = barn;
	}

	public void UpdateAll() {						//perform all updates
		Base_Component.UpdateStats();
		Base_Component.UpdateEnergy();
		Inventory.UpdateInventory();
		Barn.UpdateBarn();
	}
}
