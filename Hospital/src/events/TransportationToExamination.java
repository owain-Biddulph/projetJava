 package events;

import java.util.PriorityQueue;

import core.Simulator;
import core.Variables;
import person.Patient;
import person.Transporter;
import ressources.Equipment;
import room.BloodTestLaboratory;
import room.MRIRoom;
import room.RadiographyRoom;
import room.Room;

public class TransportationToExamination extends Event{
	private static PriorityQueue<Patient> waitingPatients = new PriorityQueue<Patient>();
	private Room startRoom;
	private Room endRoom;
	private Equipment equipment;
	private Transporter transporter;
	
	/*public Transportation(Patient patient, int time, Equipment equipment, Room startRoom, Room endRoom) {
		this.patient = patient;
		this.startTime = time;
		this.endTime = ProbabilityDistribution.gamma() + time;
		this.equipment = equipment;
	}*/
	
	public TransportationToExamination(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + 5;
		this.startRoom = patient.getLocation();
		if(patient.getNextEvent().equalsIgnoreCase("Tansportation To XRay")) {
			this.endRoom = RadiographyRoom.deQueue();
			this.setNextStep("XRay");
		}
		if(patient.getNextEvent().equalsIgnoreCase("Tansportation To Blood Test")) {
			this.endRoom = BloodTestLaboratory.deQueue();
			this.setNextStep("BloodTest");
		}
		if(patient.getNextEvent().equalsIgnoreCase("Tansportation To MRI")) {
			this.endRoom = MRIRoom.deQueue();
			this.setNextStep("MRI");
		}
		this.patient = patient;
		this.cost = Variables.TransportationToExamination.getCost();
		this.transporter = Transporter.deQueue();
		this.registerObserver(patient);
		this.registerObserver(this.transporter);
		this.registerObserver(this.endRoom);
		this.registerObserver(this.startRoom);
	}
	
	public static PriorityQueue<Patient> getQueue() {return waitingPatients;}
}
