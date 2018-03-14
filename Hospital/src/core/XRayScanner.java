package core;

import java.util.*;

public class XRayScanner extends NonHumanResource {
	private static List<XRayScanner> xRayScanners = new ArrayList<XRayScanner>();
	private static String probabilityDistribution;

	public XRayScanner() {
		xRayScanners.add(this);
	}
	public void use(Patient patient) {
		new XRay(patient);
		
	}
}
