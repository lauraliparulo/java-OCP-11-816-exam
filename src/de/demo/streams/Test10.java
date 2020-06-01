package de.demo.streams;

import java.util.List;

public class Test10 {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2);
		
		int i = list.stream().reduce(1,  Integer::sum, Integer::sum);
		
		System.out.println(i);
		
	}

}
