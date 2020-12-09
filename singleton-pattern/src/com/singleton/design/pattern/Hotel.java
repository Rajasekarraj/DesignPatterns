package com.singleton.design.pattern;

public class Hotel {
	
	private static Hotel hotel = new Hotel();
	
	private Hotel() {
		
	}
	
	public void greeting() {
		System.out.println("Welcome to the hotel");
	}
	
	public static Hotel getInstance() {
		return hotel;
	}

}
