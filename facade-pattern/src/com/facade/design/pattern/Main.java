package com.facade.design.pattern;

public class Main {
	public static void main(String[] args) {
		AlgorithmHandler algorithmHandler = new AlgorithmHandler();
		algorithmHandler.doBubbleSort();
		algorithmHandler.doMergeSort();
		algorithmHandler.doQuickSort();
	}
}
