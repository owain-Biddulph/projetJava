package core;

public interface PatientPriorityStrategy {
	public boolean isMoreImportant(Patient p1, Patient p2);
}
