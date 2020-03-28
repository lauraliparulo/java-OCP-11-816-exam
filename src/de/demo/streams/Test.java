package de.demo.streams;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2,4,6,7,8);
		
		boolean allEven = list.stream().allMatch(i-> {
			System.out.println(i);
			return i%2==0; 
			// with number 7 it evaluates to false and exit
		});
		
		
	}
}
