package de.demo.collections;

import java.util.ArrayList;
import java.util.List;

public class TestListGeneric {

	public static void main(String[] args) {
		List<? super B> l1 = new ArrayList<>();
		List<? extends B> l2 = new ArrayList<>();
		
		
		//l1 type of B or any supertype
		l1.add(new C());
		l1.add(new B());
		
//		l1.add(new A());
		
		
		//l2 type of supertype of B
//		l2.add(new C());
//		l2.add(new B());
//		l2.add(new A());
		
	}
	
}

class A{}
class B extends A{}
class C extends B{}

