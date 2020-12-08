package com.template.design.pattern;

public class Laptop extends Product {

	@Override
	public void addToCard() {
		System.out.println("Adding Laptop to cart");
		
	}

	@Override
	public void proceedToCheckout() {
		System.out.println("Proceeding Laptop to checkout");
		
	}

}
