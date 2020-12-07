package com.strategy.design.pattern;

public class Main {

	public static void main(String[] args) {
		// At runtime we can change the behaviour from Add to Multiply or other implementation.
		// Instead of defining it during runtime, we have created interface and determined the instance during
		Handler handler = new Handler(new Add());
		handler.operation(2, 4);

	}

}
