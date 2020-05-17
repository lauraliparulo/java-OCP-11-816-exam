package de.demo.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class TestBi {

	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,4);
		
		BiPredicate<Integer,Integer> p = (i,j) -> i%j == 0;
		
		BiFunction<List<Integer>, Integer, List<Integer>> f = (l1,j) -> {
		
			List<Integer> l2 = new ArrayList<>();
			for (int i : l1) {
				if (p.test(i,j)) {
					l2.add(i/j);
				}
			}
			
			
			return l2;
			
		};
		
		System.out.println(f.apply(list,3));
		
	}
}
