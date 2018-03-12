package core;

public class TransportationToTest extends Event{
	private Room startRoom;
	private Room endRoom;
	private Equipment equipment;
	private Transporter transporter;
	
	/*public Transportation(Patient patient, int time, Equipment equipment, Room startRoom, Room endRoom) {
		this.patient = patient;
		this.startTime = time;
		this.endTime = ProbabilityDistribution.gamma() + time;
		this.equipment = equipment;
	}*/
	
	public TransportationToTest(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + 5;
		this.startRoom = patient.getLocation();
		if(patient.getSeverityLevel() instanceof L1 || patient.getSeverityLevel() instanceof L2) {
			this.endRoom = ShockRoom.deQueue();
		}
		else {
			this.endRoom = BoxRoom.deQueue();
		}
		this.patient = patient;
		this.cost = 0;
		this.transporter = Transporter.deQueue();
		this.registerObserver(patient);
		this.registerObserver(this.transporter);
		this.registerObserver(this.endRoom);
		patient.getLocation().removePatient(patient);
		patient.setNextEvent("");
	}
}
