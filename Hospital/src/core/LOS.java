package core;

import java.util.*;

public class LOS extends KPI {
	private static List<Integer> lengths = new ArrayList<Integer>();
	
	public static int averageLOS() {
		int average = 0;
		for(int i : lengths) {
			average += i;
		}
		return average /= lengths.size();
	}
	
	public static void addLOS(int i) {
		LOS.lengths.add(i);
	}
}
