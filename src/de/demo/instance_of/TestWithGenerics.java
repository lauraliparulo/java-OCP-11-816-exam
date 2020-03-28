package de.demo.instance_of;

import java.util.ArrayList;
import java.util.List;

public class TestWithGenerics {

	public static void main(String[] args) {
		m(new ArrayList<Integer>());
	}
	
	
	public static <E> void m(List<E> list) {
		
		/*
		 * 
		 * this leads to compile-time error
		if (list instanceof ArrayList<Integer>) {
			System.out.println("Instance of Integer!");
		}
		
		*/
		
		if (list instanceof ArrayList<?>) {
			System.out.println("Instance of arraylist!");
		}
		
	}
}
