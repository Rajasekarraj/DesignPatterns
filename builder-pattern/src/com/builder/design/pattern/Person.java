package com.builder.design.pattern;

public class Person {
	
	private String name;
	private int age;
	private String address;
	private String favouriteSport;
	
	private Person(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.address = builder.address;
		this.favouriteSport = builder.favouriteSport;
	}
	
	public static class Builder {
		private final String name;
		private final int age;
		private String address;
		private String favouriteSport;
		
		Builder(String name, int age) {
			this.name = name;
			this.age=age;
		}
		
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Builder setFavouriteSport(String favouriteSport) {
			this.favouriteSport = favouriteSport;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
		
	}
	
	@Override
	public String toString() {
		return this.name+"--"+this.age+"--"+this.address+"--"+this.favouriteSport;
	}

}
