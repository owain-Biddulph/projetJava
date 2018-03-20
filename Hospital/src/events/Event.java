package events;

import java.util.*;


import core.Observable;
import core.Observer;
import core.Simulator;
import person.Patient;
import room.Room;
import room.WaitingRoom;

public abstract class Event implements Observable {
	
	protected Room endRoom = WaitingRoom.getInstance();
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
	public void setNextStep(String event) {
		this.nextStep = event;
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
	
	//the 2 next methods start and finish (or execute) an event
	public void startEvent() {
		this.notifyObservers(true);
		Simulator.globalClock = this.startTime;
	}
	
	public void execute() {
		this.notifyObservers(false);
		Simulator.globalClock = this.endTime;
	}
	

	
	public int getDuration() {
		return(endTime-startTime);
	}
	
	
	
	
//##################### Observer methods ######################
	@Override
	public void notifyObservers(boolean start) {
		for(Observer o:observerList) {
			o.update(this, start);
		}
	}
	
	public Room getEndRoom() {
		return(endRoom);
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
