package core;


public class Registration extends Event{
	private Nurse nurse;
	
	public Registration(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + Variables.Registration.getTime();
		this.nurse = Nurse.deQueue();
		this.patient = patient;
		this.cost = Variables.Registration.getCost();
		this.registerObserver(this.nurse);
		this.registerObserver(this.patient);
		this.patient.setNextEvent("TransportationToConsultation");
	}
	

	
	/*public Registration(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + ProbabilityDistribution.exp(1);
		this.patient = patient;
		this.cost = 0;
		this.registerObserver(patient);
		Event.enabledEvents.add(this);
	}*/


}
