package core;

import java.util.ArrayList;

public class BoxRoom extends Room {
	private static ArrayList<BoxRoom> availableBoxRooms = new ArrayList<BoxRoom>();
	
	public static Room deQueue() {
		return availableBoxRooms.remove(0);
	}

	@Override
	public void update(Event event, boolean start) {
		if(start == false) {
			availableBoxRooms.add(this);
		}	
	}
}