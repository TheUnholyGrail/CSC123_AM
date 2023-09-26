package main_package;
public class BookTest {

	public static void main(String[] args) {
		//Object created(ref count = 1)
		Book myBook = new Book("Jim Slim", "1000-1000", 250 );
		//Ref count = 2
		Book myBook2 = myBook;
		//Ref count = 1
		myBook2 = null;
		//Ref count = 0
		myBook = null;
	}

}
