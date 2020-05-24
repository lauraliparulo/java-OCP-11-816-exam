package de.demo.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test {

	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("o.ser");
		
		Member member = new Member ("john",1);
		
		var oos = new ObjectOutputStream(new FileOutputStream(file));
		
		oos.writeObject(member);
		
		var ois = new ObjectInputStream(new FileInputStream(file));
		
//		Person person = (Person) ois.readObject();
		
		Member member2 = (Member) ois.readObject();
		
//		System.out.println(person.name); //EOF exception if readobject already invoked
		System.out.println(member2.id);
	}

}


class Person implements Serializable {
	
	protected String name;
	
	protected Person(String name) {
		
		this.name = name;
	}
}

class Member extends Person {
	
	public int id ;
	
	public Member (String name, int id) {
		super(name);
		this.id = id;
	}
}