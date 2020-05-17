package de.demo.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class Test5 {
	
	public static void main(String[] args) {
		Data data = Stream.<Data>empty().findAny().
				or(()-> Optional.of(new Data(1)))
				.orElseGet(()-> new Data(2));
		System.out.println(data.number);
		
		
	}
	
}
