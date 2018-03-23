package core;

public class L3 implements SeverityLevel{
	
	public int getNextArrivalTime() {
		return Variables.L3.getTime();
	}
	@Override
	public String toString() {
		return "L3";
	}
}
