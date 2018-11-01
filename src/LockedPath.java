public class LockedPath extends Path{	// A path that requires an item, consumable or non-consumable, to be equipped by player to open

	Item key;	// What is required to access the path?
	boolean consumable;	// Is the key removed from the player's inventory when used?
	boolean mustBeEquipped;	// Does the key have to be held or just carried? UNUSED RIGHT NOW

	public LockedPath(String name, Item key, boolean consumable, boolean mustBeEquipped){
		this.name = name;
		this.key = key;
		this.consumable = consumable;
		this.mustBeEquipped = mustBeEquipped;
	}

	public LockedPath(Item key, boolean consumable, boolean mustBeEquipped){
		this("", key, consumable, mustBeEquipped);
	}


	@Override
	public boolean take(Game game) {
		boolean ret = game.inventory.getItems().contains(key);

		if(consumable){
			game.inventory.getItems().remove(key);
		}

		return ret;
	}
}
