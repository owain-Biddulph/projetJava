package core;

public interface Observable {
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers(boolean start);
	

}
