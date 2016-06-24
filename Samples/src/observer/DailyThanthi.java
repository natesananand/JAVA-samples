package observer;

public class DailyThanthi implements Observer {
	
	DailyThanthi(int temp){
		this.temp=temp;
	}
	
	int temp;

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	@Override
	public void update(int temp) {
		this.temp=temp;
		System.out.println("temp updated");
		
	}

}
