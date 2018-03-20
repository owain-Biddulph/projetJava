package core;

import person.Patient;

public interface PatientPriorityStrategy {
	public boolean isMoreImportant(Patient p1, Patient p2);
}
