package de.demo.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		File file = new File("file.tmp");	
		Person in = new Person("John", "Oxford Street");
		
		var oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(in);
		
		
		
		var ois = new ObjectInputStream(new FileInputStream(file));
		Person out = (Person) ois.readObject();
		
		System.out.println(out.name + "lives at "+out.address.street);

	}

}
