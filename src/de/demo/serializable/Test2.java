package de.demo.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		String fileName = "test.ser";
		
		C input = new C();  //PRINTs  ABC
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
				){
			oos.writeObject(input);
			ois.readObject(); //print A
		}
		
	}
	
}

class A {
	A() {
		System.out.println("A");
	}
	
}

class B extends A implements Serializable {
	
	B() {
		System.out.println("B");
	}
}

class C extends B {
	C() {
		System.out.println("C");
	}
	
}

