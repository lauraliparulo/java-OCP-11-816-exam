package de.demo.supplier;

import java.util.function.Supplier;

import de.demo.streams.collectors.Person;

public class Test {
	
	public static void main(String[] args) {
//		Person person = new Person("laura");
		
		Supplier func = Person::new;
//		Person person = func.get();
//		System.out.println(person.getFirstName());
	}
	
}
