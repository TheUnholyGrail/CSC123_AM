package classwork;

public class Toaster {
	//Fields
	private byte setting;	//Setting 1-3, determines the toast burn rate
	private boolean isToast = false;	//Determines if the bread is toast
	private boolean power = true;	//Determines if the toaster is on
	private int timer;	//The timer
	private boolean isBroken = false;	//Determines the condition of the toaster
	
	//Methods
	public boolean checkToaster() {	//Checks the toaster's condition and whether it can run
		return isBroken;
	}
	public boolean checkPower() { //Checks power and returns wether or not it is on
		return power;
	}
	public int checkTimer() {	//Returns the timer
		return timer;
	}
	public void setSetting() {	//Set the setting of the toaster, which will determine the rate at which the bread toasts
		
	}
	public void toast() {	//Begins the toasting processs
		
	}
	
	
}
