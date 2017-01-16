public class NewAdventure {
	static int room = 1;
	static int attack = 0;
	static int forwards = 0;
	static int backwards = 0;
	static int right = 0;
	static int left = 0;
	static boolean room2Monster = true;
	static boolean room3Monster = true;
	public static void newAdventure(Player player){
		while (true){
			//Log cabin
			if (room == 1){
				DisplayStats.displayStats(player);
				System.out.println("You are in a small log cabin, enjoying your hot chocolate,"
						+ " when you hear a loud noise coming from outside. (Leave"
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
				Monster PokeBoy = new Monster();
				PokeBoy.setDexterity(2);
				PokeBoy.setExperience(200);
				PokeBoy.setHitPoints(10);
				PokeBoy.setMaxHitPoints(10);
				PokeBoy.setStrength(1);
				PokeBoy.setType("Pokemon Boy");
				DisplayStats.displayStats(player);
				System.out.println("You are in the forest.");
				if (room2Monster == true){
					System.out.println("There is a boy playing Pokemon Go outside!");
					attack = 1;
					forwards = 0;
					backwards = 1;
					right = 0;
					left = 0;
				}
				else{
					DisplayStats.displayStats(player);
					System.out.println("You are in the forest.");
					System.out.println("You are on a pathway which leads in all directions. Behind you is your log cabin.");
					attack = 0;
					forwards = 1;
					backwards = 1;
					right = 1;
					left = 1;
				}
				String nextAction = Actions.getAction();
				int checkNextAction = checkAction(nextAction, player);
				
				if (checkNextAction == 1){
					Attack.doAttack(PokeBoy, player);
					room2Monster = false;
				}
				else if (checkNextAction == 2){
					room = 3;
				}
				else if (checkNextAction == 3){
					room = 1;
				}
				else if (checkNextAction == 4){
					room = 4;
				}
				else if (checkNextAction == 5){
					room = 5;
				}
			}
			//City - Entrance
			if (room == 3){
				Monster InternetZombie = new Monster();
				InternetZombie.setDexterity(1);
				InternetZombie.setExperience(300);
				InternetZombie.setHitPoints(15);
				InternetZombie.setMaxHitPoints(20);
				InternetZombie.setStrength(2);
				InternetZombie.setType("Internet Zombie");
				System.out.println("You are at the entrance to the city.");
				if (room3Monster == true){
					System.out.println("There is a person on their phone blocking the way.");
					attack = 1;
					forwards = 0;
					backwards = 1;
					right = 0;
					left = 0;
				}
				String nextAction = Actions.getAction();
				int checkNextAction = checkAction(nextAction, player);
				
				if (checkNextAction == 1){
					Attack.doAttack(InternetZombie, player);
					room3Monster = false;
				}
				if (checkNextAction == 2){
					
				}
				if (checkNextAction == 3){
					room = 2;
				}
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