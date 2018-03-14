package core;

import java.util.ArrayList;

public class BoxRoom extends Room {
	private static ArrayList<ShockRoom> availableBoxRooms = new ArrayList<ShockRoom>();
	
	public static Room deQueue() {
		return availableBoxRooms.remove(0);
	}

	@Override
	public void update(Event event, Boolean True) {
		// TODO Auto-generated method stub
		
	}
}