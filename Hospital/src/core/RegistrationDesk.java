package core;

import events.Event;
import person.Patient;

public class RegistrationDesk implements Observer {
	private static RegistrationDesk instance = null;
	private Patient patient = null;
	private boolean available = true;
	
	private RegistrationDesk() {}
	
	public static RegistrationDesk getRegistrationDesk() {
		if(instance == null) {
			return(new RegistrationDesk());
		}
		else {return(instance);}
	}
	
	
	
	public boolean isAvailable() {return available;}

	public void setAvailable(boolean available) {this.available = available;}

	@Override
	public void update(Event event, boolean start) {
		if(start == true) {
			this.patient = event.getPatient();
			this.available = false;
		}
		else {
			this.patient = null;
			this.available = true;
		}
	}

}
