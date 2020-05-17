package de.demo.consumer;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {

		Person person = new Person("john");

		Consumer consumer = name -> System.out.print(name);
		Consumer consumer2 = (var p) -> System.out.println(p);

		consumer.accept(person);
		consumer2.accept(person);
	}
}

class Person {

	String name;

	Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
