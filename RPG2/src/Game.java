
public class Game {
	private Player player;
	
	public void start()
	{
		player = PlayerCreationWizard.createPlayer();
		Tutorial.startTutorial(player);
		Adventure.startAdventure(player);
	}
}
