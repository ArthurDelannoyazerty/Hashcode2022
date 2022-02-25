package main;


import java.io.IOException;
import java.util.ArrayList;

import formatinput.Person;
import formatinput.Project;
import formatinput.Skill;
import io.IO;

public class Main_start {

	public static void main(String[] args) throws IOException {
		int whattxt = 0;	//choose file 0 -> (n-1)
		
		String[] path = {"a_an_example.in.txt","b_better_start.in.txt","c_collaboration.in.txt","d_dense_schedule.in.txt","e_exceptional_skills.in.txt", "f_find_great_mentors.in.txt"};
		IO io = new IO(path[whattxt]);
		io.init();
		
		//io.printArrayInput();
		
		int deltaPerson=0;
		int nbPerson = Integer.parseInt(io.getArray()[0][1]);
		ArrayList<Person> listPerson = new ArrayList<Person>();
		for (int i=0; i<nbPerson;i++) {
			int nbSkillPerson = Integer.parseInt(io.getArray()[i+1+deltaPerson][1]);
			int deltaSkill=deltaPerson;
			listPerson.add(new Person());
			for(int j=0; j<nbSkillPerson; j++) {
				Skill skill = new Skill(io.getArray()[i+1+deltaSkill+j+1][0],Integer.parseInt(io.getArray()[i+1+deltaSkill+j+1][1]));
				listPerson.get(i).addSkill(skill);
				listPerson.get(i).setName(io.getArray()[i+deltaPerson+1][0]);
				deltaPerson++;
			}
		}
		//System.out.println("-------------------------");
		int deltaTemp=0;
		ArrayList<Project> listProject = new ArrayList<Project>();
		for (int i = nbPerson+1+deltaPerson; i<io.getArray().length; i++) {
			if (io.getArray()[i+deltaTemp][0]==null) break;
			System.out.println(io.getArray()[i+deltaTemp][0]);
			listProject.add(new Project());
			listProject.get(i).setBestBefore(Integer.parseInt(io.getArray()[i+deltaTemp][3]));
			listProject.get(i).setName(io.getArray()[i+deltaTemp][0]);
			listProject.get(i).setDuration(Integer.parseInt(io.getArray()[i+deltaTemp][1]));
			listProject.get(i).setScore(Integer.parseInt(io.getArray()[i+deltaTemp][2]));
			//System.out.println(io.getArray()[i+deltaTemp][4]);
			int nbSkillPerson = Integer.parseInt(io.getArray()[i+deltaTemp][4]);
			//int deltaSkill=deltaPerson;
			for(int j=0; j<nbSkillPerson; j++) {
				System.out.println(io.getArray()[i+1+deltaTemp][0]);
				Skill skill = new Skill(io.getArray()[i+1+deltaTemp][0],Integer.parseInt(io.getArray()[i+1+deltaTemp][1]));
				listProject.get(i).setSkillRequired(skill);
				deltaTemp++;
			}
		}
		
		
		// fast *2
		//System.out.print("test = "+ (3<<1) );
	}	
	
	
	
	static void organizeInput(){
		
		
	}
}
