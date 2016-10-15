
public abstract class Character {
	private int level;
	private int experience;
	private int strength;
	private int dexterity;
	private int hitPoints;
	private int maxHitPoints;
	private int levelUpExperience;
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	
	public int getDexterity() {
		return dexterity;
	}
	
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public int getHitPoints() {
		return hitPoints;
	}
	
	public void setMaxHitPoints(int maxHitPoints) {
		this.maxHitPoints = maxHitPoints;
	}
	
	public int getMaxHitPoints() {
		return maxHitPoints;
	}
	
	public void setLevelUpExperience(int levelUpExperience) {
		this.levelUpExperience = levelUpExperience;
	}
	
	public int getLevelUpExperience() {
		return levelUpExperience;
	}
}
