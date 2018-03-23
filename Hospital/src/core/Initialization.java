package core;

import person.*;
import ressources.*;
import room.*;

public class Initialization {
	
	public static void createRessources() {
		for(int i = 0; i<= Variables.BloodTestLaboratory.getNumber(); i++) {
			BloodTestLaboratory.getQueue().add(new BloodTestLaboratory());
		}
		
		for(int i = 0; i<= Variables.MRIRoom.getNumber(); i++) {
			MRIRoom.getQueue().add(new MRIRoom());
		}
		
		for(int i = 0; i<= Variables.BoxRoom.getNumber(); i++) {
			BoxRoom.getQueue().add(new BoxRoom());
		}
		
		for(int i = 0; i<= Variables.ShockRoom.getNumber(); i++) {
			ShockRoom.getQueue().add(new ShockRoom());
		}
		
		for(int i = 0; i<= Variables.Stretcher.getNumber(); i++) {
			Stretcher.getQueue().add(new Stretcher());
		}
		
		for(int i = 0; i<= Variables.Wheelchair.getNumber(); i++) {
			Wheelchair.getQueue().add(new Wheelchair());
		}
		
		for(int i = 0; i<= Variables.XRayScanner.getNumber(); i++) {
			XRayScanner.getQueue().add(new XRayScanner());
		}
		
		for(int i = 0; i<= Variables.Nurse.getNumber(); i++) {
			Nurse.getQueue().add(new Nurse());
		}
		
		for(int i = 0; i<= Variables.Physician.getNumber(); i++) {
			Physician.getQueue().add(new Physician());
		}
		
		for(int i = 0; i<= Variables.Transporter.getNumber(); i++) {
			Transporter.getQueue().add(new Transporter());
		}
		
	}
}
