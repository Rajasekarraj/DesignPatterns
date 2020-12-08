package com.visitor.design.pattern;

public interface ShoppingCartVisitor {
	
	public double getPrice(Table table);
	
	public double getPrice(Chair chair);

}
