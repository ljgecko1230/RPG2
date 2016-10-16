import java.util.Scanner;

public class Enter {
	public static void pressEnter(){
		Scanner enter = new Scanner(System.in);
		System.out.println("Press enter to continue");
		String nextEnter = enter.nextLine();
	}
}
