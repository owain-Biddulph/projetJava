package events;

import core.Examination;
import core.Patient;
import core.ProbabilityDistribution;
import core.Simulator;
import room.Room;

public class BloodTest extends Examination{
	private Room room;
	
	
	public BloodTest (Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + ProbabilityDistribution.uniform(15,90);
		this.patient = patient;
		this.room = patient.getLocation();   // TODO change patient location before creating consultation
		this.cost = 0;
		this.registerObserver(patient);
		this.registerObserver(this.room);
		this.patient.setNextEvent("TransportationToConsultation");
	}	
}
