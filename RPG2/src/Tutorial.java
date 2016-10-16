
public class Tutorial {
	public static void startTutorial(Player player)
	{
		System.out.println("Running tutorial for " + player.getName() + "...");
		System.out.println();
		System.out.println("Welcome to the tutorial.");
		
		Monster trainingDummy = new Monster();
		trainingDummy.setType("training dummy");
		trainingDummy.setDexterity(0);
		trainingDummy.setExperience(100);
		trainingDummy.setHitPoints(8);
		trainingDummy.setMaxHitPoints(8);
		trainingDummy.setStrength(0);
		
		DisplayStats.displayStats(player);
		
		System.out.println("There is a training dummy in front of you");
		
		eventHandler(trainingDummy, player);
		
		System.out.println("Hello there");
	}
	
	public static void eventHandler(Monster trainingDummy, Player player){
		String nextAction = Actions.getAction();
		if(nextAction.equals("1")){
			Attack.doAttack(trainingDummy, player);
		}
		else{
			System.out.println("That is invalid");
			Actions.getAction();
			eventHandler(trainingDummy, player);
		}
	}
}