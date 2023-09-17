package main_package.classwork;
public class Airplane {
	//Fields
	private double fuel;	//Fuel for the plane to use
	private short passengers;	//Stores the number of passengers
	private boolean pilot = true;	//Holds whether the pilot is present or not
	private boolean power = true;	//Holds whether the power is on or not
	private double weight;	//The weight of the plane's cargo
	//Methods
	public double weightCheck(){	//Checks for weight and returns the amount/ weight maximum
		return weight;
	}
	
	public double fuelCheck(){	//Checks for fuel and returns how much/ fuel maximum
		return fuel;
	}
	
	public boolean powerCheck(){	//Checks for power and returns if there is
		return power;
	}
	
	public boolean pilotCheck(){	//Checks for the pilot
		return pilot;
	}
	
	public short passengersCheck(){	//Checks how many passengers there are and returns the amount/maximum passenger capacity
		return passengers;
	}
	
	
}
