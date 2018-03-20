package events;

import java.util.PriorityQueue;

import core.ProbabilityDistribution;
import core.Simulator;
import core.Variables;
import person.Nurse;
import person.Patient;
import person.Physician;
import room.Room;

public class MRI extends Examination {
	private static PriorityQueue<Patient> waitingPatients = new PriorityQueue<Patient>();
	private Room room;
	private Physician physician;
	
	
	public MRI(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + Variables.MRI.getTime();
		this.patient = patient;
		this.physician = Physician.deQueue();
		this.room = patient.getLocation();   
		this.cost = Variables.MRI.getCost();
		this.registerObserver(patient);
		this.registerObserver(this.room);
		this.registerObserver(this.physician);
		this.patient.setNextEvent("TransportationToConsultation");
	}
	
	public static PriorityQueue<Patient> getQueue() {return waitingPatients;}
}
