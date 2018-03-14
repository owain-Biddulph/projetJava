package core;

import java.util.ArrayList;
import java.util.List;

public abstract class Person implements Observer {
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
	
	@Override
	public abstract void update(Event event, boolean start);
}
