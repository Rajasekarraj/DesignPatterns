package com.adapter.design.pattern;

public class Main {
	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle bus = new Bus();
		
		car.accelerate();
		bus.accelerate();
		
		Bicycle bicycle = new Bicycle();
		BicycleAdapter bicycleAdapter = new BicycleAdapter(bicycle);
		
		bicycleAdapter.accelerate();
	}
}
