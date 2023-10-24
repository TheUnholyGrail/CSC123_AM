package main_package.Assignment3;
//Alejandro Morales (amorales298@toromail.csudh.edu)
public class Item {
	//Fields
	protected String name;
	protected String vendor;
	protected double price;	//How much customer pays
	protected double cost;	//How much store pays
	protected double weight;
	protected double taxRate;	//Tax rate on item
	//Consttructor
	public Item(String name, String vendor, double price, double cost, double weight, double taxRate) {
		this.name = name;
		this.vendor = vendor;
		this.price = price;
		this.cost = cost;
		this.weight = weight;
		this.taxRate = taxRate;
	}
	//Methods
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public double calculateTotalCost() {
		double total;
		double taxValue = (taxRate/100) * cost;	//Item's Tax cost
		
		return total = cost + taxValue;
	}
	
	public double getTaxPrice() {
		return (taxRate/100) * price;	//Item's Tax price
	}
	public double calculateTotalPrice() {
		double total;
		return total = price + getTaxPrice();
	}
	//Other
	
	
}
