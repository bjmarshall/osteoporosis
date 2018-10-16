import java.util.ArrayList;
import java.util.Collection;

public interface Container{ // Anything that has an inventory; i.e. can hold items

	public Collection<Item> getItems();
	public void addItem();

}
