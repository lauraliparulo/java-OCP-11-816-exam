package de.demo.streams;

import java.util.List;
import java.util.stream.Stream;

public interface Test7 {

	public static void main(String[] args) {
		List<Integer> integers = List.of(0,1,2,3);
		
		integers.stream().limit(2).peek(System.out::println).forEach(i->{});
		
		List l1 = List.of("a","b");
		List l2 = List.of(1,2);
		Stream.of(l1,l2).flatMap(Stream::of).forEach(System.out::print);
		
	}
}
