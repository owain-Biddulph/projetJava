package core;

import java.util.ArrayList;

public class Physician extends Person implements HumanResource {
	private static ArrayList<Physician> availablePhysicians = new ArrayList<Physician>();
	
	public Physician (String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.ID = IDGenerator.getIDGenerator().nextID();
	}
	
	public Physician () {
		this.name = "Name";
		this.surname = "Surname";
		this.ID = IDGenerator.getIDGenerator().nextID();
	}
	
	public static Physician deQueue() {
		return availablePhysicians.remove(0);
	}


	@Override
	public void update(Event event, boolean start) {
		// TODO Auto-generated method stub
		
	}
	
}
