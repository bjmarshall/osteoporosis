public class SampleGameMain {
	static Location roomA = new Location();
	static Location roomB = new Location();
	static Location roomC = new Location();

	static Path AB = new Path("red door", roomA, roomB);
	static Path AC = new Path("blue door", roomA, roomC);
	static Path BC = new Path("green door", roomB, roomC);

	public static void main(String[] args){
		roomA.add(new Item("gold coin"));
		roomB.add(new Item("silver coin"));
		roomA.add(new Entity("red lever"));
	}
}