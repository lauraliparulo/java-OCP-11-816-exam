package de.demo.io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {
	
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeObject(name.toUpperCase());
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
	}
	
}
