package core;


import events.Arrival;
import events.BloodTest;
import events.Consultation;
import events.MRI;
import events.Registration;
import events.TransportationToConsultation;
import events.TransportationToExamination;
import events.XRay;
import person.Patient;

public class addToQueues {
	
	public static void add(Patient patient) {
		if(patient.getNextEvent().equalsIgnoreCase("Registration")){
			Registration.getQueue().add(patient);
			Patient.getWaitingPatients().add(patient);
		}
		if(patient.getNextEvent().equalsIgnoreCase("BloodTest")){
			BloodTest.getQueue().add(patient);
			Patient.getWaitingPatients().add(patient);
		}
		if(patient.getNextEvent().equalsIgnoreCase("Consultation")){
			Consultation.getQueue().add(patient);
			Patient.getWaitingPatients().add(patient);
		}
		if(patient.getNextEvent().equalsIgnoreCase("MRI")){
			MRI.getQueue().add(patient);
			Patient.getWaitingPatients().add(patient);
		}
		if(patient.getNextEvent().equalsIgnoreCase("TransportationToConsultation")){
			TransportationToConsultation.getQueue().add(patient);
			Patient.getWaitingPatients().add(patient);
		}
		if(patient.getNextEvent().equalsIgnoreCase("TransportationToExamination")){
			TransportationToExamination.getQueue().add(patient);
			Patient.getWaitingPatients().add(patient);
		}
		if(patient.getNextEvent().equalsIgnoreCase("XRay")){
			XRay.getQueue().add(patient);
			Patient.getWaitingPatients().add(patient);
		}
	}
}
