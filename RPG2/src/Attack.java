
public class Attack {
	public static void doAttack(Monster monster, Player player){
		System.out.println("You attack the " + monster.getType());
		
		while(true) {
			if(monster.getDexterity() > player.getDexterity()){
				System.out.println("The monster attacks first");
				attack(monster, player);
				if (player.isDead()) {
					break;
				}
				attack(player, monster);
				if (monster.isDead()) {
					gainExperience(player, monster);
					break;
				}
			} else {
				System.out.println("You attack first");
				attack(player, monster);
				if (monster.isDead()) {
					gainExperience(player, monster);
					break;
				}
				attack(monster, player);
				if (player.isDead()) {
					break;
				}
			}
		}
	}
	
	private static void attack(Character attacker, Character defender)
	{
		System.out.println(attacker.getDisplayName() + " does " + attacker.getStrength() + " damage");
		
		defender.setHitPoints(defender.getHitPoints() - attacker.getStrength());
		if (defender.isDead())
		{
			System.out.println(defender.getDisplayName() + " died...");
		}
	}
	
	public static void gainExperience(Player player, Monster monster){
			System.out.println("You killed the monster. You get " + monster.getExperience() + " experience");
			player.setExperience(player.getExperience() + monster.getExperience());
			
			if(player.getExperience() >= player.getLevelUpExperience()){
				player.setLevel(player.getLevel() + 1);
				player.setLevelUpExperience(player.getLevelUpExperience() * 2);
				System.out.println("Level up. You are now level " + player.getLevel());
		}
	}
}

