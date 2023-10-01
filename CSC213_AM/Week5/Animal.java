
public class Animal {
	//Fields
	String name;
	String animalType;
	String color;
	//Constructor
	public Animal(String name, String animalType, String color) {
		this.name = name;
		this.animalType = animalType;
		this.color = color;
	}
	//Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//Extras

	@Override
	public String toString() {
		return "Animal [name=" + name + ", animalType=" + animalType + ", color=" + color + "]";
	}
	
}
