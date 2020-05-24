package de.demo.streams.collectors;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestWithCollectors {

	public static void main(String[] args) {
		List l1 = List.of(1);
		List l2 = List.of(1,2);
		List l3 = List.of(2,3);
		List l4 = List.of(3,4,5);
		Collection result = Stream.of(l1,l2,l3,l4).collect(Collectors.groupingBy(List::size, Collectors.counting()))
				.values();
		
		
		List list = List.of("a","b","cd","ed","ghij");
		Map data = (Map) list.stream().collect(Collectors.groupingBy(String::length, Collectors.joining()));
		
		System.out.println(data.values());
	}
}
