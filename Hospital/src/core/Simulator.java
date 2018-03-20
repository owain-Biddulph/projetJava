package core;

import java.util.ArrayList;
import java.util.PriorityQueue;

import events.Arrival;
import events.Event;
import events.EventAvailability;
import events.EventQueue;
import person.Patient;
import room.BloodTestLaboratory;

public class Simulator {
	public static int globalClock;
	public static EventQueue eventQueue;
	public static PatientComparator c = new WaitTimePriority();
	public static ArrayList<Event> history = new ArrayList<Event>();
	public static int nSteps;
	
	public static void initialize() {
		globalClock = 0;
		eventQueue = EventQueue.getEventQueue();
		Patient.setPriorityStrategy(c);
		eventQueue.add(new Arrival(new Patient(new L1())));
		eventQueue.add(new Arrival(new Patient(new L2())));
		eventQueue.add(new Arrival(new Patient(new L3())));
		eventQueue.add(new Arrival(new Patient(new L4())));
		eventQueue.add(new Arrival(new Patient(new L5())));
		for 
		for(int i = 0; i<= Variables.BloodTestLaboratory.getNumber(); i++) {
			BloodTestLaboratory.getQueue.add(new BloodTestLaboratory();
		}
		
		
	}
	public static void takeStep() {
		Event e = eventQueue.deQueue();
		e.execute();
		history.add(e);
		PriorityQueue<Patient>  waitingPatients = Patient.getWaitingPatients();
		//On peut faire le remove de waiting list dans le update de patient (je l'ai fait)
		for(Patient priorityPatient :waitingPatients) {
			//priorityPatient is the most important patient in the waiting queue
			//priorityEvent is the event that patient needs
			String priorityEvent = priorityPatient.getNextEvent();
			//if this event is possible (if the resources are there)
			//then we create it and add it to the eventQueue
			if(EventAvailability.isPossible(priorityEvent)) {
				Event nextEvent = EventFactory.createEvent(priorityEvent, priorityPatient);
				nextEvent.startEvent();
				eventQueue.add(nextEvent);
			}
		}
	}
	public static void main(String[] args) {
		initialize();
		for(int i = 0; i< nSteps; i++) {
			takeStep();
		}
}
	
}
