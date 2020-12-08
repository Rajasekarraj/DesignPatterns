package com.visitor.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<ShoppingItem> shoppingItems = new ArrayList();
		
		shoppingItems.add(new Table("wooden", 50));
		shoppingItems.add(new Chair("Iron", 25));
		shoppingItems.add(new Chair("Iron", 25));
		
		ShoppingCartVisitor shoppingCartVisitor = new ShoppingCart();
		
		double sum = 0;
		
		for(ShoppingItem shoppingItem : shoppingItems) {
			sum = sum + shoppingItem.accept(shoppingCartVisitor);
		}
		
		System.out.println("Sum of all items is: " + sum);
		

	}

}
