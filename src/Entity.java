public class Entity { // Top of the hierarchy for anything that can go in a location.

	String name;

	public Entity(){
		name = "";
	}

	public Entity(String name) {
		setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
