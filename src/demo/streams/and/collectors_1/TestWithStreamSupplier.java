package demo.streams.and.collectors_1;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestWithStreamSupplier {

	public static void main(String[] args) {

		Person p1 = new Person("laura", "liparulo", "frankfurt", "Hessen", 36);
		Person p2 = new Person("christine", "müller", "frankfurt", "Hessen", 42);
		Person p3 = new Person("anna", "müller", "Darmstadt", "Hessen", 42);
		Person p4 = new Person("michael", "meyer", "bonn", "Nordrhein Westfahlen", 52);
		Person p5 = new Person("michael", "schwarz", "köln", "Nordrhein Westfahlen", 32);

		Supplier<Stream<Person>> streamSupplier = () -> Stream.of(p1, p2, p3, p4, p5);
		
	

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

	}
}
