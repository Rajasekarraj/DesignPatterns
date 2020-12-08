package com.iterator.design.pattern;

public class Main {

	public static void main(String[] args) {
		String[] myNames = {"Rajasekar", "Raja", "Sekar"};
		for(Iterator iterator = String1DArrayRepository.getString1DArrayIterator(myNames); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
		}

	}

}
