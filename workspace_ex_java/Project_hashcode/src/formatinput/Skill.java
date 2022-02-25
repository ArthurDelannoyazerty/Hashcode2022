package formatinput;

public class Skill {
	
	String name;
	int level;
	
	public Skill(String name, int level){
		this.name = name;
		this.level = level;
	}
	
	String getName() {
		return this.name;
	}
	
	int getLevel() {
		return level;
	}
	
	void levelUp() {
		this.level += 1;
	}
	
}
