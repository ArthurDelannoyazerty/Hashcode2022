package formatinput;

import java.util.ArrayList;

public class Person {
	
	String name;
	ArrayList<Skill> skill = new ArrayList<Skill>();
	
	public Person(String name, ArrayList<Skill> competence){
		this.name = name;
		this.skill = competence;
	}
	
	public Person() {
		this.name = "";
		this.skill = new ArrayList<Skill>();
	}
	
	
	String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	ArrayList<Skill> getCompetence() {
		return this.skill;
	}
	
	void levelUp(String nameCompetence) {
		boolean temp=false;
		for (int i=0; i<this.skill.size(); i++) {
			if(name.equals(this.skill.get(i).getName())) {
				temp=true;
				this.skill.get(i).levelUp();
				break;
			}
		}
		if(temp==false) {
			throw new Error("pas dans les competences");
		}
	}
	
	public void addSkill(Skill skill) {
		this.skill.add(skill);
	}
	
	/*
	boolean isInArrayAttribute(String name) {
		boolean isInThere=false;
		for (int i=0; i<this.skill.length; i++) {
			if(name.equals(this.skill[i].getName())) {
				isInThere=true;
				break;
			}
		}
		return isInThere;
	}
	*/
}
