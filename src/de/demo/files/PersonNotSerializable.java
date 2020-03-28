package de.demo.files;

import java.io.Serializable;

public class PersonNotSerializable /* implements Serializable */{	

	String name;
	Address address;

	public PersonNotSerializable(String name, String street) {
		this.name = name;
		this.address = new Address(street);
	}	
}