package core;

public class L2 implements SeverityLevel{
	
	public int getNextArrivalTime() {
		return Variables.L2.getTime();
	}
	@Override
	public String toString() {
		return "L2";
	}
}
