package room;

import java.util.ArrayList;

import events.Event;

public class MRIRoom extends Room {
	private static ArrayList<MRIRoom> availableMRIRooms = new ArrayList<MRIRoom>();
	
	
	public static Room deQueue() {
		MRIRoom room = availableMRIRooms.remove(0);
		if(room.getOccupants().size() < room.getSize() -1) {availableMRIRooms.add(room);}
		return room;
	}
	
	public static boolean available() {
		return(! availableMRIRooms.isEmpty());
	}
	
	public MRIRoom () {
		
	}
	
	@Override
	public void update(Event event, boolean start) {
		if(start == false) {
			availableMRIRooms.add(this);
		}	
	}

}
