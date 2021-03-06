package core;

import events.Arrival;
import events.BloodTest;
import events.Consultation;
import events.Event;
import events.MRI;
import events.Outcome;
import events.Registration;
import events.TransportationToConsultation;
import events.TransportationToExamination;
import events.XRay;
import person.Patient;

public class EventFactory {
		
	public static Event createEvent(String event, Patient patient) {
		if(event.equalsIgnoreCase("Arrival")){
			return new Arrival(patient);
		}
		if(event.equalsIgnoreCase("Registration")){
			return new Registration(patient);
		}
		if(event.equalsIgnoreCase("TransportationToConsultation")) {
			return new TransportationToConsultation(patient);
		}
		if(event.equalsIgnoreCase("Consultation")) {
			return new Consultation(patient);
		}
		if(event.equalsIgnoreCase("TransportationToCExamination")) {
			return new TransportationToExamination(patient);
		}
		if(event.equalsIgnoreCase("XRay")) {
			return new XRay(patient);
		}
		if(event.equalsIgnoreCase("BloodTest")) {
			return new BloodTest(patient);
		}
		if(event.equalsIgnoreCase("MRI")) {
			return new MRI(patient);
		}
		if(event.equalsIgnoreCase("Outcome")) {
			return new Outcome(patient);
		}
		return null;
	}
}
