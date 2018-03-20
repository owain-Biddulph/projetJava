package events;

import java.util.PriorityQueue;

import core.DTDT;

import core.ProbabilityDistribution;
import core.Simulator;
import core.Variables;
import person.Patient;
import person.Physician;
import room.Room;

public class Consultation extends Event{
	private static PriorityQueue<Patient> waitingPatients = new PriorityQueue<Patient>();
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
		this.endTime = Simulator.globalClock + Variables.Consultation.getTime();
		this.patient = patient;
		this.room = patient.getLocation();   
		this.cost = Variables.Consultation.getCost();
		this.physician = Physician.deQueue();
		this.registerObserver(patient);
		this.registerObserver(this.room);
		this.registerObserver(this.physician);
	
		if(patient.getNotYetConsulted() == true) {
			DTDT.addDTDT(Simulator.globalClock - patient.getArrivalTime());
			patient.setNotYetConsulted(false);
		}
	}
	
	public static PriorityQueue<Patient> getQueue() {return waitingPatients;}
	
	@Override
	public void execute() {
		this.examNeeded = Examination.randomExamination(0.35, 0.2, 0.4, 0.05);
		//randomly chooses to say what exam is needed (possible that it is No Examination)
		if(examNeeded.equalsIgnoreCase("No Exam")) {this.setNextStep("Outcome");}
		else if(examNeeded.equalsIgnoreCase("Radiography")) {this.setNextStep("Transportation To XRay");}
		else if(examNeeded.equalsIgnoreCase("Blood Test")) {this.setNextStep("Transportation To Blood Test");}
		else {this.setNextStep("Transportation To MRI");}
		this.notifyObservers(false);
		Simulator.globalClock = this.endTime;
	}
		
 }

	

