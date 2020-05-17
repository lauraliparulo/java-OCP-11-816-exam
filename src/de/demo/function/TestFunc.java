package de.demo.function;

import java.util.List;
import java.util.function.Function;

public class TestFunc {

	static int calculate(List<String> list, Function<List<String>, Integer> func) {
		return func.apply(list);		
	}
	
	public static void main(String[] args) {
		List<String> list = List.of("a", "b", "c");
		System.out.println(calculate(list, l -> l.indexOf("b")));
	}
	
}
