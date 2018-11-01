import java.util.ArrayList;
import java.util.Collection;

public class CreatureInventory implements Container{

	ArrayList<Item> items;		// Anything that the creature is carrying. INCLUDES held and equipped items
	ArrayList<Item> equipped;	// Anything that the creature is wearing or holding. Subset of items.

	public CreatureInventory(){
		items = new ArrayList<>();
		equipped = new ArrayList<>();
	}

	@Override
	public Collection<Item> getItems() {
		return equipped;
	}

	@Override
	public void addItem(Item item) {
		items.add(item);
	}

	public int equip(Item item){	// returns -1 if already equipped, 0 if equipped from inventory, and 1 if added to inventory
		if (equipped.contains(item)){
			return -1;
		}
		if (items.contains(item)){
			equipped.add(item);
			return 0;
		}
		items.add(item);
		equipped.add(item);
		return 1;
	}
}
