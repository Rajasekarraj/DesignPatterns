package com.template.design.pattern;

public class WashingMachine extends Product {

	@Override
	public void addToCard() {
		System.out.println("Adding WashinMachine to cart");
		
	}

	@Override
	public void proceedToCheckout() {
		System.out.println("Checking out Washing Machine");
		
	}

}
