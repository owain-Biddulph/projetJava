package core;

public interface Observer {
	void update(Event event);

	void update(Event event, Boolean True);
}
