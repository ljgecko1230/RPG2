
public class Adventure {
	static int forwards = 1;
	static int backwards = 0;
	static int left = 0;
	static int right = 0;
	static int attack = 0;
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
		String nextAction = Actions.getAction();
		forwards = 1;
		backwards = 0;
		left = 0;
		right = 0;
		attack = 0;
		checkAction(nextAction);
		System.out.println("You exit the tent");
		System.out.println("You see a large bear looming over you...");
	}
	public static void checkAction(String nextAction){
		int invalid = 0;
		if(nextAction.equals("1")){
			if(attack == 0){
				System.out.println("That is invalid");
				invalid = 1;
			}
			else{
				System.out.println("You attack");
			}
		}
		else if(nextAction.equals("2")){
			if(forwards == 0){
				System.out.println("That is invalid");
				invalid = 1;
			}
			else{
				System.out.println("You move forwards");
			}
		}
		else if(nextAction.equals("3")){
			if(backwards == 0){
				System.out.println("That is invalid");
				invalid = 1;
			}
			else{
				System.out.println("You move backwards");
			}
		}
		else{
			System.out.println("That is invalid");
			invalid = 1;
		}
		if(invalid == 1){
			nextAction = Actions.getAction();
			checkAction(nextAction);
		}
	}
}