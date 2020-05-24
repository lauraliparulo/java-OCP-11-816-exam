package de.demo.streams;

public class Person {

	int age;

	String name;

	Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	
	
}
