import java.util.ArrayList;
import java.util.Objects;

public class Library {
	//Fields
	private String name;
	private String address;
	private String city;
	private String state;
	private ArrayList<Book> database = new ArrayList<Book>();
	Book myBook;
	//Constructor
	public Library(String name, String address, String city, String state) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
	}
	//Methods
	
	public ArrayList<Book> getDatabase() {
		return database;
	}

	public void setDatabase(ArrayList<Book> database) {
		this.database = database;
	}
	
	public void setBooks(Book aBook) {	//Adds books
		database.add(aBook);
		
	}

	public Book getMyBook() {
		return myBook;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//Extra
	@Override
	public int hashCode() {
		return Objects.hash(address, city, name, state);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return Objects.equals(address, other.address) && Objects.equals(city, other.city)
				&& Objects.equals(name, other.name) && Objects.equals(state, other.state);
	}
	@Override
	public String toString() {
		return "Library [name=" + name + ", address=" + address + ", city=" + city + ", state=" + state + ", database="
				+ database + "]";
	}
	
}
