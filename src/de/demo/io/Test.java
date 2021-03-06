package de.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("o.ser");
		Person in = new Person("John",20);
		var oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(in);
		
		
		var ois = new ObjectInputStream(new FileInputStream(file));
		Person out = (Person) ois.readObject();
		System.out.println(out.name + " is "+out.age);
	}
}
