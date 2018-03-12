package core;

public class EventFactory {
	public static Event createEvent(String event) {
		if(event == null){
			return null;
			}
		if(event.equalsIgnoreCase("Arrival")){
			return new Arrival();
		}
		return null;
	}
		
	public static Event createEvent(String event, Patient patient) {
		if(event.equalsIgnoreCase("Registration")){
			return new Registration(patient);
		}
		if(event.equalsIgnoreCase("Transportation")) {
			return new Transportation(patient);
		}
		if(event.equalsIgnoreCase("Consultation")) {
			return new Consultation(patient);
		}
		if(event.equalsIgnoreCase("Examination")) {
			return new Examination(patient);
		}
		return null;
	}
}
