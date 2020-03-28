package de.demo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 4, 6, 7, 8);

		boolean allEven = list.stream().allMatch(i -> {
			System.out.println(i);
			return i % 2 == 0;
			// with number 7 it evaluates to false and exit
		});

		System.out.println("----");
		
		Stream.of(1, 2, 3, 4).peek(i -> {
			if (i % 2 != 0)
				System.out.println(i);
		}).forEach( i -> System.out.println("element : "+i));
		//forEach is a terminaal operation
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.stream().forEach( i -> list.add(i++));
		//Throws UnsupportedOperationException as the list cannot be modified from the stream
		
	}
}
