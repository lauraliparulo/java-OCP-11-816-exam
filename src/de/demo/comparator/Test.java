package de.demo.comparator;

import java.util.List;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
	
		Data d1 = new Data(2);
		Data d2 = new Data(3);
		Data d3 = new Data(1);

		TreeSet<Data> set = new TreeSet<>(d3);
		
		set.addAll(List.of(d1,d2,d3));
		
		System.out.println(set.higher(d1).number);
		
		
		
	}

}
