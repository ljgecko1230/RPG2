import java.util.Scanner;

public class Actions {
	public static void getAction(Player player, int monster){
		Scanner input = new Scanner(System.in);
		System.out.println("What will you do (1 = attack)");
		String nextAction = input.nextLine();
		if(nextAction.equals("1")){
			if(monster == 1){
				System.out.println("You attack");
			}
		}
	}
}
