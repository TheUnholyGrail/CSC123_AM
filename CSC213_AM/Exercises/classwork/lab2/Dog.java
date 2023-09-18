package main_package.classwork;

public class Dog {
	//Fields
	private String name;	//Dog's name
	private String color;	//Dog's fur color
	private String breed;	//Dog's breed
	private int joy;	//How happy the dog is(1-100)
	private byte age;	//Dog's age
	//Methods
	public Dog(String n, String c, String b, byte a) {	//Establishes the important information for the dog object
		name = n;
		color = c;
		breed = b;
		age = a;
	}
	public int checkJoy() {	//Checks the dog's joy
		return joy;
	}
	public void play() {	//User "plays" with the dog, giving them joy
		
	}
	public String getName() {	//Returns the dog's name to the user
		return name;
	}
	public String getBreed() {	//Returns the dog's breed to the user
		return breed;
	}
	
}
