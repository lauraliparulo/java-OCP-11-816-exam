package de.demo.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestData {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("o.ser");
		Data in = new Data();
		
		var oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(in);
		
		var ois = new ObjectInputStream(new FileInputStream(file));	
		Data out = (Data) ois.readObject();
		System.out.println(out.val1 + out.val2 + out.val3);
	
	}
	
}

