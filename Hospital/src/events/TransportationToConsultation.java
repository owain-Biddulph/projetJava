package events;

import java.util.PriorityQueue;

import core.L1;
import core.L2;
import core.Simulator;
import core.Variables;
import person.Nurse;
import person.Patient;
import ressources.Equipment;
import room.BoxRoom;
import room.Room;
import room.ShockRoom;

public class TransportationToConsultation extends Event{
	private static PriorityQueue<Patient> waitingPatients = new PriorityQueue<Patient>();
	private Room startRoom;
	private Room endRoom;
	private Equipment equipment;
	private Nurse nurse;
	private String nextEvent = "Consultation";
	
	/*public Transportation(Patient patient, int time, Equipment equipment, Room startRoom, Room endRoom) {
		this.patient = patient;
		this.startTime = time;
		this.endTime = ProbabilityDistribution.gamma() + time;
		this.equipment = equipment;
	}*/
	
	public TransportationToConsultation(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + 2;
		this.startRoom = patient.getLocation();
		if(patient.getSeverityLevel() instanceof L1 || patient.getSeverityLevel() instanceof L2) {
			this.endRoom = ShockRoom.deQueue();
		}
		else {
			this.endRoom = BoxRoom.deQueue();
		}
		this.patient = patient;
		this.cost = Variables.TransportationToConsultation.getCost();
		this.nurse = Nurse.deQueue();
		this.registerObserver(patient);
		this.registerObserver(this.nurse);
		this.registerObserver(this.endRoom);
		this.registerObserver(this.startRoom);
	}
	
	public static PriorityQueue<Patient> getQueue() {return waitingPatients;}
}