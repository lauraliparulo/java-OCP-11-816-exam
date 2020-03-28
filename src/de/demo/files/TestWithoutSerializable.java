package de.demo.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestWithoutSerializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		File file = new File("file.tmp");
		PersonNotSerializable in = new PersonNotSerializable("John", "Oxford Street");
		var oos = new ObjectOutputStream(new FileOutputStream(file));

		try {
			oos.writeObject(in);

			var ois = new ObjectInputStream(new FileInputStream(file));
			PersonNotSerializable out = (PersonNotSerializable) ois.readObject();

			System.out.println(out.name + "lives at " + out.address.street);

		} catch (NotSerializableException e) {
			System.err.println("The Person object is not serializable");
		}

	}

}
