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

	@Override
	public void update(Event event, Boolean True) {
		// TODO Auto-generated method stub
		
	}
}
