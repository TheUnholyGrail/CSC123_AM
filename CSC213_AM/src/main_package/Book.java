//Package
package main_package;
public class Book {
	//Fields
	private static String Company = "Pearson";
	private String ISBN;
	private int numPages;
	private String authorName;
	private int amzRank;
	//Constructors
	public Book(String authorName, String iSBN) {
		ISBN = iSBN;
		this.authorName = authorName;
	}
	
	public Book(String authorName, String iSBN, int numPages) {
		ISBN = iSBN;
		this.numPages = numPages;
		this.authorName = authorName;
	}
	public Book(Book copyBook) {
		this.amzRank = copyBook.amzRank;
		this.authorName = copyBook.authorName;
		this.ISBN = copyBook.ISBN;
		this.numPages = copyBook.numPages;
	}
	//Methods
	public static String getCompany() {
		return Company;
	}
	public static void setCompany(String company) {
		Company = company;
	}
	public String getISBN() {
		return ISBN;
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
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getAmzRank() {
		return amzRank;
	}
	public void setAmzRank(int amzRank) {
		this.amzRank = amzRank;
	}
	@Override
	public String toString() {
		String s = (Company + ":" + ISBN + ":" + numPages + ":" + authorName + ":" + amzRank );
		return s;
	}
	public boolean equals(Object obj) {
		//
		if(obj == null) {
			return false;
		}
		if(!obj.getClass().getName().equals(this.getClass().getName())) {
			return false;
		}
		Book other = (Book)obj;
		//
		if(other.ISBN == this.ISBN) {
			return true;
		} else {
			return false;
		}
		
	}
	

}
