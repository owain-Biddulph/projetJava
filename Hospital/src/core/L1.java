package core;

public class L1 implements SeverityLevel {

	public int getNextArrivalTime() {
		return Variables.L1.getTime();
	}

	@Override
	public String toString() {
		return "L1";
	}
	
}
