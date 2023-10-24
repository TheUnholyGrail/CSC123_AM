package main_package.Assignment3;

public class Food extends Item{
	//Fields
	private String sellBy;
	private String useBy;
	//Constructor
	public Food(String name, String vendor, double price, double cost, double weight, double taxRate, String sellBy, String useBy) {
		super(name, vendor, price, cost, weight, taxRate);
		this.sellBy = sellBy;
		this.useBy = useBy;
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
