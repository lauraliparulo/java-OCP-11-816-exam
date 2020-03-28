package de.demo.streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestWithStreamsCollectorsToMap {

	private static final int AGE_TRESHHOLD = 35;

	public static void main(String[] args) {

		
		Person p1 = new Person("laura", "liparulo", "frankfurt", "Hessen", 36);
		Person p2 = new Person("christine", "müller", "frankfurt", "Hessen", 42);
		Person p3 = new Person("anna", "müller", "Darmstadt", "Hessen", 42);
		Person p4 = new Person("michael", "meyer", "bonn", "Nordrhein Westfahlen", 16);
		Person p5 = new Person("michael", "schwarz", "köln", "Nordrhein Westfahlen", 37);
		Person p6 = new Person("michael", "braun", "köln", "Nordrhein Westfahlen", 17);

		Supplier<Stream<Person>> streamSupplier = () -> Stream.of(p1, p2, p3, p4, p5, p6);
		
//		streamSupplier.get().collect(Collectors.toMap(keyMapper, valueMapper))

	}
}
