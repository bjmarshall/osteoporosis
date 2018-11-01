import java.util.Scanner;

public class Game {

	Location location;
	Container inventory;
	boolean running;

	public Game(Location start, Container inventory){
		running = true;
		location = start;
		this.inventory = inventory;

		// Initialize game by describing the starting location.
		for(Entity e : start.occupants){
			System.out.println("You see " + e.getName());
		}

		runCommandLoop();
	}

	public void runCommandLoop(){
		Scanner scan = new Scanner(System.in);
		CommandParser parser = new CommandParser(this);
		while(running){								// This is the command loop.
			parser.handle(scan.nextLine());
		}
	}
	public void moveTo(Path path){
		if(path.take(this)){	// Send the entire game state, probably a bad idea!!!
			location = path.to;

			for(Entity e : location.occupants){
				System.out.println("You see " + e.getName());
			}
		}
	}
}
