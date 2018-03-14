package core;

//Finished

public class Arrival extends Event{
	
	// constructors : one predefined, one random
	public Arrival(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + ProbabilityDistribution.exp(0,1);
		this.patient = patient;
		this.cost = 0;
	}
	
	public Arrival() {
		this.cost = 0;
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + ProbabilityDistribution.exp(0,1);
		this.patient = new Patient();
		this.registerObserver(this.patient);
		EventQueue.add(this);
	}
	
	@Override
	public void execute() {
		Patient.getWaitingPatients().add(this.patient);
		this.patient.setLocation(WaitingRoom.getInstance());
		Event nextArrival = EventFactory.createEvent("Arrival");
		//there is always exactly one Arrival event in the EventQueue, when one is executed, the next one is created
		EventQueue.add(nextArrival);
	}


}
