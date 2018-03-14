package core;

public class XRay extends Examination {
	private Room room;
	
	/*public static XRay(Patient patient, int endTime) {
		super();
		this.patient = patient;
		this.startTime = startTime;
		this.endTime = endTime;
		this.cost = 50;
	}*/
	
	public XRay(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + ProbabilityDistribution.uniform(10,20);
		this.patient = patient;
		this.room = patient.getLocation();   // TODO change patient location before creating consultation
		this.cost = 0;
		this.registerObserver(patient);
		this.registerObserver(this.room);
		this.patient.setNextEvent("TransportationToConsultation");
	}
}
