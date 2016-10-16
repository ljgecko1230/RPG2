import java.util.Scanner;

public class PlayerCreationWizard {
	public static Player createPlayer()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Creating character...");
		
		Player player = new Player();
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		player.setName(name);
		int statPoints = 10;
		int strength = 1;
		int dexterity = 1;
		int maxHitPoints = 1;
		while(statPoints > 0){
			System.out.println();
			System.out.println("Press 1 for Strength (" + player.getStrength() + 
					"), 2 for HP (" + player.getMaxHitPoints() +"), or 3 for Dexterity " +
							"(" + player.getDexterity() + ").");
			System.out.println("You have " + statPoints + " stat points");
			String statInput = input.nextLine();
			if(statInput.equals("1")){
				System.out.println("You added 1 to damage");
				strength += 1;
				player.setStrength(strength);
				statPoints -= 1;
			}
			else if(statInput.equals("2")){
				System.out.println("You added 1 to hit points");
				maxHitPoints += 1;
				player.setMaxHitPoints(maxHitPoints);
				statPoints -= 1;
			}
			else if(statInput.equals("3")){
				System.out.println("You added 1 to dexterity");
				dexterity += 1;
				player.setDexterity(dexterity);
				statPoints -= 1;
			}
			else{
				System.out.println("That is invalid");
			}
		}
		IntitializeVariables.initializeVariables(player);
		return player;
	}
}
