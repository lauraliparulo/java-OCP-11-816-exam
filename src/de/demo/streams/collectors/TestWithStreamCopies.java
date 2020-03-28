package de.demo.streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestWithStreamCopies {

	public static void main(String[] args) {
		
		Person p1 = new Person("laura", "liparulo", "frankfurt", "Hessen", 36);
		Person p2 = new Person("christine", "müller", "frankfurt", "Hessen", 42);
		Person p3 = new Person("anna", "müller", "Darmstadt", "Hessen", 42);
		Person p4 = new Person("michael", "meyer", "bonn", "Nordrhein Westfahlen", 52);
		Person p5 = new Person("michael", "schwarz", "köln", "Nordrhein Westfahlen", 32);

		Stream<Person> streamOfPersons = Stream.of(p1, p2, p3, p4, p5);

		Map<String, List<Person>> peopleByState = streamOfPersons.collect(Collectors.groupingBy(Person::getState));

		Stream<Person> streamOfPersons2 = Stream.of(p1, p2, p3, p4, p5);

		Map<String, Map<String, List<Person>>> peopleByStateAndCity = streamOfPersons2
				.collect(Collectors.groupingBy(Person::getState, Collectors.groupingBy(Person::getCity)));

		peopleByState.forEach((a, b) -> {
			System.out.println("how many people in " + a + "? " + b.size());

		});

		peopleByStateAndCity.forEach((a, b) -> {
			b.forEach((c, d) -> {
				System.out.println("how many people in " + c + "? " + d.size());

			});

		});

		
		
	}
}
