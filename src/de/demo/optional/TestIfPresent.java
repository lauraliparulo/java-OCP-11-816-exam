package de.demo.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class TestIfPresent {

	private static Optional<String> findCustomer(final String customerId) {
		System.out.println("find customer(" + customerId + ")");

		final Stream<String> customers = Stream.of("Tim", "Tom", "Mike", "Andy");

		if (customers.anyMatch(name -> name.contains(customerId))) {
			return Optional.of(customerId);
		}

		return Optional.empty();
	}

	public static void main(String[] args) {

		// ifPresent(<Consumer<? super T>)
		findCustomer("Tim").ifPresent(System.out::println);

		String UNKNOWN = "UNKNOWN";
		
		// ifPresent(<Consumer<? super T>, Runnable)
		findCustomer("UNKNOWN").ifPresentOrElse(System.out::println,
				() -> System.out.println(String.format("%s not found", UNKNOWN)));

		// this throws NoSuchElementException
		Optional<String> foundCustomer = findCustomer("John");

		System.out.println(foundCustomer.get());
	}
}
