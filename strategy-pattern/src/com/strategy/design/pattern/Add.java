package com.strategy.design.pattern;

public class Add implements Strategy {

	@Override
	public void operation(int num1, int num2) {
		System.out.println("Addition of the numbers is:" + (num1 + num2));
		
	}

}
