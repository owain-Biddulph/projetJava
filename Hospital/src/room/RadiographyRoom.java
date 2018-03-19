package room;
import java.util.*;

import core.XRayScanner;
import events.Event;

public class RadiographyRoom extends Room {
	private XRayScanner scanner;
	private static ArrayList<RadiographyRoom> availableRadiographyRooms = new ArrayList<RadiographyRoom>();
	
		
	public static Room deQueue() {
		RadiographyRoom room = availableRadiographyRooms.remove(0);
		if(room.getOccupants().size() < room.getSize() -1) {availableRadiographyRooms.add(room);}
		return room;
	}
	
	public static boolean available() {
		return(! availableRadiographyRooms.isEmpty());
	}
	
	public RadiographyRoom () {
		this.scanner = new XRayScanner();
	}
	@Override
	public void update(Event event, boolean start) {
		if(start == false) {
			availableRadiographyRooms.add(this);
		}	
	}
}
