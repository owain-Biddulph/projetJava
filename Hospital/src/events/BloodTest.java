package events;

import java.util.PriorityQueue;

import core.ProbabilityDistribution;
import core.Simulator;
import core.Variables;
import person.Nurse;
import person.Patient;
import room.Room;
import room.WaitingRoom;

public class BloodTest extends Examination{
	private static PriorityQueue<Patient> waitingPatients = new PriorityQueue<Patient>();
	private Room room;
	private Nurse nurse;
	
	
	public BloodTest (Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + Variables.BloodTest.getTime();
		this.patient = patient;
		this.nurse = Nurse.deQueue();
		this.room = patient.getLocation();   
		this.cost = Variables.BloodTest.getCost();
		this.registerObserver(patient);
		this.registerObserver(this.room);
		this.registerObserver(this.nurse);
		this.patient.setNextEvent("TransportationToConsultation");
	}
	
	public static PriorityQueue<Patient> getQueue() {return waitingPatients;}
}
