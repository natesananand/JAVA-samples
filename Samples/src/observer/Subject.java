package observer;

public interface Subject {
	
	public void registerObserver(Observer observer);
	public void notifyObserver(int temp);
	
	public void removeObserver(Observer observer);
	
	
}
