package core;
import java.util.*;

public abstract class Room extends NonHumanResource implements Observer{
	private int number;
	private int size;
	private List<Patient> occupants = new ArrayList<Patient>();
	
	public void addPatient(Patient patient) {this.occupants.add(patient);}
	public void removePatient(Patient patient) {this.occupants.remove(patient);}
	
	public void update(Event event) {
		
	}
}
