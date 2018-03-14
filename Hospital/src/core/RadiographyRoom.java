package core;
import java.util.*;

public class RadiographyRoom extends Room {
	private XRayScanner scanner;
	private static ArrayList<RadiographyRoom> availableRadiographyRooms = new ArrayList<RadiographyRoom>();
	
		
	public static RadiographyRoom deQueue() {
		//gets the next available nurse
		return availableRadiographyRooms.remove(0);
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
