package room;
import java.util.*;

import events.Event;
import ressources.XRayScanner;

public class RadiographyRoom extends Room {
	private XRayScanner scanner;
	private static ArrayList<RadiographyRoom> availableRadiographyRooms = new ArrayList<RadiographyRoom>();
	
	public ArrayList<RadiographyRoom> getQueue(){
		return(availableRadiographyRooms);
	}

	
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
			if(!availableRadiographyRooms.contains(this)) {
				availableRadiographyRooms.add(this);
			}			
		}	
	}
}
