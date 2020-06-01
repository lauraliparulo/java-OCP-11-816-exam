package de.demo.collections;

import java.util.Map;

public class TestMapOfEntries {
	
	public static void main(String[] args) {
		Map<Integer,String> mapping = Map.ofEntries(Map.entry(1, "one"), Map.entry(2, "two"));
		mapping.forEach((key, value) -> System.out.println(key + ":"+value));
	}
	
}
