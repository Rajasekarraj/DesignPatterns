package com.factory.design.pattern;

public class Main {
	public static void main(String[] args) {
		AlgorithmFactory algorithmFactory = new AlgorithmFactory();
		algorithmFactory.getAlgorithm(AlgorithmFactory.BUBBLE_SORT).solve();
		algorithmFactory.getAlgorithm(AlgorithmFactory.INSERTION_SORT).solve();
	}
}
