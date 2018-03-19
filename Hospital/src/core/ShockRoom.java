package core;

import java.util.ArrayList;

import events.Event;
import room.Room;

public class ShockRoom extends Room{
	private static ArrayList<ShockRoom> availableShockRooms = new ArrayList<ShockRoom>();
	
	public static Room deQueue() {
		ShockRoom room = availableShockRooms.remove(0);
		if(room.getOccupants().size() < room.getSize() -1) {availableShockRooms.add(room);}
		return room;
	}

	@Override
	public void update(Event event, boolean start) {
		if(start == false) {
			availableShockRooms.add(this);
		}	
	}
}
