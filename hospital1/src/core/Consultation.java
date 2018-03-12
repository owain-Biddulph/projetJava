package core;

public class Consultation extends Event{
	private Physician physician;
	private String examNeeded;
	private Room room;
	
	/*public Consultation(int startTime, Patient patient, Physician physician) {
		this.startTime = startTime;
		this.patient = patient;
		this.physician = physician;
		this.examNeeded = Examination.types.get(ProbabilityDistribution.gamma(Examination.ntypes));
		//randomly chooses to say that an exam is needed
	}*/
	
	public Consultation(Patient patient) {
		this.startTime = Simulator.globalClock;
		this.endTime = Simulator.globalClock + UniformDistribution.get(5,20);
		this.patient = patient;
		this.room = patient.getLocation();   // TODO change patient location before creating consultation
		this.cost = 0;
		this.physician = Physician.deQueue();
		this.registerObserver(patient);
		this.registerObserver(this.room);
		this.registerObserver(this.physician);
		this.examNeeded = Examination.randomExamination(0.35, 0.2, 0.4, 0.05);
		//randomly chooses to say what exam is needed (possible that it is No Examination)
		if(examNeeded.equalsIgnoreCase("No Exam")) {patient.setNextEvent("Outcome");}
		else if(examNeeded.equalsIgnoreCase("Radiography")) {patient.setNextEvent("Transportation To XRay");}
		else if(examNeeded.equalsIgnoreCase("Blood Test")) {patient.setNextEvent("Transportation To Blood Test");}
		else {patient.setNextEvent("Transportation To MRI");}
	}
}
	

