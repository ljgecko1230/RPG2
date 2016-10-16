import java.util.Scanner;

public class Actions { 
	public static String getAction(){
		Scanner action = new Scanner(System.in);
		System.out.println("What will you do? (1 = attack, 2 = move forwards, 3 = move backwards, 4 = move right, 5 = move left)");
		String nextAction = action.nextLine();
		return nextAction;
	}
}

