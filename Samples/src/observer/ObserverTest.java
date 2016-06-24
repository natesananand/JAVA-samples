package observer;

public class ObserverTest {
	
	public static void main(String args[]){
		
	

	
	Observer ob1=new Dinakaran(12);
	Observer ob2=new DailyThanthi(13);
	Weather weather=new Weather();
	weather.registerObserver(ob1);
	weather.registerObserver(ob2);
	
	weather.notifyObserver(20);
	
	Dinakaran dk=(Dinakaran)weather.observerList.get(0);
	System.out.println(dk.getTemp());
	DailyThanthi dt=(DailyThanthi)weather.observerList.get(1);
	System.out.println(dt.getTemp());
	
	
}
}
