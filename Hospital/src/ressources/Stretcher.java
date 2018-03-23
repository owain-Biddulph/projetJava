package ressources;

import java.util.ArrayList;

public class Stretcher extends Equipment {
	private static ArrayList<Equipment> queue = new ArrayList<Equipment>();
	
	public static ArrayList<Equipment> getQueue() {
		return queue;
	}
}
