
public class Adventure {
	static int forwards = 0;
	static int backwards = 0;
	static int left = 0;
	static int right = 0;
	static int attack = 0;
	public static void startAdventure(Player player)
	{
		Monster killerBear = new Monster();
		killerBear.setType("killer bear");
		killerBear.setHitPoints(8);
		killerBear.setExperience(300);
		killerBear.setStrength(2);
		killerBear.setDexterity(2);
		
		System.out.println("Running adventure for " + player.getName() + "...");
		System.out.println();
		Enter.pressEnter();
		ClearConsole.clearConsole();
		DisplayStats.displayStats(player);
		System.out.println("Welcome to the adventure. This is not part of the tutorial.");
		System.out.println("This is now the actual game.");
		Enter.pressEnter();
		ClearConsole.clearConsole();
		DisplayStats.displayStats(player);
		System.out.println("You wake up in your tent. You have been camping all weekend.");
		System.out.println("You hear a strange noise coming from outside.");
		System.out.println();
		System.out.println("You can exit the tent by moving forwards.");
		String nextAction = Actions.getAction();
		forwards = 1;
		backwards = 0;
		left = 0;
		right = 0;
		attack = 0;
		int checkNextAction = checkAction(nextAction, player);
		ClearConsole.clearConsole();
		System.out.println("You exit the tent");
		System.out.println("You see a large bear looming over you...");
		nextAction = Actions.getAction();
		forwards = 0;
		backwards = 0;
		left = 0;
		right = 0;
		attack = 1;
		checkNextAction = checkAction(nextAction, player);
		Attack.doAttack(killerBear, player);
		Enter.pressEnter();
		ClearConsole.clearConsole();
		DisplayStats.displayStats(player);
		System.out.println("Good job! I will now heal you.");
		System.out.println();
		System.out.println("Your health was restored.");
		player.setHitPoints(player.getMaxHitPoints());
		DisplayStats.displayStats(player);
		Enter.pressEnter();
		ClearConsole.clearConsole();
		DisplayStats.displayStats(player);
		System.out.println("The bear is dead. The forest ahead is very"
				+ " quiet. Too quiet.");
		nextAction = Actions.getAction();
		forwards = 1;
		backwards = 0;
		left = 0;
		right = 0;
		attack = 0;
		checkNextAction = checkAction(nextAction, player);
		System.out.println("You enter the forest.");
		Enter.pressEnter();
		ClearConsole.clearConsole();
		DisplayStats.displayStats(player);
	}
	public static int checkAction(String nextAction, Player player){
		int checkNextAction = 0;
		int invalid = 0;
		if(nextAction.equals("1")){
			if(attack == 0){
				System.out.println("That is invalid");
				invalid = 1;
			}
			else{
				System.out.println("You attack");
				checkNextAction = 1;
			}
		}
		else if(nextAction.equals("2")){
			if(forwards == 0){
				System.out.println("That is invalid");
				invalid = 1;
			}
			else{
				System.out.println("You move forwards");
				checkNextAction = 2;
			}
		}
		else if(nextAction.equals("3")){
			if(backwards == 0){
				System.out.println("That is invalid");
				invalid = 1;
			}
			else{
				System.out.println("You move backwards");
				checkNextAction = 3;
			}
		}
		else{
			System.out.println("That is invalid");
			invalid = 1;
		}
		if(invalid == 1){
			Enter.pressEnter();
			ClearConsole.clearConsole();
			DisplayStats.displayStats(player);
			nextAction = Actions.getAction();
			checkAction(nextAction, player);
		}
		return checkNextAction;
	}
}