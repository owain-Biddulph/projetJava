package core;

import java.util.ArrayList;

public class MRIRoom extends Room {
	private static ArrayList<MRIRoom> availableMRIRooms = new ArrayList<MRIRoom>();
	
	
	public static MRIRoom deQueue() {
		//gets the next available nurse
		return availableMRIRooms.remove(0);
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
