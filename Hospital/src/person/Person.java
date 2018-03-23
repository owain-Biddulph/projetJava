package person;

import java.util.ArrayList;
import java.util.List;

import core.Observer;
import events.Event;

public abstract class Person implements Observer {
	private static List<Person> existingPeople = new ArrayList<Person>();
	protected String name;
	protected String surname;
	protected int ID;
	protected List<Event> history = new ArrayList<Event>();
	
	/*public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
		this.ID = currentID;
		currentID++;
		this.available = true;
		//this.history = emptylist;
	}*/
	
	public static List<Person> getExistingPeople() {
		return Person.existingPeople;
	}
	
	public void getState() {}
	@Override
	public abstract void update(Event event, boolean start);
}
