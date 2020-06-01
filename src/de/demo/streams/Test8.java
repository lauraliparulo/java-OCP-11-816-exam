package de.demo.streams;

import java.util.List;

public class Test8 {

	
	public static void main(String[] args) {
		List<Integer> integers = List.of(0,1,2,3);
		
		integers.stream().peek( i -> {
			if (i%2 != 0) System.out.println(i);
		}).forEach(i -> {
			if (i%2 == 0) System.out.println(i);
		});
	}
}
