import java.util.Scanner;

public class Game {

	Location location;
	Container inventory;
	boolean running;

	public Game(Location start, Container inventory){
		location = start;
		this.inventory = inventory;

		// Initialize game by describing the starting location.
		for(Entity e : start.occupants){
			System.out.println("You see " + e.getName());
		}

		runCommandLoop();
	}

	private void runCommandLoop(){
		Scanner scan = new Scanner(System.in);
		while(running){								// This is the command loop.
			System.out.println(scan.nextLine());	// just gonna parrot input for now
		}
	}
	private void moveTo(Path path){
		if(path.take(this)){	// Send the entire game state, probably a bad idea!!!
			location = path.to;
		}
	}
}
