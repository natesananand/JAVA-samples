package observer;

import java.util.ArrayList;
import java.util.List;

public class Weather implements Subject {
	
	List<Observer> observerList=new ArrayList();

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
		
	}

	@Override
	public void notifyObserver(int temp) {
		
		for(Observer ob: observerList){
			ob.update(temp);
		}
		
		
	}
	

		
	

	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);
		// TODO Auto-generated method stub
		
	}

}
