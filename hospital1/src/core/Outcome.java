package core;

public class Outcome extends Event{
	private boolean sucessful;

	public Outcome(Patient patient, int time) {
		super();
		this.patient = patient;
		this.startTime = time;
		this.endTime = time;
		this.cost = 0;
	}
	
}
