package core;

import java.util.PriorityQueue;

public class Simulator {
	public static int globalClock;
	public static EventQueue eventQueue;
	
	public Simulator() {
		this.globalClock = 0;
		this.eventQueue = new EventQueue();
	}
	
	public void takeStep() {
		Event e = eventQueue.deQueue();
		e.execute();
		PriorityQueue<Patient>  waitingPatients = Patient.getWaitingPatients();
		while(! waitingPatients.isEmpty()) {
			//priorityPatient is the most important patient in the waiting queue
			Patient priorityPatient = waitingPatients.remove();
			//priorityEvent is the event that patient needs
			String priorityEvent = priorityPatient.getNextEvent();
			//if this event is possible (if the ressources are there)
			//then we create it and add it to the eventQueue
			if(EventAvailability.isPossible(priorityEvent)) {
				Event nextEvent = EventFactory.createEvent(priorityEvent);
				eventQueue.add(nextEvent);
			}
		}
		eventQueue.sort();
	}
	public static void main(String[] args) {

}
	
}
