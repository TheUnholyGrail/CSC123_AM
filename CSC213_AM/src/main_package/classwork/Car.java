package main_package.classwork;

public class Car {
	//Fields
	private boolean driver = true;	//Needs Driver in order to drive the car
	private double gas;	//Fuel needed to run the car
	private boolean power = true;	//Power needed to run the car and misc
	private double cargo;	//Cargo to store items
	private boolean tires = true;	//Tire conditions, if the car can even run
	//Methods
	public boolean driverCheck(){	//Checks for driver and returns whether or not they are present
		return driver;
	}
	
	public boolean tireCheck(){	//Checks the tires' condition and returns whether or not they are ready
		return tires;
	}
	
	public boolean powerCheck(){	//Checks for power and returns whether or not power is present
		return power;
	}
	
	public double gasCheck(){ 	//Checks the gas level and returns the amount of gas/the maximum gas
		return gas;
	}
	
	public double cargoCheck(){	//Checks the cargo and returns the amount of cargo there is out of the max capacity
		return cargo;
	}
}
