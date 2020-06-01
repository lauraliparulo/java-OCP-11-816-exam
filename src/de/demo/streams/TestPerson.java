package de.demo.streams;

import java.util.stream.Stream;

public class TestPerson {

	public static void main(String[] args) {
		Person2 person = new Person2("John");
		Stream stream = Stream.of(person);
//		stream.forEach(Person2::print2);
	}
	
}


class Person2 {
	
	String name;
	
	Person2(String name){
		this.name = name;
	}
	
	Person print2(Person p) {
		System.out.println(p.name);
		return p;
	}
	
	
	static void print(Person p) {
		System.out.println(p.name);
	}
	
}