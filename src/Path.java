public class Path {

	String name;
	Location from;
	Location to;
	boolean accessible = true;

	public Path(){
		name = "";
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
}
