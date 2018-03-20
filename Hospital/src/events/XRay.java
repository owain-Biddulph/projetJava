package events;

import java.util.PriorityQueue;

import core.ProbabilityDistribution;
import core.Simulator;
import core.Variables;
import person.Nurse;
import person.Patient;
import person.Physician;
import room.Room;

public class XRay extends Examination {
	private static PriorityQueue<Patient> waitingPatients = new PriorityQueue<Patient>();
	private Room room;
	private Physician physician;
	
	/*public static XRay(Patient patient, int endTime) {
		super();
		this.patient = patient;
		this.startTime = startTime;
		this.endTime = endTime;
		this.cost = 50;
	}*/
	
	public XRay(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + Variables.XRay.getTime();
		this.patient = patient;
		this.physician = Physician.deQueue();
		this.room = patient.getLocation();   
		this.cost = Variables.XRay.getCost();
		this.registerObserver(patient);
		this.registerObserver(this.room);
		this.registerObserver(this.physician);
		this.patient.setNextEvent("TransportationToConsultation");
	}
	
	public static PriorityQueue<Patient> getQueue() {return waitingPatients;}
	
}
