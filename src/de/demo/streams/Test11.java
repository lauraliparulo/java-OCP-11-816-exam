package de.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Test11 {

	
	public static void main(String[] args) {
		List<Integer> intList  = Arrays.asList(1,2,3,4,5,6,6);
		DoubleStream doubleStream = intList.stream().mapToDouble(i -> i.doubleValue());
		
		
		OptionalDouble maxValue = doubleStream.max();
		
		System.out.println(maxValue.getAsDouble());
	}
}
