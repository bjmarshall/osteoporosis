import java.util.ArrayList;

public class Location {

	public ArrayList<Entity> occupants = new ArrayList<>(); // Anything within the location

	public ArrayList<Path> egresses = new ArrayList<>(); // Any location that can be directly traveled to from this location

	public ArrayList<Location> getNeighbors(){
		ArrayList<Location> ret = new ArrayList<>();

		for(Path eg : egresses){
			if(!ret.contains(eg.to)){
				ret.add(eg.to);
			}
		}

		return ret;
	}

	public void add(Entity e){
		occupants.add(e);
	}

}
