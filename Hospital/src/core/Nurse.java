package core;

import java.util.ArrayList;

public class Nurse extends Person implements HumanResource {
	private static ArrayList<Nurse> availableNurses = new ArrayList<Nurse>();
	
		
	public static Nurse deQueue() {
		//gets the next available nurse
		return availableNurses.remove(0);
	}
	public static boolean available() {
		return(! availableNurses.isEmpty());
	}

	private boolean available;

	@Override
	public void update(Event event, Boolean True) {
		if(this.available == true) {this.available = false;}
		else	 {this.available = false;}
		
	}
}
