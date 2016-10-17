
public class Adventure {
	public static void startAdventure(Player player)
	{
		Monster killerBear = new Monster();
		killerBear.setType("killer bear");
		killerBear.setHitPoints(14);
		killerBear.setExperience(300);
		killerBear.setStrength(2);
		killerBear.setDexterity(4);
		
		
		System.out.println("Running adventure for " + player.getName() + "...");
		System.out.println();
		DisplayStats.displayStats(player);
		System.out.println("Welcome to the adventure. This is not part of the tutorial.");
		System.out.println("This is now the actual game.");
		Enter.pressEnter();
		DisplayStats.displayStats(player);
		System.out.println();
		System.out.println("You wake up in your tent. You have been camping all weekend.");
		System.out.println("You hear a strange noise coming from outside.");
		System.out.println();
		System.out.println("You can exit the tent by moving forwards.");
		Actions.getAction();
		
		int trueForwards = 1;
		int trueRight = 0;
		int trueBackwards = 0;
		int trueLeft = 0;
		int trueMonster = 0;
		eventHandler(killerBear, player, trueMonster, 
				trueForwards, trueLeft, trueRight, trueBackwards);
		
		System.out.println("You exit the tent");
		System.out.println("You see a large bear looming over you...");
		trueForwards = 0;
		trueRight = 0;
		trueBackwards = 0;
		trueLeft = 0;
		trueMonster = 1;
		eventHandler(killerBear, player, trueMonster, 
				trueForwards, trueLeft, trueRight, trueBackwards);
	}
	
	public static void eventHandler(Monster monster, Player player, int trueMonster, 
			int trueForwards, int trueLeft, int trueRight, int trueBackwards){
		String nextAction = Actions.getAction();
		if(nextAction.equals("1")){
			if(trueMonster == 1){
				Attack.doAttack(monster, player);
			}
			else{
				System.out.println("That is invalid");
				eventHandler(monster, player, trueMonster, trueForwards, trueLeft, trueRight, trueBackwards);
			}
		}
		else if(nextAction.equals("2")){
			if(trueForwards == 1){
				System.out.println("You move forwards");
			}
		}
		else{
			System.out.println("That is invalid");
			eventHandler(monster, player, trueMonster, trueForwards, trueLeft, trueRight, trueBackwards);
		}
	}
}
