package events;

import person.Nurse;
import person.Physician;
import person.Transporter;
import room.BloodTestLaboratory;
import room.MRIRoom;
import room.RadiographyRoom;

public class EventAvailability {
	
	// TODO populate 
	
	public static boolean isPossible(String s) {
		if(s.equals("Registration")) {
			return(Nurse.available());
		}
		
		if(s.equals("TransportationToConsultation")) {
			return(Transporter.available());
		}
		if(s.equals("Consultation")) {
			return(Physician.available());
		}
		if(s.equals("TransportationToExamination")) {
			return(Transporter.available());
		}
		if(s.equals("XRay")) {
			return(Physician.available() && RadiographyRoom.available());
		}
		if(s.equals("MRI")) {
			return(Physician.available() && MRIRoom.available());
		}
		if(s.equals("BloodTest")) {
			return(Nurse.available() && BloodTestLaboratory.available());
		}
		if(s.equals("Outcome")) {
			return(true);
		}

		
		else {return(false);}
	}
}
