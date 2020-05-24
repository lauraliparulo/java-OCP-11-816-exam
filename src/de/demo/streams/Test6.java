package de.demo.streams;

import java.util.stream.Stream;

public class Test6 {

	static Person getPerson(){
		
		throw new RuntimeException();
	
	}	
	
	public static void main(String[] args) {
		
		Person p1 = new Person("John");
		
		Person p2 = new Person("Jane");
		
	//	Person p3 = Stream.of(p1,p2).findAny().orElse(getPerson());
		
		Person p3 = Stream.of(p1,p2).findAny().orElseGet(() -> getPerson());
		
		System.out.println(p1.equals(p3) +  "" + p2.equals(p3));
	}
	
}

