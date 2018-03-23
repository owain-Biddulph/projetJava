package room;

import java.util.*;

import core.Variables;
import events.Event;

public class BloodTestLaboratory extends Room {
	private static ArrayList<BloodTestLaboratory> availableBloodTestLaboratories = new ArrayList<BloodTestLaboratory>();
	
	public static ArrayList<BloodTestLaboratory> getQueue(){
		return(availableBloodTestLaboratories);
	}
	public static BloodTestLaboratory deQueue() {
		//gets the next available nurse
		return availableBloodTestLaboratories.remove(0);
	}
	public static boolean available() {
		return(! availableBloodTestLaboratories.isEmpty());
	}
	
	public BloodTestLaboratory() {
		this.size = Variables.BloodTestLaboratory.getSize();
	}
	
	@Override
	public void update(Event event, boolean start) {
		if(start == false) {
			if(!availableBloodTestLaboratories.contains(this)) {
			availableBloodTestLaboratories.add(this);}
		}	
	}
}
