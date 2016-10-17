
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
		int trueForwards = 0;
		int trueMonster = 1;
		eventHandler(trainingDummy, player, trueMonster, trueForwards);
		
		System.out.println("Good job. Now we will try moving.");
		System.out.println();
		System.out.println("You are in a hallway with a door at the end of it. It only leads north (Forwards)");
		
		trueForwards = 1;
		trueMonster = 0;
		eventHandler(trainingDummy, player, trueMonster, trueForwards);
		
		System.out.println("Nice. You moved forwards. Now you are an expert at this game. I think you are ready to begin.");
	}
	
	public static void eventHandler(Monster trainingDummy, Player player, int trueMonster, int trueForwards){
		String nextAction = Actions.getAction();
		if(nextAction.equals("1")){
			if(trueMonster == 1){
				Attack.doAttack(trainingDummy, player);
			}
			else{
				System.out.println("That is invalid");
				eventHandler(trainingDummy, player, trueMonster, trueForwards);
			}
		}
		else if(nextAction.equals("2")){
			if(trueForwards == 1){
				System.out.println("You move forwards");
			}
			else{
				System.out.println("That is invalid");
				eventHandler(trainingDummy, player, trueMonster, trueForwards);
			}
		}
		else{
			System.out.println("That is invalid");
			eventHandler(trainingDummy, player, trueMonster, trueForwards);
		}
	}
}