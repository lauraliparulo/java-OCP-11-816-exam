package de.demo.streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestTakeDrop {

	public static void main(String[] args) {
		

		final IntStream stream1 = IntStream.iterate(1, n -> n + 1);
	
		System.out.println("takeWhile: "
				+ stream1.takeWhile(n -> n < 10).mapToObj(Integer::toString).collect(Collectors.joining(", ")));
	
		final IntStream stream2 = IntStream.rangeClosed(7,14);
		
		System.out.println("dropWhile: "
				+ stream2.dropWhile(n -> n < 10).skip(1).mapToObj(Integer::toString).collect(Collectors.joining(", ")));

	}

}
