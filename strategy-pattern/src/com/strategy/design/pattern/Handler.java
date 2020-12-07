package com.strategy.design.pattern;

public class Handler implements Strategy {
	
	private Strategy strategy;
	
	Handler(Strategy strategy) {
		this.strategy = strategy;
	}

	@Override
	public void operation(int num1, int num2) {
		this.strategy.operation(num1, num2);
	}

}
