package com.iterator.design.pattern;

public class String1DArrayIterator implements Iterator {
	
	String[] stringArray;
	int index;
	
	public String1DArrayIterator(String[] stringArray) {
		this.stringArray = stringArray;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < stringArray.length) 
			return true;
		return false;
	}

	@Override
	public Object next() {
		if (hasNext()) {
			return stringArray[index++];
		}
		return null;
	}

}
