package events;

import core.Equipment;
import core.L1;
import core.L2;
import core.Nurse;
import core.Patient;
import core.ShockRoom;
import core.Simulator;
import room.BoxRoom;
import room.Room;

public class TransportationToConsultation extends Event{
	private Room startRoom;
	private Room endRoom;
	private Equipment equipment;
	private Nurse nurse;
	
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
		this.cost = 0;
		this.nurse = Nurse.deQueue();
		this.registerObserver(patient);
		this.registerObserver(this.nurse);
		this.registerObserver(this.endRoom);
		patient.getLocation().removePatient(patient);
		patient.setNextEvent("Consultation");
	}
}