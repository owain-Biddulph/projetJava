package core;

import java.util.*;

import events.Event;
import room.Room;

public class BloodTestLaboratory extends Room {
	private static ArrayList<BloodTestLaboratory> availableBloodTestLaboratories = new ArrayList<BloodTestLaboratory>();
	
		
	public static BloodTestLaboratory deQueue() {
		//gets the next available nurse
		return availableBloodTestLaboratories.remove(0);
	}
	public static boolean available() {
		return(! availableBloodTestLaboratories.isEmpty());
	}
	
	public BloodTestLaboratory () {
		
	}
	
	@Override
	public void update(Event event, boolean start) {
		if(start == false) {
			availableBloodTestLaboratories.add(this);
		}	
	}
}
