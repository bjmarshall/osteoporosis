public class Path {

	String name;
	Location from;
	Location to;
	boolean accessible = true;

	public Path(){
		this("");
	}

	public Path(String name) {
		setName(name);
	}

	public Path(String name, Location from, Location to) {
		setName(name);
		this.from = from;
		this.to = to;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean take(Game game){		// Takes in entire game state, PROBABLY A BAD IDEA!
		return accessible;
	}
}
