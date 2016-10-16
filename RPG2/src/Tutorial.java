
public class Tutorial {
	public static void startTutorial(Player player)
	{
		System.out.println("Running tutorial for " + player.getName() + "...");
		System.out.println();
		System.out.println("Welcome to the tutorial.");
		
		Monster ant = new Monster();
		ant.setType("ant");
		ant.setDexterity(1);
		ant.setExperience(100);
		ant.setHitPoints(2);
		ant.setMaxHitPoints(2);
		ant.setStrength(1);
		
		DisplayStats.displayStats(player);
		
		String nextAction = Actions.getAction();
		
		if(nextAction.equals("1")){
			Attack.doAttack(ant, player);
		}
		else{
		}
	}
}
