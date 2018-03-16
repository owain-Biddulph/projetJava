package core;

import java.util.*;

public class Patient extends Person {
	private SeverityLevel severityLevel;
	private Insurance insurance;
	private Room location;
	//the exitTime attribute indicates since when the patient is awaiting the next step in his hospital stay
	//it helps determine the priority  of patients
	private int exitTime;
	private String nextEvent;
	private int priorityLevel;
	private static PriorityQueue<Patient> waitingPatients = new PriorityQueue<Patient>();
	private static PatientComparator comparator;
	
	
	
	public Patient(String name, String surname, SeverityLevel severity) {
		this.severityLevel = severity;
		this.insurance = new Insurance();
		this.nextEvent = "Registration";
		this.name = name;
		this.surname = surname;
		this.ID = IDGenerator.getIDGenerator().nextID();
		this.exitTime = Simulator.globalClock;
	}
	
	public Patient(SeverityLevel severity) {
		this.severityLevel = severity;
		this.insurance = new Insurance();
		this.nextEvent = "Registration";
		this.ID = IDGenerator.getIDGenerator().nextID();
		this.name = "Name";
		this.surname = "Surname";
		this.exitTime = Simulator.globalClock;
	}
	
	
	public int getWaitingTime() {
		return(Simulator.globalClock - exitTime);
	}
	
	@Override
	public void update(Event event, boolean start) {
		if(start == true) {
			Patient.waitingPatients.remove(this);
		}
		this.nextEvent = event.getNextStep();
		if(nextEvent.equals("Outcome")){} //if the patient is finished, he is released
		else {
			exitTime = event.endTime;
			//available = true;
			this.history.add(event);
			waitingPatients.add(this);
		}
	}
	
	public static void setPriorityStrategy(PatientComparator c) {
		comparator = c;
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
