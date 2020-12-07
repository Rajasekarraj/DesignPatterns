package com.observer.design.pattern;

public class WeatherObserver implements Observer {
	
	int temperature;
	int pressure;
	
	// Subject that the current observer is interested in(in this case it is WeatherStation)
	private Subject subject;
	
	WeatherObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update(int temperature, int pressure) {
		this.temperature = temperature;
		this.pressure = pressure;
		// simply output the subscribed values to console.
		this.printData();
		
	}

	private void printData() {
		System.out.println("Temperature is:" + this.temperature + " Pressure is: " + this.pressure);
		
	}

}
