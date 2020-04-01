package de.demo.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class TestWithRunnable {

	public static void main(String[] args) {
		
		Stream.of(0).findAny().or(() -> Optional.of(1)).ifPresentOrElse(System.out::println, () -> System.out.println("ok"));

	}

}
