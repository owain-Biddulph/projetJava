package core;

public class L5 implements SeverityLevel{
	
	public int getNextArrivalTime() {
		return Variables.L5.getTime();
	}
	@Override
	public String toString() {
		return "L5";
	}
}