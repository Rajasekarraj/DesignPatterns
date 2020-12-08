package com.iterator.design.pattern;

public class String1DArrayRepository {
	
	public static Iterator getString1DArrayIterator(String[] stringArray) {
		return new String1DArrayIterator(stringArray);
	}

}
