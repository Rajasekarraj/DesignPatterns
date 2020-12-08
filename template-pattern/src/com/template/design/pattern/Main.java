package com.template.design.pattern;

public class Main {

	public static void main(String[] args) {
		
		// At runtime we are creating the instance
		Product product1 = new Laptop();
		product1.exploreShopping();
		
		
		// At runtime we are creating the instance
		Product product2 = new WashingMachine();
		product2.exploreShopping();
	}

}
