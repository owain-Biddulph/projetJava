package core;

public class WaitingRoom extends Room{
	public static WaitingRoom instance = null;
	
	private WaitingRoom() {}
	
	public static WaitingRoom getInstance() {
		if(instance == null) {
			instance = new WaitingRoom();
		}
		return instance;
	}
}
