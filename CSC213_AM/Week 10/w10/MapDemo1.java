package w10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) //Tree Map keeps everything sorted for you(keys)but takes longer|| Hash Map does not sort and prints everything quickly
	{
		Map<String, Object> studentJoe = new HashMap<String, Object>();
		Map<String, Object> studentJames = new HashMap<String, Object>();
		Map<String, Object> studentJane = new HashMap<String, Object>();
		ArrayList<Map> students = new ArrayList<Map>();
		
		//Dictionary-Printed in standard JSON notation
		ArrayList<String> joeHobbies = new ArrayList<String>();
		joeHobbies.add("Cooking");
		joeHobbies.add("Tennis");
		joeHobbies.add("Hunting");
		studentJoe.put("Name", "Joe");
		studentJoe.put("Age", 24);
		studentJoe.put("GPA", 3);
		studentJoe.put("Hobbies", joeHobbies);
		
		Set keys = studentJoe.keySet();
		
		ArrayList<String> jamesHobbies = new ArrayList<String>();
		jamesHobbies.add("Polo");
		jamesHobbies.add("Track");
		jamesHobbies.add("Reading");
		studentJames.put("Name", "James");
		studentJames.put("Age", 18);
		studentJames.put("GPA", 2);
		studentJames.put("Hobbies", jamesHobbies);
		
		ArrayList<String> janeHobbies = new ArrayList<String>();
		janeHobbies.add("Boxing");
		janeHobbies.add("Baseball");
		janeHobbies.add("Music");
		studentJane.put("Name", "Jane");
		studentJane.put("Age", 28);
		studentJane.put("GPA", 4);
		studentJane.put("Hobbies", janeHobbies);
		
		students.add(studentJoe);
		students.add(studentJames);
		students.add(studentJane);
		
		//Prints all of maps in students arrayList
		for(Map m: students) {
			System.out.println(m);
		}
		

	}

}
