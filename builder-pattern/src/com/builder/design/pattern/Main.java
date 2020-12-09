package com.builder.design.pattern;

public class Main {
	public static void main(String[] args) {

		Person person = new Person.Builder("RAJA", 23).setAddress("myaddress").setFavouriteSport("cricket").build();
		System.out.println(person);
	}
}
