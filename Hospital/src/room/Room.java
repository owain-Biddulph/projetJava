package room;
import java.util.*;

import core.Variables;
import core.Observer;
import person.Patient;
import ressources.NonHumanResource;
//TODO faire la création d'une multitude de chambres, (que l'utilisateur peut régler)
public abstract class Room extends NonHumanResource implements Observer{
	private int number;
	
	protected int size;
	private List<Patient> occupants = new ArrayList<Patient>();
	
	
	public void addPatient(Patient patient) {this.occupants.add(patient);}
	public void removePatient(Patient patient) {this.occupants.remove(patient);}
	
	public int getNumber() {return number;}
	public void setNumber(int number) {this.number = number;}
	public int getSize() {return size;}
	public void setSize(int size) {this.size = size;}
	public List<Patient> getOccupants() {return occupants;}
	public void setOccupants(List<Patient> occupants) {this.occupants = occupants;}
	
	@Override
	public String toString() {
		return "Room [number=" + number + "]";
	}
	
	
}
