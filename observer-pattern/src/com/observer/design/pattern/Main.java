package com.observer.design.pattern;

public class Main {

	
	/**
	 * Observer Pattern.
	 * It is typically a Subscriber Consumer Model.
	 * 
	 * Whenever two object depends on each other, it is a best practice to make them LOOSELY COUPLED.
	 * We can achieve loose coupling, by creating interfaces/abstract classes in java.
	 * In this following example, we have a publisher(Weather Station who publishes their temperature and pressure datas).
	 * On each publication of it, we need to update all its observer about the latest data of temperature and pressure.
	 * We have achieved the above scenario in this code below.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Publisher Instance
		WeatherStation weatherStation = new WeatherStation();
		// Subscriber Instance(Inside parameter we passed the publisher instance)
		WeatherObserver weatherObserver = new WeatherObserver(weatherStation);
		
		// With the above structure we can implement any number of OBSERVER and PUBLISHER.
		// Inside observer instance creation we need to pass the publisher(it can be 4 to 5 publisher in future.so its better to have this way like to accept the publisher instance)
		
		// The CODE now is open for implementation(both the observer and publisher)
		
		weatherStation.setTemperature(100);
		weatherStation.setPressure(27);

	}

}
