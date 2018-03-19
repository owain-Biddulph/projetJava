package core;

import java.util.ArrayList;
import java.util.List;

public class DTDT extends KPI {
private static List<Integer> lengths = new ArrayList<Integer>();
	
	public static int averageDTDT() {
		int average = 0;
		for(int i : lengths) {
			average += i;
		}
		return average /= lengths.size();
	}
	
	public static void addDTDT(int i) {
		DTDT.lengths.add(i);
	}
}
