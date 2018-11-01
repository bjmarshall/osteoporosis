import java.util.Scanner;

public class SampleGameMain {
	static Location roomA = new Location();
	static Location roomB = new Location();
	static Location roomC = new Location();

	static Path AB = new Path("red_door", roomA, roomB);
	static Path AC = new Path("blue_door", roomA, roomC);
	static Path BC = new Path("green_door", roomB, roomC);

	static Game game;

	public static void main(String[] args){
		roomA.add(new Item("gold coin"));
		roomB.add(new Item("silver coin"));
		roomA.add(new Entity("red lever"));

		roomA.egresses.add(AB);
		roomB.egresses.add(BC);
		roomA.egresses.add(AC);


		game = new Game(roomA, new CreatureInventory());
		game.runCommandLoop();
	}
}