package core;

import java.util.ArrayList;

public class Nurse extends Person implements HumanResource {
	private boolean available;
	private static ArrayList<Nurse> availableNurses = new ArrayList<Nurse>();
	
		
	public static Nurse deQueue() {
		//gets the next available nurse
		return availableNurses.remove(0);
	}
	
	//TODO this available method could be confused with the attribute available
	public static boolean available() {
		return(! availableNurses.isEmpty());
	}

	@Override
	public void update(Event event, boolean start) {
		if(start = true) 
		{this.available = false;}
		else 
		{this.available = true;}
	}
}
