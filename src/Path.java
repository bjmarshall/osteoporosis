public class Path {

	String name;
	Location from;
	Location to;

	public Path(){
		name = "";
	}

	public Path(String name) {
		setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}
}
