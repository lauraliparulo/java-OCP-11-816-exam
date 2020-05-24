package de.demo.tests;

import java.util.function.Function;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		Stream stream = Stream.of(1,2,3,4);
		
		stream.map( i -> {
			
			Function<T, R> func = Data::new;
			
			return func.apply(i);
			
		}).forEach(Data::output);
	}
}

class Data {
	
	int val;
	
	Data(int val) {
		this.val = val;
	}
	
	void output() {
		System.out.println(val);
	}
	
}