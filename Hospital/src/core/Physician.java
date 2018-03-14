package core;

import java.util.ArrayList;

public class Physician extends Person implements HumanResource {
	private static ArrayList<Physician> availablePhysicians = new ArrayList<Physician>();
	
	public static Physician deQueue() {
		return availablePhysicians.remove(0);
	}

	@Override
	public void update(Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Event event, Boolean True) {
		// TODO Auto-generated method stub
		
	}
	
}
