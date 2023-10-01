
public class BookTest {

	public static void main(String[] args) {
		Library library1 = new Library("St. John", "1803 Street", "city", "CA");
		Book myBook1 = new Book("Prey", "65135",263 , "Forgot");
		Book myBook2 = new Book("Jo", "65135",263 , "Forgot");
		Book myBook3 = new Book("Vey", "65135",263 , "Forgot");
		//library1.setBooks(myBook1);
		//library1.setBooks(myBook2);
		//library1.setBooks(myBook3);
		
		myBook1.setMyLibrary(library1);
		myBook2.setMyLibrary(library1);
		myBook3.setMyLibrary(library1);
		System.out.println(library1);	//Prints the library's books
		System.out.println(myBook1.getLibrary().getName());	//Prints the library that the book belongs to
	}

}
