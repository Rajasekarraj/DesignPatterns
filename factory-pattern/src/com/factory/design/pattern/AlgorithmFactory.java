package com.factory.design.pattern;

public class AlgorithmFactory {
	
	public static final int INSERTION_SORT = 0;
	public static final int BUBBLE_SORT = 1;
	
	public Algorithm getAlgorithm(int algorithm) {
		switch(algorithm) {
		case INSERTION_SORT:
			return new InsertionSort();
		case BUBBLE_SORT:
			return new BubbleSort();
		default:
			return null;
		}
	}

}
