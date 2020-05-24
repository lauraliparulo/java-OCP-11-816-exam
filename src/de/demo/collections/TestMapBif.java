package de.demo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class TestMapBif {

	public static void main(String[] args) {
		
		Map people = new HashMap<>();
		
		people.put("john", new Student("John",43));
		people.put("jane", new Student("Jane",12));
		
		BiFunction biFunction = (x,y) -> y instanceof Student ? new Student((String) x,2) : new Student("hello",3);
		
		people.compute("jane", biFunction);
		
		Student john = (Student) people.get("john");
		Student jane = (Student) people.get("jane");
		
		System.out.println(john.id + " " + jane.id);		
		
	}
}

