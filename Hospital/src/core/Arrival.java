package core;

//Finished

public class Arrival extends Event{
	
	// constructors : one predefined, one random
	public Arrival(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + ProbabilityDistribution.exp(1);
		this.patient = patient;
		this.cost = 0;
	}
	
	public Arrival() {
		this.cost = 0;
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + ProbabilityDistribution.exp(1);
		this.patient = new Patient();
		this.registerObserver(this.patient);
		EventQueue.add(this);
	}
	
	@Override
	public void execute() {
		Patient.getWaitingPatients().add(this.patient);
		this.patient.setLocation(WaitingRoom.getInstance());
		EventFactory.createEvent("Arrival");
	}


}
