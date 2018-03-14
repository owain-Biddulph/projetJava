package core;

public class MRI extends Examination {
	private Room room;
	
	
	public MRI(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + UniformDistribution.get(30,70);
		this.patient = patient;
		this.room = patient.getLocation();   // TODO change patient location before creating consultation
		this.cost = 0;
		this.registerObserver(patient);
		this.registerObserver(this.room);
		this.patient.setNextEvent("TransportationToConsultation");
	}
}