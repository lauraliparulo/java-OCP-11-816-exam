package de.demo.files;

import java.io.Serializable;

public class Person implements Serializable{

	String name;
	Address address;

	public Person(String name, String street) {
		this.name = name;
		this.address = new Address(street);
	}	
}