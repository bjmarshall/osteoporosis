public class CommandParser {

	Game game;

	public CommandParser(Game game){
		this.game = game;
	}

	public void handle(String command){		// Takes in a command and tries to make sense of it!
		String[] words = command.split("\\s+");

		if(words.length == 2 && words[0].equals("go")){		// the "go" command to take a path
			for(Path p : game.location.egresses){
				if(p.name.equals(words[1])){
					game.moveTo(p);
					break;
				}
			}
		}
	}

}
