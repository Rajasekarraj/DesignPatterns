package com.template.design.pattern;

public abstract class Product {
	public abstract void addToCard();
	public abstract void proceedToCheckout();
	
	/**
	 * Shopping usually happens in sequence, so we create a template for it, and invoked it from Main application.
	 */
	public void exploreShopping() {
		addToCard();
		proceedToCheckout();
	}

}
