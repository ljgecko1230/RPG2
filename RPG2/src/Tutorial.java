
public class Tutorial {
	public static void startTutorial(Player player)
	{
		int monster = 0;
		System.out.println("Running tutorial for " + player.getName() + "...");
		System.out.println();
		System.out.println("Welcome to the tutorial.");
		
		DisplayStats.displayStats(player);
		
		Actions.getAction(player, monster);
	}
}
