package com.visitor.design.pattern;

public class ShoppingCart implements ShoppingCartVisitor {

	@Override
	public double getPrice(Table table) {
		return table.getPrice();
	}

	@Override
	public double getPrice(Chair chair) {
		return chair.getPrice();
	}

}
