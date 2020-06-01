package de.demo.collections;

import java.util.List;
import java.util.ArrayList;

public class Test2 {

	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(0);
		l.add(null);
		l.add("dhsjhdsj");
		
		
		System.out.println(l.get(2));
		
	}
}
