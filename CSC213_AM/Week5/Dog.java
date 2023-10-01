import java.util.Objects;

public class Dog {
	//Fields
	String name;
	String breed;
	String color;
	int age;
	Owner myOwner;
	
	//Constructor
	public Dog(String name, String breed, String color, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	//Methods
	
	public String getName() {
		return name;
	}


	public Owner getMyOwner() {
		return myOwner;
	}

	public void setMyOwner(Owner o) {
		this.myOwner = o;
		if(o.getPet()==null) {
			o.setDog(this);
		}
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, breed, color, myOwner, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return age == other.age && Objects.equals(breed, other.breed) && Objects.equals(color, other.color)
				&& Objects.equals(myOwner, other.myOwner) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", color=" + color + ", age=" + age + ", myOwner=" + myOwner + "]";
	}

	
}
