package core;

public class IDGenerator {
	private static IDGenerator instance = null;
	private int nextID = 0;
	
	private IDGenerator() {}
	
	public static IDGenerator getIDGenerator() {
		if(instance == null) {
			instance = new IDGenerator();
		}
		return instance;
	}
	
	public int nextID() {
		return nextID++;
	}
}
