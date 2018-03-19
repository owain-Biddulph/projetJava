package room;
import java.util.*;

import core.NonHumanResource;
import core.Observer;
import core.Patient;

public abstract class Room extends NonHumanResource implements Observer{
	private int number;
	private int size;
	private List<Patient> occupants = new ArrayList<Patient>();
	
	public void addPatient(Patient patient) {this.occupants.add(patient);}
	public void removePatient(Patient patient) {this.occupants.remove(patient);}
	
	public int getNumber() {return number;}
	public void setNumber(int number) {this.number = number;}
	public int getSize() {return size;}
	public void setSize(int size) {this.size = size;}
	public List<Patient> getOccupants() {return occupants;}
	public void setOccupants(List<Patient> occupants) {this.occupants = occupants;}
	
}
