package events;

import core.LOS;
import core.Patient;
import core.Simulator;

public class Outcome extends Event{
	private boolean successful;

	public Outcome(Patient patient) {
		super();
		this.patient = patient;
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock;
		LOS.addLOS(Simulator.globalClock - patient.getArrivalTime());
		this.cost = 0;
	}
	
}
