
public class DisplayStats {
	public static void displayStats(Player player){
		ClearConsole.clearConsole();
		System.out.println("Stats:");
		System.out.println("HP: " + player.getHitPoints() + "/" + player.getMaxHitPoints());
		System.out.println("STRENGTH: " + player.getStrength());
		System.out.println("DEXTERITY: " + player.getDexterity());
		System.out.println("LEVEL: " + player.getLevel());
		System.out.println("EXPERIENCE: " + player.getExperience());
		System.out.println("LEVEL UP IN " + (player.getLevelUpExperience() - player.getExperience()) + " experience");
		System.out.println();		
	}
}
