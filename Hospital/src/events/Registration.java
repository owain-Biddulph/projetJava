package events;

import java.util.PriorityQueue;

import core.RegistrationDesk;
import core.Simulator;
import core.Variables;
import person.Nurse;
import person.Patient;

public class Registration extends Event{
	private static PriorityQueue<Patient> waitingPatients = new PriorityQueue<Patient>();
	private Nurse nurse;
	private String nextStep = "TransportationToConsultation";
	
	public Registration(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + Variables.Registration.getTime();
		this.nurse = Nurse.deQueue();
		RegistrationDesk.getRegistrationDesk().setAvailable(false);
		this.patient = patient;
		this.cost = Variables.Registration.getCost();
		this.registerObserver(this.nurse);
		this.registerObserver(this.patient);
		this.patient.setNextEvent("TransportationToConsultation");
	}
	
	public static PriorityQueue<Patient> getQueue() {return waitingPatients;}
	
	/*public Registration(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + ProbabilityDistribution.exp(1);
		this.patient = patient;
		this.cost = 0;
		this.registerObserver(patient);
		Event.enabledEvents.add(this);
	}*/


}
