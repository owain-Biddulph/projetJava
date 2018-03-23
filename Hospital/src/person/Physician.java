package person;

import java.util.ArrayList;

import core.IDGenerator;
import events.Event;
import room.ShockRoom;

public class Physician extends Person implements HumanResource {
	private static ArrayList<Physician> availablePhysicians = new ArrayList<Physician>();
	
	public static ArrayList<Physician> getQueue(){
		return(availablePhysicians);
	}
	
	public Physician (String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.ID = IDGenerator.getIDGenerator().nextID();
		Person.getExistingPeople().add(this);
	}
	
	public static boolean available() {
		return(!availablePhysicians.isEmpty());
	}
	
	public Physician () {
		this.name = "Name";
		this.surname = "Surname";
		this.ID = IDGenerator.getIDGenerator().nextID();
		Person.getExistingPeople().add(this);
	}
	
	public static Physician deQueue() {
		return availablePhysicians.remove(0);
	}
	@Override
	public void getState() {
		System.out.println("The Physicians state is :");
		System.out.println("Name : " + this.name);
		System.out.println("Surname : " + this.surname);
		System.out.println("ID : " + this.ID);
		System.out.println("Availability : " + this.available());
		System.out.println("Mailbox : " + this.getMailbox);
	}

	@Override
	public void update(Event event, boolean start) {
		if(start = true) {}
		else 
		{
			Physician.availablePhysicians.add(this);
		}
	}
}
