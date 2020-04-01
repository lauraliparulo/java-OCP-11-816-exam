package de.demo.streams.consumers;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import de.demo.streams.collectors.Person;

public class TestConsumer {

	public static void main(String[] args) {
		
		Person john = new Person("john",30);
		Person jane = new Person("Jane",20);
		
		Map<Object, Object> people = Stream.of(john,jane).collect(Collectors.toMap(p -> p.firstName,  p -> p.age));
		
		BiConsumer<? super Object, ? super Object> consumer = (s,i) -> {
			if ((Integer) i>25)
				System.out.println(s);
		};
		
		

		people.forEach(consumer);
		
		
		
		
	}
	
}
