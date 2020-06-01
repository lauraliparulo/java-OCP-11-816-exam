package de.demo.function;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestBinary {

	static int calculate(List list, int seed, BinaryOperator func) {
		
		if(list.isEmpty()) {
			return seed;
		}
		int result = seed;
//		
//		for (Integer integer: list) {
//			result = (int) func.apply(result, integer);
//		}
		return result;
		
		
		
	}
	
	public static void main(String[] args) {
		List<Integer> integers = List.of(1,2,3,4);
		
//		int result = calculate(integers, 0, (( i1, i2) ->  i1 *  i2));
//		
//		System.out.println(result);
		
		
		
	}

	
}
