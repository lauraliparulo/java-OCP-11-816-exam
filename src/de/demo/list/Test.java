package de.demo.list;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;



public class Test {

	public static void main(String[] args) {

		var l = new CopyOnWriteArrayList<>(List.of("a", "b"));
		
		Iterator iterator = l.iterator ();
		
		iterator.next();
	
//		iterator.remove();
		
		System.out.println(	iterator.next());
	}
	
}
