package main_package.classwork;

public class Student {
	//Fields
	private String name;	//Student's name
	private byte age;	//Student's age
	private short studentID;	//Student's ID
	private boolean isHungry = true;	//Determines if student is hungry
	private boolean isThirsty = true;	//Determines if student is thirsty
	
	//Methods
	public Student(String n, byte a, short id) {	//Is a constructor which creates a student object and sets the important details of the Student
		name = n;
		age = a;
		studentID = id;
	}
	public void hunger() {	//Check student's hunger and feeds them if hungry
		
	}
	public void thirst() {	//Check student's thirst and they will drink if thirsty
		
	}
	public short getStudentID() {	//Returns student id
		return studentID;
	}
	public void goToLecture() {	//Checks if student has enough thrist and hunger to make it through class, if so then they go
		
	}
}
