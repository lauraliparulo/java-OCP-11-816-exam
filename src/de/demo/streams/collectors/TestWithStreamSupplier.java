package de.demo.streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestWithStreamSupplier {

	private static final int MINOR_TRESHHOLD = 18;

	public static void main(String[] args) {

		
		Person p1 = new Person("laura", "liparulo", "frankfurt", "Hessen", 36);
		Person p2 = new Person("christine", "müller", "frankfurt", "Hessen", 42);
		Person p3 = new Person("anna", "müller", "Darmstadt", "Hessen", 42);
		Person p4 = new Person("michael", "meyer", "bonn", "Nordrhein Westfahlen", 16);
		Person p5 = new Person("michael", "schwarz", "köln", "Nordrhein Westfahlen", 32);
		Person p6 = new Person("michael", "schwarz", "köln", "Nordrhein Westfahlen", 17);

		Supplier<Stream<Person>> streamSupplier = () -> Stream.of(p1, p2, p3, p4, p5, p6);
		

		Map<String, List<Person>> peopleByState = streamSupplier.get().collect(Collectors.groupingBy(Person::getState));


		Map<String, Map<String, List<Person>>> peopleByStateAndCity = streamSupplier.get()
				.collect(Collectors.groupingBy(Person::getState, Collectors.groupingBy(Person::getCity)));

		peopleByState.forEach((a, b) -> {
			System.out.println("how many people in " + a + "? " + b.size());

		});

		peopleByStateAndCity.forEach((a, b) -> {
			b.forEach((c, d) -> {
				System.out.println("how many people in " + c + "? " + d.size());

			});

		});

		System.out.println("Average age: " + streamSupplier.get().collect(Collectors.averagingInt(Person::getAge)));
		
		
		System.out.println("People under 18 years: "+streamSupplier.get().collect(Collectors.partitioningBy(p -> p.getAge()<= MINOR_TRESHHOLD)).size());
	

	}
}
