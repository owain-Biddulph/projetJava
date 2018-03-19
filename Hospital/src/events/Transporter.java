package events;

import java.util.ArrayList;

import core.HumanResource;
import core.IDGenerator;
import core.Person;

public class Transporter extends Person implements HumanResource {
	private static ArrayList<Transporter> availableTransporters = new ArrayList<Transporter>();
	
	public Transporter (String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.ID = IDGenerator.getIDGenerator().nextID();
	}
	
	public Transporter () {
		this.name = "Name";
		this.surname = "Surname";
		this.ID = IDGenerator.getIDGenerator().nextID();
	}
	
		
	public static Transporter deQueue() {
		//gets the next available nurse
		return availableTransporters.remove(0);
	}
	public static boolean available() {
		return(! availableTransporters.isEmpty());
	}

	private boolean available;

	@Override
	public void update(Event event, boolean start) {
		if(this.available == true) {this.available = false;}
		else	 {this.available = false;}
		
	}
}
