import java.util.Scanner;

public class Actions { 
	public static String getAction(){
		Scanner action = new Scanner(System.in);
		System.out.println("What will you do? (1 = attack)");
		String nextAction = action.nextLine();
		return nextAction;
	}
}

