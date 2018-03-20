package room;

import java.util.*;

import events.Event;
import person.Patient;

public class WaitingRoom extends Room{
	public static WaitingRoom instance = null;
	public ArrayList<Patient> waitingPatients = new ArrayList<Patient>();
	
	private WaitingRoom() {}
	
	public static WaitingRoom getInstance() {
		if(instance == null) {
			instance = new WaitingRoom();
		}
		return instance;
	}

	@Override
	public void update(Event event, boolean start) {
		if(start) {
			this.removePatient(event.getPatient());
		}
		
	}
}
