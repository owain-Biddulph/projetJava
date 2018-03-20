package room;

import java.util.ArrayList;

import events.Event;

public class BoxRoom extends Room {
	private static ArrayList<BoxRoom> availableBoxRooms = new ArrayList<BoxRoom>();
	public ArrayList<BoxRoom> getQueue(){
		return(availableBoxRooms);
	}

	
	public static Room deQueue() {
		BoxRoom room = availableBoxRooms.remove(0);
		if(room.getOccupants().size() < room.getSize() -1) {availableBoxRooms.add(room);}
		return room;
	}

	@Override
	public void update(Event event, boolean start) {
		if(start == false) {
			if(!availableBoxRooms.contains(this)) {
				availableBoxRooms.add(this);
			}
		}	
	}
}