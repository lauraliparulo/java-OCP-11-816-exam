package de.demo.streams.collectors;

public class Student {
	
	String name;
	Faculty faculty;
	
	Student(String name, Faculty faculty){
		this.name = name;
		this.faculty = faculty;
	}
	
	String getName() {
		return name;
	}
	
	Faculty getFaculty() {
		return faculty;
	}
	
	public String toString() {
		return name;
	}

}
