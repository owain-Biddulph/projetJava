package person;

import java.util.*;

import core.IDGenerator;
import core.Insurance;
import core.PatientComparator;
import core.SeverityLevel;
import core.Simulator;
import core.addToQueues;
import events.*;
import room.Room;
import room.WaitingRoom;

public class Patient extends Person {
	private SeverityLevel severityLevel;
	private Insurance insurance;
	private Room location;
	//the exitTime attribute indicates since when the patient is awaiting the next step in his hospital stay
	//it helps determine the priority  of patients
	private int exitTime;
	private String nextEvent;
	private int priorityLevel;
	private int arrivalTime;
	private boolean notYetConsulted = true;
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
		this.arrivalTime = Simulator.globalClock;
		Person.getExistingPeople().add(this);
	}
	
	public Patient(SeverityLevel severity) {
		this.severityLevel = severity;
		this.insurance = new Insurance();
		this.nextEvent = "Registration";
		this.ID = IDGenerator.getIDGenerator().nextID();
		this.name = "Name";
		this.surname = "Surname";
		this.exitTime = Simulator.globalClock;
		this.arrivalTime = Simulator.globalClock;
		Person.getExistingPeople().add(this);
	}
	
	
	public int getWaitingTime() {
		return(Simulator.globalClock - exitTime);
	}
	
	@Override
	public void update(Event event, boolean start) {
		if(start == true) {
			Patient.waitingPatients.remove(this);
		}
		else {
			this.nextEvent = event.getNextStep();
			if(nextEvent.equals("Outcome")){} //if the patient is finished, he is released
			else {
				exitTime = event.getEndTime();
				this.location = event.getEndRoom();
				this.history.add(event);
				addToQueues.add(this);
			}
			
		}
	}
	
	public static void setPriorityStrategy(PatientComparator c) {
		comparator = c;
	}
	@Override
	public void getState() {
		System.out.println("The Patients state is :");
		System.out.println("Name : " + this.name);
		System.out.println("Surname : " + this.surname);
		System.out.println("ID : " + this.ID);
		System.out.println("Location : " + this.getLocation());
		System.out.println("Next Step : " + this.getNextEvent());
		System.out.println("Severity Level : " + this.getSeverityLevel());
		System.out.println("Insurance : " + this.insurance);
		
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
	
	public int getArrivalTime() {return this.arrivalTime;}
	public boolean getNotYetConsulted() {return this.notYetConsulted;}
	public void setNotYetConsulted(boolean bool) {this.notYetConsulted = bool;}

	public static PriorityQueue<Patient> getWaitingPatients() {
		return waitingPatients;
	}

	public static void getWaitingPatientsState() {
		System.out.println("Patients waiting for MRI : ");
		for(Patient patient : MRI.getQueue()) {
			patient.getState();
		}
		System.out.println("");
		
		System.out.println("Patients waiting for blood test : ");
		for(Patient patient : BloodTest.getQueue()) {
			patient.getState();
		}
		System.out.println("");
		
		System.out.println("Patients waiting for XRay : ");
		for(Patient patient : XRay.getQueue()) {
			patient.getState();
		}
		System.out.println("");
		
		System.out.println("Patients waiting for Transportation to Consultation : ");
		for(Patient patient : TransportationToConsultation.getQueue()) {
			patient.getState();
		}
		System.out.println("");
		
		System.out.println("Patients waiting for Transportation to Examination : ");
		for(Patient patient : TransportationToExamination.getQueue()) {
			patient.getState();
		}
		System.out.println("");
		
		System.out.println("Patients waiting for Registration : ");
		for(Patient patient : Registration.getQueue()) {
			patient.getState();
		}
		System.out.println("");
		
		System.out.println("Patients waiting for Consultation : ");
		for(Patient patient : Consultation.getQueue()) {
			patient.getState();
		}
		System.out.println("");	
	}

}
