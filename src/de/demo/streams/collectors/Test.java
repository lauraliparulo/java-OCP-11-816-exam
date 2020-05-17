package de.demo.streams.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	
	public static void main(String[] args) {
		Student s1 = new Student("Anna",Faculty.BUSINESS);
		Student s2 = new Student("Mario",Faculty.BUSINESS);
		Student s3 = new Student("Peter",Faculty.ENGINEERING);
		Student s4 = new Student("JOhn",Faculty.ENGINEERING);
		
		Stream.of(s1,s2,s3,s4).collect(Collectors.partitioningBy(
				c -> c.getFaculty() == Faculty.BUSINESS				
				)).forEach((k,v) -> {System.out.println(v);
				System.out.println(k);
				});
		
	}
}
