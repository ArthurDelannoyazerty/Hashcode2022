package formatinput;

import java.util.ArrayList;

public class Project {
	
	ArrayList<Skill> skillRequired;
	String name;
	int duration;
	int score;
	int numberPerson;
	int bestBefore;
	
	Project(ArrayList<Skill> skillRequired, String name, int duration, int score, int numberPerson, int bestBefore){
		this.skillRequired = skillRequired;
		this.name = name;
		this.duration = duration;
		this.score = score;
		this.numberPerson = numberPerson;
		this.bestBefore = bestBefore;
	}
	
	public Project(){
		this.skillRequired = new ArrayList<Skill>();
		this.name = "";
		this.duration = 0;
		this.score = 0;
		this.numberPerson = 0;
		this.bestBefore = 0;
	}
	
	public ArrayList<Skill> getSkillRequired() {
		return this.skillRequired;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public int getNumberPerson() {
		return this.numberPerson;
	}
	
	public int getBestBefore() {
		return this.bestBefore;
	}

	public void setName(String name) {
		this.name=name;
	}
	public void setDuration(int duration) {
		this.duration=duration;
	}
	public void setScore(int score) {
		this.score=score;
	}
	public void setBestBefore(int bestBefore) {
		this.bestBefore=bestBefore;
	}
	
	public void setSkillRequired(Skill skillRequired) {
		this.skillRequired.add(skillRequired);
	}
	
	
}
