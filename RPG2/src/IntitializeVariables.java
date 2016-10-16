
public class IntitializeVariables {
	public static void initializeVariables(Player player){
		System.out.println("Initializing variables...");
		int monster = 0;
		player.setLevel(1);
		player.setLevelUpExperience(100);
		player.setHitPoints(player.getMaxHitPoints());
	}
}
