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
		
		
//		Function f1 = s -> ((String) s).toLowerCase();
//		Function f2 = String::toUpperCase;
//		
//		Object o = f1.compose(f2).apply("Java");
//		
//		System.out.println(o);
		
		
	}
	
}
