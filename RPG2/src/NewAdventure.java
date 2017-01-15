public class NewAdventure {
	static int room = 1;
	static int attack = 0;
	static int forwards = 0;
	static int backwards = 0;
	static int right = 0;
	static int left = 0;
	public static void newAdventure(Player player){
		while (true){
			//Log cabin
			if (room == 1){
				DisplayStats.displayStats(player);
				System.out.println("You are in a small log cabin, enjoying your hot chocolate,"
						+ " when you hear a lout noise coming from outside. (Leave"
						+ " by going forwards)");
				
				forwards = 1;
				String nextAction = Actions.getAction();
				int checkNextAction = checkAction(nextAction, player);
				
				if (checkNextAction == 2){
					System.out.println("You get up out of your chair and go outside");
					room = 2;
				}
			}
			//Forest
			if (room == 2){
				DisplayStats.displayStats(player);
				System.out.println("You are in the forest.");
			}
			Enter.pressEnter();
		}
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
		else if(nextAction.equals("4")){
			if(left == 0){
				System.out.println("That is invalid");
				invalid = 1;
			}
			else{
				System.out.println("You move right");
				checkNextAction = 4;
			}
		}
		else if(nextAction.equals("5")){
			if(right == 0){
				System.out.println("That is invalid");
				invalid = 1;
			}
			else{
				System.out.println("You move left");
				checkNextAction = 5;
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