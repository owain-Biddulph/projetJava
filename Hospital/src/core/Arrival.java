package core;

//Finished

public class Arrival extends Event{
	
	// constructors : one predefined, one random
	public Arrival(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = patient.getSeverityLevel().getNextArrivalTime();
		this.patient = patient;
		this.cost = 0;
		this.registerObserver(this.patient);
	}
	
	/*public Arrival() {
		this.cost = 0;
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + ProbabilityDistribution.exp(0.1);
		this.patient = new Patient();
		this.registerObserver(this.patient);
	}*/
	
	@Override
	public void execute() {
		Patient.getWaitingPatients().add(this.patient);
		this.patient.setLocation(WaitingRoom.getInstance());
		try {
			Event nextArrival = EventFactory.createEvent("Arrival", new Patient(this.patient.getSeverityLevel().getClass().newInstance()));
			//there is always exactly one Arrival event of each severity level in the EventQueue, when one is executed, the next one is created
			EventQueue.add(nextArrival);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			System.out.println("Error creating new patient arrival");
		}
	}


}
