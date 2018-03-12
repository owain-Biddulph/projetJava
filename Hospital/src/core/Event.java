package core;

import java.util.*;

public abstract class Event implements Observable {

	protected int startTime;
	protected int endTime;
	protected int cost;
	protected Patient patient;
	protected String nextStep;
	private ArrayList<Observer> observerList = new ArrayList<Observer>();
	public static PriorityQueue<Patient> enabledEvents = new PriorityQueue<Patient>();
	
	public String getNextStep() {
		return(nextStep);
	}

	
//constructors###########################################################
	/*public Event(int startTime, Patient patient) {
		this.startTime = startTime;
		this.patient = patient;
	}	
	public Event(int startTime, int endTime, int cost, Patient patient) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.cost = cost;
		this.patient = patient;
	}*/
//no more constructors###################################################
	
	
	public void execute() {
		this.notifyObservers();
		Simulator.globalClock = this.endTime;
	}
	
	public int getDuration() {
		return(endTime-startTime);
	}
	


	
	
	
//##################### Observer methods ######################
	@Override
	public void notifyObservers() {
		for(Observer o:observerList) {
			o.update(this);
		}
	}
	
	@Override
	public void registerObserver(Observer observer) {
	observerList.add(observer);
	}
	
	@Override
	public void removeObserver(Observer observer) {
	observerList.remove(observer);
	}



	
//#################### getters####################################

	public int getStartTime() {
		return startTime;
	}
	
	
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	
	
	public int getEndTime() {
		return endTime;
	}
	
	
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	
	
	public int getCost() {
		return cost;
	}
	
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	public Patient getPatient() {
		return patient;
	}
	
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}
