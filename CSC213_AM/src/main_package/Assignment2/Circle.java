package main_package.Assignment2;
//Imports
public class Circle {
	//Alejandro Morales (amorales298@toromail.csudh.edu)
	//Fields
	private final double PI = 3.14;	//This value is constant
	private String name;
	private double radius = 0;
	private double area = 0;
	private double circumference = 0;
	//Constructor
	public Circle(String label, double r) {
		name = label;
		radius = r;
	}
	//Methods
	public double getArea() {	//Calculates and returns area
		area = PI * (radius*radius);
		return area;
	}
	public double getCircumference() {	//Calculates and returns area
		circumference = 2 * PI * radius;
		return circumference;
	}
	
	@Override
	public String toString() {	//Prints OBJ data
		return "The output will be:\n" + name + "\nRadius: " + String.format("%.2f", radius) + "\nArea: " + String.format("%.2f",getArea()) + "\nCircumference: " + String.format("%.2f",getCircumference());
	}
}
