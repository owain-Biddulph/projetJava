package core;

public class WaitTimePriority implements PatientComparator {
	//the priority is simply the waiting time in this strategy
	@Override
	public int compare(Patient o1, Patient o2) {
		if(o1.getExitTime()>o2.getExitTime()) {return 1;}
		if(o1.getExitTime()>o2.getExitTime()) {return -1;}
		else {return 0;}
	}

}
