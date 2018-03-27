import java.util.ArrayList;

public abstract class Subject {
	
	ArrayList<Observer> subscribers = new ArrayList<Observer>();
	
	//Method to allow observers to subscribe
	public void attach(Observer subscriber) {
		subscribers.add(subscriber);
	}
	
	//Method to allow observers to unsubscribe
	public void detach(Observer subscriber) {
		subscribers.remove(subscriber);
	}
	
	//Method to notify observers
	public void notifyObservers() {
		for (Observer subscriber: subscribers) {
			subscriber.update();
		}
	}
	
	//Method to set state
	public abstract void setState(String news);
	
	//Method to get state
	public abstract String getState();

}
