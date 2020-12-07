package com.strategy.design.pattern;

public class Multiply implements Strategy {

	@Override
	public void operation(int num1, int num2) {
		System.out.println("Multiplication of the numbers is:" + num1 * num2);
		
	}

}
