package core;

import events.Event;

public interface Observer {
	//void update(Event event);

	void update(Event event, boolean start);
}
