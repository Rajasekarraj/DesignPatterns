package com.facade.design.pattern;

public class AlgorithmHandler {
	
	private Algorithm bubbleSort;
	private Algorithm mergeSort;
	private Algorithm quickSort;

	public AlgorithmHandler() {
		this.bubbleSort = new BubbleSort();
		this.mergeSort = new MergeSort();
		this.quickSort = new QuickSort();
	}
	
	public void doBubbleSort() {
		this.bubbleSort.solve();
	}
	
	public void doMergeSort() {
		this.mergeSort.solve();
	}
	
	public void doQuickSort() {
		this.quickSort.solve();
	}
}
