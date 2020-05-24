package de.demo.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Test {

	
	public static void main(String[] args) {
		
		List l1 = new ArrayList<>(List.of("a","b"));
		
		List l2 = new ArrayList<>(Collections.singletonList("e"));
		
		Collections.copy(l1, l2);
		
		l2.set(0,"d");
		
		System.out.println(l1);
		
	}
}
