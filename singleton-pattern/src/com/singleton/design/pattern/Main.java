package com.singleton.design.pattern;

public class Main {

	public static void main(String[] args) {
		Hotel hotel1 = Hotel.getInstance();
		Hotel hotel2 = Hotel.getInstance();
		if (hotel1 == hotel2) {
			System.out.println("Both are same Instance");
		} else {
			System.out.println("Different");
		}
		
		hotel1.greeting();
		hotel2.greeting();

	}

}
