package de.demo.streams;

import java.util.stream.Stream;

public class Test2 {
	
	public static void main(String[] args) {
//		Data data1 = new Data(1);
//		Data data2 = new Data(2);
		
	//	Object result = Stream.of(data1,data2).reduce(data1, (d1,d2) -> d1.number + d2.number );
	//	System.out.println(result);
		
		
		Stream stream = Stream.of(0,1);
		stream.forEach(i -> System.out.println(i));
//	stream.filter(i -> i > 0).forEach(System.out::print);
		
	}

}
