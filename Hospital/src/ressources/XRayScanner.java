package ressources;

import java.util.*;

import events.XRay;
import person.Patient;

public class XRayScanner extends Equipment {
	//private static List<XRayScanner> xRayScanners = new ArrayList<XRayScanner>();
	private static String probabilityDistribution;
	private static ArrayList<Equipment> queue = new ArrayList<Equipment>();
	
	public static ArrayList<Equipment> getQueue() {
		return queue;
	}
	

	public void use(Patient patient) {
		new XRay(patient);
		
	}
}
