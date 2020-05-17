package de.demo.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Test4 {

	
	public static void main(String[] args) {
		List<Integer> list = List.of(2,3);
		int i = list.parallelStream().reduce(1, Integer::sum, (i1,i2) -> i1*i2);
		System.out.println(i);
		
		
		Stream<Integer> stream = Stream.of(1,2,3,4);
		
	//	var sum1 = stream.mapToInt(x -> x).sum();
		
		var sum2 = stream.reduce(0,(x,y) -> x+y);
		
	//	System.out.println(sum1);
		System.out.println(sum2);
		
		
		Set<Integer> set = new HashSet<Integer>(List.of(2,1,4,2));
		
		set.stream().forEach(System.out::print);
		
	}


}
