package main_package.Assignment3;
//Alejandro Morales (amorales298@toromail.csudh.edu)
public class Publication extends Item{
	//Fields
	private String author;
	private String publicationMonth;
	private int numPages;
	//Constructor
	public Publication(String name, String vendor, double price, double cost, double weight, double taxRate, String author, String publicationMonth, int numPages) {
		super(name, vendor, price, cost, weight, taxRate);	//Using super class "Item" fields for subclass constructor
		this.author = author;
		this.publicationMonth = publicationMonth;
		this.numPages = numPages;
	}
	//Methods
	public String getName() {
		return super.getName();
	}
	public double getPrice() {
		return super.getPrice();
	}
	public double calculateTotalCost() {
		return super.calculateTotalCost();
	}
	public double getTaxPrice() {
		return super.getTaxPrice();
	}
	public double calculateTotalPrice() {
		return super.calculateTotalPrice();
	}
	//Other
}
