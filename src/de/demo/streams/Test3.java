package de.demo.streams;

import java.util.List;
import java.util.Optional;

public class Test3 {

	public static void main(String[] args) {
//		int sum = Stream.of(-1,-2).filter( i -> i> 0)
//				  .map( i -> 0 -i)
//				  .mapToInt(i -> i)
//				  .sum();
//		System.out.println(sum);
//		
//		
//		Stream stream = Stream.of("A","B");
//		
//		String[] output = (String[]) stream.toArray(String[]::new);
//		
//		System.out.println(Arrays.toString(output));
//		
		
		List<Integer> list = List.of(1,4,5,6);
		boolean result =  list.stream().noneMatch(i -> i%2 == 1);
		System.out.println(result);
		
	}
	
}

