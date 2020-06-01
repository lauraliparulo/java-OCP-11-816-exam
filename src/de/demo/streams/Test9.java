package de.demo.streams;

import java.util.stream.Stream;

public class Test9 {

	public static void main(String[] args) {
		
		StringBuilder result = Stream.of("a","b").parallel()
				.collect(StringBuilder::new, StringBuilder::append, (a,b) -> b.append(a));
		
		System.out.println(result);
		
	}
	
}
