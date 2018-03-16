package core;

import java.util.PriorityQueue;

public class Simulator {
	public static int globalClock;
	public static EventQueue eventQueue;
	public static PatientComparator c = new WaitTimePriority();
	
	public static void initialize() {
		globalClock = 0;
		eventQueue = EventQueue.getEventQueue();
		Patient.setPriorityStrategy(c);
	}
	public static void takeStep() {
		Event e = eventQueue.deQueue();
		e.execute();
		PriorityQueue<Patient>  waitingPatients = Patient.getWaitingPatients();
		//On peut faire le remove de waiting list dans le update de patient (je l'ai fait)
		while(! waitingPatients.isEmpty()) {
			//priorityPatient is the most important patient in the waiting queue
			Patient priorityPatient = waitingPatients.remove();
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
		
}
	
}
