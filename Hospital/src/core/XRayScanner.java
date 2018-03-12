package core;

import java.util.*;

public class XRayScanner extends NonHumanResource {
	private static List<XRayScanner> xRayScanners = new ArrayList<XRayScanner>();
	private static String probabilityDistribution;

	public XRayScanner() {
		xRayScanners.add(this);
		this.available = true;
	}
	public int use(Patient patient) {
		XRay(patient);
		
	}
}
