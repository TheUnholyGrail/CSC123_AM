//Package
import java.util.Objects;

public class Book {
	//Fields
	private String title;
	private String ISBN;
	private int numPages;
	private String author;
	Library library;
	//Constructors
	public Book(String title, String iSBN, int numPages, String author) {
		super();
		this.title = title;
		ISBN = iSBN;
		this.numPages = numPages;
		this.author = author;
	}
	//Special case
	public Book(Book copyBook) {	//Copies Book
		this.author = copyBook.author;
		this.ISBN = copyBook.ISBN;
		this.numPages = copyBook.numPages;
	}
	//Methods
	
	public Library getLibrary() {
		return library;
	}
	public void setMyLibrary(Library lib) {
		this.library = lib;
		if(!lib.getDatabase().contains(this)) {
			lib.getDatabase().add(this);
		}
	}
	public String getISBN() {
		return ISBN;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getNumPages() {
		return numPages;
	}
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
	public String getAuthorName() {
		return author;
	}
	public void setAuthorName(String authorName) {
		this.author = authorName;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", ISBN=" + ISBN + ", numPages=" + numPages + ", author=" + author + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ISBN, author, numPages, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(ISBN, other.ISBN) && Objects.equals(author, other.author) && numPages == other.numPages
				&& Objects.equals(title, other.title);
	}
	

}
