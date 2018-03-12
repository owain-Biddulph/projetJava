package core;

import java.util.*;

public class Patient extends Person {
	private SeverityLevel severityLevel;
	private Insurance insurance;
	private Room location;
	private int exitTime;
	private String nextEvent;
	private int priorityLevel;
	private static PriorityQueue<Patient> waitingPatients = new PriorityQueue();

	
	/*public Patient(String name, String surname, Room location) {
		this.location = location;
		this.severityLevel = new SeverityLevel();
		this.insurance = new Insurance();
		this.nextEvent = "Registration";
		this.name = name;
		this.surname = surname;
		this.ID = IDGenerator.getIDGenerator().nextID();
	}*/
	
	public Patient() {
		this.severityLevel = new SeverityLevel();
		this.insurance = new Insurance();
		this.nextEvent = "Registration";
		this.ID = IDGenerator.getIDGenerator().nextID();
	}
	
	
	public int getWaitingTime() {
		return(Simulator.globalClock - exitTime);
	}
	
	public void update(Event event) {
		this.nextEvent = event.getNextStep();
		if(nextEvent.equals("Outcome")){} //if the patient is finished, he is released
		else {
			exitTime = event.endTime;
			//available = true;
			this.history.add(event);
			waitingPatients.add(this);
		}
	}
	
	// Getters and Setters

	public SeverityLevel getSeverityLevel() {
		return severityLevel;
	}

	public void setSeverityLevel(SeverityLevel severityLevel) {
		this.severityLevel = severityLevel;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public Room getLocation() {
		return location;
	}

	public void setLocation(Room location) {
		this.location = location;
	}

	public int getExitTime() {
		return exitTime;
	}

	public void setExitTime(int exitTime) {
		this.exitTime = exitTime;
	}

	public String getNextEvent() {
		return nextEvent;
	}

	public void setNextEvent(String nextEvent) {
		this.nextEvent = nextEvent;
	}

	public static PriorityQueue<Patient> getWaitingPatients() {
		return waitingPatients;
	}

	
	
}
