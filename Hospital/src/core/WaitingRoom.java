package core;

import java.util.*;

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
		// TODO Auto-generated method stub
		
	}
}
