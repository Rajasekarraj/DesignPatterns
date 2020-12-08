package com.visitor.design.pattern;

public interface ShoppingItem {
	
	public double accept(ShoppingCartVisitor shoppingCartVisitor);

}
