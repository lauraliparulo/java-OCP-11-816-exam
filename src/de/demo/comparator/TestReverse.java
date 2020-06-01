package de.demo.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TestReverse {

	public static void main(String[] args) {
		Comparator comparator = Comparator.reverseOrder();
		
		TreeSet<Integer> set = new TreeSet<>(comparator);
		
		set.addAll(List.of(2,4,1,3));
		
		set.pollLast();
		
		System.out.println(set.last());
	}
	
}
