package core;

import java.util.ArrayList;

public class Transporter extends Person implements HumanResource {
	private static ArrayList<Transporter> availableTransporters = new ArrayList<Transporter>();
	
		
	public static Transporter deQueue() {
		//gets the next available nurse
		return availableTransporters.remove(0);
	}
	public static boolean available() {
		return(! availableTransporters.isEmpty());
	}

	private boolean available;

	@Override
	public void update(Event event, Boolean True) {
		if(this.available == true) {this.available = false;}
		else	 {this.available = false;}
		
	}
	@Override
	public void update(Event event) {
		// TODO Auto-generated method stub
		
	}
}
