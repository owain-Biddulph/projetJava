package core;

public class TransportationToExamination extends Event{
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
	
	public TransportationToExamination(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + 5;
		this.startRoom = patient.getLocation();
		if(patient.getNextEvent().equalsIgnoreCase("Tansportation To XRay")) {
			this.endRoom = RadiographyRoom.deQueue();
			patient.setNextEvent("XRay");
		}
		if(patient.getNextEvent().equalsIgnoreCase("Tansportation To Blood Test")) {
			this.endRoom = BloodTestLaboratory.deQueue();
			patient.setNextEvent("Blood Test");
		}
		if(patient.getNextEvent().equalsIgnoreCase("Tansportation To MRI")) {
			this.endRoom = MRIRoom.deQueue();
			patient.setNextEvent("MRI");
		}
		this.patient = patient;
		this.cost = 0;
		this.transporter = Transporter.deQueue();
		this.registerObserver(patient);
		this.registerObserver(this.transporter);
		this.registerObserver(this.endRoom);
		patient.getLocation().removePatient(patient);
	}
}
