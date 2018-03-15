package core;

import java.util.ArrayList;

public class Nurse extends Person implements HumanResource {
	private boolean available;
	private static ArrayList<Nurse> availableNurses = new ArrayList<Nurse>();
	
	public Nurse(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.ID = IDGenerator.getIDGenerator().nextID();
	}
	
	public Nurse() {
		this.name = "Name";
		this.surname = "Surname";
		this.ID = IDGenerator.getIDGenerator().nextID();
	}
		
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
