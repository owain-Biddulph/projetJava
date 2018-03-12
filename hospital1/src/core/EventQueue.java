package core;

import java.util.*;

//TODO we need to make this class a singleton
public class EventQueue {
	
	private class EventComparator implements Comparator<Event>{

		@Override
		public int compare(Event e1, Event e2) {
			if(e1.getEndTime() < e2.getEndTime()) {
				return(-1);
			}
			if(e1.endTime>e2.endTime) {
				return(1);
			}
			return 0;
		}
		
	}
	
	private static PriorityQueue<Event> eventQueue = new PriorityQueue(1, new EventComparator());
	
	
	
	
	public static void add(Event event) {
		eventQueue.add(event);
	}
	
	public static Event deQueue() {
		return eventQueue.remove();
	}
	
	
	public static void remove(Event event) {
		eventQueue.remove(event);
	}
	

	public void update(ArrayList<Event> newEnabledEvents, ArrayList<Event> oldEnabledEvents) {
		ArrayList<Event> newlyEnabled = (ArrayList) newEnabledEvents.clone();
		ArrayList<Event> newlyDisabled = (ArrayList)oldEnabledEvents.clone();
		newlyEnabled.removeAll(oldEnabledEvents);
		newlyDisabled.removeAll(newEnabledEvents);
		
		
	}
}
