package core;

public class L4 implements SeverityLevel{
	
	public int getNextArrivalTime() {
		return Variables.L4.getTime();
	}
	@Override
	public String toString() {
		return "L4";
	}
}
