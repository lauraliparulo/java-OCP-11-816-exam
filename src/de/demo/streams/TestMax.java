package de.demo.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class TestMax {

	public static void main(String[] args) {

		Person mandy = new Person(25,"Mandy");
		Person zoey = new Person(20,"Zoey");
		Person alex = new Person(30, "Alex");
		Person mike = new Person(40, "JOhn");
		Optional<Person> person = Stream.of(mandy,zoey, alex, mike).max((p1,p2) -> p1.age + p2.age);
		System.out.println(person.get().name);
		
	}
	
}


