package events;
import core.*;

import person.Nurse;
import person.Patient;
import person.Physician;
import person.Transporter;
import room.BloodTestLaboratory;
import room.BoxRoom;
import room.MRIRoom;
import room.RadiographyRoom;
import room.ShockRoom;

public class EventAvailability {
	
	
	public static boolean isPossible(String s, Patient p) {
		if(s.equals("Registration")) {
			return(Nurse.available());
		}
		
		if(s.equals("TransportationToConsultation")) {
			boolean roomIsFree = false;
			if (p.getSeverityLevel() instanceof L1 || p.getSeverityLevel() instanceof L2) {
				roomIsFree = !ShockRoom.getQueue().isEmpty();
			}
			else {
				roomIsFree = !BoxRoom.getQueue().isEmpty();
			}
			//we add the physician's availibility because it would be weird to 
			//transport a patient to a room and have them wait there
			return(Transporter.available() && roomIsFree && Physician.available());
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
