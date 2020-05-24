package de.demo.predicate;

import java.util.function.Predicate;

public class Test {

	static <T> boolean validate (Validator v, Predicate<T> predicate) {
		return predicate.test((T) v);
	}
	
	
	public static void main (String[] args) {
		
		Validator v = new Validator(false);
		
		boolean result = validate(v, va -> ((Validator) va).isValid());
		
		System.out.println(result);
		
		
		
		Person person = new Person("JOhn");
		System.out.println(person.name);
		
	}
	
}

class Person{
	String name;
	
	Person(String name){
		
		this.name = name.toUpperCase();
	}
}

class Validator {
	
	boolean valid;
	
	Validator(boolean valid) {
		this.valid = valid;
		
	}
	
	boolean isValid() {
		return valid;
	}
	
}