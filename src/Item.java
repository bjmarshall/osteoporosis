public class Item extends Entity{ //Anything that can be held or carried.

	int weight = 0;

	public Item(String n){
		super(n);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
