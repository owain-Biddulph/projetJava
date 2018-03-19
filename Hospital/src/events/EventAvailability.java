package events;

import core.Nurse;

public class EventAvailability {
	
	
	public static boolean isPossible(String s) {
		if(s.equals("Registration")) {
			return(Nurse.available());
		}
		
		else {return(false);}
	}
}
