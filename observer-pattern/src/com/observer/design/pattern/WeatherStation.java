package com.observer.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
	
	/**
	 * The below 2 fields are the information that each observer is interested in. Whenever a value of any
	 * of these 2 changes then all the observers should be notified.
	 */
	int temperature;
	int pressure;
	
	
	// List of observers to this weather station
	List<Observer> observerList;
	
	public WeatherStation() {
		this.observerList = new ArrayList();
	}

	@Override
	public void addObserver(Observer observer) {
		// this method is called whenever a new observer instance is created for this particular(WeatherStation) subject.
		this.observerList.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observerList.remove(observer);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer observer: observerList) {
			observer.update(temperature, pressure);
		}
		
	}
	
	public void setTemperature(int temperature) {
		this.temperature = temperature;
		this.notifyObserver();
	}
	
	public void setPressure(int pressure) {
		this.pressure = pressure;
		this.notifyObserver();
	}

}
