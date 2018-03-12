package core;

import java.util.ArrayList;

public class ShockRoom extends Room{
	private static ArrayList<ShockRoom> availableShockRooms = new ArrayList<ShockRoom>();
	
	public static Room deQueue() {
		return availableShockRooms.remove(0);
	}
}
