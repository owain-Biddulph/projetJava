package room;

import java.util.ArrayList;

import core.Variables;
import events.Event;

public class ShockRoom extends Room{
	private static ArrayList<ShockRoom> availableShockRooms = new ArrayList<ShockRoom>();
	public static ArrayList<ShockRoom> getQueue(){
		return(availableShockRooms);
	}

	public static Room deQueue() {
		ShockRoom room = availableShockRooms.remove(0);
		if(room.getOccupants().size() < room.getSize() -1) {availableShockRooms.add(room);}
		return room;
	}
	
	public ShockRoom() {
		this.size = Variables.ShockRoom.getSize();
	}

	@Override
	public void update(Event event, boolean start) {
		if(start == false) {
			if(!availableShockRooms.contains(this)) {
				availableShockRooms.add(this);
			}
		}	
	}
}
